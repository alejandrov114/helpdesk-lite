/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.Usuario;

/**
 *
 * @author alejo
 */
public class panelControlAdmin extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(panelControlAdmin.class.getName());

    /**
     * Creates new form panelControlAdmin
     */
    
    
    public panelControlAdmin() {
        initComponents();
    }
    
    public panelControlAdmin(Usuario usuario) {
    initComponents();
    setLocationRelativeTo(null);
    setTitle("Panel del Administrador - " + usuario.getNombre());

    // Aquí podrías actualizar un label si lo necesitas
    labelNombreAdmin.setText("Hola, " + usuario.getNombre());
    
    btnCerrarSesionAdmin.addActionListener(e -> {
    dispose(); // Cierra esta ventana
    new MainLogin().setVisible(true); // Abre la pantalla de login
});
    
    btnVerTodosTickets.addActionListener(e -> {
    // Aquí puedes abrir la ventana que muestra todos los tickets
    System.out.println("Mostrar todos los tickets");
});
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanelControlAdmin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCerrarSesionAdmin = new javax.swing.JButton();
        btnVerTicketsCerrados = new javax.swing.JButton();
        btnVerTodosTickets = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelNombreAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgPanelControlAdmin.setBackground(new java.awt.Color(255, 255, 255));
        bgPanelControlAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Inter 24pt Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(26, 67, 191));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¿Que deseas hacer hoy?");
        bgPanelControlAdmin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        btnCerrarSesionAdmin.setText("Cerrar Sesion");
        bgPanelControlAdmin.add(btnCerrarSesionAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        btnVerTicketsCerrados.setText("Ver tickets cerrados");
        bgPanelControlAdmin.add(btnVerTicketsCerrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        btnVerTodosTickets.setText("Ver todos Tickets");
        bgPanelControlAdmin.add(btnVerTodosTickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        jPanel1.setBackground(new java.awt.Color(26, 67, 191));

        jLabel1.setFont(new java.awt.Font("Inter 18pt Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenid@!");

        labelNombreAdmin.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        labelNombreAdmin.setForeground(new java.awt.Color(255, 255, 255));
        labelNombreAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombreAdmin.setText("Hola [Nombre]");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(labelNombreAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNombreAdmin)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        bgPanelControlAdmin.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanelControlAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanelControlAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new panelControlAdmin().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanelControlAdmin;
    private javax.swing.JButton btnCerrarSesionAdmin;
    private javax.swing.JButton btnVerTicketsCerrados;
    private javax.swing.JButton btnVerTodosTickets;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNombreAdmin;
    // End of variables declaration//GEN-END:variables
}
