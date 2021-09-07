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
public class TelaCadastroFornecedor extends javax.swing.JFrame {

   /**
    * Creates new form FormModeloCadastros
    */
   public TelaCadastroFornecedor() {
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
        nome = new javax.swing.JLabel();
        textoNome = new javax.swing.JTextField();
        razaoSocial = new javax.swing.JLabel();
        textoRazaoSocial = new javax.swing.JTextField();
        cnpj = new javax.swing.JLabel();
        textoCnpj = new javax.swing.JTextField();
        inscEstadual = new javax.swing.JLabel();
        textoInscEstadual = new javax.swing.JTextField();
        cep = new javax.swing.JLabel();
        listaCep = new javax.swing.JComboBox<>();
        compleEndereco = new javax.swing.JLabel();
        textoCompleEndereco = new javax.swing.JTextField();
        telefones = new javax.swing.JLabel();
        textoFone1 = new javax.swing.JFormattedTextField();
        textoFone2 = new javax.swing.JFormattedTextField();
        email = new javax.swing.JLabel();
        textoEmail = new javax.swing.JTextField();
        obs = new javax.swing.JLabel();
        textoObs = new javax.swing.JTextField();
        textoEndereco = new javax.swing.JTextField();
        endereco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulário de Cadastro");
        setResizable(false);

        north.setBackground(new java.awt.Color(0, 153, 153));
        north.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        north.setPreferredSize(new java.awt.Dimension(700, 75));

        titulo.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("FORNECEDOR");

        javax.swing.GroupLayout northLayout = new javax.swing.GroupLayout(north);
        north.setLayout(northLayout);
        northLayout.setHorizontalGroup(
            northLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(northLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
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

        nome.setText("Nome:");

        razaoSocial.setText("Razão Social:");

        cnpj.setText("CNPJ:");

        inscEstadual.setText("Inscrição Estadual:");

        cep.setText("CEP:");

        compleEndereco.setText("Complemento Endereço:");

        textoCompleEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCompleEnderecoActionPerformed(evt);
            }
        });

        telefones.setText("Telefones:");

        try {
            textoFone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-###*")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textoFone1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            textoFone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-###*")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textoFone2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        email.setText("E-mail:");

        obs.setText("Observações:");

        textoEndereco.setEnabled(false);
        textoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoEnderecoActionPerformed(evt);
            }
        });

        endereco.setText("Endereço:");

        javax.swing.GroupLayout centerLayout = new javax.swing.GroupLayout(center);
        center.setLayout(centerLayout);
        centerLayout.setHorizontalGroup(
            centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(centerLayout.createSequentialGroup()
                        .addComponent(razaoSocial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoRazaoSocial))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centerLayout.createSequentialGroup()
                        .addComponent(obs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoObs))
                    .addGroup(centerLayout.createSequentialGroup()
                        .addComponent(telefones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(centerLayout.createSequentialGroup()
                                .addComponent(textoFone2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(centerLayout.createSequentialGroup()
                                .addComponent(textoFone1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textoEmail))))
                    .addGroup(centerLayout.createSequentialGroup()
                        .addComponent(nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoNome))
                    .addGroup(centerLayout.createSequentialGroup()
                        .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(centerLayout.createSequentialGroup()
                                .addComponent(cep)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(listaCep, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(centerLayout.createSequentialGroup()
                                .addComponent(cnpj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textoCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 144, Short.MAX_VALUE)
                        .addComponent(inscEstadual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoInscEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(centerLayout.createSequentialGroup()
                        .addComponent(compleEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoCompleEndereco))
                    .addGroup(centerLayout.createSequentialGroup()
                        .addComponent(endereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoEndereco)))
                .addContainerGap())
        );
        centerLayout.setVerticalGroup(
            centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(razaoSocial)
                    .addComponent(textoRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inscEstadual)
                    .addComponent(textoInscEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnpj)
                    .addComponent(textoCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cep)
                    .addComponent(listaCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endereco)
                    .addComponent(textoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compleEndereco)
                    .addComponent(textoCompleEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefones)
                    .addComponent(textoFone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email)
                    .addComponent(textoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoFone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obs)
                    .addComponent(textoObs, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(center, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   private void textoCompleEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCompleEnderecoActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_textoCompleEnderecoActionPerformed

   private void textoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoEnderecoActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_textoEnderecoActionPerformed

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
         java.util.logging.Logger.getLogger(TelaCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(TelaCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(TelaCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(TelaCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new TelaCadastroFornecedor().setVisible(true);
         }
      });
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JPanel center;
    private javax.swing.JLabel cep;
    private javax.swing.JLabel cnpj;
    private javax.swing.JLabel compleEndereco;
    private javax.swing.JLabel email;
    private javax.swing.JLabel endereco;
    private javax.swing.JButton gravar;
    private javax.swing.JLabel inscEstadual;
    private javax.swing.JComboBox<String> listaCep;
    private javax.swing.JLabel nome;
    private javax.swing.JPanel north;
    private javax.swing.JButton novo;
    private javax.swing.JLabel obs;
    private javax.swing.JLabel razaoSocial;
    private javax.swing.JButton sair;
    private javax.swing.JPanel south;
    private javax.swing.JLabel telefones;
    private javax.swing.JTextField textoCnpj;
    private javax.swing.JTextField textoCompleEndereco;
    private javax.swing.JTextField textoEmail;
    private javax.swing.JTextField textoEndereco;
    private javax.swing.JFormattedTextField textoFone1;
    private javax.swing.JFormattedTextField textoFone2;
    private javax.swing.JTextField textoInscEstadual;
    private javax.swing.JTextField textoNome;
    private javax.swing.JTextField textoObs;
    private javax.swing.JTextField textoRazaoSocial;
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

   public JComboBox<String> getListaCep() {
      return listaCep;
   }

   public JTextField getTextoCnpj() {
      return textoCnpj;
   }

   public JTextField getTextoCompleEndereco() {
      return textoCompleEndereco;
   }

   public JTextField getTextoEmail() {
      return textoEmail;
   }

   public JFormattedTextField getTextoFone1() {
      return textoFone1;
   }

   public JFormattedTextField getTextoFone2() {
      return textoFone2;
   }

   public JTextField getTextoInscEstadual() {
      return textoInscEstadual;
   }

   public JTextField getTextoNome() {
      return textoNome;
   }

   public JTextField getTextoObs() {
      return textoObs;
   }

   public JTextField getTextoRazaoSocial() {
      return textoRazaoSocial;
   }

   public JTextField getTextoEndereco() {
      return textoEndereco;
   }
}