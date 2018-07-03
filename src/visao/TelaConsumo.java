/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;


import com.mysql.jdbc.Connection;
import controle.CtrlConsumo;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;


import modelagem1.Consumo;

/**
 *
 * @author Dirceu
 */
   public class TelaConsumo extends javax.swing.JFrame {
    private CtrlConsumo consumo;
private NewMasterHospedagem veioDoNewMaterHospedagem;
private TelaHospedagem veioDoTelaHospedagem;
    /**
     * Creates new form TelaCandidato
     */
    public  TelaConsumo() {
        initComponents();
         this.setLocationRelativeTo(null);
          consumo= new CtrlConsumo(); 
          this.setTitle("Cadastro Consumo");
           this.setIconImage(new ImageIcon(getClass(). getResource("ScreenHunter_06 Aug. 19 17.25.gif")).getImage());
    }
public void  enviaHospedagem (NewMasterHospedagem veiDo1,  String  nome){
             
       
               jIdhospedagem.setText(nome);

}
public void  enviaNome(NewMasterHospedagem veiDo1,  String  nome){
             
       
               jNome.setText(nome);

}
public void  enviaHospedagem (TelaHospedagem veiDo1,  String  nome){
             
        jIdhospedagem.setText(nome);
              
               
}
public void  enviaNome (TelaHospedagem veiDo1,  String  nome){
             
        jNome.setText(nome);
              
               
}
ListaConsumo janela2= new ListaConsumo();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField11 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jNome = new javax.swing.JTextField();
        jIdhospedagem = new javax.swing.JTextField();
        jNomeproduto = new javax.swing.JTextField();
        jAdicionar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPreco = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jQuantidade = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jDia = new javax.swing.JFormattedTextField();
        jMes = new javax.swing.JFormattedTextField();
        jAno = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();

        jTextField11.setText("jTextField11");

        jButton6.setText("jButton6");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/ScreenHunter_05 May. 13 15.56.gif"))); // NOI18N

        jTextField7.setText("jTextField7");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/ScreenHunter_05 May. 13 15.56.gif"))); // NOI18N
        jLabel15.setText("jLabel15");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/ScreenHunter_05 May. 13 15.56.gif"))); // NOI18N
        jLabel16.setText("jLabel16");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jLabel2.setText("Hospedagem:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel3.setText("Nome produto:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, 20));

        jLabel4.setText("Preco:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));
        getContentPane().add(jNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 290, -1));
        getContentPane().add(jIdhospedagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 80, -1));

        jNomeproduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNomeprodutoMouseClicked(evt);
            }
        });
        getContentPane().add(jNomeproduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 290, -1));

        jAdicionar.setBackground(new java.awt.Color(153, 255, 255));
        jAdicionar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/filesave.png"))); // NOI18N
        jAdicionar.setText("Salvar");
        jAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(jAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 150, -1));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 128, -1, -1));

        jPreco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPrecoMouseClicked(evt);
            }
        });
        getContentPane().add(jPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 80, -1));

        jLabel12.setText("Quantidade:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 80, 20));

        jQuantidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jQuantidadeMouseClicked(evt);
            }
        });
        getContentPane().add(jQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 80, -1));

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/edit_add.png"))); // NOI18N
        jButton2.setText("Novo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 150, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "IdConsumo", "Hospedagem", "NomeProduto", "Preco", "Quantidade", "Nome", "Dia", "Mes", "Ano"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 790, 220));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 210, -1));

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/search.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        jLabel5.setText("Hospedagem:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 20));

        jButton3.setBackground(new java.awt.Color(153, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/filter.png"))); // NOI18N
        jButton3.setText("Listar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 150, -1));

        jButton4.setBackground(new java.awt.Color(153, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/print.png"))); // NOI18N
        jButton4.setText("Imprimir");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 100, -1));

        jButton5.setBackground(new java.awt.Color(153, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/redo.png"))); // NOI18N
        jButton5.setText("ConsumoTotal");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 150, -1));

        jLabel6.setText("Data:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        try {
            jDia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 60, -1));

        try {
            jMes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 60, -1));

        try {
            jAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 60, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/fd.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdicionarActionPerformed
       if(jNome.getText().equals("")){
    javax.swing.JOptionPane.showMessageDialog(null, "Nome campo obrigatório","",2);
    return;
}if(jPreco.getText().equals("")){
    javax.swing.JOptionPane.showMessageDialog(null, "Preco campo obrigatório","",2);
    return;
}if(jDia.getText().equals("")){
    javax.swing.JOptionPane.showMessageDialog(null, "Dia campo obrigatório","",2);
    return;
}if(jQuantidade.getText().equals("")){
    javax.swing.JOptionPane.showMessageDialog(null, "Quantidade campo obrigatório","",2);
    return;
}if(jAno.getText().equals("")){
    javax.swing.JOptionPane.showMessageDialog(null, "Ano campo obrigatório","",2);
    return;

}if(jMes.getText().equals("")){
    javax.swing.JOptionPane.showMessageDialog(null, "Mes campo obrigatório","",2);
    return;
}if(jIdhospedagem.getText().equals("")){
    javax.swing.JOptionPane.showMessageDialog(null, "Hospedagem campo obrigatório","",2);
    return;
}if(jNomeproduto.getText().equals("")){
    javax.swing.JOptionPane.showMessageDialog(null, "Produto campo obrigatório","",2);
    return;
}
  javax.swing.JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
       consumo.adicionar(this.telaConsumo());
     this.consumoTela(consumo.exibir());
    
           
    }//GEN-LAST:event_jAdicionarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jNome.setText(null);
        jIdhospedagem.setText(null);
        jNomeproduto.setText(null);
        jQuantidade.setText(null);
        jPreco.setText(null);
        jDia.setText(null);
        jAno.setText(null);
       
        jMes.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn;
           conn =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?zeroDateTimeBehavior=convertToNull", "root", "root");
       String query="SELECT  *FROM consumo WHERE idhospedagem LIKE   ?";
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
                   
                    rs.getString("idconsumo"),
                  
                   rs.getString("idhospedagem"),
                  
                   rs.getString("nomeproduto"),
                    rs.getString("preco"),
                 rs.getString("quantidade"),
                  rs.getString("nome"),
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn;
           conn =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?zeroDateTimeBehavior=convertToNull", "root", "root");
       String query="SELECT  *FROM consumo ";
       PreparedStatement cmd;
       cmd= conn.prepareStatement(query);
      
       ResultSet rs;
       rs= cmd.executeQuery();
       DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
       model.setNumRows(0);
       
       while(rs.next()){
           
       model.addRow(
               new Object[]{
                   
                    rs.getString("idconsumo"),
                  
                   rs.getString("idhospedagem"),
                  
                   rs.getString("nomeproduto"),
                    rs.getString("preco"),
                 rs.getString("quantidade"),
                  rs.getString("nome"),
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
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       if(!jIdhospedagem.getText().isEmpty()){
       
       if(janela2==null){
          
 janela2= new ListaConsumo();
              
           janela2.setVisible(true);
             
       }else{
        
           janela2.setVisible(true);
             
       }
      janela2.enviaPalavra(this, jIdhospedagem.getText() );
      }   
       dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jNomeprodutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNomeprodutoMouseClicked
        try {
              //Registra JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
 
            //Abrindo a conexão
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?zeroDateTimeBehavior=convertToNull", "root", "root");
            
            //Executa a query de seleção
          
            java.sql.Statement st = conn.createStatement();
            st.executeQuery("select * from produto ");
              ResultSet rs = st.getResultSet();
              
              JPopupMenu popup1 = new JPopupMenu();
               JPopupMenu popup2 = new JPopupMenu();
                 JPopupMenu popup3 = new JPopupMenu();
                   JPopupMenu popup4 = new JPopupMenu();
                    JPopupMenu popup5 = new JPopupMenu();
                     JPopupMenu popup6 = new JPopupMenu();
                      JPopupMenu popup7 = new JPopupMenu();
                       JPopupMenu popup8 = new JPopupMenu();
                        JPopupMenu popup9 = new JPopupMenu();
                         JPopupMenu popup10 = new JPopupMenu();
   
                while (rs.next()){
         
                 // Especifica os dados em ordena.
                 JMenuItem item = new JMenuItem (rs.getString("nomeproduto"));
        item.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
             jNomeproduto.setText(((JMenuItem) e.getSource()).getText());
                  
            }
      
         });
          // Especifica os dados em ordena.
                 JMenuItem item1 = new JMenuItem (rs.getString("precoproduto"));
        item1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
           
                  
            }
      
         });
           
            
       
                //Adiciona item ao jText
              popup1.add(item);
              popup2.add(item);
              popup3.add(item);
              popup4.add(item);
               popup5.add(item);
              popup6.add(item);
              popup7.add(item);
              popup8.add(item);
               popup9.add(item);
              popup10.add(item);
               popup1.add(item1);
              popup2.add(item1);
              popup3.add(item1);
              popup4.add(item1);
               popup5.add(item1);
              popup6.add(item1);
              popup7.add(item1);
              popup8.add(item1);
               popup9.add(item1);
              popup10.add(item1);
              
                //Mostra na Tela
              popup1.show(jNomeproduto, 0, 30);
              popup2.show(jNomeproduto, 0, 30);
              popup3.show(jNomeproduto, 0, 30);
              popup4.show(jNomeproduto, 0, 30);
              popup5.show(jNomeproduto, 0, 30);
              popup6.show(jNomeproduto, 0, 30);
              popup7.show(jNomeproduto, 0, 30);
              popup8.show(jNomeproduto, 0, 30);
              popup9.show(jNomeproduto, 0, 30);
              popup10.show(jNomeproduto, 0, 30);
           
    
                }
             
                
           
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(jNomeproduto, e);
        }//Fim try
    }//GEN-LAST:event_jNomeprodutoMouseClicked

    private void jPrecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPrecoMouseClicked
        try {
              //Registra JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
 
            //Abrindo a conexão
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?zeroDateTimeBehavior=convertToNull", "root", "root");
            
            //Executa a query de seleção
          
            java.sql.Statement st = conn.createStatement();
            st.executeQuery("select * from produto ");
              ResultSet rs = st.getResultSet();
              
              JPopupMenu popup1 = new JPopupMenu();
               JPopupMenu popup2 = new JPopupMenu();
                 JPopupMenu popup3 = new JPopupMenu();
                   JPopupMenu popup4 = new JPopupMenu();
                    JPopupMenu popup5 = new JPopupMenu();
                     JPopupMenu popup6 = new JPopupMenu();
                      JPopupMenu popup7 = new JPopupMenu();
                       JPopupMenu popup8 = new JPopupMenu();
                        JPopupMenu popup9 = new JPopupMenu();
                         JPopupMenu popup10 = new JPopupMenu();
   
                while (rs.next()){
         
                 // Especifica os dados em ordena.
                 JMenuItem item = new JMenuItem (rs.getString("nomeproduto"));
        item.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
            
                  
            }
      
         });
          // Especifica os dados em ordena.
                 JMenuItem item1 = new JMenuItem (rs.getString("precoproduto"));
        item1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
             jPreco.setText(((JMenuItem) e.getSource()).getText());
                  
            }
      
         });
           
            
       
                //Adiciona item ao jText
              popup1.add(item);
              popup2.add(item);
              popup3.add(item);
              popup4.add(item);
               popup5.add(item);
              popup6.add(item);
              popup7.add(item);
              popup8.add(item);
               popup9.add(item);
              popup10.add(item);
               popup1.add(item1);
              popup2.add(item1);
              popup3.add(item1);
              popup4.add(item1);
               popup5.add(item1);
              popup6.add(item1);
              popup7.add(item1);
              popup8.add(item1);
               popup9.add(item1);
              popup10.add(item1);
              
                //Mostra na Tela
              popup1.show(jPreco, 0, 30);
              popup2.show(jPreco, 0, 30);
              popup3.show(jPreco, 0, 30);
              popup4.show(jPreco, 0, 30);
              popup5.show(jPreco, 0, 30);
              popup6.show(jPreco, 0, 30);
              popup7.show(jPreco, 0, 30);
              popup8.show(jPreco, 0, 30);
              popup9.show(jPreco, 0, 30);
              popup10.show(jPreco, 0, 30);
           
    
                }
             
                
           
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(jPreco, e);
        }//Fim try
    }//GEN-LAST:event_jPrecoMouseClicked

    private void jQuantidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuantidadeMouseClicked
       

        JMenuItem item1 = new JMenuItem("1");
        item1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                jQuantidade.setText("1");
            }
        });

        //cria o segundo item do menu e atribui uma ação pra ele
        JMenuItem item2 = new JMenuItem("2");
        item2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
              jQuantidade.setText("2");
               
                
                double preco =         Double.parseDouble(jPreco.getText());
                double  quantidade=    Double.parseDouble(jQuantidade.getText()); 
               
            
              jPreco.setText(String.valueOf(preco * quantidade));
                
                
            }
        });

        //cria o terceiro item do menu e atribui uma ação pra ele
        JMenuItem item3 = new JMenuItem("3");
        item3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                jQuantidade.setText("3");
                 double preco =         Double.parseDouble(jPreco.getText());
                double  quantidade=    Double.parseDouble(jQuantidade.getText()); 
               
            
              jPreco.setText(String.valueOf(preco * quantidade));
            }
        });
         JMenuItem item4 = new JMenuItem("4");
        item4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                jQuantidade.setText("4");
                 double preco =         Double.parseDouble(jPreco.getText());
                double  quantidade=    Double.parseDouble(jQuantidade.getText()); 
               
            
              jPreco.setText(String.valueOf(preco * quantidade));
            }
        });
         JMenuItem item5 = new JMenuItem("5");
        item5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                jQuantidade.setText("5");
                 double preco =         Double.parseDouble(jPreco.getText());
                double  quantidade=    Double.parseDouble(jQuantidade.getText()); 
               
            
              jPreco.setText(String.valueOf(preco * quantidade));
            }
        });
         JMenuItem item6 = new JMenuItem("6");
        item6.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                jQuantidade.setText("6"); double preco =         Double.parseDouble(jPreco.getText());
                double  quantidade=    Double.parseDouble(jQuantidade.getText()); 
               
            
              jPreco.setText(String.valueOf(preco * quantidade));
                
            }
        });


        //cria o menu popup e adiciona os 3 itens
        JPopupMenu popup = new JPopupMenu();
        popup.add(item1);
        popup.add(item2);
        popup.add(item3);
        popup.add(item4);
        popup.add(item5);
        popup.add(item6);

        //mostra na tela
        popup.show(jQuantidade, 0, 30);
    
        

    }//GEN-LAST:event_jQuantidadeMouseClicked

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
            java.util.logging.Logger.getLogger(TelaConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsumo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAdicionar;
    private javax.swing.JFormattedTextField jAno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JFormattedTextField jDia;
    private javax.swing.JTextField jIdhospedagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JFormattedTextField jMes;
    private javax.swing.JTextField jNome;
    private javax.swing.JTextField jNomeproduto;
    private javax.swing.JTextField jPreco;
    private javax.swing.JTextField jQuantidade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
public Consumo telaConsumo(){
  
    String nome= (this.jNome.getText());
      int idhospedagem= Integer.parseInt(this.jIdhospedagem.getText());
    String nomeproduto= (this.jNomeproduto.getText());
      String preco= (this.jPreco.getText());
   int quantidade=  Integer.parseInt(this.jQuantidade.getText());
     int dia=  Integer.parseInt(this.jDia.getText());
    int ano=  Integer.parseInt(this.jAno.getText());
    
     int mes= Integer.parseInt(this.jMes.getText());
     
  return (new Consumo (nome,idhospedagem,nomeproduto,preco,quantidade, dia,mes,ano));  

   }
   
    public void consumoTela(Consumo consumo){
      
        this.jNome.setText(consumo.getNome());
          this.jIdhospedagem.setText(consumo.getIdhospedagem()+"");
        this.jNomeproduto.setText(consumo.getNomeproduto());
      this.jPreco.setText(consumo.getPreco());
        this.jQuantidade.setText(consumo.getQuantidade()+"");
        this.jDia.setText(consumo.getDia()+"");
        this.jAno.setText(consumo.getAno()+"");
       
        this.jMes.setText(consumo.getMes()+"");
        
        
        }
    public void limpaTela(){
       
        this.jNome.setText("");
         this.jIdhospedagem.setText("");
        this.jNomeproduto.setText("");
           this.jPreco.setText("");
            this.jQuantidade.setText("");
            this.jDia.setText("");
              this.jAno.setText("");
                  
                      this.jMes.setText("");

    
                
}
}