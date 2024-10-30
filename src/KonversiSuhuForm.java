import javax.swing.JOptionPane;

public class KonversiSuhuForm extends javax.swing.JFrame {

    /** Creates new form KonversiSuhuForm */
    public KonversiSuhuForm() {
        initComponents();
    }
    
    private void konversiSuhu() {
    try {
        // Ambil nilai suhu dari input
        double suhu = Double.parseDouble(txtSuhu.getText());
        double hasil = 0;

        // Ambil skala suhu awal dari ComboBox
        String skalaAwal = (String) cmbSkala.getSelectedItem();

        // Cek arah konversi berdasarkan RadioButton yang dipilih
        if (rdbToFahrenheit.isSelected()) {
            if (skalaAwal.equals("Celcius")) {
                hasil = suhu * 9/5 + 32; // Celcius ke Fahrenheit
            } else if (skalaAwal.equals("Kelvin")) {
                hasil = (suhu - 273.15) * 9/5 + 32; // Kelvin ke Fahrenheit
            } else if (skalaAwal.equals("Reamur")) {
                hasil = suhu * 9/4 + 32; // Reamur ke Fahrenheit
            }
        } else if (rdbToCelcius.isSelected()) {
            if (skalaAwal.equals("Fahrenheit")) {
                hasil = (suhu - 32) * 5/9; // Fahrenheit ke Celcius
            } else if (skalaAwal.equals("Kelvin")) {
                hasil = suhu - 273.15; // Kelvin ke Celcius
            } else if (skalaAwal.equals("Reamur")) {
                hasil = suhu * 5/4; // Reamur ke Celcius
            }
        } else if (rdbToKelvin.isSelected()) {
            if (skalaAwal.equals("Celcius")) {
                hasil = suhu + 273.15; // Celcius ke Kelvin
            } else if (skalaAwal.equals("Fahrenheit")) {
                hasil = (suhu - 32) * 5/9 + 273.15; // Fahrenheit ke Kelvin
            } else if (skalaAwal.equals("Reamur")) {
                hasil = suhu * 5/4 + 273.15; // Reamur ke Kelvin
            }
        } else if (rdbToReamur.isSelected()) {
            if (skalaAwal.equals("Celcius")) {
                hasil = suhu * 4/5; // Celcius ke Reamur
            } else if (skalaAwal.equals("Fahrenheit")) {
                hasil = (suhu - 32) * 4/9; // Fahrenheit ke Reamur
            } else if (skalaAwal.equals("Kelvin")) {
                hasil = (suhu - 273.15) * 4/5; // Kelvin ke Reamur
            }
        }

        // Tampilkan hasil konversi
        lblHasil.setText("Hasil: " + hasil);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Input harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}



    


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblHasil = new javax.swing.JTextField();
        cmbSkala = new javax.swing.JComboBox<>();
        rdbToCelcius = new javax.swing.JRadioButton();
        rdbToFahrenheit = new javax.swing.JRadioButton();
        btnKonversi = new javax.swing.JButton();
        txtSuhu = new javax.swing.JTextField();
        rdbToKelvin = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        rdbToReamur = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nilai Suhu");

        jLabel2.setText("Hasil Konversi");

        jLabel3.setText("Pilih Skala Suhu");

        lblHasil.setEditable(false);
        lblHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblHasilActionPerformed(evt);
            }
        });
        lblHasil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblHasilKeyTyped(evt);
            }
        });

        cmbSkala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Fahrenheit", "Kelvin", "Reamur" }));
        cmbSkala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonGroup1.add(rdbToCelcius);
        rdbToCelcius.setText("Ke Celcius");

        buttonGroup1.add(rdbToFahrenheit);
        rdbToFahrenheit.setText("Ke Fahrenheit");

        btnKonversi.setBackground(new java.awt.Color(153, 204, 255));
        btnKonversi.setText("Konversikan");
        btnKonversi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonversiActionPerformed(evt);
            }
        });

        txtSuhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuhuActionPerformed(evt);
            }
        });
        txtSuhu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSuhuKeyTyped(evt);
            }
        });

        buttonGroup1.add(rdbToKelvin);
        rdbToKelvin.setText("Ke Kelvin");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Aplikasi Konversi Suhu");

        buttonGroup1.add(rdbToReamur);
        rdbToReamur.setText("Reamur");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbSkala, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdbToFahrenheit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbToCelcius)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbToKelvin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdbToReamur))
                    .addComponent(btnKonversi)
                    .addComponent(lblHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSkala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbToFahrenheit)
                    .addComponent(rdbToCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbToKelvin)
                    .addComponent(rdbToReamur))
                .addGap(18, 18, 18)
                .addComponent(btnKonversi)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblHasilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblHasilKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lblHasilKeyTyped

    private void lblHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblHasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblHasilActionPerformed

    private void btnKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonversiActionPerformed
         konversiSuhu();        // TODO add your handling code here:
    }//GEN-LAST:event_btnKonversiActionPerformed

    private void txtSuhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuhuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuhuActionPerformed

    private void txtSuhuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSuhuKeyTyped
        char input = evt.getKeyChar();
    if(!Character.isDigit(input)){
        evt.consume(); // Hanya angka yang diperbolehkan
    }          // TODO add your handling code here:
    }//GEN-LAST:event_txtSuhuKeyTyped

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
            java.util.logging.Logger.getLogger(KonversiSuhuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhuForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKonversi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbSkala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lblHasil;
    private javax.swing.JRadioButton rdbToCelcius;
    private javax.swing.JRadioButton rdbToFahrenheit;
    private javax.swing.JRadioButton rdbToKelvin;
    private javax.swing.JRadioButton rdbToReamur;
    private javax.swing.JTextField txtSuhu;
    // End of variables declaration//GEN-END:variables

}
