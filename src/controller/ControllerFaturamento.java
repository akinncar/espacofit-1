package controller;

import controller.ControllerBaluno;
import controller.ControllerBpersonal;
import model.bo.*;
import service.*;
import view.*;
import view.TelaVendas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ControllerFaturamento implements ActionListener {

    public static TelaVendas tela = new TelaVendas();
    public static List<ItemVenda> listaItens = new ArrayList<>();
    public static DefaultTableModel tabela;
    public static float valor;
    public DateFormat data;
    public DateFormat hora;
    public Date dataHora;
    public Venda venda = new Venda();
    public static int codigoAluno;
    public static int codigoPersonal;
    public static int codigoVenda;

    public ControllerFaturamento(TelaVendas telaVendas) {
        tela = telaVendas;
        tela.getPesquisarProduto().addActionListener(this);
        tela.getProcurarAluno().addActionListener(this);
        tela.getProcurarPersonal().addActionListener(this);

        start();
        horario(false);

        ativacao(false);
        tela.getTextoStatus().setEditable(false);
        tela.getTextoStatus().setText("OFF");

        tabela = (DefaultTableModel) tela.getListaItens().getModel();
        valor = 0;
        tela.getValorTotal().setText("R$ 0,00");
        listaItens.clear();

        tela.getCodigoBarras().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if(evt.getKeyCode() == KeyEvent.VK_ENTER) inserirItem();
                if(evt.getKeyCode() == KeyEvent.VK_F1)buscarProduto();
                if(evt.getKeyCode() == KeyEvent.VK_F2)novoFaturamento();
                if(evt.getKeyCode() == KeyEvent.VK_F3)cancelarFaturamento();
                if(evt.getKeyCode() == KeyEvent.VK_F4)encerrarFaturamento();
                if(evt.getKeyCode() == KeyEvent.VK_F5)cancelarItem();
            }
        });
    }

    private void ativacao(boolean estado){
        tela.getListaItens().setEnabled(estado);
        tela.getTextoNomeA().setEnabled(estado);
        tela.getTextoNomeP().setEnabled(estado);
        tela.getTextoEnderecoA().setEnabled(estado);
        tela.getTextoEnderecoP().setEnabled(estado);
        tela.getTextoTelefonesA().setEnabled(estado);
        tela.getTextoTelefonesP().setEnabled(estado);
    }

    private void limpar(){
        tela.getCodigoBarras().setText(null);
        tela.getTextoStatus().setText("OFF");
        tela.getListaItens().removeAll();
        ((DefaultTableModel) tela.getListaItens().getModel()).setRowCount(0);
        tela.getTextoNomeA().setText(null);
        tela.getTextoNomeP().setText(null);
        tela.getTextoEnderecoA().setText(null);
        tela.getTextoEnderecoP().setText(null);
        tela.getTextoTelefonesA().setText(null);
        tela.getTextoTelefonesP().setText(null);
    }

    private void horario(boolean ativado){
        tela.getTextoData().setEditable(false);
        tela.getTextoData().setEnabled(ativado);
        tela.getTextoHora().setEditable(false);
        tela.getTextoHora().setEnabled(ativado);
    }

    public void start() {
        //cria uma thread
        Thread th = new Thread(() -> {
            while(true) { //roda indefinidamente
                dataHora = Calendar.getInstance().getTime(); //pega a hora do sistema
                data = new SimpleDateFormat("dd/MM/yyyy");
                hora = new SimpleDateFormat("HH:mm");
                tela.getTextoData().setText(data.format(dataHora));
                tela.getTextoHora().setText(hora.format(dataHora));
                try {
                    Thread.sleep(1000); //espera 1 segundo para fazer a nova evolu????o
                } catch(InterruptedException ex){
                    //?? algo terr??vel a se fazer mas pelo jeito a API medonha do Java exige
                }
            }
        });
        th.start();
    }

    private void buscarAluno() {
        if(tela.getTextoStatus().getText().equalsIgnoreCase("off"))
            JOptionPane.showMessageDialog(null, "N??o existe um faturamento em andamento para cancelar!\nAperte F2 para criar um novo faturamento.");
        else {
            tela.getTextoNomeA().setEditable(false);
            tela.getTextoEnderecoA().setEditable(false);
            tela.getTextoTelefonesA().setEditable(false);
            TelaBuscaAluno telaBuscaAluno = new TelaBuscaAluno(null, true);
            ControllerBaluno.quemchama = 1;
            new ControllerBaluno(telaBuscaAluno);
            telaBuscaAluno.setVisible(true);

            Aluno aluno = AlunoService.Listar(codigoAluno);

            if(aluno != null) {
                tela.getTextoNomeA().setText(aluno.getNome());
                tela.getTextoEnderecoA().setText(aluno.getCep().toString() + "\n" + aluno.getCompleEndereco());
                tela.scroll();

                String telefones = "";
                if (aluno.getFone1() != null) {
                    if (aluno.getFone1().length() == 10) {
                        telefones += "(" + aluno.getFone1().substring(0, 2) + ") " + aluno.getFone1().substring(2, 6) + "-" + aluno.getFone1().substring(6, 10);
                    } else if (aluno.getFone1().length() == 11) {
                        telefones += "(" + aluno.getFone1().substring(0, 2) + ") " + aluno.getFone1().substring(2, 7) + "-" + aluno.getFone1().substring(7, 11);
                    }
                }
                if (aluno.getFone2() != null) {
                    telefones += "\n";
                    if (aluno.getFone2().length() == 10) {
                        telefones += "(" + aluno.getFone2().substring(0, 2) + ") " + aluno.getFone2().substring(2, 6) + "-" + aluno.getFone2().substring(6, 10);
                    } else if (aluno.getFone2().length() == 11) {
                        telefones += "(" + aluno.getFone2().substring(0, 2) + ") " + aluno.getFone2().substring(2, 7) + "-" + aluno.getFone2().substring(7, 11);
                    }
                }
                tela.getTextoTelefonesA().setText(telefones);

                venda.setAluno(aluno);
            }
        }
    }

    private void buscarPersonal() {
        if(tela.getTextoStatus().getText().equalsIgnoreCase("off"))
            JOptionPane.showMessageDialog(null, "N??o existe um faturamento em andamento para cancelar!\nAperte F2 para criar um novo faturamento.");
        else {
            tela.getTextoNomeP().setEditable(false);
            tela.getTextoEnderecoP().setEditable(false);
            tela.getTextoTelefonesP().setEditable(false);
            TelaBuscaPersonal telaBuscaPersonal = new TelaBuscaPersonal(null, true);
            ControllerBpersonal.quemchama = 1;
            new ControllerBpersonal(telaBuscaPersonal);
            telaBuscaPersonal.setVisible(true);

            Personal personal = PersonalService.Listar(codigoPersonal);

            if(personal != null) {
                tela.getTextoNomeP().setText(personal.getNome());
                tela.getTextoEnderecoP().setText(personal.getCep().toString());
                tela.scroll();

                String telefones = "";
                if (personal.getFone1() != null) {
                    if (personal.getFone1().length() == 10) {
                        telefones += "(" + personal.getFone1().substring(0, 2) + ") " + personal.getFone1().substring(2, 6) + "-" + personal.getFone1().substring(6, 10);
                    } else if (personal.getFone1().length() == 11) {
                        telefones += "(" + personal.getFone1().substring(0, 2) + ") " + personal.getFone1().substring(2, 7) + "-" + personal.getFone1().substring(7, 11);
                    }
                }
                if (personal.getFone2() != null) {
                    telefones += "\n";
                    if (personal.getFone2().length() == 10) {
                        telefones += "(" + personal.getFone2().substring(0, 2) + ") " + personal.getFone2().substring(2, 6) + "-" + personal.getFone2().substring(6, 10);
                    } else if (personal.getFone2().length() == 11) {
                        telefones += "(" + personal.getFone2().substring(0, 2) + ") " + personal.getFone2().substring(2, 7) + "-" + personal.getFone2().substring(7, 11);
                    }
                }
                tela.getTextoTelefonesP().setText(telefones);

                venda.setPersonal(personal);
            }
        }
    }

    private void buscarProduto() {
        if(tela.getTextoStatus().getText().equalsIgnoreCase("off")){
            JOptionPane.showMessageDialog(null, "N??o existe um faturamento em andamento!\nAperte F2 para criar um novo faturamento.");
        }else{
            TelaBuscaEstoque telaBuscaProduto = new TelaBuscaEstoque(null, true);
            new ControllerFitem(telaBuscaProduto);
            telaBuscaProduto.setVisible(true);

            DecimalFormat df = new DecimalFormat("0.00");
            String valor = String.valueOf(df.format(ControllerFaturamento.valor));
            tela.getValorTotal().setText("R$ " + valor);
        }
    }

    private void inserirItem() {
        if(tela.getTextoStatus().getText().equalsIgnoreCase("off")){
            JOptionPane.showMessageDialog(null, "N??o existe um faturamento em andamento!\nAperte F2 para criar um novo faturamento.");
        }else{
            Produto produto = ProdutoService.Listar(tela.getCodigoBarras().getText());
            if(produto == null){
                JOptionPane.showMessageDialog(null, "Esse c??digo de barras n??o existe!");
            }else{
                tela.getCodigoBarras().setText(produto.getCodigoBarra());
                ItemVenda item = new ItemVenda(produto, 1);
                listaItens.add(item);
                valor += item.getSubtotal();

                tabela.addRow(new Object[]{listaItens.indexOf(item) + 1, produto.getDescricao(), item.getQuantidade(), produto.getValor(), item.getSubtotal()});

                tela.getCodigoBarras().setText(null);

                DecimalFormat df = new DecimalFormat("0.00");
                String valor = String.valueOf(df.format(ControllerFaturamento.valor));
                tela.getValorTotal().setText("R$ " + valor);
            }
        }
    }

    private void novoFaturamento() {
        if(tela.getTextoStatus().getText().equalsIgnoreCase("off")){
            ativacao(true);
            tela.getTextoStatus().setText("EM ANDAMENTO");
            String dataFormat = data.format(dataHora).substring(6, 10) + "-" + data.format(dataHora).substring(3, 5) + "-" + data.format(dataHora).substring(0, 2);
            venda.setData(dataFormat);
            venda.setIdentificacao("Venda " + new SimpleDateFormat("dd/MM/yyyy HH:mm").format(dataHora));
            horario(true);
        }else{
            JOptionPane.showMessageDialog(null, "Um novo faturamento n??o pode ser feito");
        }
    }

    private void cancelarItem() {
        if(tela.getTextoStatus().getText().equalsIgnoreCase("off")){
            JOptionPane.showMessageDialog(null, "N??o existe um faturamento em andamento!\nAperte F2 para criar um novo faturamento.");
        }else{
            if(listaItens.isEmpty()){
                JOptionPane.showMessageDialog(null, "N??o existe nenhum item na venda!\nInsira apertando F1 ou no bot??o 'Pesquisar Produto'");
            }else{
                TelaBuscaItem telaBuscaItem = new TelaBuscaItem(null, true);
                new ControllerFitem(telaBuscaItem);
                telaBuscaItem.setVisible(true);

                DecimalFormat df = new DecimalFormat("0.00");
                tela.getValorTotal().setText("R$ " + df.format(valor));
            }
        }
    }

    private void cancelarFaturamento() {
        if(tela.getTextoStatus().getText().equalsIgnoreCase("off"))
            JOptionPane.showMessageDialog(null, "N??o existe um faturamento em andamento para cancelar!\nAperte F2 para criar um novo faturamento.");
        else{
            limpar();
            tela.getValorTotal().setText("R$ 0,00");
            valor = 0;
            ativacao(false);
        }
    }

    private void encerrarFaturamento() {
        if(tela.getTextoStatus().getText().equalsIgnoreCase("off")){
            JOptionPane.showMessageDialog(null, "N??o existe um faturamento em andamento para encerrar!\nAperte F2 para criar um novo faturamento.");
        }else{
            if(venda.getAluno() == null){
                JOptionPane.showMessageDialog(null, "Aluno n??o selecionado!");
            }else if(venda.getPersonal() == null){
                JOptionPane.showMessageDialog(null, "Personal n??o selecionado!");
            }else{
                venda.setValorTotal(valor);
                VendaService.Incluir(venda);

                for(Venda v : VendaService.Listar()){
                    if(v.getIdentificacao().equalsIgnoreCase(venda.getIdentificacao())){
                        codigoVenda = v.getId();
                    }
                }

                venda = VendaService.Listar(codigoVenda);

                for(ItemVenda item : listaItens){
                    if(item != null) {
                        item.setVenda(venda);
                        ItemVendaService.Incluir(item);
                    }
                }

                limpar();
                tela.getValorTotal().setText("R$ 0,00");
                valor = 0;
                ativacao(false);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource() == tela.getPesquisarProduto()){
                buscarProduto();
            }

            if(e.getSource() == tela.getProcurarAluno()){
                buscarAluno();
            }

            if(e.getSource() == tela.getProcurarPersonal()){
                buscarPersonal();
            }
        }
}