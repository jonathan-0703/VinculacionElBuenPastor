/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author nini2
 */
public class Crear_NuevoUsuario extends javax.swing.JFrame {

    /**
     * Creates new form VistaCrear
     */
    public Crear_NuevoUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Agregar Usuario");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLblRetroceder = new javax.swing.JLabel();
        Jtf_NomUsu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPsw_ContraUsu = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Jbtn_guardarUsu = new javax.swing.JButton();
        jCmBTipo = new javax.swing.JComboBox<>();
        jCmBestadoUsu = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(228, 244, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(393, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLblRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/retroceso.png"))); // NOI18N
        jPanel1.add(jLblRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Jtf_NomUsu.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        Jtf_NomUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtf_NomUsuActionPerformed(evt);
            }
        });
        jPanel1.add(Jtf_NomUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 270, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Agregar Usuario Nuevo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 330, 40));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel9.setText("Contraseña");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jPsw_ContraUsu.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jPanel1.add(jPsw_ContraUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 270, -1));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel10.setText("Tipo");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel11.setText("Estado");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        Jbtn_guardarUsu.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Jbtn_guardarUsu.setText("Agregar");
        jPanel1.add(Jbtn_guardarUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 200, 40));

        jCmBTipo.setEditable(true);
        jCmBTipo.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jCmBTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asistente", "Administrador" }));
        jCmBTipo.setToolTipText("fd");
        jPanel1.add(jCmBTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 270, 30));

        jCmBestadoUsu.setEditable(true);
        jCmBestadoUsu.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jCmBestadoUsu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        jCmBestadoUsu.setToolTipText("fd");
        jPanel1.add(jCmBestadoUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 270, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jtf_NomUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtf_NomUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtf_NomUsuActionPerformed

  
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
            java.util.logging.Logger.getLogger(Crear_NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear_NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear_NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear_NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear_NuevoUsuario().setVisible(true);
            }
        });
    }

    public JButton getJbtn_guardarUsu() {
        return Jbtn_guardarUsu;
    }

    public void setJbtn_guardarUsu(JButton Jbtn_guardarUsu) {
        this.Jbtn_guardarUsu = Jbtn_guardarUsu;
    }

    public JPasswordField getjPsw_ContraUsu() {
        return jPsw_ContraUsu;
    }

    public void setjPsw_ContraUsu(JPasswordField jPsw_ContraUsu) {
        this.jPsw_ContraUsu = jPsw_ContraUsu;
    }

    public JLabel getjLblRetroceder() {
        return jLblRetroceder;
    }

    public void setjLblRetroceder(JLabel jLblRetroceder) {
        this.jLblRetroceder = jLblRetroceder;
    }

    

    public JTextField getJtf_NomUsu() {
        return Jtf_NomUsu;
    }

    public void setJtf_NomUsu(JTextField Jtf_NomUsu) {
        this.Jtf_NomUsu = Jtf_NomUsu;
    }

    public JComboBox<String> getjCmBTipo() {
        return jCmBTipo;
    }

    public void setjCmBTipo(JComboBox<String> jCmBTipo) {
        this.jCmBTipo = jCmBTipo;
    }

    public JComboBox<String> getjCmBestadoUsu() {
        return jCmBestadoUsu;
    }

    public void setjCmBestadoUsu(JComboBox<String> jCmBestadoUsu) {
        this.jCmBestadoUsu = jCmBestadoUsu;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn_guardarUsu;
    private javax.swing.JTextField Jtf_NomUsu;
    private javax.swing.JComboBox<String> jCmBTipo;
    private javax.swing.JComboBox<String> jCmBestadoUsu;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblRetroceder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPsw_ContraUsu;
    // End of variables declaration//GEN-END:variables
}
