
package prova;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class cadastro extends javax.swing.JFrame {

    java.util.List<Imovel> Imoveis;
    
    public cadastro() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Imoveis = new java.util.ArrayList();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textMenu = new javax.swing.JLabel();
        btnCadastroMenu = new javax.swing.JButton();
        btnListarMenu = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textMenu.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        textMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textMenu.setText("Imobiliaria do Futuro");

        btnCadastroMenu.setText("Cadastrar Imóvel");
        btnCadastroMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroMenuActionPerformed(evt);
            }
        });

        btnListarMenu.setText("Listar Imoveis");
        btnListarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnCadastroMenu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btnListarMenu)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnCadastroMenu)
                .addGap(51, 51, 51)
                .addComponent(btnListarMenu)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroMenuActionPerformed
        cadastroImovel FormCad = new cadastroImovel();
        FormCad.setVisible(true);
        FormCad.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent ev){
                Imoveis.addAll(FormCad.getImoveis());
            }
        
        });
        
        Imoveis.addAll(FormCad.getImoveis());
        
    }//GEN-LAST:event_btnCadastroMenuActionPerformed

    private void btnListarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarMenuActionPerformed
        listarImovel ListCad = new listarImovel(Imoveis);
        ListCad.setVisible(true);
    }//GEN-LAST:event_btnListarMenuActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroMenu;
    private javax.swing.JButton btnListarMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel textMenu;
    // End of variables declaration//GEN-END:variables
}
