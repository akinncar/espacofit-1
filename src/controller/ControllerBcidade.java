package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Cidade;
import view.TelaBuscaCidade;

public class ControllerBcidade implements ActionListener {
   TelaBuscaCidade tela;

   public ControllerBcidade(TelaBuscaCidade telaBuscaCidade) {
      this.tela = telaBuscaCidade;
      
      this.tela.getCarregar().addActionListener(this);
      this.tela.getDeletar().addActionListener(this);
      this.tela.getSair().addActionListener(this);
      
      DefaultTableModel tabela = (DefaultTableModel) this.tela.getjTable1().getModel();
      if(service.CidadeService.Listar().size() != 0){
         ativacao("normal");
         for(Cidade cidade : service.CidadeService.Listar()) {
             tabela.addRow(new Object[]{cidade.getId(), cidade.getDescricao()});
         }
      }

      this.tela.getjTable1().getSelectionModel().addListSelectionListener(event -> ativacao("todos"));
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      if(e.getSource() == this.tela.getCarregar()){
         if((int) this.tela.getjTable1().getValueAt(this.tela.getjTable1().getSelectedRow(), 0) > 0){
            ControllerCidade.codigo = (int) this.tela.getjTable1().getValueAt(this.tela.getjTable1().getSelectedRow(), 0);
         }
         this.tela.dispose();
      }
      
      if(e.getSource() == this.tela.getDeletar()){
         DefaultTableModel tabela = (DefaultTableModel) this.tela.getjTable1().getModel();
         if((int) this.tela.getjTable1().getValueAt(this.tela.getjTable1().getSelectedRow(), 0) > 0){
            service.CidadeService.Excluir(service.CidadeService.Listar((int) this.tela.getjTable1().getValueAt(this.tela.getjTable1().getSelectedRow(), 0)));
            tabela.removeRow(this.tela.getjTable1().getSelectedRow());
         }
         ativacao("normal");
      }
      
      if(e.getSource() == this.tela.getSair()){
         this.tela.dispose();
      }
   }

   public void ativacao(String tipo){
      if(tipo.equalsIgnoreCase("normal")){
         this.tela.getCarregar().setEnabled(false);
         this.tela.getDeletar().setEnabled(false);
         this.tela.getSair().setEnabled(true);
      }
      if(tipo.equalsIgnoreCase("todos")){
         this.tela.getCarregar().setEnabled(true);
         this.tela.getDeletar().setEnabled(true);
         this.tela.getSair().setEnabled(true);
      }
   }
}
