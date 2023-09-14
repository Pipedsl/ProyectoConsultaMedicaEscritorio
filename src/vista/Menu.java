
package vista;
import modelo.Paciente;
import controlador.Registro;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 * 
 * @author Nicolas Acevedo - Hugo Navarrete
 */
public class Menu extends javax.swing.JFrame {
    private Registro registro = new Registro();
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    
        boolean conectado = registro.conectar();
        
        if(!conectado)//conectado == false;
            JOptionPane.showMessageDialog(null, "Falló conexion a BD");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnIAgregar = new javax.swing.JMenuItem();
        mnIListar = new javax.swing.JMenuItem();
        mnISalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Procesos");

        mnIAgregar.setText("Agregar");
        mnIAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIAgregarActionPerformed(evt);
            }
        });
        jMenu1.add(mnIAgregar);

        mnIListar.setText("Listar");
        mnIListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIListarActionPerformed(evt);
            }
        });
        jMenu1.add(mnIListar);

        mnISalir.setText("Salir");
        mnISalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnISalirActionPerformed(evt);
            }
        });
        jMenu1.add(mnISalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnIAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnIAgregarActionPerformed
        Agregar a1 = new Agregar();
        a1.setVisible(true);
    }//GEN-LAST:event_mnIAgregarActionPerformed

    private void mnIListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnIListarActionPerformed
        Listar l1 = new Listar();
        l1.setVisible(true);
    }//GEN-LAST:event_mnIListarActionPerformed

    private void mnISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnISalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_mnISalirActionPerformed
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnIAgregar;
    private javax.swing.JMenuItem mnIListar;
    private javax.swing.JMenuItem mnISalir;
    // End of variables declaration//GEN-END:variables
}
