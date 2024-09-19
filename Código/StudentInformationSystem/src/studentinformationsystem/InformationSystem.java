// Trabalho realizado por Miguel Magalhães, Nº2021103166, ISPGAYA, aluno do curso de Redes e Sistemas Informáticos, no âmbito da Unidade Curricular de Linguagens de Programação, orientado pelo Sr. Professor Henrique Teixeira.

package studentinformationsystem;

import java.sql.Connection; // Importa a classe Connection para estabelecer a conexão com a base de dados
import java.sql.DriverManager; // Importa a classe DriverManager para gerenciar a conexão
import java.sql.PreparedStatement; // Importa a classe PreparedStatement para executar consultas SQL parametrizadas
import java.sql.ResultSet; // Importa a classe ResultSet para armazenar os resultados de uma consulta SQL
import java.sql.ResultSetMetaData; // Importa a classe ResultSetMetaData para obter informações sobre os resultados de uma consulta SQL
import java.sql.SQLException; // Importa a classe SQLException para tratar erros relacionados a SQL
import java.util.Vector; // Importa a classe Vector para criar vetores dinâmicos
import java.util.logging.Level; // Importa a classe Level para definir níveis de log
import java.util.logging.Logger; // Importa a classe Logger para registar logs
import javax.swing.JOptionPane; // Importa a classe JOptionPane para exibir diálogos de mensagem
import javax.swing.table.DefaultTableModel; // Importa a classe DefaultTableModel para manipular dados em tabelas
public class InformationSystem extends javax.swing.JFrame {

    // Construtor da classe InformationSystem
    public InformationSystem() {
        initComponents(); // Inicializa os componentes da interface gráfica
        show_table(); // Chama o método para mostrar os dados na tabela
    }

    Connection con = null; // Declaração da variável de conexão com a base de dados
    PreparedStatement pst = null; // Declaração da variável para execução de consultas SQL

    // Método para exibir os dados na tabela
    private void show_table() {
        int CC; // Variável para armazenar o número de colunas

        try {
            // Estabelece a conexão com a base de dados
            con = DriverManager.getConnection("jdbc:mysql://localhost/studentinfo", "root", "");
            // Prepara a consulta SQL
            pst = con.prepareStatement("SELECT * FROM info");
            ResultSet Rs = pst.executeQuery(); // Executa a consulta e armazena os resultados
            ResultSetMetaData RSMD = Rs.getMetaData(); // Obtém meta dados dos resultados
            CC = RSMD.getColumnCount(); // Obtém o número de colunas
            DefaultTableModel DFT = (DefaultTableModel) jTable1.getModel(); // Obtém o modelo da tabela

            DFT.setRowCount(0); // Limpa a tabela
            while (Rs.next()) { // Itera sobre os resultados
                Vector v2 = new Vector(); // Cria um vetor para armazenar uma linha de dados

                for (int i = 1; i <= CC; i++) { // Itera sobre as colunas
                    v2.add(Rs.getString("id")); // Adiciona o ID ao vetor
                    v2.add(Rs.getString("firstname")); // Adiciona o primeiro nome ao vetor
                    v2.add(Rs.getString("lastname")); // Adiciona o último nome ao vetor
                    v2.add(Rs.getString("email")); // Adiciona o email ao vetor
                    v2.add(Rs.getString("rollnumber")); // Adiciona o número de aluno ao vetor
                    v2.add(Rs.getString("course")); // Adiciona o curso ao vetor
                }
                DFT.addRow(v2); // Adiciona a linha de dados à tabela
            }
        } catch (SQLException ex) { // Trata exceções SQL
            Logger.getLogger(InformationSystem.class.getName()).log(Level.SEVERE, null, ex); // Regista o erro
        }
    }

    // Este método é chamado dentro do construtor para inicializar a interface gráfica.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtfirstname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtlastname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtrollno = new javax.swing.JTextField();
        txtcourse = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de Contactos - ISPGAYA");

        jTable1.setForeground(new java.awt.Color(204, 102, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Email", "Roll Number", "Course"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 102, 0));
        jLabel1.setText("Agenda de Contactos - ISPGAYA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Primeiro Nome (Firstname):");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Segundo Nome (Lastname):");

        jButton1.setBackground(new java.awt.Color(0, 51, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Atualizar/Update");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtlastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlastnameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Número do Aluno\n(Student number):");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Curso (Course):");

        jButton2.setBackground(new java.awt.Color(51, 255, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Inserir/Insert");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Apagar/Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtlastname)
                    .addComponent(txtfirstname)
                    .addComponent(txtemail)
                    .addComponent(txtcourse)
                    .addComponent(txtrollno)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(565, 565, 565))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtlastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtrollno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtcourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jButton2)
                .addGap(13, 13, 13)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(200, 200, 200))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Método chamado ao clicar na tabela
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtlastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlastnameActionPerformed
    
    }//GEN-LAST:event_txtlastnameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
        
        String fname, lname, email, rollnumber, course;
        
        fname = txtfirstname.getText();
        lname = txtlastname.getText();
        email = txtemail.getText();
        rollnumber = txtrollno.getText();
        course = txtcourse.getText();
        
        if(fname.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor insira o seu primeiro nome / Please enter your first name");
        }
        else if(lname.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor insira o seu último nome / Please enter your last name");
        }
        else if(email.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor insira o seu email / Please enter your email");
        }
        else if(rollnumber.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor insira o seu número de aluno / Please enter your Student number");
        }
        else if(course.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor insira o seu curso / Please enter your course");
        }
        
        else {
            
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/studentinfo","root","");
                pst = con.prepareStatement("insert into info (firstname, lastname, email, rollnumber, course)values(?,?,?,?,?)");
                
                pst.setString(1, fname);
                pst.setString(2, lname);
                pst.setString(3, email);
                pst.setString(4, rollnumber);
                pst.setString(5, course);
                
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Inserted Successfully");
                show_table();
                
                
                txtfirstname.setText("");
                txtlastname.setText("");
                txtemail.setText("");
                txtrollno.setText("");
                txtcourse.setText("");
                
            } catch (SQLException ex) {
                Logger.getLogger(InformationSystem.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        
        int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
        txtfirstname.setText(model.getValueAt(selectedIndex, 1).toString());
        txtlastname.setText(model.getValueAt(selectedIndex, 2).toString());
        txtemail.setText(model.getValueAt(selectedIndex, 3).toString());
        txtrollno.setText(model.getValueAt(selectedIndex, 4).toString());
        txtcourse.setText(model.getValueAt(selectedIndex, 5).toString());
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        String fname, lname, email, rollnumber, course;
        
        fname = txtfirstname.getText();
        lname = txtlastname.getText();
        email = txtemail.getText();
        rollnumber = txtrollno.getText();
        course = txtcourse.getText();
        
        if(fname.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor insira o seu primeiro nome / Please enter your first name");
        }
        else if(lname.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor insira o seu último nome / Please enter your last name");
        }
        else if(email.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor insira o seu email / Please enter your email");
        }
        else if(rollnumber.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor insira o seu número de aluno / Please enter your Student number");
        }
        else if(course.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor insira o seu curso / Please enter your course");
        }
        
        else {
            try {
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                int selectedIndex = jTable1.getSelectedRow();
                int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
                con = DriverManager.getConnection("jdbc:mysql://localhost/studentinfo","root","");
                
                pst = con.prepareStatement ("update info set firstname =?, lastname=?, email =?, rollnumber =?, course = ? where id =?");
                
                pst.setString(1, fname);
                pst.setString(2, lname);
                pst.setString(3, email);
                pst.setString(4, rollnumber);
                pst.setString(5, course);
                pst.setInt(6, id);
                
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso / Data updated successfully");
                show_table();
                
                txtfirstname.setText("");
                txtlastname.setText("");
                txtemail.setText("");
                txtrollno.setText("");
                txtcourse.setText("");
                
            } catch (SQLException ex) {
                Logger.getLogger(InformationSystem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            
            
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            int selectedIndex = jTable1.getSelectedRow();
            int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
            con = DriverManager.getConnection("jdbc:mysql://localhost/studentinfo","root","");
            pst = con.prepareStatement("Delete from info where id = ?");
            
            pst.setInt(1,id);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro excluído / Record deleted");
            show_table();
            
            txtfirstname.setText("");
            txtlastname.setText("");
            txtemail.setText("");
            txtrollno.setText("");
            txtcourse.setText("");
            
            
        } catch (SQLException ex) {
            // Trata possíveis erros de SQL
            Logger.getLogger(InformationSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args os argumentos da linha de comando
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
            java.util.logging.Logger.getLogger(InformationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Cria e exibe o formulário */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformationSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtcourse;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JTextField txtrollno;
    // End of variables declaration//GEN-END:variables
}

// Trabalho realizado por Miguel Magalhães, Nº2021103166, ISPGAYA, aluno do curso de Redes e Sistemas Informáticos, no âmbito da Unidade Curricular de Linguagens de Programação, orientado pelo Sr. Professor Henrique Teixeira.
