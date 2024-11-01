/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forme;

import controller.Controller;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Knjiga;
import model.Zanr;

/**
 *
 * @author milic
 */
public class GlavnaForma extends javax.swing.JFrame {

    private Controller kontroler;

    /**
     * Creates new form GlavnaForma
     */
    public GlavnaForma() {
        initComponents();
        kontroler = Controller.getInstance();
        //ModelTabeleKnjige modelTabele = new ModelTabeleKnjige(kontroler.getListaKnjiga());
        ModelTabeleKnjige modelTabele = new ModelTabeleKnjige(kontroler.ucitajListuKnjigaIzBaze());
        jTableKnjige.setModel(modelTabele);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableKnjige = new javax.swing.JTable();
        jButtonObrisi = new javax.swing.JButton();
        jButtonIzmeni = new javax.swing.JButton();
        jButtonDodaj = new javax.swing.JButton();
        jTextFieldNaziv = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldAutor = new javax.swing.JTextField();
        jComboBoxZanr = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jCheckBoxStrip = new javax.swing.JCheckBox();
        jCheckBoxNaucniCasopis = new javax.swing.JCheckBox();
        jButtonFiltriraj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableKnjige.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableKnjige);

        jButtonObrisi.setText("Obrisi");
        jButtonObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonObrisiActionPerformed(evt);
            }
        });

        jButtonIzmeni.setText("Izmeni");
        jButtonIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIzmeniActionPerformed(evt);
            }
        });

        jButtonDodaj.setText("Dodaj");
        jButtonDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDodajActionPerformed(evt);
            }
        });

        jLabel1.setText("Naziv:");

        jLabel2.setText("Autor:");

        jComboBoxZanr.setModel(new DefaultComboBoxModel(Zanr.values()));

        jLabel3.setText("Zanr:");

        jCheckBoxStrip.setText("strip");

        jCheckBoxNaucniCasopis.setText("naucni casopis");

        jButtonFiltriraj.setText("filtriraj");
        jButtonFiltriraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrirajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonObrisi)
                            .addComponent(jButtonIzmeni)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(165, 165, 165)
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26)
                                .addComponent(jComboBoxZanr, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(232, 232, 232))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButtonFiltriraj)
                                        .addGap(71, 71, 71)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxNaucniCasopis)
                                    .addComponent(jCheckBoxStrip))))
                        .addGap(0, 141, Short.MAX_VALUE)))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonDodaj)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jButtonObrisi)
                .addGap(72, 72, 72)
                .addComponent(jButtonIzmeni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxZanr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jButtonFiltriraj))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jCheckBoxStrip)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxNaucniCasopis)))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonObrisiActionPerformed
        int selektovaniRed = jTableKnjige.getSelectedRow();

        if (selektovaniRed == -1) {
            JOptionPane.showMessageDialog(this, "Morate selektovati knjigu koju zelite obrisati", "Upozorenje", JOptionPane.WARNING_MESSAGE);
        } else {
            ModelTabeleKnjige mtk = (ModelTabeleKnjige) jTableKnjige.getModel();
            int id = mtk.getListaKnjiga().get(selektovaniRed).getId();
            Controller controller = Controller.getInstance();
            controller.obrisiKnjigu(id);

            osveziTabelu();
        }

    }//GEN-LAST:event_jButtonObrisiActionPerformed

    private void jButtonDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDodajActionPerformed
        FormaKnjiga fk = new FormaKnjiga(this, true, null);
        fk.setVisible(true);
    }//GEN-LAST:event_jButtonDodajActionPerformed

    private void jButtonIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIzmeniActionPerformed
        int selektovaniRed = jTableKnjige.getSelectedRow();

        if (selektovaniRed == -1) {
            JOptionPane.showMessageDialog(this, "Morate selektovati knjigu koju zelite izmeniti", "Upozorenje", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Controller controller = Controller.getInstance();
        Knjiga selektovanaKnjiga = controller.ucitajListuKnjigaIzBaze().get(selektovaniRed);

        FormaKnjiga fk = new FormaKnjiga(this, true, selektovanaKnjiga);
        fk.setVisible(true);

    }//GEN-LAST:event_jButtonIzmeniActionPerformed

    private void jButtonFiltrirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrirajActionPerformed
        String autor = jTextFieldAutor.getText().trim();
        String naziv = jTextFieldNaziv.getText().trim();

        //iz lok.mem.
        List<Knjiga> filtriranaLista = kontroler.filtriraj(autor,naziv);
        
        //iz baze
        List<Knjiga> filtriranaLista2 = kontroler.filtriraj2(autor,naziv);
        
        ModelTabeleKnjige mtkf = new ModelTabeleKnjige(filtriranaLista2);
        jTableKnjige.setModel(mtkf);       
        
    }//GEN-LAST:event_jButtonFiltrirajActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDodaj;
    private javax.swing.JButton jButtonFiltriraj;
    private javax.swing.JButton jButtonIzmeni;
    private javax.swing.JButton jButtonObrisi;
    private javax.swing.JCheckBox jCheckBoxNaucniCasopis;
    private javax.swing.JCheckBox jCheckBoxStrip;
    private javax.swing.JComboBox<String> jComboBoxZanr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableKnjige;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldNaziv;
    // End of variables declaration//GEN-END:variables

    void osveziTabelu() {
        ModelTabeleKnjige modelTabele = new ModelTabeleKnjige(kontroler.ucitajListuKnjigaIzBaze());
        jTableKnjige.setModel(modelTabele);

        /*ModelTabeleKnjige modelTabele = (ModelTabeleKnjige) jTableKnjige.getModel();
        modelTabele.osveziPodatke();*/
    }
}
