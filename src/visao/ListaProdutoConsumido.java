/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 102650
 */
public class ListaProdutoConsumido extends javax.swing.JFrame {

    /**
     * Creates new form ListaProdutoConsumido
     */
    public ListaProdutoConsumido() {
        initComponents();
            this.setLocationRelativeTo(null);
        this.setTitle("Lista Produto Consumido");
        this.setIconImage(new ImageIcon(getClass(). getResource("ScreenHunter_06 Aug. 19 17.25.gif")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/filter.png"))); // NOI18N
        jButton1.setText("Listar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 120, 30));

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/format1_16x16.gif"))); // NOI18N
        jButton2.setText("Limpar");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 110, 30));

        jButton3.setBackground(new java.awt.Color(153, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/print.png"))); // NOI18N
        jButton3.setText("Imprimir");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 120, 30));

        jButton4.setBackground(new java.awt.Color(153, 255, 255));
        jButton4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/search.png"))); // NOI18N
        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 110, 30));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 150, -1));

        jLabel3.setText("Hospedagem:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Hospedagem", "Produto", "Quantidade", "Dia", "Mes", "Ano"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 800, 350));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/fd.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     try {
            
            Class.forName("com.mysql.jdbc.Driver");
            com.mysql.jdbc.Connection conn;
           conn =  (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?zeroDateTimeBehavior=convertToNull", "root", "root");
       String query="SELECT consumo.idhospedagem,consumo.nome,consumo.nomeproduto,consumo.quantidade,consumo.dia,consumo.mes,consumo.ano FROM consumo WHERE idhospedagem  ";
       PreparedStatement cmd;
       cmd= conn.prepareStatement(query);
       
       ResultSet rs;
       rs= cmd.executeQuery();
       DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
       model.setNumRows(0);
       
       while(rs.next()){
           
       model.addRow(
               new Object[]{
                     rs.getString("nome"),
              rs.getString("idhospedagem"),
                rs.getString("nomeproduto"),
            rs.getString("quantidade"),
                       rs.getString("dia"),
                        rs.getString("mes"),
                                 rs.getString("ano")
               }
       );
      
       }
       
        
        
        } catch (ClassNotFoundException ex) {
            System.out.println("Não foi possivel encontrar a classe");
            
        } catch (SQLException ex) {
             System.out.println("Ocorreu error"+ ex.getMessage());
        }//Fim try


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
DefaultTableModel tableModel =(DefaultTableModel) jTable1.getModel();  
  tableModel.setNumRows(0);      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try {  
    // Imprime o coteudo da "jTable1":  
    jTable1.print(JTable.PrintMode.FIT_WIDTH);  
  
} catch (java.awt.print.PrinterException ex) {  
    JOptionPane.showMessageDialog(this, "Erro de impressão: " + ex.getMessage(), "Erro de impressão", JOptionPane.ERROR_MESSAGE);  
}         
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     try {
            
            Class.forName("com.mysql.jdbc.Driver");
            com.mysql.jdbc.Connection conn;
           conn =  (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?zeroDateTimeBehavior=convertToNull", "root", "root");
       String query="SELECT consumo.nome,consumo.idhospedagem ,consumo.nomeproduto,consumo.quantidade,consumo.dia,consumo.mes,consumo.ano FROM consumo  WHERE idhospedagem =? ";
       PreparedStatement cmd;
       cmd= conn.prepareStatement(query);
       cmd.setString(1,jTextField1.getText());
       ResultSet rs;
       rs= cmd.executeQuery();
       DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
       model.setNumRows(0);
       
       while(rs.next()){
           
       model.addRow(
               new Object[]{
                     rs.getString("nome"),
              rs.getString("idhospedagem"),
                rs.getString("nomeproduto"),
            rs.getString("quantidade"),
                       rs.getString("dia"),
                        rs.getString("mes"),
                                 rs.getString("ano")
               }
       );
      
       }
       
        
        
        } catch (ClassNotFoundException ex) {
            System.out.println("Não foi possivel encontrar a classe");
            
        } catch (SQLException ex) {
             System.out.println("Ocorreu error"+ ex.getMessage());
        }//Fim try
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(ListaProdutoConsumido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaProdutoConsumido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaProdutoConsumido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaProdutoConsumido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaProdutoConsumido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}