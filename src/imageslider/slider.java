/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageslider;

import java.awt.Image;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

import javafx.animation.*;;

/**
 *
 * @author Dell
 */
public class slider extends javax.swing.JFrame {

    /**
     * Creates new form slider
     */
    public slider() {
        initComponents();
        show(position);
    }
    int position=0;
public String[] takeimage()
{
    File f=new File(getClass().getResource("/imagespath").getFile());
    String[] Images=f.list();
    return Images;
}

public void show(int index)
{
    String[] Images=takeimage();
    String img=Images[index];
    ImageIcon icon=new ImageIcon(getClass().getResource("/imagespath/"+img));
    Image image=icon.getImage().getScaledInstance(label1.getWidth(), label1.getHeight(), Image.SCALE_SMOOTH);
    label1.setIcon(new ImageIcon(image));
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
        jLabel2 = new javax.swing.JLabel();
        previous = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageslider/icons8_Cancel_30px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        getContentPane().add(jLabel2, null);

        previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageslider/icons8_Back_To_64px.png"))); // NOI18N
        previous.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                previousMousePressed(evt);
            }
        });
        getContentPane().add(previous, null);

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageslider/icons8_Next_page_52px.png"))); // NOI18N
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nextMousePressed(evt);
            }
        });
        getContentPane().add(next,null);
        getContentPane().add(label1, null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageslider/bg-5-full (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMousePressed
      new Thread();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(slider.class.getName()).log(Level.SEVERE, null, ex);
        }
        int p=this.label1.getX();
        
        if(p>-1)
        {
        }
        position=position+1;
        if(position>=takeimage().length)
        {
            position=takeimage().length-1;
        }
        show(position);
    }//GEN-LAST:event_nextMousePressed

    private void previousMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousMousePressed
       new Thread();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(slider.class.getName()).log(Level.SEVERE, null, ex);
        }
        int p=this.label1.getX();
        
        if(p>-1)
        {
        }
          position=position-1;
        if(position<0)
        {
            position=0;
        }
        show(position);
    }//GEN-LAST:event_previousMousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
       System.exit(0);
    }//GEN-LAST:event_jLabel2MousePressed

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
            java.util.logging.Logger.getLogger(slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new slider().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel next;
    private javax.swing.JLabel previous;
    // End of variables declaration//GEN-END:variables
}
