/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b.tree.insert_11741159_11811146_;

import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiffanny
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_insertar = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jcmb_existe = new javax.swing.JComboBox<>();
        jbtn_cargar = new javax.swing.JButton();
        jbtn_abrir = new javax.swing.JButton();
        jbtn_insertar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtxt_codigo_insert = new javax.swing.JTextField();
        jd_buscar = new javax.swing.JDialog();
        jd_eliminar = new javax.swing.JDialog();
        jd_crear = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jtxt_codigo = new javax.swing.JTextField();
        jbtn_crear = new javax.swing.JButton();
        jbtn_agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_acciones = new javax.swing.JMenu();
        jmi_crear = new javax.swing.JMenuItem();
        jmi_insertar = new javax.swing.JMenuItem();
        jmi_buscar = new javax.swing.JMenuItem();
        jmi_borrar = new javax.swing.JMenuItem();

        jLabel2.setFont(new java.awt.Font("DengXian", 1, 14)); // NOI18N
        jLabel2.setText("Existen");

        jcmb_existe.setFont(new java.awt.Font("DengXian", 0, 14)); // NOI18N
        jcmb_existe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        jbtn_cargar.setText("Cargar");
        jbtn_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cargarActionPerformed(evt);
            }
        });

        jbtn_abrir.setText("Abrir");
        jbtn_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_abrirActionPerformed(evt);
            }
        });

        jbtn_insertar.setText("Insertar");

        jLabel3.setFont(new java.awt.Font("DengXian", 1, 14)); // NOI18N
        jLabel3.setText("Codigo");

        jtxt_codigo_insert.setFont(new java.awt.Font("DengXian", 0, 14)); // NOI18N

        javax.swing.GroupLayout jd_insertarLayout = new javax.swing.GroupLayout(jd_insertar.getContentPane());
        jd_insertar.getContentPane().setLayout(jd_insertarLayout);
        jd_insertarLayout.setHorizontalGroup(
            jd_insertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_insertarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_insertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jd_insertarLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxt_codigo_insert))
                    .addGroup(jd_insertarLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcmb_existe, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jd_insertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtn_cargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtn_insertar, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jbtn_abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jd_insertarLayout.setVerticalGroup(
            jd_insertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_insertarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_insertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcmb_existe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_cargar)
                    .addComponent(jbtn_abrir))
                .addGap(30, 30, 30)
                .addGroup(jd_insertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxt_codigo_insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_insertar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_buscarLayout = new javax.swing.GroupLayout(jd_buscar.getContentPane());
        jd_buscar.getContentPane().setLayout(jd_buscarLayout);
        jd_buscarLayout.setHorizontalGroup(
            jd_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_buscarLayout.setVerticalGroup(
            jd_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_eliminarLayout = new javax.swing.GroupLayout(jd_eliminar.getContentPane());
        jd_eliminar.getContentPane().setLayout(jd_eliminarLayout);
        jd_eliminarLayout.setHorizontalGroup(
            jd_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_eliminarLayout.setVerticalGroup(
            jd_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("DengXian", 1, 14)); // NOI18N
        jLabel1.setText("Codigo");

        jtxt_codigo.setFont(new java.awt.Font("DengXian", 0, 11)); // NOI18N

        jbtn_crear.setText("Crear");
        jbtn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_crearActionPerformed(evt);
            }
        });

        jbtn_agregar.setText("Agregar");
        jbtn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_agregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_crearLayout = new javax.swing.GroupLayout(jd_crear.getContentPane());
        jd_crear.getContentPane().setLayout(jd_crearLayout);
        jd_crearLayout.setHorizontalGroup(
            jd_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jbtn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jbtn_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jd_crearLayout.setVerticalGroup(
            jd_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jd_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_crear)
                    .addComponent(jbtn_agregar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Jason Josué Deras Rodríguez - 11741159\nTiffanny Alexa Varela Banegas - 11811146");
        jScrollPane1.setViewportView(jTextArea1);

        jm_acciones.setText("Acciones");

        jmi_crear.setText("Crear");
        jmi_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_crearActionPerformed(evt);
            }
        });
        jm_acciones.add(jmi_crear);

        jmi_insertar.setText("Insertar");
        jmi_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_insertarActionPerformed(evt);
            }
        });
        jm_acciones.add(jmi_insertar);

        jmi_buscar.setText("Buscar");
        jmi_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_buscarActionPerformed(evt);
            }
        });
        jm_acciones.add(jmi_buscar);

        jmi_borrar.setText("Borrar");
        jmi_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_borrarActionPerformed(evt);
            }
        });
        jm_acciones.add(jmi_borrar);

        jMenuBar1.add(jm_acciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_crearActionPerformed
        // TODO add your handling code here:
        nombreArch = JOptionPane.showInputDialog(null, "Nombre", JOptionPane.QUESTION_MESSAGE);
        jd_crear.setModal(true);
        jd_crear.pack();
        jd_crear.setLocationRelativeTo(this);
        jd_crear.setVisible(true);
    }//GEN-LAST:event_jmi_crearActionPerformed

    private void jmi_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_insertarActionPerformed
        // TODO add your handling code here:
        jd_insertar.setModal(true);
        jd_insertar.pack();
        jd_insertar.setLocationRelativeTo(this);
        jd_insertar.setVisible(true);
    }//GEN-LAST:event_jmi_insertarActionPerformed

    private void jmi_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_buscarActionPerformed
        // TODO add your handling code here:
        jd_buscar.setModal(true);
        jd_buscar.pack();
        jd_buscar.setLocationRelativeTo(this);
        jd_buscar.setVisible(true);
    }//GEN-LAST:event_jmi_buscarActionPerformed

    private void jmi_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_borrarActionPerformed
        // TODO add your handling code here:
        jd_eliminar.setModal(true);
        jd_eliminar.pack();
        jd_eliminar.setLocationRelativeTo(this);
        jd_eliminar.setVisible(true);
    }//GEN-LAST:event_jmi_borrarActionPerformed

    private void jbtn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_agregarActionPerformed
        // TODO add your handling code here:
        int cod = Integer.parseInt(jtxt_codigo.getText());
        entero = new Entero(cod);
        enteros.add(entero);
        jtxt_codigo.setText("");
        
    }//GEN-LAST:event_jbtn_agregarActionPerformed

    private void jbtn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_crearActionPerformed
        // TODO add your handling code here:
        try {
            admin = new Admin_Entero(nombreArch+".rw");
            admin.setCampos(enteros);
            admin.Escribir();
            enteros.clear();
            jd_crear.setVisible(false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jbtn_crearActionPerformed

    private void jbtn_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cargarActionPerformed
        // TODO add your handling code here:
        try {
            jcmb_existe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
            File carpeta = new File (ruta);
            ArrayList <String> docs = new ArrayList<String>();
            for (File archivo : carpeta.listFiles()) {
                if (archivo.isFile() && (archivo.getName().contains(".rw"))) {
                    docs.add(archivo.getName());
                }
            }
            if (docs.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay ningun archivo", "Carpeta Vacia", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                DefaultComboBoxModel modelo = (DefaultComboBoxModel) jcmb_existe.getModel();
                for (int i = 0; i < docs.size(); i++) {
                    modelo.addElement(docs.get(i));
                    jcmb_existe.setModel(modelo);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jbtn_cargarActionPerformed

    private void jbtn_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_abrirActionPerformed
        // TODO add your handling code here:
        nombreArch = jcmb_existe.getSelectedItem().toString();
        admin = new Admin_Entero(nombreArch);
        admin.Cargar();
        
    }//GEN-LAST:event_jbtn_abrirActionPerformed

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbtn_abrir;
    private javax.swing.JButton jbtn_agregar;
    private javax.swing.JButton jbtn_cargar;
    private javax.swing.JButton jbtn_crear;
    private javax.swing.JButton jbtn_insertar;
    private javax.swing.JComboBox<String> jcmb_existe;
    private javax.swing.JDialog jd_buscar;
    private javax.swing.JDialog jd_crear;
    private javax.swing.JDialog jd_eliminar;
    private javax.swing.JDialog jd_insertar;
    private javax.swing.JMenu jm_acciones;
    private javax.swing.JMenuItem jmi_borrar;
    private javax.swing.JMenuItem jmi_buscar;
    private javax.swing.JMenuItem jmi_crear;
    private javax.swing.JMenuItem jmi_insertar;
    private javax.swing.JTextField jtxt_codigo;
    private javax.swing.JTextField jtxt_codigo_insert;
    // End of variables declaration//GEN-END:variables
String nombreArch = "";
Admin_Entero admin;
String ruta = "./Creados/";
Entero entero;
ArrayList <Entero> enteros = new ArrayList();
}
