import static java.lang.Thread.sleep;
import java.util.Random;
import javax.swing.JTextField;
import javax.swing.*;

public class Main extends javax.swing.JFrame {
    //Attributes
    Aeropuerto aeropuertoMadrid = new Aeropuerto("Madrid");
    Aeropuerto aeropuertoBarcelona = new Aeropuerto("Barcelona");
    
    Random r = new Random();
    boolean jButtonResumeStatus = false;
    
    public Main(){
        initComponents();
        this.setResizable(false);
    }

    //Getters y Setters
    public void setjButtonIniciar(JButton jButtonIniciar) {
        this.jButtonIniciar = jButtonIniciar;
    }

    public void setjButtonPausar(JButton jButtonPausar) {
        this.jButtonPausar = jButtonPausar;
    }

    public void setjButtonRenaudar(JButton jButtonRenaudar) {
        this.jButtonRenaudar = jButtonRenaudar;
    }

    public void setjTextFieldAEstacionamientoBarcelona(String jTextFieldAEstacionamientoBarcelona) {
        this.jTextFieldAEstacionamientoBarcelona.setText(jTextFieldAEstacionamientoBarcelona);
    }

    public void setjTextFieldAEstacionamientoMadrid(String jTextFieldAEstacionamientoMadrid) {
        this.jTextFieldAEstacionamientoMadrid.setText(jTextFieldAEstacionamientoMadrid);
    }

    public void setjTextFieldAeroviaBarcelona(String jTextFieldAeroviaBarcelona) {
        this.jTextFieldAeroviaBarcelona.setText(jTextFieldAeroviaBarcelona);
    }

    public void setjTextFieldAeroviaMadrid(String jTextFieldAeroviaMadrid) {
        this.jTextFieldAeroviaMadrid.setText(jTextFieldAeroviaMadrid);
    }

    public void setjTextFieldGate1Barcelona(String jTextFieldGate1Barcelona) {
        this.jTextFieldGate1Barcelona.setText(jTextFieldGate1Barcelona);
    }

    public void setjTextFieldGate1Madrid(String jTextFieldGate1Madrid) {
        this.jTextFieldGate1Madrid.setText(jTextFieldGate1Madrid);
    }

    public void setjTextFieldGate2Barcelona(String jTextFieldGate2Barcelona) {
        this.jTextFieldGate2Barcelona.setText(jTextFieldGate2Barcelona);
    }

    public void setjTextFieldGate2Madrid(String jTextFieldGate2Madrid) {
        this.jTextFieldGate2Madrid.setText(jTextFieldGate2Madrid);
    }

    public void setjTextFieldGate3Barcelona(String jTextFieldGate3Barcelona) {
        this.jTextFieldGate3Barcelona.setText(jTextFieldGate3Barcelona);
    }

    public void setjTextFieldGate3Madrid(String jTextFieldGate3Madrid) {
        this.jTextFieldGate3Madrid.setText(jTextFieldGate3Madrid);
    }

    public void setjTextFieldGate4Barcelona(String jTextFieldGate4Barcelona) {
        this.jTextFieldGate4Barcelona.setText(jTextFieldGate4Barcelona);
    }

    public void setjTextFieldGate4Madrid(String jTextFieldGate4Madrid) {
        this.jTextFieldGate4Madrid.setText(jTextFieldGate4Madrid);
    }

    public void setjTextFieldGate5Barcelona(String jTextFieldGate5Barcelona) {
        this.jTextFieldGate5Barcelona.setText(jTextFieldGate5Barcelona);
    }

    public void setjTextFieldGate5Madrid(String jTextFieldGate5Madrid) {
        this.jTextFieldGate5Madrid.setText(jTextFieldGate5Madrid);
    }

    public void setjTextFieldGate6Barcelona(String jTextFieldGate6Barcelona) {
        this.jTextFieldGate6Barcelona.setText(jTextFieldGate6Barcelona);
    }

    public void setjTextFieldGate6Madrid(String jTextFieldGate6Madrid) {
        this.jTextFieldGate6Madrid.setText(jTextFieldGate6Madrid);
    }

    public void setjTextFieldHangarBarcelona(String jTextFieldHangarBarcelona) {
        this.jTextFieldHangarBarcelona.setText(jTextFieldHangarBarcelona);
    }

    public void setjTextFieldHangarMadrid(String jTextFieldHangarMadrid) {
        this.jTextFieldHangarMadrid.setText(jTextFieldHangarMadrid);
    }

    public void setjTextFieldPasajerosBarcelona(String jTextFieldPasajerosBarcelona) {
        this.jTextFieldPasajerosBarcelona.setText(jTextFieldPasajerosBarcelona);
    }

    public void setjTextFieldPasajerosMadrid(String jTextFieldPasajerosMadrid) {
        this.jTextFieldPasajerosMadrid.setText(jTextFieldPasajerosMadrid);
    }

    public void setjTextFieldPista1Barcelona(String jTextFieldPista1Barcelona) {
        this.jTextFieldPista1Barcelona.setText(jTextFieldPista1Barcelona);
    }

    public void setjTextFieldPista1Madrid(String jTextFieldPista1Madrid) {
        this.jTextFieldPista1Madrid.setText(jTextFieldPista1Madrid);
    }

    public void setjTextFieldPista2Barcelona(String jTextFieldPista2Barcelona) {
        this.jTextFieldPista2Barcelona.setText(jTextFieldPista2Barcelona);
    }

    public void setjTextFieldPista2Madrid(String jTextFieldPista2Madrid) {
        this.jTextFieldPista2Madrid.setText(jTextFieldPista2Madrid);
    }

    public void setjTextFieldPista3Barcelona(String jTextFieldPista3Barcelona) {
        this.jTextFieldPista3Barcelona.setText(jTextFieldPista3Barcelona);
    }

    public void setjTextFieldPista3Madrid(String jTextFieldPista3Madrid) {
        this.jTextFieldPista3Madrid.setText(jTextFieldPista3Madrid);
    }

    public void setjTextFieldPista4Barcelona(String jTextFieldPista4Barcelona) {
        this.jTextFieldPista4Barcelona.setText(jTextFieldPista4Barcelona);
    }

    public void setjTextFieldPista4Madrid(String jTextFieldPista4Madrid) {
        this.jTextFieldPista4Madrid.setText(jTextFieldPista4Madrid);
    }

    public void setjTextFieldRodajeBarcelona(String jTextFieldRodajeBarcelona) {
        this.jTextFieldRodajeBarcelona.setText(jTextFieldRodajeBarcelona);
    }

    public void setjTextFieldRodajeMadrid(String jTextFieldRodajeMadrid) {
        this.jTextFieldRodajeMadrid.setText(jTextFieldRodajeMadrid);
    }

    public void setjTextFieldTallerBarcelona(String jTextFieldTallerBarcelona) {
        this.jTextFieldTallerBarcelona.setText(jTextFieldTallerBarcelona);
    }

    public void setjTextFieldTallerMadrid(String jTextFieldTallerMadrid) {
        this.jTextFieldTallerMadrid.setText(jTextFieldTallerMadrid);
    }

    public void setjTextFieldTransfersAeropuertoBarcelona(String jTextFieldTransfersAeropuertoBarcelona) {
        this.jTextFieldTransfersAeropuertoBarcelona.setText(jTextFieldTransfersAeropuertoBarcelona);
    }

    public void setjTextFieldTransfersAeropuertoMadrid(String jTextFieldTransfersAeropuertoMadrid) {
        this.jTextFieldTransfersAeropuertoMadrid.setText(jTextFieldTransfersAeropuertoMadrid);
    }

    public void setjTextFieldTransfersCiudadBarcelona(String jTextFieldTransfersCiudadBarcelona) {
        this.jTextFieldTransfersCiudadBarcelona.setText(jTextFieldTransfersCiudadBarcelona);
    }

    public void setjTextFieldTransfersCiudadMadrid(String jTextFieldTransfersCiudadMadrid) {
        this.jTextFieldTransfersCiudadMadrid.setText(jTextFieldTransfersCiudadMadrid);
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldAEstacionamientoMadrid = new javax.swing.JTextField();
        jTextFieldGate6Madrid = new javax.swing.JTextField();
        jTextFieldGate1Madrid = new javax.swing.JTextField();
        jTextFieldPasajerosMadrid = new javax.swing.JTextField();
        jTextFieldGate4Madrid = new javax.swing.JTextField();
        jTextFieldGate2Madrid = new javax.swing.JTextField();
        jTextFieldRodajeMadrid = new javax.swing.JTextField();
        jTextFieldTallerMadrid = new javax.swing.JTextField();
        jTextFieldGate3Madrid = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldGate5Madrid = new javax.swing.JTextField();
        jTextFieldHangarMadrid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldTransfersAeropuertoMadrid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldTransfersCiudadMadrid = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldPista1Madrid = new javax.swing.JTextField();
        jTextFieldPista2Madrid = new javax.swing.JTextField();
        jTextFieldPista3Madrid = new javax.swing.JTextField();
        jTextFieldPista4Madrid = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldAeroviaBarcelona = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldAeroviaMadrid = new javax.swing.JTextField();
        jButtonPausar = new javax.swing.JButton();
        jButtonRenaudar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextFieldAEstacionamientoBarcelona = new javax.swing.JTextField();
        jTextFieldGate6Barcelona = new javax.swing.JTextField();
        jTextFieldGate1Barcelona = new javax.swing.JTextField();
        jTextFieldPasajerosBarcelona = new javax.swing.JTextField();
        jTextFieldGate4Barcelona = new javax.swing.JTextField();
        jTextFieldGate2Barcelona = new javax.swing.JTextField();
        jTextFieldRodajeBarcelona = new javax.swing.JTextField();
        jTextFieldTallerBarcelona = new javax.swing.JTextField();
        jTextFieldGate3Barcelona = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextFieldGate5Barcelona = new javax.swing.JTextField();
        jTextFieldHangarBarcelona = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldTransfersAeropuertoBarcelona = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextFieldTransfersCiudadBarcelona = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jTextFieldPista1Barcelona = new javax.swing.JTextField();
        jTextFieldPista2Barcelona = new javax.swing.JTextField();
        jTextFieldPista3Barcelona = new javax.swing.JTextField();
        jTextFieldPista4Barcelona = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jButtonIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(java.awt.SystemColor.control);

        jLabel14.setText("Número de Pasajeros en el Aeropuerto:");

        jLabel15.setText("Hangar:");

        jLabel16.setText("Taller:");

        jTextFieldAEstacionamientoMadrid.setEditable(false);

        jTextFieldGate6Madrid.setEditable(false);

        jTextFieldGate1Madrid.setEditable(false);
        jTextFieldGate1Madrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGate1MadridActionPerformed(evt);
            }
        });

        jTextFieldPasajerosMadrid.setEditable(false);

        jTextFieldGate4Madrid.setEditable(false);
        jTextFieldGate4Madrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGate4MadridActionPerformed(evt);
            }
        });

        jTextFieldGate2Madrid.setEditable(false);

        jTextFieldRodajeMadrid.setEditable(false);

        jTextFieldTallerMadrid.setEditable(false);

        jTextFieldGate3Madrid.setEditable(false);

        jLabel17.setText("Área de Estacionamiento:");

        jLabel18.setText("Área de Rodaje:");

        jTextFieldGate5Madrid.setEditable(false);

        jTextFieldHangarMadrid.setEditable(false);
        jTextFieldHangarMadrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHangarMadridActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Nova", 1, 14)); // NOI18N
        jLabel8.setText("Aeropuerto de Madrid");

        jLabel4.setText("Transfers Aeropuerto:");

        jTextFieldTransfersAeropuertoMadrid.setEditable(false);

        jLabel5.setText("Transfers Ciudad:");

        jTextFieldTransfersCiudadMadrid.setEditable(false);
        jTextFieldTransfersCiudadMadrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTransfersCiudadMadridActionPerformed(evt);
            }
        });

        jLabel19.setText("Pista 1:");

        jLabel20.setText("Pista 2:");

        jTextFieldPista1Madrid.setEditable(false);

        jTextFieldPista2Madrid.setEditable(false);

        jTextFieldPista3Madrid.setEditable(false);

        jTextFieldPista4Madrid.setEditable(false);

        jLabel22.setText("Pista 3:");

        jLabel23.setText("Pista 4:");

        jLabel25.setText("Gate 1:");

        jLabel26.setText("Gate 2:");

        jLabel34.setText("Gate 3:");

        jLabel35.setText("Gate 6:");

        jLabel36.setText("Gate 4:");

        jLabel37.setText("Gate 5:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel34))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldGate2Madrid)
                            .addComponent(jTextFieldGate3Madrid)
                            .addComponent(jTextFieldGate1Madrid, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldGate5Madrid, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldGate6Madrid, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldGate4Madrid, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRodajeMadrid))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldTallerMadrid))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAEstacionamientoMadrid))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldHangarMadrid, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldPista2Madrid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jTextFieldPista1Madrid, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldPista4Madrid, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPista3Madrid, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTransfersAeropuertoMadrid, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTransfersCiudadMadrid, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldPasajerosMadrid, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(135, 135, 135))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldTransfersCiudadMadrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTransfersAeropuertoMadrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldPasajerosMadrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldHangarMadrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTallerMadrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAEstacionamientoMadrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGate4Madrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldGate1Madrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldGate5Madrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldGate2Madrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel37)
                        .addComponent(jLabel26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGate3Madrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jTextFieldGate6Madrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRodajeMadrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPista1Madrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jTextFieldPista3Madrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldPista2Madrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20)
                        .addComponent(jLabel23))
                    .addComponent(jTextFieldPista4Madrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("Aerovía Madrid-Barcelona:");

        jTextFieldAeroviaBarcelona.setEditable(false);
        jTextFieldAeroviaBarcelona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAeroviaBarcelonaActionPerformed(evt);
            }
        });

        jLabel7.setText("Aerovía Barcelona-Madrid:");

        jTextFieldAeroviaMadrid.setEditable(false);
        jTextFieldAeroviaMadrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAeroviaMadridActionPerformed(evt);
            }
        });

        jButtonPausar.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPausar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonPausar.setText("Pausar");
        jButtonPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPausarActionPerformed(evt);
            }
        });

        jButtonRenaudar.setBackground(new java.awt.Color(204, 204, 255));
        jButtonRenaudar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonRenaudar.setText("Renaudar");
        jButtonRenaudar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRenaudarActionPerformed(evt);
            }
        });

        jPanel7.setBackground(java.awt.SystemColor.control);

        jLabel27.setText("Número de Pasajeros en el Aeropuerto:");

        jLabel28.setText("Hangar:");

        jLabel29.setText("Taller:");

        jTextFieldAEstacionamientoBarcelona.setEditable(false);

        jTextFieldGate6Barcelona.setEditable(false);

        jTextFieldGate1Barcelona.setEditable(false);
        jTextFieldGate1Barcelona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGate1BarcelonaActionPerformed(evt);
            }
        });

        jTextFieldPasajerosBarcelona.setEditable(false);

        jTextFieldGate4Barcelona.setEditable(false);
        jTextFieldGate4Barcelona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGate4BarcelonaActionPerformed(evt);
            }
        });

        jTextFieldGate2Barcelona.setEditable(false);

        jTextFieldRodajeBarcelona.setEditable(false);
        jTextFieldRodajeBarcelona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRodajeBarcelonaActionPerformed(evt);
            }
        });

        jTextFieldTallerBarcelona.setEditable(false);

        jTextFieldGate3Barcelona.setEditable(false);

        jLabel30.setText("Área de Estacionamiento:");

        jLabel31.setText("Área de Rodaje:");

        jTextFieldGate5Barcelona.setEditable(false);

        jTextFieldHangarBarcelona.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Arial Nova", 1, 14)); // NOI18N
        jLabel10.setText("Aeropuerto de Barcelona");

        jLabel13.setText("Transfers Aeropuerto:");

        jTextFieldTransfersAeropuertoBarcelona.setEditable(false);
        jTextFieldTransfersAeropuertoBarcelona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTransfersAeropuertoBarcelonaActionPerformed(evt);
            }
        });

        jLabel32.setText("Transfers Ciudad:");

        jTextFieldTransfersCiudadBarcelona.setEditable(false);
        jTextFieldTransfersCiudadBarcelona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTransfersCiudadBarcelonaActionPerformed(evt);
            }
        });

        jLabel33.setText("Pista 1:");

        jLabel55.setText("Pista 2:");

        jTextFieldPista1Barcelona.setEditable(false);

        jTextFieldPista2Barcelona.setEditable(false);

        jTextFieldPista3Barcelona.setEditable(false);

        jTextFieldPista4Barcelona.setEditable(false);

        jLabel57.setText("Pista 3:");

        jLabel58.setText("Pista 4:");

        jLabel60.setText("Gate 1:");

        jLabel61.setText("Gate 2:");

        jLabel62.setText("Gate 3:");

        jLabel63.setText("Gate 6:");

        jLabel64.setText("Gate 4:");

        jLabel65.setText("Gate 5:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60)
                            .addComponent(jLabel61)
                            .addComponent(jLabel62))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldGate2Barcelona)
                            .addComponent(jTextFieldGate3Barcelona)
                            .addComponent(jTextFieldGate1Barcelona, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel63)
                            .addComponent(jLabel64)
                            .addComponent(jLabel65))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldGate5Barcelona, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldGate6Barcelona, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldGate4Barcelona, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRodajeBarcelona))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldTallerBarcelona))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAEstacionamientoBarcelona))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldHangarBarcelona, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel55))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldPista2Barcelona, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jTextFieldPista1Barcelona, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel57)
                            .addComponent(jLabel58))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldPista4Barcelona, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPista3Barcelona, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTransfersAeropuertoBarcelona, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTransfersCiudadBarcelona, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldPasajerosBarcelona, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(125, 125, 125))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel32)
                    .addComponent(jTextFieldTransfersCiudadBarcelona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTransfersAeropuertoBarcelona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextFieldPasajerosBarcelona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTextFieldHangarBarcelona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTallerBarcelona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAEstacionamientoBarcelona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGate4Barcelona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldGate1Barcelona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60)
                    .addComponent(jLabel64))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldGate5Barcelona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldGate2Barcelona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel65)
                        .addComponent(jLabel61)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGate3Barcelona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62)
                    .addComponent(jLabel63)
                    .addComponent(jTextFieldGate6Barcelona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRodajeBarcelona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPista1Barcelona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(jTextFieldPista3Barcelona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldPista2Barcelona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel55)
                        .addComponent(jLabel58))
                    .addComponent(jTextFieldPista4Barcelona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonIniciar.setBackground(new java.awt.Color(204, 204, 255));
        jButtonIniciar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonIniciar.setText("Iniciar");
        jButtonIniciar.setActionCommand("Iniciar");
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonPausar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonRenaudar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldAeroviaMadrid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldAeroviaBarcelona)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonRenaudar)
                    .addComponent(jButtonPausar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldAeroviaMadrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldAeroviaBarcelona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonIniciar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPausarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPausarActionPerformed

    private void jTextFieldAeroviaBarcelonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAeroviaBarcelonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAeroviaBarcelonaActionPerformed

    private void jTextFieldTransfersCiudadMadridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTransfersCiudadMadridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTransfersCiudadMadridActionPerformed

    private void jButtonRenaudarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRenaudarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRenaudarActionPerformed

    private void jTextFieldGate1MadridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGate1MadridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGate1MadridActionPerformed

    private void jTextFieldGate4MadridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGate4MadridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGate4MadridActionPerformed

    private void jTextFieldAeroviaMadridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAeroviaMadridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAeroviaMadridActionPerformed

    private void jTextFieldGate1BarcelonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGate1BarcelonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGate1BarcelonaActionPerformed

    private void jTextFieldGate4BarcelonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGate4BarcelonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGate4BarcelonaActionPerformed

    private void jTextFieldTransfersCiudadBarcelonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTransfersCiudadBarcelonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTransfersCiudadBarcelonaActionPerformed

    private void jTextFieldTransfersAeropuertoBarcelonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTransfersAeropuertoBarcelonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTransfersAeropuertoBarcelonaActionPerformed

    private void jTextFieldHangarMadridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHangarMadridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHangarMadridActionPerformed

    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
        // TODO add your handling code here:
        Thread aviones = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 8000; i++) {
                    Avion avion = new Avion(aeropuertoMadrid, aeropuertoBarcelona);
                    avion.start();
                    try{
                        Thread.sleep(r.nextInt(3000-1000+1)+1000);
                    } catch (InterruptedException e){
                    }
                }
            }
        });
        
        Thread autobuses = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 4000; i++) {
                    Autobus autobus = new Autobus(aeropuertoMadrid, aeropuertoBarcelona);
                    autobus.start();
                    try{
                        Thread.sleep(r.nextInt(1000-500+1)+500);
                    } catch (InterruptedException e){
                    }
                }
            }
        });
        
        aviones.start();
        autobuses.start();
    }//GEN-LAST:event_jButtonIniciarActionPerformed

    private void jTextFieldRodajeBarcelonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRodajeBarcelonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRodajeBarcelonaActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JButton jButtonPausar;
    private javax.swing.JButton jButtonRenaudar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextFieldAEstacionamientoBarcelona;
    private javax.swing.JTextField jTextFieldAEstacionamientoMadrid;
    private javax.swing.JTextField jTextFieldAeroviaBarcelona;
    private javax.swing.JTextField jTextFieldAeroviaMadrid;
    private javax.swing.JTextField jTextFieldGate1Barcelona;
    private javax.swing.JTextField jTextFieldGate1Madrid;
    private javax.swing.JTextField jTextFieldGate2Barcelona;
    private javax.swing.JTextField jTextFieldGate2Madrid;
    private javax.swing.JTextField jTextFieldGate3Barcelona;
    private javax.swing.JTextField jTextFieldGate3Madrid;
    private javax.swing.JTextField jTextFieldGate4Barcelona;
    private javax.swing.JTextField jTextFieldGate4Madrid;
    private javax.swing.JTextField jTextFieldGate5Barcelona;
    private javax.swing.JTextField jTextFieldGate5Madrid;
    private javax.swing.JTextField jTextFieldGate6Barcelona;
    private javax.swing.JTextField jTextFieldGate6Madrid;
    private javax.swing.JTextField jTextFieldHangarBarcelona;
    private javax.swing.JTextField jTextFieldHangarMadrid;
    private javax.swing.JTextField jTextFieldPasajerosBarcelona;
    private javax.swing.JTextField jTextFieldPasajerosMadrid;
    private javax.swing.JTextField jTextFieldPista1Barcelona;
    private javax.swing.JTextField jTextFieldPista1Madrid;
    private javax.swing.JTextField jTextFieldPista2Barcelona;
    private javax.swing.JTextField jTextFieldPista2Madrid;
    private javax.swing.JTextField jTextFieldPista3Barcelona;
    private javax.swing.JTextField jTextFieldPista3Madrid;
    private javax.swing.JTextField jTextFieldPista4Barcelona;
    private javax.swing.JTextField jTextFieldPista4Madrid;
    private javax.swing.JTextField jTextFieldRodajeBarcelona;
    private javax.swing.JTextField jTextFieldRodajeMadrid;
    private javax.swing.JTextField jTextFieldTallerBarcelona;
    private javax.swing.JTextField jTextFieldTallerMadrid;
    private javax.swing.JTextField jTextFieldTransfersAeropuertoBarcelona;
    private javax.swing.JTextField jTextFieldTransfersAeropuertoMadrid;
    private javax.swing.JTextField jTextFieldTransfersCiudadBarcelona;
    private javax.swing.JTextField jTextFieldTransfersCiudadMadrid;
    // End of variables declaration//GEN-END:variables
}
