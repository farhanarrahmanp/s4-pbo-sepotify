
package view;

import model.Playlist;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.*;
import javax.swing.DefaultListModel;
import java.util.ArrayList;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.AncestorListener;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class vSepotify extends javax.swing.JFrame {

    public vSepotify() {
        initComponents();
        this.setLocationRelativeTo(null);
        setSize(640, 480);
    }

    public void setlEmail(String lName) {
        this.lEmail.setText(lName);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_add2 = new javax.swing.JButton();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        p1 = new javax.swing.JPanel();
        spDaftarList = new javax.swing.JScrollPane();
        lDaftarList = new javax.swing.JList<>();
        lPlaylist = new javax.swing.JLabel();
        p11 = new javax.swing.JPanel();
        bUp = new javax.swing.JButton();
        bDown = new javax.swing.JButton();
        p12 = new javax.swing.JPanel();
        lPlay = new javax.swing.JLabel();
        lStop = new javax.swing.JLabel();
        lPause = new javax.swing.JLabel();
        lNext = new javax.swing.JLabel();
        lPrev = new javax.swing.JLabel();
        p13 = new javax.swing.JPanel();
        lSepotify = new javax.swing.JLabel();
        p14 = new javax.swing.JPanel();
        bAdd = new javax.swing.JButton();
        bRemove = new javax.swing.JButton();
        bOpen = new javax.swing.JButton();
        bSave = new javax.swing.JButton();
        bLogout = new javax.swing.JButton();
        lEmail = new javax.swing.JLabel();

        btn_add2.setBackground(new java.awt.Color(0, 102, 102));
        btn_add2.setFont(new java.awt.Font("Malayalam Sangam MN", 0, 13)); // NOI18N
        btn_add2.setText("PLAY");

        jMenuItem1.setText("jMenuItem1");

        jLabel3.setText("jLabel3");

        jLabel12.setFont(new java.awt.Font("Monaco", 1, 12)); // NOI18N
        jLabel12.setText("15101152610308");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p1.setBackground(new java.awt.Color(51, 51, 51));
        p1.setPreferredSize(new java.awt.Dimension(640, 480));

        lDaftarList.setBackground(new java.awt.Color(153, 153, 153));
        lDaftarList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lDaftarList.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lDaftarListAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lDaftarList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lDaftarListMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lDaftarListMouseClicked(evt);
            }
        });
        lDaftarList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lDaftarListKeyPressed(evt);
            }
        });
        spDaftarList.setViewportView(lDaftarList);

        lPlaylist.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lPlaylist.setForeground(new java.awt.Color(255, 255, 255));
        lPlaylist.setText("Playlist");

        p11.setBackground(new java.awt.Color(51, 51, 51));
        p11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bUp.setBackground(new java.awt.Color(51, 51, 51));
        bUp.setFont(new java.awt.Font("Malayalam Sangam MN", 0, 13)); // NOI18N
        bUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/iUp.png"))); // NOI18N
        bUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpActionPerformed(evt);
            }
        });

        bDown.setBackground(new java.awt.Color(51, 51, 51));
        bDown.setFont(new java.awt.Font("Malayalam Sangam MN", 0, 13)); // NOI18N
        bDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/iDown.png"))); // NOI18N
        bDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p11Layout = new javax.swing.GroupLayout(p11);
        p11.setLayout(p11Layout);
        p11Layout.setHorizontalGroup(
            p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bDown, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        p11Layout.setVerticalGroup(
            p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p11Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(bUp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bDown, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        p12.setBackground(new java.awt.Color(51, 51, 51));
        p12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p12MouseReleased(evt);
            }
        });

        lPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/iPlay.png"))); // NOI18N
        lPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lPlayMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lPlayMouseClicked(evt);
            }
        });

        lStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/iStop.png"))); // NOI18N
        lStop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lStopMouseClicked(evt);
            }
        });

        lPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/iPause.png"))); // NOI18N
        lPause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lPauseMouseClicked(evt);
            }
        });

        lNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/iNext.png"))); // NOI18N
        lNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lNextMouseClicked(evt);
            }
        });

        lPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/iPrev.png"))); // NOI18N
        lPrev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lPrevMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p12Layout = new javax.swing.GroupLayout(p12);
        p12.setLayout(p12Layout);
        p12Layout.setHorizontalGroup(
            p12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p12Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(lPrev)
                .addGap(35, 35, 35)
                .addComponent(lPause)
                .addGap(35, 35, 35)
                .addComponent(lPlay)
                .addGap(35, 35, 35)
                .addComponent(lStop)
                .addGap(35, 35, 35)
                .addComponent(lNext)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p12Layout.setVerticalGroup(
            p12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p12Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(p12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNext, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lPause)
                    .addComponent(lPrev)
                    .addComponent(lPlay)
                    .addComponent(lStop))
                .addGap(10, 10, 10))
        );

        p13.setBackground(new java.awt.Color(51, 51, 51));
        p13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lSepotify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/iSepotify.png"))); // NOI18N

        javax.swing.GroupLayout p13Layout = new javax.swing.GroupLayout(p13);
        p13.setLayout(p13Layout);
        p13Layout.setHorizontalGroup(
            p13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p13Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(lSepotify)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p13Layout.setVerticalGroup(
            p13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lSepotify, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );

        p14.setBackground(new java.awt.Color(51, 51, 51));
        p14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bAdd.setBackground(new java.awt.Color(51, 51, 51));
        bAdd.setFont(new java.awt.Font("Malayalam Sangam MN", 0, 13)); // NOI18N
        bAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/iAdd.png"))); // NOI18N
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bRemove.setBackground(new java.awt.Color(51, 51, 51));
        bRemove.setFont(new java.awt.Font("Malayalam Sangam MN", 0, 13)); // NOI18N
        bRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/iRemove.png"))); // NOI18N
        bRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemoveActionPerformed(evt);
            }
        });

        bOpen.setBackground(new java.awt.Color(51, 51, 51));
        bOpen.setFont(new java.awt.Font("Malayalam Sangam MN", 0, 13)); // NOI18N
        bOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/iOpen.png"))); // NOI18N
        bOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOpenActionPerformed(evt);
            }
        });

        bSave.setBackground(new java.awt.Color(51, 51, 51));
        bSave.setFont(new java.awt.Font("Malayalam Sangam MN", 0, 13)); // NOI18N
        bSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/iSave.png"))); // NOI18N
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p14Layout = new javax.swing.GroupLayout(p14);
        p14.setLayout(p14Layout);
        p14Layout.setHorizontalGroup(
            p14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p14Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bSave, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p14Layout.setVerticalGroup(
            p14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(bOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(bSave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bLogout.setText("LOGOUT");

        lEmail.setForeground(new java.awt.Color(255, 255, 255));
        lEmail.setText("{Email}");

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p1Layout.createSequentialGroup()
                        .addComponent(lPlaylist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bLogout))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p1Layout.createSequentialGroup()
                        .addComponent(spDaftarList, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(p11, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(p14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPlaylist)
                    .addComponent(bLogout)
                    .addComponent(lEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spDaftarList, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(640, 502));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDownActionPerformed
        // TODO add your handling code here:
        //down();
    }//GEN-LAST:event_bDownActionPerformed

    private void bUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpActionPerformed
        // TODO add your handling code here:
        //up();
    }//GEN-LAST:event_bUpActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        // TODO add your handling code here:
        //save();
    }//GEN-LAST:event_bSaveActionPerformed

    private void bOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOpenActionPerformed
        // TODO add your handling code here:
        //open();
    }//GEN-LAST:event_bOpenActionPerformed

    private void bRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoveActionPerformed
        // TODO add your handling code here:
        //remove();
    }//GEN-LAST:event_bRemoveActionPerformed

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        // TODO add your handling code here:
        //add();
    }//GEN-LAST:event_bAddActionPerformed

    private void lDaftarListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lDaftarListKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_lDaftarListKeyPressed

    private void lDaftarListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lDaftarListMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_lDaftarListMouseClicked

    private void lDaftarListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lDaftarListMousePressed
        // TODO add your handling code here:
        //putar();
    }//GEN-LAST:event_lDaftarListMousePressed

    private void lDaftarListAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lDaftarListAncestorAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_lDaftarListAncestorAdded

    private void lPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lPlayMouseClicked
        // TODO add your handling code here:
       // putar();
    }//GEN-LAST:event_lPlayMouseClicked

    private void lPauseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lPauseMouseClicked
        // TODO add your handling code here:
        //player.close();
    }//GEN-LAST:event_lPauseMouseClicked

    private void lNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lNextMouseClicked
        // TODO add your handling code here:
        //next();
    }//GEN-LAST:event_lNextMouseClicked

    private void lPrevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lPrevMouseClicked
        // TODO add your handling code here:
        //previous();
    }//GEN-LAST:event_lPrevMouseClicked

    private void lStopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lStopMouseClicked
        // TODO add your handling code here:
        //player.close();
    }//GEN-LAST:event_lStopMouseClicked

    private void lPlayMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lPlayMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lPlayMouseReleased

    private void p12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p12MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_p12MouseReleased

    /**
     * @param args the command line arguments
     */
    
    
    
    /*public static void main(String args[]) {*/
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vSepotify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vSepotify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vSepotify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vSepotify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vSepotify().setVisible(true);
            }
        });
    }*/

    public JButton getbAdd() {
        return bAdd;
    }

    public void setbAdd(JButton bAdd) {
        this.bAdd = bAdd;
    }

    public JButton getbDown() {
        return bDown;
    }

    public void setbDown(JButton bDown) {
        this.bDown = bDown;
    }

    public JButton getbOpen() {
        return bOpen;
    }

    public void setbOpen(JButton bOpen) {
        this.bOpen = bOpen;
    }

    public JButton getbRemove() {
        return bRemove;
    }

    public void setbRemove(JButton bRemove) {
        this.bRemove = bRemove;
    }

    public JButton getbSave() {
        return bSave;
    }

    public void setbSave(JButton bSave) {
        this.bSave = bSave;
    }

    public JButton getbUp() {
        return bUp;
    }

    /**
     * @param args the command line arguments
     */
    public void setbUp(JButton bUp) {
        this.bUp = bUp;
    }

    public JLabel getlNext() {
        return lNext;
    }

    public void setINext(JLabel INext) {
        this.lNext = INext;
    }

    public JLabel getlPause() {
        return lPause;
    }

    public void setlPause(JLabel lPause) {
        this.lPause = lPause;
    }

    public JLabel getlPlay() {
        return lPlay;
    }

    public void setlPlay(JLabel lPlay) {
        this.lPlay = lPlay;
    }

    public JLabel getlPrev() {
        return lPrev;
    }

    public void setlPrev(JLabel lPrev) {
        this.lPrev = lPrev;
    }

    public JLabel getlStop() {
        return lStop;
    }

    public void setlStop(JLabel lStop) {
        this.lStop = lStop;
    }

    public JList<String> getlDaftarList() {
        return lDaftarList;
    }

    public void setlDaftarList(JList<String> lDaftarList) {
        this.lDaftarList = lDaftarList;
    }

    public JButton getbLogout() {
        return bLogout;
    }
    
    
    public void addActionListener(ActionListener e) {
        bUp.addActionListener(e);
        bDown.addActionListener(e);  
        bAdd.addActionListener(e);
        bRemove.addActionListener(e);
        bOpen.addActionListener(e);
        bSave.addActionListener(e);
        bLogout.addActionListener(e);
    }
    
    @Override
    public void addMouseListener(MouseListener e){
        lPlay.addMouseListener(e);
        lPause.addMouseListener(e);
        lNext.addMouseListener(e);
        lPrev.addMouseListener(e);
        lStop.addMouseListener(e);
    }
    
        
    
    
    
    /*public static void main(String args[]) {*/
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vSepotify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vSepotify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vSepotify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vSepotify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vSepotify().setVisible(true);
            }
        });
    }*/
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bDown;
    private javax.swing.JButton bLogout;
    private javax.swing.JButton bOpen;
    private javax.swing.JButton bRemove;
    private javax.swing.JButton bSave;
    private javax.swing.JButton bUp;
    private javax.swing.JButton btn_add2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JList<String> lDaftarList;
    private javax.swing.JLabel lEmail;
    private javax.swing.JLabel lNext;
    private javax.swing.JLabel lPause;
    private javax.swing.JLabel lPlay;
    private javax.swing.JLabel lPlaylist;
    private javax.swing.JLabel lPrev;
    private javax.swing.JLabel lSepotify;
    private javax.swing.JLabel lStop;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p11;
    private javax.swing.JPanel p12;
    private javax.swing.JPanel p13;
    private javax.swing.JPanel p14;
    private javax.swing.JScrollPane spDaftarList;
    // End of variables declaration//GEN-END:variables

    
}


