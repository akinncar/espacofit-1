/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author julia
 */
public class TelaCadastroCep extends javax.swing.JFrame {

   /**
    * Creates new form FormModeloCadastros
    */
   public TelaCadastroCep() {
      initComponents();
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        north = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        south = new javax.swing.JPanel();
        novo = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        gravar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        center = new javax.swing.JPanel();
        cep = new javax.swing.JLabel();
        textoCep = new javax.swing.JFormattedTextField();
        logradouro = new javax.swing.JLabel();
        textoLogradouro = new javax.swing.JTextField();
        obs = new javax.swing.JLabel();
        textoObs = new javax.swing.JTextField();
        cidade = new javax.swing.JLabel();
        listaCidade = new javax.swing.JComboBox<>();
        bairro = new javax.swing.JLabel();
        listaBairros = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulário de Cadastro");
        setResizable(false);

        north.setBackground(new java.awt.Color(0, 153, 153));
        north.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        north.setPreferredSize(new java.awt.Dimension(700, 75));

        titulo.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("CEP");

        javax.swing.GroupLayout northLayout = new javax.swing.GroupLayout(north);
        north.setLayout(northLayout);
        northLayout.setHorizontalGroup(
            northLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(northLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                .addContainerGap())
        );
        northLayout.setVerticalGroup(
            northLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(northLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(north, java.awt.BorderLayout.NORTH);

        south.setBackground(new java.awt.Color(0, 153, 153));
        south.setPreferredSize(new java.awt.Dimension(700, 50));

        novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo.png"))); // NOI18N
        novo.setText("Novo");
        novo.setPreferredSize(new java.awt.Dimension(120, 30));
        south.add(novo);

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.setEnabled(false);
        cancelar.setPreferredSize(new java.awt.Dimension(120, 30));
        south.add(cancelar);

        gravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravar2.png"))); // NOI18N
        gravar.setText("Gravar");
        gravar.setEnabled(false);
        gravar.setPreferredSize(new java.awt.Dimension(120, 30));
        south.add(gravar);

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buscar.png"))); // NOI18N
        buscar.setText("Buscar");
        buscar.setPreferredSize(new java.awt.Dimension(120, 30));
        south.add(buscar);

        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        sair.setText("Sair");
        sair.setPreferredSize(new java.awt.Dimension(120, 30));
        south.add(sair);

        getContentPane().add(south, java.awt.BorderLayout.SOUTH);

        cep.setText("CEP:");

        try {
            textoCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textoCep.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        logradouro.setText("Logradouro:");

        obs.setText("Observações:");

        cidade.setText("Cidade:");

        bairro.setText("Bairro:");

        javax.swing.GroupLayout centerLayout = new javax.swing.GroupLayout(center);
        center.setLayout(centerLayout);
        centerLayout.setHorizontalGroup(
            centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(centerLayout.createSequentialGroup()
                        .addComponent(logradouro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoLogradouro))
                    .addGroup(centerLayout.createSequentialGroup()
                        .addComponent(obs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoObs))
                    .addGroup(centerLayout.createSequentialGroup()
                        .addComponent(cep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoCep, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(listaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(listaBairros, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        centerLayout.setVerticalGroup(
            centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centerLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cep)
                    .addComponent(textoCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairro)
                    .addComponent(listaBairros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidade)
                    .addComponent(listaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logradouro)
                    .addComponent(textoLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obs)
                    .addComponent(textoObs, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        getContentPane().add(center, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      /* Set the Nimbus look and feel */
      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
      /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
       */
      try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(TelaCadastroCep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(TelaCadastroCep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(TelaCadastroCep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(TelaCadastroCep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new TelaCadastroCep().setVisible(true);
         }
      });
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairro;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JPanel center;
    private javax.swing.JLabel cep;
    private javax.swing.JLabel cidade;
    private javax.swing.JButton gravar;
    private javax.swing.JComboBox<String> listaBairros;
    private javax.swing.JComboBox<String> listaCidade;
    private javax.swing.JLabel logradouro;
    private javax.swing.JPanel north;
    private javax.swing.JButton novo;
    private javax.swing.JLabel obs;
    private javax.swing.JButton sair;
    private javax.swing.JPanel south;
    private javax.swing.JFormattedTextField textoCep;
    private javax.swing.JTextField textoLogradouro;
    private javax.swing.JTextField textoObs;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

   public JButton getBuscar() {
      return buscar;
   }

   public JButton getCancelar() {
      return cancelar;
   }

   public JButton getGravar() {
      return gravar;
   }

   public JButton getNovo() {
      return novo;
   }

   public JButton getSair() {
      return sair;
   }

   public JPanel getCenter() {
      return center;
   }

   public JFormattedTextField getTextoCep() {
      return textoCep;
   }

   public JTextField getTextoLogradouro() {
      return textoLogradouro;
   }

   public JTextField getTextoObs() {
      return textoObs;
   }

   public JComboBox<String> getListaBairros() {
      return listaBairros;
   }

   public JComboBox<String> getListaCidade() {
      return listaCidade;
   }

}