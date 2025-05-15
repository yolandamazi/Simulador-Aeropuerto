package pecl.programacion.distribuida;

import static java.lang.Thread.sleep;
import java.rmi.*;

public class Main extends javax.swing.JFrame {
    
    public Main(){
        initComponents();
        this.setResizable(false);
        
        this.setjButtonPista1AbrirBarcelona(false);
        this.setjButtonPista1AbrirMadrid(false);
        
        this.setjButtonPista2AbrirBarcelona(false);
        this.setjButtonPista2AbrirMadrid(false);
        
        this.setjButtonPista3AbrirBarcelona(false);
        this.setjButtonPista3AbrirMadrid(false);
        
        this.setjButtonPista4AbrirBarcelona(false);
        this.setjButtonPista4AbrirMadrid(false);
        
    }

    //SETTERS
    public void setjButtonConectar(Boolean jButtonConectar) {
        this.jButtonConectar.setEnabled(jButtonConectar);
    }

    public void setjButtonPista1AbrirBarcelona(Boolean jButtonPista1AbrirBarcelona) {
        this.jButtonPista1AbrirBarcelona.setEnabled(jButtonPista1AbrirBarcelona);
    }

    public void setjButtonPista1AbrirMadrid(Boolean jButtonPista1AbrirMadrid) {
        this.jButtonPista1AbrirMadrid.setEnabled(jButtonPista1AbrirMadrid);
    }

    public void setjButtonPista1CerrarBarcelona(Boolean jButtonPista1CerrarBarcelona) {
        this.jButtonPista1CerrarBarcelona.setEnabled(jButtonPista1CerrarBarcelona);
    }

    public void setjButtonPista1CerrarMadrid(Boolean jButtonPista1CerrarMadrid) {
        this.jButtonPista1CerrarMadrid.setEnabled(jButtonPista1CerrarMadrid);
    }

    public void setjButtonPista2AbrirBarcelona(Boolean jButtonPista2AbrirBarcelona) {
        this.jButtonPista2AbrirBarcelona.setEnabled(jButtonPista2AbrirBarcelona);
    }

    public void setjButtonPista2AbrirMadrid(Boolean jButtonPista2AbrirMadrid) {
        this.jButtonPista2AbrirMadrid.setEnabled(jButtonPista2AbrirMadrid);
    }

    public void setjButtonPista2CerrarBarcelona(Boolean jButtonPista2CerrarBarcelona) {
        this.jButtonPista2CerrarBarcelona.setEnabled(jButtonPista2CerrarBarcelona);
    }

    public void setjButtonPista2CerrarMadrid(Boolean jButtonPista2CerrarMadrid) {
        this.jButtonPista2CerrarMadrid.setEnabled(jButtonPista2CerrarMadrid);
    }

    public void setjButtonPista3AbrirBarcelona(Boolean jButtonPista3AbrirBarcelona) {
        this.jButtonPista3AbrirBarcelona.setEnabled(jButtonPista3AbrirBarcelona);
    }

    public void setjButtonPista3AbrirMadrid(Boolean jButtonPista3AbrirMadrid) {
        this.jButtonPista3AbrirMadrid.setEnabled(jButtonPista3AbrirMadrid);
    }

    public void setjButtonPista3CerrarBarcelona(Boolean jButtonPista3CerrarBarcelona) {
        this.jButtonPista3CerrarBarcelona.setEnabled(jButtonPista3CerrarBarcelona);
    }

    public void setjButtonPista3CerrarMadrid(Boolean jButtonPista3CerrarMadrid) {
        this.jButtonPista3CerrarMadrid.setEnabled(jButtonPista3CerrarMadrid);
    }

    public void setjButtonPista4AbrirBarcelona(Boolean jButtonPista4AbrirBarcelona) {
        this.jButtonPista4AbrirBarcelona.setEnabled(jButtonPista4AbrirBarcelona);
    }

    public void setjButtonPista4AbrirMadrid(Boolean jButtonPista4AbrirMadrid) {
        this.jButtonPista4AbrirMadrid.setEnabled(jButtonPista4AbrirMadrid);
    }

    public void setjButtonPista4CerrarBarcelona(Boolean jButtonPista4CerrarBarcelona) {
        this.jButtonPista4CerrarBarcelona.setEnabled(jButtonPista4CerrarBarcelona);
    }

    public void setjButtonPista4CerrarMadrid(Boolean jButtonPista4CerrarMadrid) {
        this.jButtonPista4CerrarMadrid.setEnabled(jButtonPista4CerrarMadrid);
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
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings(value = "unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldAEstacionamientoMadrid = new javax.swing.JTextField();
        jTextFieldPasajerosMadrid = new javax.swing.JTextField();
        jTextFieldRodajeMadrid = new javax.swing.JTextField();
        jTextFieldTallerMadrid = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldHangarMadrid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButtonPista1AbrirMadrid = new javax.swing.JButton();
        jButtonPista2CerrarMadrid = new javax.swing.JButton();
        jButtonPista1CerrarMadrid = new javax.swing.JButton();
        jButtonPista2AbrirMadrid = new javax.swing.JButton();
        jButtonPista3CerrarMadrid = new javax.swing.JButton();
        jButtonPista3AbrirMadrid = new javax.swing.JButton();
        jButtonPista4AbrirMadrid = new javax.swing.JButton();
        jButtonPista4CerrarMadrid = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldAeroviaBarcelona = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldAeroviaMadrid = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextFieldAEstacionamientoBarcelona = new javax.swing.JTextField();
        jTextFieldPasajerosBarcelona = new javax.swing.JTextField();
        jTextFieldRodajeBarcelona = new javax.swing.JTextField();
        jTextFieldTallerBarcelona = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTextFieldHangarBarcelona = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jButtonPista1AbrirBarcelona = new javax.swing.JButton();
        jButtonPista2CerrarBarcelona = new javax.swing.JButton();
        jButtonPista1CerrarBarcelona = new javax.swing.JButton();
        jButtonPista2AbrirBarcelona = new javax.swing.JButton();
        jButtonPista3CerrarBarcelona = new javax.swing.JButton();
        jButtonPista3AbrirBarcelona = new javax.swing.JButton();
        jButtonPista4AbrirBarcelona = new javax.swing.JButton();
        jButtonPista4CerrarBarcelona = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButtonConectar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(java.awt.SystemColor.control);

        jLabel14.setText("Nº de Pasajeros en el Aeropuerto:");

        jLabel15.setText("Nº de Aviones en el Hangar:");

        jLabel16.setText("Nº de Aviones en el Taller:");

        jTextFieldAEstacionamientoMadrid.setEditable(false);

        jTextFieldPasajerosMadrid.setEditable(false);

        jTextFieldRodajeMadrid.setEditable(false);

        jTextFieldTallerMadrid.setEditable(false);

        jLabel17.setText("Nº de Aviones en el Estacionamiento:");

        jLabel18.setText("Nº de Aviones en el Área de Rodaje:");

        jTextFieldHangarMadrid.setEditable(false);
        jTextFieldHangarMadrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHangarMadridActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Nova", 1, 14)); // NOI18N
        jLabel8.setText("Aeropuerto de Madrid");

        jLabel19.setText("Pista 1:");

        jLabel20.setText("Pista 2:");

        jLabel22.setText("Pista 3:");

        jLabel23.setText("Pista 4:");

        jButtonPista1AbrirMadrid.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPista1AbrirMadrid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonPista1AbrirMadrid.setText("Abrir");
        jButtonPista1AbrirMadrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista1AbrirMadridActionPerformed(evt);
            }
        });

        jButtonPista2CerrarMadrid.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPista2CerrarMadrid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonPista2CerrarMadrid.setText("Cerrar");
        jButtonPista2CerrarMadrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista2CerrarMadridActionPerformed(evt);
            }
        });

        jButtonPista1CerrarMadrid.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPista1CerrarMadrid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonPista1CerrarMadrid.setText("Cerrar");
        jButtonPista1CerrarMadrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista1CerrarMadridActionPerformed(evt);
            }
        });

        jButtonPista2AbrirMadrid.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPista2AbrirMadrid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonPista2AbrirMadrid.setText("Abrir");
        jButtonPista2AbrirMadrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista2AbrirMadridActionPerformed(evt);
            }
        });

        jButtonPista3CerrarMadrid.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPista3CerrarMadrid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonPista3CerrarMadrid.setText("Cerrar");
        jButtonPista3CerrarMadrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista3CerrarMadridActionPerformed(evt);
            }
        });

        jButtonPista3AbrirMadrid.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPista3AbrirMadrid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonPista3AbrirMadrid.setText("Abrir");
        jButtonPista3AbrirMadrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista3AbrirMadridActionPerformed(evt);
            }
        });

        jButtonPista4AbrirMadrid.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPista4AbrirMadrid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonPista4AbrirMadrid.setText("Abrir");
        jButtonPista4AbrirMadrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista4AbrirMadridActionPerformed(evt);
            }
        });

        jButtonPista4CerrarMadrid.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPista4CerrarMadrid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonPista4CerrarMadrid.setText("Cerrar");
        jButtonPista4CerrarMadrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista4CerrarMadridActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldAEstacionamientoMadrid, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(jTextFieldTallerMadrid)
                            .addComponent(jTextFieldHangarMadrid)
                            .addComponent(jTextFieldPasajerosMadrid))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldRodajeMadrid, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPista1AbrirMadrid)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPista1CerrarMadrid))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPista2AbrirMadrid)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPista2CerrarMadrid)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPista3AbrirMadrid)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPista3CerrarMadrid))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPista4AbrirMadrid)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPista4CerrarMadrid)))
                        .addGap(7, 7, 7))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel8)
                .addGap(0, 135, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRodajeMadrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jButtonPista1AbrirMadrid)
                    .addComponent(jLabel22)
                    .addComponent(jButtonPista1CerrarMadrid)
                    .addComponent(jButtonPista3AbrirMadrid)
                    .addComponent(jButtonPista3CerrarMadrid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPista4CerrarMadrid)
                    .addComponent(jButtonPista4AbrirMadrid)
                    .addComponent(jLabel23)
                    .addComponent(jButtonPista2CerrarMadrid)
                    .addComponent(jButtonPista2AbrirMadrid)
                    .addComponent(jLabel20))
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

        jPanel6.setBackground(java.awt.SystemColor.control);

        jLabel21.setText("Nº de Pasajeros en el Aeropuerto:");

        jLabel24.setText("Nº de Aviones en el Hangar:");

        jLabel25.setText("Nº de Aviones en el Taller:");

        jTextFieldAEstacionamientoBarcelona.setEditable(false);

        jTextFieldPasajerosBarcelona.setEditable(false);

        jTextFieldRodajeBarcelona.setEditable(false);

        jTextFieldTallerBarcelona.setEditable(false);

        jLabel26.setText("Nº de Aviones en el Estacionamiento:");

        jLabel34.setText("Nº de Aviones en el Área de Rodaje:");

        jTextFieldHangarBarcelona.setEditable(false);
        jTextFieldHangarBarcelona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHangarBarcelonaActionPerformed(evt);
            }
        });

        jLabel35.setText("Pista 1:");

        jLabel36.setText("Pista 2:");

        jLabel37.setText("Pista 3:");

        jLabel38.setText("Pista 4:");

        jButtonPista1AbrirBarcelona.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPista1AbrirBarcelona.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonPista1AbrirBarcelona.setText("Abrir");
        jButtonPista1AbrirBarcelona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista1AbrirBarcelonaActionPerformed(evt);
            }
        });

        jButtonPista2CerrarBarcelona.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPista2CerrarBarcelona.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonPista2CerrarBarcelona.setText("Cerrar");
        jButtonPista2CerrarBarcelona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista2CerrarBarcelonaActionPerformed(evt);
            }
        });

        jButtonPista1CerrarBarcelona.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPista1CerrarBarcelona.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonPista1CerrarBarcelona.setText("Cerrar");
        jButtonPista1CerrarBarcelona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista1CerrarBarcelonaActionPerformed(evt);
            }
        });

        jButtonPista2AbrirBarcelona.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPista2AbrirBarcelona.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonPista2AbrirBarcelona.setText("Abrir");
        jButtonPista2AbrirBarcelona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista2AbrirBarcelonaActionPerformed(evt);
            }
        });

        jButtonPista3CerrarBarcelona.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPista3CerrarBarcelona.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonPista3CerrarBarcelona.setText("Cerrar");
        jButtonPista3CerrarBarcelona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista3CerrarBarcelonaActionPerformed(evt);
            }
        });

        jButtonPista3AbrirBarcelona.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPista3AbrirBarcelona.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonPista3AbrirBarcelona.setText("Abrir");
        jButtonPista3AbrirBarcelona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista3AbrirBarcelonaActionPerformed(evt);
            }
        });

        jButtonPista4AbrirBarcelona.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPista4AbrirBarcelona.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonPista4AbrirBarcelona.setText("Abrir");
        jButtonPista4AbrirBarcelona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista4AbrirBarcelonaActionPerformed(evt);
            }
        });

        jButtonPista4CerrarBarcelona.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPista4CerrarBarcelona.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonPista4CerrarBarcelona.setText("Cerrar");
        jButtonPista4CerrarBarcelona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista4CerrarBarcelonaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Nova", 1, 14)); // NOI18N
        jLabel9.setText("Aeropuerto de Barcelona");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldAEstacionamientoBarcelona, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(jTextFieldTallerBarcelona)
                            .addComponent(jTextFieldHangarBarcelona)
                            .addComponent(jTextFieldPasajerosBarcelona))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldRodajeBarcelona, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPista1AbrirBarcelona)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPista1CerrarBarcelona))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPista2AbrirBarcelona)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPista2CerrarBarcelona)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPista3AbrirBarcelona)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPista3CerrarBarcelona))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPista4AbrirBarcelona)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPista4CerrarBarcelona)))
                        .addGap(7, 7, 7))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(125, 125, 125))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextFieldPasajerosBarcelona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextFieldHangarBarcelona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTallerBarcelona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAEstacionamientoBarcelona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRodajeBarcelona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jButtonPista1AbrirBarcelona)
                    .addComponent(jLabel37)
                    .addComponent(jButtonPista1CerrarBarcelona)
                    .addComponent(jButtonPista3AbrirBarcelona)
                    .addComponent(jButtonPista3CerrarBarcelona))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPista4CerrarBarcelona)
                    .addComponent(jButtonPista4AbrirBarcelona)
                    .addComponent(jLabel38)
                    .addComponent(jButtonPista2CerrarBarcelona)
                    .addComponent(jButtonPista2AbrirBarcelona)
                    .addComponent(jLabel36))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonConectar.setBackground(new java.awt.Color(204, 204, 255));
        jButtonConectar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonConectar.setText("Conectar");
        jButtonConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonConectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(12, 12, 12)
                                .addComponent(jTextFieldAeroviaMadrid)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(7, 7, 7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(12, 12, 12)
                                .addComponent(jTextFieldAeroviaBarcelona)
                                .addContainerGap())))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldAeroviaBarcelona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldAeroviaMadrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConectar)
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

    private void jButtonPista1AbrirMadridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista1AbrirMadridActionPerformed
        // TODO add your handling code here:
        try{
            InterfaceAeropuerto objMadrid = (InterfaceAeropuerto) Naming.lookup("//127.0.0.1/ObjetoAeropuertoMadrid");
            objMadrid.controlarPista(0, true);
            this.setjButtonPista1CerrarMadrid(true);
            this.setjButtonPista1AbrirMadrid(false);
        } catch (Exception e){
        }
    }//GEN-LAST:event_jButtonPista1AbrirMadridActionPerformed

    private void jTextFieldAeroviaBarcelonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAeroviaBarcelonaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldAeroviaBarcelonaActionPerformed

    private void jTextFieldAeroviaMadridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAeroviaMadridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAeroviaMadridActionPerformed

    private void jTextFieldHangarMadridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHangarMadridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHangarMadridActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void jButtonPista2CerrarMadridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista2CerrarMadridActionPerformed
        // TODO add your handling code here:
        try{
            InterfaceAeropuerto objMadrid = (InterfaceAeropuerto) Naming.lookup("//127.0.0.1/ObjetoAeropuertoMadrid"); 
            objMadrid.controlarPista(1, false);
            this.setjButtonPista2AbrirMadrid(true);
            this.setjButtonPista2CerrarMadrid(false);
        } catch (Exception e){
        }
    }//GEN-LAST:event_jButtonPista2CerrarMadridActionPerformed

    private void jButtonPista1CerrarMadridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista1CerrarMadridActionPerformed
        // TODO add your handling code here:
        try{
            InterfaceAeropuerto objMadrid = (InterfaceAeropuerto) Naming.lookup("//127.0.0.1/ObjetoAeropuertoMadrid");  
            objMadrid.controlarPista(0, false);
            this.setjButtonPista1AbrirMadrid(true);
            this.setjButtonPista1CerrarMadrid(false);
        } catch (Exception e){
        }
    }//GEN-LAST:event_jButtonPista1CerrarMadridActionPerformed

    private void jButtonPista2AbrirMadridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista2AbrirMadridActionPerformed
        // TODO add your handling code here:
        try{
            InterfaceAeropuerto objMadrid = (InterfaceAeropuerto) Naming.lookup("//127.0.0.1/ObjetoAeropuertoMadrid");  
            objMadrid.controlarPista(1, true);
            this.setjButtonPista2CerrarMadrid(true);
            this.setjButtonPista2AbrirMadrid(false);
        } catch (Exception e){
        }
    }//GEN-LAST:event_jButtonPista2AbrirMadridActionPerformed

    private void jButtonPista3CerrarMadridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista3CerrarMadridActionPerformed
        // TODO add your handling code here:
        try{
            InterfaceAeropuerto objMadrid = (InterfaceAeropuerto) Naming.lookup("//127.0.0.1/ObjetoAeropuertoMadrid");
            objMadrid.controlarPista(2, false);
            this.setjButtonPista3AbrirMadrid(true);
            this.setjButtonPista3CerrarMadrid(false);
        } catch (Exception e){
        }
    }//GEN-LAST:event_jButtonPista3CerrarMadridActionPerformed

    private void jButtonPista3AbrirMadridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista3AbrirMadridActionPerformed
        // TODO add your handling code here:
        try{
            InterfaceAeropuerto objMadrid = (InterfaceAeropuerto) Naming.lookup("//127.0.0.1/ObjetoAeropuertoMadrid");
            objMadrid.controlarPista(2, true);
            this.setjButtonPista3CerrarMadrid(true);
            this.setjButtonPista3AbrirMadrid(false);
        } catch (Exception e){
        }
    }//GEN-LAST:event_jButtonPista3AbrirMadridActionPerformed

    private void jButtonPista4AbrirMadridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista4AbrirMadridActionPerformed
        // TODO add your handling code here:
        try{
            InterfaceAeropuerto objMadrid = (InterfaceAeropuerto) Naming.lookup("//127.0.0.1/ObjetoAeropuertoMadrid"); 
            objMadrid.controlarPista(3, true);
            this.setjButtonPista4CerrarMadrid(true);
            this.setjButtonPista4AbrirMadrid(false);
        } catch (Exception e){
        }
    }//GEN-LAST:event_jButtonPista4AbrirMadridActionPerformed

    private void jButtonPista4CerrarMadridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista4CerrarMadridActionPerformed
        // TODO add your handling code here:
        try{
            InterfaceAeropuerto objMadrid = (InterfaceAeropuerto) Naming.lookup("//127.0.0.1/ObjetoAeropuertoMadrid");
            objMadrid.controlarPista(3, false);
            this.setjButtonPista4AbrirMadrid(true);
            this.setjButtonPista4CerrarMadrid(false);
        } catch (Exception e){
        }
    }//GEN-LAST:event_jButtonPista4CerrarMadridActionPerformed

    private void jTextFieldHangarBarcelonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHangarBarcelonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHangarBarcelonaActionPerformed

    private void jButtonPista1AbrirBarcelonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista1AbrirBarcelonaActionPerformed
        // TODO add your handling code here:
        try{
            InterfaceAeropuerto objBarcelona = (InterfaceAeropuerto) Naming.lookup("//127.0.0.1/ObjetoAeropuertoBarcelona");  
            
            objBarcelona.controlarPista(0, true);
            this.setjButtonPista1CerrarBarcelona(true);
            this.setjButtonPista1AbrirBarcelona(false);
        } catch (Exception e){
        }
    }//GEN-LAST:event_jButtonPista1AbrirBarcelonaActionPerformed

    private void jButtonPista2CerrarBarcelonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista2CerrarBarcelonaActionPerformed
        // TODO add your handling code here:
        try{
            InterfaceAeropuerto objBarcelona = (InterfaceAeropuerto) Naming.lookup("//127.0.0.1/ObjetoAeropuertoBarcelona");  
            objBarcelona.controlarPista(1, false);
            this.setjButtonPista2AbrirBarcelona(true);
            this.setjButtonPista2CerrarBarcelona(false);
        } catch (Exception e){
        }
    }//GEN-LAST:event_jButtonPista2CerrarBarcelonaActionPerformed

    private void jButtonPista1CerrarBarcelonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista1CerrarBarcelonaActionPerformed
        // TODO add your handling code here:
        try{
            InterfaceAeropuerto objBarcelona = (InterfaceAeropuerto) Naming.lookup("//127.0.0.1/ObjetoAeropuertoBarcelona");  
            objBarcelona.controlarPista(0, false);
            this.setjButtonPista1AbrirBarcelona(true);
            this.setjButtonPista1CerrarBarcelona(false);
        } catch (Exception e){
        }
    }//GEN-LAST:event_jButtonPista1CerrarBarcelonaActionPerformed

    private void jButtonPista2AbrirBarcelonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista2AbrirBarcelonaActionPerformed
        // TODO add your handling code here:
        try{
            InterfaceAeropuerto objBarcelona = (InterfaceAeropuerto) Naming.lookup("//127.0.0.1/ObjetoAeropuertoBarcelona");
            objBarcelona.controlarPista(1, true);
            this.setjButtonPista2CerrarBarcelona(true);
            this.setjButtonPista2AbrirBarcelona(false);
        } catch (Exception e){
        }
    }//GEN-LAST:event_jButtonPista2AbrirBarcelonaActionPerformed

    private void jButtonPista3CerrarBarcelonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista3CerrarBarcelonaActionPerformed
        // TODO add your handling code here:
        try{
            InterfaceAeropuerto objBarcelona = (InterfaceAeropuerto) Naming.lookup("//127.0.0.1/ObjetoAeropuertoBarcelona");  
            objBarcelona.controlarPista(2, false);
            this.setjButtonPista3AbrirBarcelona(true);
            this.setjButtonPista3CerrarBarcelona(false);
        } catch (Exception e){
        }
    }//GEN-LAST:event_jButtonPista3CerrarBarcelonaActionPerformed

    private void jButtonPista3AbrirBarcelonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista3AbrirBarcelonaActionPerformed
        // TODO add your handling code here:
        try{
            InterfaceAeropuerto objBarcelona = (InterfaceAeropuerto) Naming.lookup("//127.0.0.1/ObjetoAeropuertoBarcelona");  
            objBarcelona.controlarPista(2, true);
            this.setjButtonPista3CerrarBarcelona(true);
            this.setjButtonPista3AbrirBarcelona(false);
        } catch (Exception r){
        }
    }//GEN-LAST:event_jButtonPista3AbrirBarcelonaActionPerformed

    private void jButtonPista4AbrirBarcelonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista4AbrirBarcelonaActionPerformed
        // TODO add your handling code here:
        try{
            InterfaceAeropuerto objBarcelona = (InterfaceAeropuerto) Naming.lookup("//127.0.0.1/ObjetoAeropuertoBarcelona");
            objBarcelona.controlarPista(3, true);
            this.setjButtonPista4CerrarBarcelona(true);
            this.setjButtonPista4AbrirBarcelona(false);
        } catch (Exception e){
        }
    }//GEN-LAST:event_jButtonPista4AbrirBarcelonaActionPerformed

    private void jButtonPista4CerrarBarcelonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista4CerrarBarcelonaActionPerformed
        // TODO add your handling code here:
        try{
            InterfaceAeropuerto objBarcelona = (InterfaceAeropuerto) Naming.lookup("//127.0.0.1/ObjetoAeropuertoBarcelona");
            objBarcelona.controlarPista(3, false);
            this.setjButtonPista4AbrirBarcelona(true);
            this.setjButtonPista4CerrarBarcelona(false);
        } catch (Exception e){
        }
    }//GEN-LAST:event_jButtonPista4CerrarBarcelonaActionPerformed

    private void jButtonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConectarActionPerformed
        // TODO add your handling code here:
        
        try {
            InterfaceAeropuerto objMadrid = (InterfaceAeropuerto) Naming.lookup("//127.0.0.1/ObjetoAeropuertoMadrid");
            InterfaceAeropuerto objBarcelona = (InterfaceAeropuerto) Naming.lookup("//127.0.0.1/ObjetoAeropuertoBarcelona");  
            
            //Area de Estacionamiento
            this.setjTextFieldAEstacionamientoBarcelona(String.valueOf(objBarcelona.consultarNumeroAvionesEstacionamiento()));
            this.setjTextFieldAEstacionamientoMadrid(String.valueOf(objMadrid.consultarNumeroAvionesEstacionamiento()));
            
            //Hangar
            this.setjTextFieldHangarBarcelona(String.valueOf(objBarcelona.consultarNumeroAvionesHangar()));
            this.setjTextFieldHangarMadrid(String.valueOf(objMadrid.consultarNumeroAvionesHangar()));
            
            //Pasajeros
            this.setjTextFieldPasajerosBarcelona(String.valueOf(objBarcelona.consultarNumeroPasajeros()));
            this.setjTextFieldPasajerosMadrid(String.valueOf(objMadrid.consultarNumeroPasajeros()));
            
            //Area de Rodaje
            this.setjTextFieldRodajeBarcelona(String.valueOf(objBarcelona.consultarNumeroAvionesRodaje()));
            this.setjTextFieldRodajeMadrid(String.valueOf(objMadrid.consultarNumeroAvionesRodaje()));
            
            //Taller
            this.setjTextFieldTallerBarcelona(String.valueOf(objBarcelona.consultarNumeroAvionesTaller()));
            this.setjTextFieldTallerMadrid(String.valueOf(objMadrid.consultarNumeroAvionesTaller()));
            
            //Aerovia
            this.setjTextFieldAeroviaBarcelona(objBarcelona.consultarColaAerovia());
            this.setjTextFieldAeroviaMadrid(objMadrid.consultarColaAerovia());
            
            sleep(1000); //Para que dé tiempo a leer la respuesta antes de que se cierre la ventana
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonConectarActionPerformed

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
    private javax.swing.JButton jButtonConectar;
    private javax.swing.JButton jButtonPista1AbrirBarcelona;
    private javax.swing.JButton jButtonPista1AbrirMadrid;
    private javax.swing.JButton jButtonPista1CerrarBarcelona;
    private javax.swing.JButton jButtonPista1CerrarMadrid;
    private javax.swing.JButton jButtonPista2AbrirBarcelona;
    private javax.swing.JButton jButtonPista2AbrirMadrid;
    private javax.swing.JButton jButtonPista2CerrarBarcelona;
    private javax.swing.JButton jButtonPista2CerrarMadrid;
    private javax.swing.JButton jButtonPista3AbrirBarcelona;
    private javax.swing.JButton jButtonPista3AbrirMadrid;
    private javax.swing.JButton jButtonPista3CerrarBarcelona;
    private javax.swing.JButton jButtonPista3CerrarMadrid;
    private javax.swing.JButton jButtonPista4AbrirBarcelona;
    private javax.swing.JButton jButtonPista4AbrirMadrid;
    private javax.swing.JButton jButtonPista4CerrarBarcelona;
    private javax.swing.JButton jButtonPista4CerrarMadrid;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextFieldAEstacionamientoBarcelona;
    private javax.swing.JTextField jTextFieldAEstacionamientoMadrid;
    private javax.swing.JTextField jTextFieldAeroviaBarcelona;
    private javax.swing.JTextField jTextFieldAeroviaMadrid;
    private javax.swing.JTextField jTextFieldHangarBarcelona;
    private javax.swing.JTextField jTextFieldHangarMadrid;
    private javax.swing.JTextField jTextFieldPasajerosBarcelona;
    private javax.swing.JTextField jTextFieldPasajerosMadrid;
    private javax.swing.JTextField jTextFieldRodajeBarcelona;
    private javax.swing.JTextField jTextFieldRodajeMadrid;
    private javax.swing.JTextField jTextFieldTallerBarcelona;
    private javax.swing.JTextField jTextFieldTallerMadrid;
    // End of variables declaration//GEN-END:variables
}
