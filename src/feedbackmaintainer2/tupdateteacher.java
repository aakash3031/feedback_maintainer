/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feedbackmaintainer2;
import java.sql.Connection;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author CS
 */
public class tupdateteacher extends javax.swing.JInternalFrame {

    /**
     * Creates new form studentregistraition
     */
    public tupdateteacher() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        label3 = new java.awt.Label();
        textField2 = new java.awt.TextField();
        label4 = new java.awt.Label();
        textArea1 = new java.awt.TextArea();
        label5 = new java.awt.Label();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        label8 = new java.awt.Label();
        textField4 = new java.awt.TextField();
        jButton3 = new javax.swing.JButton();
        textField5 = new java.awt.TextField();
        label7 = new java.awt.Label();
        label6 = new java.awt.Label();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPasswordField1 = new javax.swing.JPasswordField();
        label9 = new java.awt.Label();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        label1.setBackground(new java.awt.Color(204, 204, 204));
        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(102, 0, 0));
        label1.setText("UPDATE TEACHER");
        getContentPane().add(label1);
        label1.setBounds(240, 10, 210, 28);

        label2.setBackground(new java.awt.Color(204, 204, 204));
        label2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label2.setForeground(new java.awt.Color(102, 0, 0));
        label2.setText("Name");
        getContentPane().add(label2);
        label2.setBounds(90, 130, 96, 19);

        textField1.setBackground(new java.awt.Color(204, 204, 204));
        textField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textField1.setForeground(new java.awt.Color(102, 0, 0));
        getContentPane().add(textField1);
        textField1.setBounds(230, 120, 190, 30);

        label3.setBackground(new java.awt.Color(204, 204, 204));
        label3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label3.setForeground(new java.awt.Color(102, 0, 0));
        label3.setText("Phone");
        getContentPane().add(label3);
        label3.setBounds(90, 180, 96, 19);

        textField2.setBackground(new java.awt.Color(204, 204, 204));
        textField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textField2.setForeground(new java.awt.Color(102, 0, 0));
        getContentPane().add(textField2);
        textField2.setBounds(230, 170, 190, 30);

        label4.setBackground(new java.awt.Color(204, 204, 204));
        label4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label4.setForeground(new java.awt.Color(102, 0, 0));
        label4.setText("Address");
        getContentPane().add(label4);
        label4.setBounds(90, 310, 96, 19);

        textArea1.setBackground(new java.awt.Color(204, 204, 204));
        textArea1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textArea1.setForeground(new java.awt.Color(102, 0, 0));
        getContentPane().add(textArea1);
        textArea1.setBounds(230, 270, 190, 120);

        label5.setBackground(new java.awt.Color(204, 204, 204));
        label5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label5.setForeground(new java.awt.Color(102, 0, 0));
        label5.setText("Gender");
        getContentPane().add(label5);
        label5.setBounds(90, 400, 70, 19);

        jRadioButton1.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(102, 0, 0));
        jRadioButton1.setText("Female");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(320, 400, 93, 23);

        jRadioButton2.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(102, 0, 0));
        jRadioButton2.setText("Male");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(230, 400, 70, 23);

        label8.setBackground(new java.awt.Color(204, 204, 204));
        label8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label8.setForeground(new java.awt.Color(102, 0, 0));
        label8.setText("Email");
        getContentPane().add(label8);
        label8.setBounds(90, 220, 96, 30);

        textField4.setBackground(new java.awt.Color(204, 204, 204));
        textField4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textField4.setForeground(new java.awt.Color(102, 0, 0));
        getContentPane().add(textField4);
        textField4.setBounds(230, 220, 190, 30);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 0, 0));
        jButton3.setText("UPDATE");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(490, 480, 120, 30);

        textField5.setBackground(new java.awt.Color(204, 204, 204));
        textField5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textField5.setForeground(new java.awt.Color(102, 0, 0));
        textField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField5ActionPerformed(evt);
            }
        });
        getContentPane().add(textField5);
        textField5.setBounds(230, 70, 190, 30);

        label7.setBackground(new java.awt.Color(204, 204, 204));
        label7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label7.setForeground(new java.awt.Color(102, 0, 0));
        label7.setName(""); // NOI18N
        label7.setText("TeacherID/Username");
        getContentPane().add(label7);
        label7.setBounds(90, 80, 130, 19);

        label6.setBackground(new java.awt.Color(204, 204, 204));
        label6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label6.setForeground(new java.awt.Color(102, 0, 0));
        label6.setText("Course");
        getContentPane().add(label6);
        label6.setBounds(90, 490, 70, 19);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(230, 480, 190, 30);

        jPasswordField1.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(102, 0, 0));
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(230, 440, 190, 30);

        label9.setBackground(new java.awt.Color(204, 204, 204));
        label9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label9.setForeground(new java.awt.Color(102, 0, 0));
        label9.setText("Password");
        getContentPane().add(label9);
        label9.setBounds(90, 440, 96, 19);

        setBounds(0, 0, 672, 553);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setBackground(Color.GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setBackground(Color.LIGHT_GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String url="jdbc:mysql://localhost/feedback";
        try
        {
            Connection myconn =DriverManager.getConnection(url, "root", "");
            try
            {

                String q="update addteacher set name=?,phone=?,email=?,address=?,gender=?,password=?,course=? where teacherid=?";
                PreparedStatement state=myconn.prepareStatement(q);
                
                
                String q2="update courseteacher set tname=? where cname=?";
                PreparedStatement state2=myconn.prepareStatement(q2);
                
                state.setString(1, textField1.getText());
                state.setString(2, textField2.getText());
                state.setString(3, textField4.getText());
                state.setString(4, textArea1.getText());
                if(jRadioButton1.isSelected())
                {
                    state.setString(5,"Female");
                }
                else
                {
                    state.setString(5,"Male");
                }
               
                state.setString(6,jPasswordField1.getText());
                state.setString(7,jComboBox1.getSelectedItem().toString());
                state.setString(8,textField5.getText());

              
                state2.setString(1,textField1.getText());
                state2.setString(2,jComboBox1.getSelectedItem().toString());
                int res=state.executeUpdate();
                int res2=state2.executeUpdate();
                if(res>0&& res2>0)
                {

                    JOptionPane.showMessageDialog(rootPane, "Teacher Updated Succesfully");
                    textField1.setText("");
                    textField2.setText("");
                    textField4.setText("");
                    buttonGroup1.clearSelection();
                    textArea1.setText("");
                    textField5.setText("");
                    jPasswordField1.setText("");
                    jComboBox1.removeAllItems();
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Teacher Not Updated Succesfully");
                     textField1.setText("");
                    textField2.setText("");
                    textField4.setText("");
                    buttonGroup1.clearSelection();
                    textArea1.setText("");
                    textField5.setText("");
                    jPasswordField1.setText("");
                    jComboBox1.removeAllItems();
                }

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "error in query"+e.getMessage());
            }
            finally
            {
                myconn.close();
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(rootPane, "error in connection"+e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void textField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
  
        String url="jdbc:mysql://localhost/feedback";
try
{
    Connection myconn =DriverManager.getConnection(url, "root", "");
try
{  
    String q1="select * from addcourse";
    PreparedStatement state2=myconn.prepareStatement(q1);
    ResultSet res2=state2.executeQuery();
while(res2.next())
{
     jComboBox1.addItem(res2.getString("name"));
}
if(jComboBox1.getItemCount()==1)
{
    jComboBox1.removeAllItems();
    jComboBox1.addItem("no course available");
    JOptionPane.showMessageDialog(rootPane, "No course available first add course");  
    this.dispose();
}
   
}
                 catch(SQLException e)
                    {
              JOptionPane.showMessageDialog(rootPane, "Error in Query"+e.getMessage());
                    } 
            finally
            {
                myconn.close();
            }
}
catch(Exception e)
{
   JOptionPane.showMessageDialog(rootPane, "Error in connection"+e.getMessage());  
}
             String url2="jdbc:mysql://localhost/feedback";
        try
        {
            Connection myconn=DriverManager.getConnection(url, "root", "");
            try
            {

                String q2="select * from addteacher where teacherid=?";
                PreparedStatement state2=myconn.prepareStatement(q2);
                state2.setString(1, loginteacher.teacherid);
                ResultSet res2=state2.executeQuery();
                if(res2.next())
                {
                    jButton3.setVisible(true);
                    
                    textField1.setText(res2.getString("name"));
                    textField5.setText(res2.getString("teacherid"));
                    textField2.setText(res2.getString("phone"));
                    textArea1.setText(res2.getString("address"));
                    textField4.setText(res2.getString("email"));
                    jComboBox1.setSelectedItem(res2.getString("course"));
                    if(res2.getString("gender").equalsIgnoreCase("Male"))
                    {
                        jRadioButton2.setSelected(true);
                    }
                    else
                    {
                        jRadioButton1.setSelected(true);
                    }

                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Invalid Teacher");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Error in Query"+e.getMessage());
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(rootPane, "Error in Connection"+e.getMessage());
   // TODO add your handling code here:
        }
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.TextArea textArea1;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    // End of variables declaration//GEN-END:variables
}
