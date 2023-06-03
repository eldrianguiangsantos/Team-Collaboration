package incident;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeGUI extends javax.swing.JFrame {

    public HomeGUI() {
        initComponents();
        setFixedSize(); // Set the preferred size of the frame
        setLocationRelativeTo(null); // Center the frame on the screen
    }

    private void initComponents() {
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 24));
        jButton2.setText("View Reports");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setFont(new java.awt.Font("Century Gothic", 0, 24));
        jButton3.setText("Create New Report");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        // Set a layout manager (GridLayout) and add buttons to the content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(1, 2));
        contentPane.add(jButton3);
        contentPane.add(jButton2);

        pack();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO: add your handling code here
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO: add your handling code here
        NewReportGUI newReportGUI = new NewReportGUI();
        newReportGUI.setVisible(true);
        dispose(); // Close the HomeGUI window
    }

    private void setFixedSize() {
        // Set the preferred size of the frame
        Dimension size = new Dimension(800, 400);
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeGUI().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
}