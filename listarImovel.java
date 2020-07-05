
package prova;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class listarImovel extends javax.swing.JFrame {
    
    
    public listarImovel() {
        initComponents();
        configurarTabela();
        
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    public listarImovel(java.util.List<Imovel> imoveis){
        
        this();
        for (Imovel c : imoveis){
        DefaultTableModel m = (DefaultTableModel)tabImoveis.getModel();
            m.addRow(
                new String[]{c.getDono(),c.getDescricao(),c.getCategoria().toString(),c.getTipo().toString(),c.getValorString()}
            );
        tabImoveis.setModel(m);
        } 
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabImoveis = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabImoveis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Categoria", "Tipo", "Valor de Venda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabImoveis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabImoveisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabImoveis);
        if (tabImoveis.getColumnModel().getColumnCount() > 0) {
            tabImoveis.getColumnModel().getColumn(2).setResizable(false);
            tabImoveis.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setText("Imoveis Cadastrados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabImoveisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabImoveisMouseClicked
        
        int linha = tabImoveis.getSelectedRow();
        
        if (linha>=0){
            String texto = tabImoveis.getValueAt(linha, 1).toString();
            JOptionPane.showMessageDialog(null, texto, "Descrição", JOptionPane.INFORMATION_MESSAGE);
        }
    
    }//GEN-LAST:event_tabImoveisMouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listarImovel().setVisible(true);
            }
        });
    }

    private void configurarTabela() {
        
        
        DefaultTableModel m = new DefaultTableModel (){
           @Override
           public boolean isCellEditable(int row, int colum){
               
               return false;
           }
        };
           // definir colunas 
        m.addColumn("Nome");
        m.addColumn("Descriçao");
        m.addColumn("Categoria"); 
        m.addColumn("Tipo"); 
        m.addColumn("Valor"); 
        tabImoveis.setModel(m);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabImoveis;
    // End of variables declaration//GEN-END:variables

    
}
