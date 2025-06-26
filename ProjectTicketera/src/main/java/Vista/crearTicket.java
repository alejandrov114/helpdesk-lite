package Vista;

import Modelo.Cliente;
import Modelo.Ticket;
import Modelo.TicketManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class crearTicket extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(crearTicket.class.getName());

    private TicketManager ticketManager;
    private Cliente clienteActual;

    public crearTicket(TicketManager ticketManager, Cliente cliente) {
        initComponents();
        this.ticketManager = ticketManager;
        this.clienteActual = cliente;

        btnCrearTicket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearNuevoTicket();
            }
        });
    }

    private void crearNuevoTicket() {
    String titulo = txtTitulo.getText().trim();
    String descripcion = txtDescripcion.getText().trim();
    String prioridad = (String) cmbPrioridad.getSelectedItem();

    if (titulo.isEmpty() || descripcion.isEmpty() || prioridad.equals("-")) {
        JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    ticketManager.crearTicket(titulo, descripcion, prioridad, clienteActual);

    JOptionPane.showMessageDialog(this, "Ticket creado exitosamente.");

    // Aquí podés abrir la ventana de tickets del cliente si la tenés (opcional)
    // new panelControlCliente(ticketManager, clienteActual).setVisible(true);

    dispose(); // cerrar esta ventana
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgCrearTicket = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        cmbPrioridad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnCrearTicket = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgCrearTicket.setBackground(new java.awt.Color(255, 255, 255));
        bgCrearTicket.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(26, 67, 191));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        bgCrearTicket.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 400));

        jLabel1.setFont(new java.awt.Font("Inter 24pt Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(26, 67, 191));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido al área de solicitudes");
        bgCrearTicket.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 400, -1));

        jLabel2.setText("Titulo");
        bgCrearTicket.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 110, -1));

        txtTitulo.setText("jTextField1");
        bgCrearTicket.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 220, -1));

        jLabel3.setText("Descripción del problema");
        bgCrearTicket.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        bgCrearTicket.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 230, -1));

        cmbPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Alta", "Media", "Baja" }));
        bgCrearTicket.add(cmbPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        jLabel4.setText("Prioridad");
        bgCrearTicket.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        btnCrearTicket.setText("Crear Ticket");
        bgCrearTicket.add(btnCrearTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgCrearTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgCrearTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            TicketManager ticketManager = new TicketManager();
            Cliente clienteDummy = new Cliente("Juan Pérez", "juan@mail.com", "cliente1", 1, "1234");

            crearTicket ventana = new crearTicket(ticketManager, clienteDummy);
            ventana.setVisible(true);
        });
    }

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgCrearTicket;
    private javax.swing.JButton btnCrearTicket;
    private javax.swing.JComboBox<String> cmbPrioridad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}