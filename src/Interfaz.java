
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import jdk.jshell.execution.Util;

public class Interfaz extends javax.swing.JFrame {

    private Administrador admin;
    private Partida partida, partidaEntrenamiento;
    private String j1, j2;
    private ArrayList<Palabra> totalPalabras, palabrasPartida;
    private Palabra palabra;

    public Interfaz() {
        initComponents();
        pOpcionesJuego.setVisible(false);
        pPartidaMulti.setVisible(false);
        pEntrenamiento.setVisible(false);
        pOpcionesAdmin.setVisible(false);
        pAltaYBaja.setVisible(false);
        pParametros.setVisible(false);
        pFichPalabras.setVisible(false);
        pInfoPartidas.setVisible(false);
        pRankings.setVisible(false);
        admin = new Administrador();
        totalPalabras = new ArrayList<>();
        palabrasPartida = new ArrayList<>();
        partida = new Partida(palabrasPartida, j1, j2);
        palabra = new Palabra("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoLetra = new javax.swing.ButtonGroup();
        grupoPalabra = new javax.swing.ButtonGroup();
        pInicio = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bAdmin = new javax.swing.JButton();
        bJugador = new javax.swing.JButton();
        pOpcionesJuego = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bVolverOpJug = new javax.swing.JButton();
        bPartida = new javax.swing.JButton();
        bEntrenamiento = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        nombreJ1 = new javax.swing.JComboBox<>();
        nombreJ2 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        tNombreJNuevo = new javax.swing.JTextField();
        pPartidaMulti = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        bSalirPartida = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        tPalabraMulti = new javax.swing.JTextField();
        bResolver = new javax.swing.JButton();
        puntosJug = new javax.swing.JLabel();
        bRegLetra = new javax.swing.JButton();
        bRegPalabra = new javax.swing.JButton();
        tLetra2Multi = new javax.swing.JTextField();
        tLetra3Multi = new javax.swing.JTextField();
        tLetra4Multi = new javax.swing.JTextField();
        tLetra5Multi = new javax.swing.JTextField();
        tLetra1Multi = new javax.swing.JTextField();
        turnoJ = new javax.swing.JLabel();
        pEntrenamiento = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        bSalirEntrenamiento = new javax.swing.JButton();
        entrenamientoJug = new javax.swing.JLabel();
        puntosJugEntrenamiento = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tPalabraEntrenamiento = new javax.swing.JTextField();
        bResolverEntrenamiento = new javax.swing.JButton();
        bRegLetraEntrenamiento = new javax.swing.JButton();
        bRegPalabraEntrenamiento = new javax.swing.JButton();
        tLetra2Solo = new javax.swing.JTextField();
        tLetra5Solo = new javax.swing.JTextField();
        tLetra4Solo = new javax.swing.JTextField();
        tLetra3Solo = new javax.swing.JTextField();
        tLetra1Solo = new javax.swing.JTextField();
        pOpcionesAdmin = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        pVolverOpcAdmin = new javax.swing.JButton();
        bAltaBaja = new javax.swing.JButton();
        bParametros = new javax.swing.JButton();
        bFichPalabras = new javax.swing.JButton();
        bInfoPartidas = new javax.swing.JButton();
        bRanking = new javax.swing.JButton();
        pAltaYBaja = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pVolverAltaYBaja = new javax.swing.JButton();
        bDarAlta = new javax.swing.JButton();
        bDarBaja = new javax.swing.JButton();
        tJAltaYBaja = new javax.swing.JTextField();
        pParametros = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tNPalabras = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pVolverParam = new javax.swing.JButton();
        bGuardarCambios = new javax.swing.JButton();
        bSiPalabra = new javax.swing.JRadioButton();
        bNoLetra = new javax.swing.JRadioButton();
        bNoPalabra = new javax.swing.JRadioButton();
        bSiLetra = new javax.swing.JRadioButton();
        pFichPalabras = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        pVolverFichPal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tFichPalabras = new javax.swing.JTextArea();
        pInfoPartidas = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        pVolverInfoPtds = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tInfoPtds = new javax.swing.JTextArea();
        pRankings = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        bRankPuntos = new javax.swing.JButton();
        pVolverRankings = new javax.swing.JButton();
        bRankAlfabetico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(520, 440));
        setResizable(false);

        pInicio.setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("WORDLE");

        jLabel4.setText("¡Bienvenidos a nuestro juego!");

        bAdmin.setText("Administrador");
        bAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdminActionPerformed(evt);
            }
        });

        bJugador.setText("Jugador");
        bJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bJugadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pInicioLayout = new javax.swing.GroupLayout(pInicio);
        pInicio.setLayout(pInicioLayout);
        pInicioLayout.setHorizontalGroup(
            pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInicioLayout.createSequentialGroup()
                .addGroup(pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInicioLayout.createSequentialGroup()
                        .addGroup(pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pInicioLayout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(jLabel3))
                            .addGroup(pInicioLayout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(jLabel4)))
                        .addGap(0, 171, Short.MAX_VALUE))
                    .addGroup(pInicioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bJugador)))
                .addContainerGap())
        );
        pInicioLayout.setVerticalGroup(
            pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
                .addGroup(pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAdmin)
                    .addComponent(bJugador))
                .addGap(20, 20, 20))
        );

        pOpcionesJuego.setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("OPCIONES DE JUEGO");

        jLabel2.setText("Nombre del jugador 2:");

        jLabel5.setText("Elige a qué modalidad quieres jugar:");

        bVolverOpJug.setText("Volver");
        bVolverOpJug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverOpJugActionPerformed(evt);
            }
        });

        bPartida.setText("Partida multijugador");
        bPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPartidaActionPerformed(evt);
            }
        });

        bEntrenamiento.setText("Entrenamiento individual");
        bEntrenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrenamientoActionPerformed(evt);
            }
        });

        jLabel8.setText("Nombre del jugador 1:");

        nombreJ1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        nombreJ2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setText("Escribe jugador para entrenamiento:");

        javax.swing.GroupLayout pOpcionesJuegoLayout = new javax.swing.GroupLayout(pOpcionesJuego);
        pOpcionesJuego.setLayout(pOpcionesJuegoLayout);
        pOpcionesJuegoLayout.setHorizontalGroup(
            pOpcionesJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOpcionesJuegoLayout.createSequentialGroup()
                .addGroup(pOpcionesJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pOpcionesJuegoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(nombreJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pOpcionesJuegoLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1))
                    .addGroup(pOpcionesJuegoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bVolverOpJug))
                    .addGroup(pOpcionesJuegoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(nombreJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pOpcionesJuegoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(tNombreJNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pOpcionesJuegoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pOpcionesJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bPartida)
                            .addComponent(jLabel5))
                        .addGap(74, 74, 74)
                        .addComponent(bEntrenamiento)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        pOpcionesJuegoLayout.setVerticalGroup(
            pOpcionesJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOpcionesJuegoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(pOpcionesJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nombreJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pOpcionesJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pOpcionesJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tNombreJNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(pOpcionesJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPartida)
                    .addComponent(bEntrenamiento))
                .addGap(92, 92, 92)
                .addComponent(bVolverOpJug)
                .addContainerGap())
        );

        pPartidaMulti.setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("PARTIDA MULTIJUGADOR");

        bSalirPartida.setText("Salir");
        bSalirPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirPartidaActionPerformed(evt);
            }
        });

        jLabel9.setText("Escribe la palabra:");

        bResolver.setText("Resolver");
        bResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResolverActionPerformed(evt);
            }
        });

        puntosJug.setText("Puntos disponibles: 50");

        bRegLetra.setText("Regalo de letra");
        bRegLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegLetraActionPerformed(evt);
            }
        });

        bRegPalabra.setText("Regalo de palabra");

        tLetra2Multi.setEditable(false);
        tLetra2Multi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tLetra2Multi.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tLetra3Multi.setEditable(false);
        tLetra3Multi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tLetra3Multi.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tLetra4Multi.setEditable(false);
        tLetra4Multi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tLetra4Multi.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tLetra5Multi.setEditable(false);
        tLetra5Multi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tLetra5Multi.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tLetra1Multi.setEditable(false);
        tLetra1Multi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tLetra1Multi.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        turnoJ.setText("Turno del jugador:");

        javax.swing.GroupLayout pPartidaMultiLayout = new javax.swing.GroupLayout(pPartidaMulti);
        pPartidaMulti.setLayout(pPartidaMultiLayout);
        pPartidaMultiLayout.setHorizontalGroup(
            pPartidaMultiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPartidaMultiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(96, 96, 96))
            .addGroup(pPartidaMultiLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(bRegLetra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bRegPalabra)
                .addGap(80, 80, 80))
            .addGroup(pPartidaMultiLayout.createSequentialGroup()
                .addGroup(pPartidaMultiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPartidaMultiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pPartidaMultiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bSalirPartida)
                            .addGroup(pPartidaMultiLayout.createSequentialGroup()
                                .addGroup(pPartidaMultiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pPartidaMultiLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tPalabraMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(turnoJ))
                                .addGap(18, 18, 18)
                                .addGroup(pPartidaMultiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bResolver)
                                    .addComponent(puntosJug)))))
                    .addGroup(pPartidaMultiLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(tLetra1Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tLetra2Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tLetra3Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tLetra4Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tLetra5Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        pPartidaMultiLayout.setVerticalGroup(
            pPartidaMultiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPartidaMultiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(pPartidaMultiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(puntosJug)
                    .addComponent(turnoJ))
                .addGap(18, 18, 18)
                .addGroup(pPartidaMultiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(pPartidaMultiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tPalabraMulti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bResolver)))
                .addGap(63, 63, 63)
                .addGroup(pPartidaMultiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tLetra2Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tLetra3Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tLetra4Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tLetra5Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tLetra1Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(pPartidaMultiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRegLetra)
                    .addComponent(bRegPalabra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(bSalirPartida)
                .addContainerGap())
        );

        pEntrenamiento.setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setText("ENTRENAMIENTO INDIVIDUAL");

        bSalirEntrenamiento.setText("Salir");
        bSalirEntrenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirEntrenamientoActionPerformed(evt);
            }
        });

        entrenamientoJug.setText("Entrenamiento del jugador jugador1:");

        puntosJugEntrenamiento.setText("Puntos disponibles: 50");

        jLabel10.setText("Escribe la palabra:");

        bResolverEntrenamiento.setText("Resolver");

        bRegLetraEntrenamiento.setText("Regalo de letra");

        bRegPalabraEntrenamiento.setText("Regalo de palabra");

        tLetra2Solo.setEditable(false);

        tLetra5Solo.setEditable(false);

        tLetra4Solo.setEditable(false);

        tLetra3Solo.setEditable(false);

        tLetra1Solo.setEditable(false);

        javax.swing.GroupLayout pEntrenamientoLayout = new javax.swing.GroupLayout(pEntrenamiento);
        pEntrenamiento.setLayout(pEntrenamientoLayout);
        pEntrenamientoLayout.setHorizontalGroup(
            pEntrenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEntrenamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(entrenamientoJug)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(puntosJugEntrenamiento)
                .addGap(48, 48, 48))
            .addGroup(pEntrenamientoLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(bRegLetraEntrenamiento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bRegPalabraEntrenamiento)
                .addGap(64, 64, 64))
            .addGroup(pEntrenamientoLayout.createSequentialGroup()
                .addGroup(pEntrenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pEntrenamientoLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(tLetra1Solo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tLetra2Solo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tLetra3Solo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tLetra4Solo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tLetra5Solo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pEntrenamientoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bSalirEntrenamiento))
                    .addGroup(pEntrenamientoLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel7))
                    .addGroup(pEntrenamientoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tPalabraEntrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(bResolverEntrenamiento)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        pEntrenamientoLayout.setVerticalGroup(
            pEntrenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEntrenamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(pEntrenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrenamientoJug)
                    .addComponent(puntosJugEntrenamiento))
                .addGap(18, 18, 18)
                .addGroup(pEntrenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tPalabraEntrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bResolverEntrenamiento))
                .addGap(72, 72, 72)
                .addGroup(pEntrenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tLetra1Solo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tLetra2Solo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tLetra3Solo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tLetra4Solo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tLetra5Solo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(pEntrenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRegLetraEntrenamiento)
                    .addComponent(bRegPalabraEntrenamiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(bSalirEntrenamiento)
                .addContainerGap())
        );

        pOpcionesAdmin.setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setText("OPCIONES ADMINISTRADOR");

        pVolverOpcAdmin.setText("Volver");
        pVolverOpcAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pVolverOpcAdminActionPerformed(evt);
            }
        });

        bAltaBaja.setText("Dar de alta y dar de baja");
        bAltaBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAltaBajaActionPerformed(evt);
            }
        });

        bParametros.setText("Parámetros del juego");
        bParametros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bParametrosActionPerformed(evt);
            }
        });

        bFichPalabras.setText("Fichero de palabras");
        bFichPalabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFichPalabrasActionPerformed(evt);
            }
        });

        bInfoPartidas.setText("Información de las partidas");
        bInfoPartidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInfoPartidasActionPerformed(evt);
            }
        });

        bRanking.setText("Generar rankings");
        bRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRankingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pOpcionesAdminLayout = new javax.swing.GroupLayout(pOpcionesAdmin);
        pOpcionesAdmin.setLayout(pOpcionesAdminLayout);
        pOpcionesAdminLayout.setHorizontalGroup(
            pOpcionesAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOpcionesAdminLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pOpcionesAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pOpcionesAdminLayout.createSequentialGroup()
                        .addComponent(bFichPalabras)
                        .addGap(55, 349, Short.MAX_VALUE))
                    .addGroup(pOpcionesAdminLayout.createSequentialGroup()
                        .addGroup(pOpcionesAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pOpcionesAdminLayout.createSequentialGroup()
                                .addComponent(bParametros)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bRanking))
                            .addGroup(pOpcionesAdminLayout.createSequentialGroup()
                                .addComponent(bAltaBaja)
                                .addGap(96, 96, 96)
                                .addComponent(bInfoPartidas)))
                        .addGap(0, 31, Short.MAX_VALUE))))
            .addGroup(pOpcionesAdminLayout.createSequentialGroup()
                .addGroup(pOpcionesAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pOpcionesAdminLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel11))
                    .addGroup(pOpcionesAdminLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pVolverOpcAdmin)))
                .addGap(49, 49, 49))
        );
        pOpcionesAdminLayout.setVerticalGroup(
            pOpcionesAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOpcionesAdminLayout.createSequentialGroup()
                .addGroup(pOpcionesAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pOpcionesAdminLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11))
                    .addGroup(pOpcionesAdminLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(pOpcionesAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bInfoPartidas)
                            .addComponent(bAltaBaja))))
                .addGroup(pOpcionesAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pOpcionesAdminLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pVolverOpcAdmin)
                        .addContainerGap())
                    .addGroup(pOpcionesAdminLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(pOpcionesAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bRanking)
                            .addComponent(bParametros))
                        .addGap(37, 37, 37)
                        .addComponent(bFichPalabras)
                        .addContainerGap(149, Short.MAX_VALUE))))
        );

        pAltaYBaja.setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setText("DAR DE ALTA Y DAR DE BAJA");

        jLabel14.setText("Elige el nombre del jugador:");

        jLabel15.setText("Elige la opción que deseas realizar:");

        pVolverAltaYBaja.setText("Volver");
        pVolverAltaYBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pVolverAltaYBajaActionPerformed(evt);
            }
        });

        bDarAlta.setText("Dar de alta al jugador");
        bDarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDarAltaActionPerformed(evt);
            }
        });

        bDarBaja.setText("Dar de baja al jugador");
        bDarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDarBajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pAltaYBajaLayout = new javax.swing.GroupLayout(pAltaYBaja);
        pAltaYBaja.setLayout(pAltaYBajaLayout);
        pAltaYBajaLayout.setHorizontalGroup(
            pAltaYBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAltaYBajaLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(71, 71, 71))
            .addGroup(pAltaYBajaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAltaYBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAltaYBajaLayout.createSequentialGroup()
                        .addGroup(pAltaYBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pAltaYBajaLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tJAltaYBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pVolverAltaYBaja))
                        .addContainerGap(174, Short.MAX_VALUE))
                    .addGroup(pAltaYBajaLayout.createSequentialGroup()
                        .addGroup(pAltaYBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bDarAlta)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bDarBaja)
                        .addGap(89, 89, 89))))
        );
        pAltaYBajaLayout.setVerticalGroup(
            pAltaYBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAltaYBajaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(35, 35, 35)
                .addGroup(pAltaYBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tJAltaYBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(jLabel15)
                .addGap(39, 39, 39)
                .addGroup(pAltaYBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDarAlta)
                    .addComponent(bDarBaja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(pVolverAltaYBaja)
                .addContainerGap())
        );

        pParametros.setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel16.setText("PARÁMETROS DEL JUEGO");

        jLabel17.setText("Escribe el número de palabras por partida:");

        tNPalabras.setText("4");

        jLabel18.setText("¿Quieres que exista la pista de letra en las partidas?");

        jLabel19.setText("¿Quieres que exista la pista de palabra en las partidas?");

        pVolverParam.setText("Volver");
        pVolverParam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pVolverParamActionPerformed(evt);
            }
        });

        bGuardarCambios.setText("Guardar cambios");
        bGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarCambiosActionPerformed(evt);
            }
        });

        grupoPalabra.add(bSiPalabra);
        bSiPalabra.setSelected(true);
        bSiPalabra.setText("Sí");

        grupoLetra.add(bNoLetra);
        bNoLetra.setText("No");

        grupoPalabra.add(bNoPalabra);
        bNoPalabra.setText("No");

        grupoLetra.add(bSiLetra);
        bSiLetra.setSelected(true);
        bSiLetra.setText("Sí");

        javax.swing.GroupLayout pParametrosLayout = new javax.swing.GroupLayout(pParametros);
        pParametros.setLayout(pParametrosLayout);
        pParametrosLayout.setHorizontalGroup(
            pParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pParametrosLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(pParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pParametrosLayout.createSequentialGroup()
                        .addComponent(bGuardarCambios)
                        .addGap(197, 197, 197))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pParametrosLayout.createSequentialGroup()
                        .addGroup(pParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(bNoLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pParametrosLayout.createSequentialGroup()
                                .addComponent(bSiPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                                .addComponent(bNoPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(89, 89, 89))))
            .addGroup(pParametrosLayout.createSequentialGroup()
                .addGroup(pParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pParametrosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(pParametrosLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tNPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel19)
                            .addComponent(pVolverParam)))
                    .addGroup(pParametrosLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(bSiLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pParametrosLayout.setVerticalGroup(
            pParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pParametrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(28, 28, 28)
                .addGroup(pParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tNPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addGroup(pParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSiLetra)
                    .addComponent(bNoLetra))
                .addGap(12, 12, 12)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addGroup(pParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSiPalabra)
                    .addComponent(bNoPalabra))
                .addGap(26, 26, 26)
                .addComponent(bGuardarCambios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(pVolverParam)
                .addContainerGap())
        );

        pFichPalabras.setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel20.setText("FICHERO DE PALABRAS");

        jLabel21.setText("Estas son todas las palabras del fichero:");

        pVolverFichPal.setText("Volver");
        pVolverFichPal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pVolverFichPalActionPerformed(evt);
            }
        });

        tFichPalabras.setEditable(false);
        tFichPalabras.setColumns(20);
        tFichPalabras.setRows(5);
        jScrollPane2.setViewportView(tFichPalabras);

        javax.swing.GroupLayout pFichPalabrasLayout = new javax.swing.GroupLayout(pFichPalabras);
        pFichPalabras.setLayout(pFichPalabrasLayout);
        pFichPalabrasLayout.setHorizontalGroup(
            pFichPalabrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFichPalabrasLayout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(106, 106, 106))
            .addGroup(pFichPalabrasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pFichPalabrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(pFichPalabrasLayout.createSequentialGroup()
                        .addGroup(pFichPalabrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(pVolverFichPal))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pFichPalabrasLayout.setVerticalGroup(
            pFichPalabrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFichPalabrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(29, 29, 29)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(pVolverFichPal)
                .addContainerGap())
        );

        pInfoPartidas.setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel22.setText("INFORMACIÓN PARTIDAS");

        jLabel23.setText("Esta es la información disponible de todas las partidas:");

        pVolverInfoPtds.setText("Volver");
        pVolverInfoPtds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pVolverInfoPtdsActionPerformed(evt);
            }
        });

        tInfoPtds.setEditable(false);
        tInfoPtds.setColumns(20);
        tInfoPtds.setRows(5);
        jScrollPane1.setViewportView(tInfoPtds);

        javax.swing.GroupLayout pInfoPartidasLayout = new javax.swing.GroupLayout(pInfoPartidas);
        pInfoPartidas.setLayout(pInfoPartidasLayout);
        pInfoPartidasLayout.setHorizontalGroup(
            pInfoPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInfoPartidasLayout.createSequentialGroup()
                .addGroup(pInfoPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInfoPartidasLayout.createSequentialGroup()
                        .addGroup(pInfoPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pInfoPartidasLayout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel22))
                            .addGroup(pInfoPartidasLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel23))
                            .addGroup(pInfoPartidasLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pVolverInfoPtds)))
                        .addGap(0, 97, Short.MAX_VALUE))
                    .addGroup(pInfoPartidasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        pInfoPartidasLayout.setVerticalGroup(
            pInfoPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInfoPartidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(pVolverInfoPtds)
                .addContainerGap())
        );

        pRankings.setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel24.setText("GENERAR RANKINGS");

        jLabel25.setText("Elige qué tipo de ranking quieres crear:");

        jLabel26.setText("Al seleccionar cualquiera de las opciones se creará un fichero de texto con el ranking.");

        bRankPuntos.setText("Ranking por puntuación");
        bRankPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRankPuntosActionPerformed(evt);
            }
        });

        pVolverRankings.setText("Volver");
        pVolverRankings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pVolverRankingsActionPerformed(evt);
            }
        });

        bRankAlfabetico.setText("Ranking por orden alfabético");
        bRankAlfabetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRankAlfabeticoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pRankingsLayout = new javax.swing.GroupLayout(pRankings);
        pRankings.setLayout(pRankingsLayout);
        pRankingsLayout.setHorizontalGroup(
            pRankingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRankingsLayout.createSequentialGroup()
                .addGroup(pRankingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pRankingsLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel24))
                    .addGroup(pRankingsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel26))
                    .addGroup(pRankingsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25))
                    .addGroup(pRankingsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pVolverRankings)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRankingsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pRankingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRankingsLayout.createSequentialGroup()
                        .addComponent(bRankPuntos)
                        .addGap(182, 182, 182))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRankingsLayout.createSequentialGroup()
                        .addComponent(bRankAlfabetico)
                        .addGap(168, 168, 168))))
        );
        pRankingsLayout.setVerticalGroup(
            pRankingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRankingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addGap(35, 35, 35)
                .addComponent(bRankPuntos)
                .addGap(18, 18, 18)
                .addComponent(bRankAlfabetico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(pVolverRankings)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pPartidaMulti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pOpcionesAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pParametros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pInfoPartidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pOpcionesJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pEntrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pAltaYBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pFichPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pRankings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pPartidaMulti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pOpcionesAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pParametros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pInfoPartidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pOpcionesJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pEntrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pAltaYBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pFichPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pRankings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bVolverOpJugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverOpJugActionPerformed
        pInicio.setVisible(true);
        pOpcionesJuego.setVisible(false);
    }//GEN-LAST:event_bVolverOpJugActionPerformed

    private void bJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bJugadorActionPerformed
        pOpcionesJuego.setVisible(true);
        pInicio.setVisible(false);
        cargarNombresJugadores(nombreJ1);
        cargarNombresJugadores(nombreJ2);
        cargarPalabrasDesdeArchivo();
    }//GEN-LAST:event_bJugadorActionPerformed

    private void bSalirPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirPartidaActionPerformed
        pOpcionesJuego.setVisible(true);
        pPartidaMulti.setVisible(false);
    }//GEN-LAST:event_bSalirPartidaActionPerformed

    private void bPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPartidaActionPerformed
        pPartidaMulti.setVisible(true);
        pOpcionesJuego.setVisible(false);
        if (nombreJ1.getSelectedItem().equals(nombreJ2.getSelectedItem())) {
            JOptionPane.showMessageDialog(this, "Elige dos jugadores distintos", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String nPalabras = tNPalabras.getText();
            int num = Integer.parseInt(nPalabras);
            Random random = new Random();
            for (int i = 0; i < num; i++) {
                int indiceAleatorio = random.nextInt(totalPalabras.size());
                Palabra palabraSeleccionada = totalPalabras.get(indiceAleatorio);
                palabrasPartida.add(palabraSeleccionada);
                totalPalabras.remove(indiceAleatorio);
            }
            Jugador jugador1 = new Jugador((String) nombreJ1.getSelectedItem());
            Jugador jugador2 = new Jugador((String) nombreJ2.getSelectedItem());
            partida.setJugador1(jugador1);
            partida.setJugador2(jugador2);
            String nJ1 = partida.getJugador1().getNombreUsuario();
            String nJ2 = partida.getJugador2().getNombreUsuario();
            turnoJ.setText("Turno del jugador " + nJ1 + ":");
            puntosJug.setText("Puntos disponibles: 5");
            palabra = palabrasPartida.get(0);
        }
    }//GEN-LAST:event_bPartidaActionPerformed

    private void bEntrenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrenamientoActionPerformed
        pEntrenamiento.setVisible(true);
        pOpcionesJuego.setVisible(false);
        String nombre = tNombreJNuevo.getText();
        entrenamientoJug.setText("Entrenamiento del jugador " + nombre + ":");
    }//GEN-LAST:event_bEntrenamientoActionPerformed

    private void bSalirEntrenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirEntrenamientoActionPerformed
        pOpcionesJuego.setVisible(true);
        pEntrenamiento.setVisible(false);
    }//GEN-LAST:event_bSalirEntrenamientoActionPerformed

    private void bAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdminActionPerformed
        pOpcionesAdmin.setVisible(true);
        pInicio.setVisible(false);
    }//GEN-LAST:event_bAdminActionPerformed

    private void pVolverOpcAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pVolverOpcAdminActionPerformed
        pInicio.setVisible(true);
        pOpcionesAdmin.setVisible(false);
    }//GEN-LAST:event_pVolverOpcAdminActionPerformed

    private void bResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResolverActionPerformed
        Palabra pEscrita = new Palabra(tPalabraMulti.getText());
        if (tPalabraMulti.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Escribe la palabra que quieres probar.", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else if (pEscrita.getLetras().length != 5) {
            JOptionPane.showMessageDialog(this, "La palabra debe ser de cinco letras.", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            tLetra1Multi.setText(Character.toString(pEscrita.getLetras()[0]));
            tLetra2Multi.setText(Character.toString(pEscrita.getLetras()[1]));
            tLetra3Multi.setText(Character.toString(pEscrita.getLetras()[2]));
            tLetra4Multi.setText(Character.toString(pEscrita.getLetras()[3]));
            tLetra5Multi.setText(Character.toString(pEscrita.getLetras()[4]));
            partida.jugar(palabra, tPalabraMulti.getText());

            for (int i = 0; i < 5; i++) {
                char letraPalabra = palabra.toString().charAt(i);
                char letraEscrita = pEscrita.toString().charAt(i);
                JTextField textField = null;

                switch (i) {
                    case 0:
                        textField = tLetra1Multi;
                        break;
                    case 1:
                        textField = tLetra2Multi;
                        break;
                    case 2:
                        textField = tLetra3Multi;
                        break;
                    case 3:
                        textField = tLetra4Multi;
                        break;
                    case 4:
                        textField = tLetra5Multi;
                        break;
                    default:
                        break;
                }

                if (letraEscrita == letraPalabra) {
                    textField.setBackground(Color.GREEN);
                } else if (palabra.toString().contains(String.valueOf(letraEscrita))) {
                    textField.setBackground(Color.YELLOW);
                } else {
                    textField.setBackground(Color.WHITE);
                }
            }

            tPalabraMulti.setText("");
            if ((pEscrita.equals(palabra)) || (partida.getIntento().getNumIntento() == 5)) {
                tLetra1Multi.setText("");
                tLetra2Multi.setText("");
                tLetra3Multi.setText("");
                tLetra4Multi.setText("");
                tLetra5Multi.setText("");
                tLetra1Multi.setBackground(Color.WHITE);
                tLetra2Multi.setBackground(Color.WHITE);
                tLetra3Multi.setBackground(Color.WHITE);
                tLetra4Multi.setBackground(Color.WHITE);
                tLetra5Multi.setBackground(Color.WHITE);
                String nJ1 = partida.getJugador1().getNombreUsuario();
                String nJ2 = partida.getJugador2().getNombreUsuario();
                if (turnoJ.getText().equals("Turno del jugador " + nJ1 + ":")) {
                    turnoJ.setText("Turno del jugador " + nJ2 + ":");
                    puntosJug.setText("Puntos disponibles: " + partida.getJugador2().getPuntos());
                } else {
                    turnoJ.setText("Turno del jugador " + nJ1 + ":");
                    puntosJug.setText("Puntos disponibles: " + partida.getJugador1().getPuntos());
                }
                int index = palabrasPartida.indexOf(palabra);
                if (index >= 0 && index < palabrasPartida.size() - 1) {
                    palabra = palabrasPartida.get(index + 1);
                } else {
                    partida.determinarGanador();
                    partida.terminarPartida();
                    JOptionPane.showMessageDialog(this, "¡Partida finalizada!", "Info", JOptionPane.INFORMATION_MESSAGE);
                    pOpcionesJuego.setVisible(true);
                    pPartidaMulti.setVisible(false);
                }
            }
        }
    }//GEN-LAST:event_bResolverActionPerformed

    private void pVolverAltaYBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pVolverAltaYBajaActionPerformed
        pOpcionesAdmin.setVisible(true);
        pAltaYBaja.setVisible(false);
    }//GEN-LAST:event_pVolverAltaYBajaActionPerformed

    private void bAltaBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAltaBajaActionPerformed
        pAltaYBaja.setVisible(true);
        pOpcionesAdmin.setVisible(false);
    }//GEN-LAST:event_bAltaBajaActionPerformed

    private void pVolverParamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pVolverParamActionPerformed
        pOpcionesAdmin.setVisible(true);
        pParametros.setVisible(false);
    }//GEN-LAST:event_pVolverParamActionPerformed

    private void bParametrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bParametrosActionPerformed
        pParametros.setVisible(true);
        pOpcionesAdmin.setVisible(false);
    }//GEN-LAST:event_bParametrosActionPerformed

    private void bGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarCambiosActionPerformed
        boolean siLetra = bSiLetra.isSelected();
        boolean siPalabra = bSiPalabra.isSelected();

        bRegLetra.setEnabled(siLetra);
        bRegLetraEntrenamiento.setEnabled(siLetra);
        bRegPalabra.setEnabled(siPalabra);
        bRegPalabraEntrenamiento.setEnabled(siPalabra);
        String nPalabras = tNPalabras.getText();
        int numero = Integer.parseInt(nPalabras);
        if (numero % 2 != 0) {
            JOptionPane.showMessageDialog(this, "El número de palabras debe ser par.", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Cambios realizados.", "Info", JOptionPane.INFORMATION_MESSAGE);
            pOpcionesAdmin.setVisible(true);
            pParametros.setVisible(false);
        }
    }//GEN-LAST:event_bGuardarCambiosActionPerformed

    private void pVolverFichPalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pVolverFichPalActionPerformed
        pOpcionesAdmin.setVisible(true);
        pFichPalabras.setVisible(false);
    }//GEN-LAST:event_pVolverFichPalActionPerformed

    private void bFichPalabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFichPalabrasActionPerformed
        pFichPalabras.setVisible(true);
        pOpcionesAdmin.setVisible(false);
        String rutaArchivo = "palabras.txt";

        try ( BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            StringBuilder contenido = new StringBuilder();
            String linea;

            while ((linea = reader.readLine()) != null) {
                contenido.append(linea).append("\n");
            }

            tFichPalabras.setText(contenido.toString());
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "El archivo no se encontró.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al leer el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bFichPalabrasActionPerformed

    private void pVolverInfoPtdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pVolverInfoPtdsActionPerformed
        pOpcionesAdmin.setVisible(true);
        pInfoPartidas.setVisible(false);
    }//GEN-LAST:event_pVolverInfoPtdsActionPerformed

    private void bInfoPartidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInfoPartidasActionPerformed
        pInfoPartidas.setVisible(true);
        pOpcionesAdmin.setVisible(false);
    }//GEN-LAST:event_bInfoPartidasActionPerformed

    private void pVolverRankingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pVolverRankingsActionPerformed
        pOpcionesAdmin.setVisible(true);
        pRankings.setVisible(false);
    }//GEN-LAST:event_pVolverRankingsActionPerformed

    private void bRankAlfabeticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRankAlfabeticoActionPerformed
        admin.crearRankingAlfabetico();
    }//GEN-LAST:event_bRankAlfabeticoActionPerformed

    private void bRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRankingActionPerformed
        pRankings.setVisible(true);
        pOpcionesAdmin.setVisible(false);
    }//GEN-LAST:event_bRankingActionPerformed

    private void bDarAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDarAltaActionPerformed
        String nJugador = tJAltaYBaja.getText();
        if (tJAltaYBaja.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Escribe el nombre del jugador primero.", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            boolean nombreRepetido = admin.existeJugador(nJugador);
            if (nombreRepetido) {
                JOptionPane.showMessageDialog(this, "El nombre de jugador ya existe. Elige otro nombre.", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                try {
                    admin.agregarNuevoJugador(nJugador);
                    JOptionPane.showMessageDialog(this, "Jugador creado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    tJAltaYBaja.setText("");
                } catch (RuntimeException e) {
                    JOptionPane.showMessageDialog(this, "Error al crear el jugador: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_bDarAltaActionPerformed

    private void bDarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDarBajaActionPerformed
        String nombreJugador = tJAltaYBaja.getText();
        if (nombreJugador.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Escribe el nombre del jugador primero.", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                admin.eliminarJugador(nombreJugador);
                JOptionPane.showMessageDialog(this, "Jugador eliminado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } catch (RuntimeException e) {
                JOptionPane.showMessageDialog(this, "Error al eliminar el jugador: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_bDarBajaActionPerformed

    private void bRankPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRankPuntosActionPerformed
        admin.crearRankingPuntos();
    }//GEN-LAST:event_bRankPuntosActionPerformed

    private void bRegLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegLetraActionPerformed
        //PistaLetra pLetra = new PistaLetra(palabra);
    }//GEN-LAST:event_bRegLetraActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdmin;
    private javax.swing.JButton bAltaBaja;
    private javax.swing.JButton bDarAlta;
    private javax.swing.JButton bDarBaja;
    private javax.swing.JButton bEntrenamiento;
    private javax.swing.JButton bFichPalabras;
    private javax.swing.JButton bGuardarCambios;
    private javax.swing.JButton bInfoPartidas;
    private javax.swing.JButton bJugador;
    private javax.swing.JRadioButton bNoLetra;
    private javax.swing.JRadioButton bNoPalabra;
    private javax.swing.JButton bParametros;
    private javax.swing.JButton bPartida;
    private javax.swing.JButton bRankAlfabetico;
    private javax.swing.JButton bRankPuntos;
    private javax.swing.JButton bRanking;
    private javax.swing.JButton bRegLetra;
    private javax.swing.JButton bRegLetraEntrenamiento;
    private javax.swing.JButton bRegPalabra;
    private javax.swing.JButton bRegPalabraEntrenamiento;
    private javax.swing.JButton bResolver;
    private javax.swing.JButton bResolverEntrenamiento;
    private javax.swing.JButton bSalirEntrenamiento;
    private javax.swing.JButton bSalirPartida;
    private javax.swing.JRadioButton bSiLetra;
    private javax.swing.JRadioButton bSiPalabra;
    private javax.swing.JButton bVolverOpJug;
    private javax.swing.JLabel entrenamientoJug;
    private javax.swing.ButtonGroup grupoLetra;
    private javax.swing.ButtonGroup grupoPalabra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> nombreJ1;
    private javax.swing.JComboBox<String> nombreJ2;
    private javax.swing.JPanel pAltaYBaja;
    private javax.swing.JPanel pEntrenamiento;
    private javax.swing.JPanel pFichPalabras;
    private javax.swing.JPanel pInfoPartidas;
    private javax.swing.JPanel pInicio;
    private javax.swing.JPanel pOpcionesAdmin;
    private javax.swing.JPanel pOpcionesJuego;
    private javax.swing.JPanel pParametros;
    private javax.swing.JPanel pPartidaMulti;
    private javax.swing.JPanel pRankings;
    private javax.swing.JButton pVolverAltaYBaja;
    private javax.swing.JButton pVolverFichPal;
    private javax.swing.JButton pVolverInfoPtds;
    private javax.swing.JButton pVolverOpcAdmin;
    private javax.swing.JButton pVolverParam;
    private javax.swing.JButton pVolverRankings;
    private javax.swing.JLabel puntosJug;
    private javax.swing.JLabel puntosJugEntrenamiento;
    private javax.swing.JTextArea tFichPalabras;
    private javax.swing.JTextArea tInfoPtds;
    private javax.swing.JTextField tJAltaYBaja;
    private javax.swing.JTextField tLetra1Multi;
    private javax.swing.JTextField tLetra1Solo;
    private javax.swing.JTextField tLetra2Multi;
    private javax.swing.JTextField tLetra2Solo;
    private javax.swing.JTextField tLetra3Multi;
    private javax.swing.JTextField tLetra3Solo;
    private javax.swing.JTextField tLetra4Multi;
    private javax.swing.JTextField tLetra4Solo;
    private javax.swing.JTextField tLetra5Multi;
    private javax.swing.JTextField tLetra5Solo;
    private javax.swing.JTextField tNPalabras;
    private javax.swing.JTextField tNombreJNuevo;
    private javax.swing.JTextField tPalabraEntrenamiento;
    private javax.swing.JTextField tPalabraMulti;
    private javax.swing.JLabel turnoJ;
    // End of variables declaration//GEN-END:variables

    private void cargarNombresJugadores(JComboBox<String> comboBox) {
        // Obtener la ruta del archivo de jugadores
        Path archivoJugadores = Paths.get("ficheros/jugadores.txt");

        // Verificar si el archivo existe
        if (!Files.exists(archivoJugadores)) {
            JOptionPane.showMessageDialog(null, "El archivo de jugadores no existe.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Crear una lista para almacenar los nombres de los jugadores
        List<String> nombresJugadores = new ArrayList<>();

        // Leer los nombres de los jugadores del archivo
        try ( BufferedReader reader = Files.newBufferedReader(archivoJugadores)) {
            String line;
            while ((line = reader.readLine()) != null) {
                int indexDelimiter = line.indexOf(","); // Obtener índice de la primera coma
                if (indexDelimiter != -1) {
                    String nombre = line.substring("Nombre: ".length(), indexDelimiter).trim();
                    nombresJugadores.add(nombre);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Error al leer el archivo de jugadores: " + e.getMessage());
        }

        // Agregar los nombres al modelo del JComboBox
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(nombresJugadores.toArray(new String[0]));
        comboBox.setModel(comboBoxModel);
    }

    private void cargarPalabrasDesdeArchivo() {
        String rutaArchivo = "ficheros/palabras.txt";

        try ( BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String palabra;
            while ((palabra = reader.readLine()) != null) {
                Palabra nuevaPalabra = new Palabra(palabra);
                totalPalabras.add(nuevaPalabra);
            }
        } catch (IOException e) {
            // Manejar el error de lectura del archivo
            e.printStackTrace();
        }
    }
}
