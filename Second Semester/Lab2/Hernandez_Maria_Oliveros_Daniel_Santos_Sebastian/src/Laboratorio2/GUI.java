/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Laboratorio2;

import javax.swing.JOptionPane;

/**
 *
 * @author sdsantos
 */
public class GUI extends javax.swing.JFrame {

    String columnNames[] = {"Codigo Estudiantil", "Primer Apellido", "Primer Nombre", "Semestre en curso", "N1", "N2", "N3", "N4", "N5", "Definitiva"};
    static int numEstudiantes = 0;
    Metodos my = new Metodos();
    static String lista[][] = new String[100][10];
    static String aux[][] = new String[100][4];

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        my.actualizarTabla(jTable1, aux, 0, columnNames);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        panelFormulario = new javax.swing.JPanel();
        verTabla = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        tituloCodigo = new javax.swing.JLabel();
        textoCodigo = new javax.swing.JTextField();
        labelApellido = new javax.swing.JLabel();
        tituloApellido = new javax.swing.JLabel();
        textoApellido = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        tituloNombre = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        labelSemestre = new javax.swing.JLabel();
        tituloSemestre = new javax.swing.JLabel();
        textoSemestre = new javax.swing.JTextField();
        tituloNota1 = new javax.swing.JLabel();
        textoNota1 = new javax.swing.JTextField();
        tituloNota2 = new javax.swing.JLabel();
        textoNota2 = new javax.swing.JTextField();
        tituloNota3 = new javax.swing.JLabel();
        textoNota3 = new javax.swing.JTextField();
        tituloNota4 = new javax.swing.JLabel();
        textoNota4 = new javax.swing.JTextField();
        tituloNota5 = new javax.swing.JLabel();
        textoNota5 = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ordenar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelFormulario.setBackground(new java.awt.Color(204, 204, 255));

        verTabla.setText("Ver tablas");
        verTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verTablaActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("CENTRO MEDICO UNINORTE");

        labelCodigo.setForeground(new java.awt.Color(153, 153, 153));
        labelCodigo.setText("Ingrese su codigo estudiantil");

        tituloCodigo.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        tituloCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCodigo.setText("Codigo estudiantil:");

        textoCodigo.setForeground(new java.awt.Color(153, 153, 153));
        textoCodigo.setToolTipText("");
        textoCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textoCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoCodigoKeyReleased(evt);
            }
        });

        labelApellido.setForeground(new java.awt.Color(153, 153, 153));
        labelApellido.setText("Ingrese su apellido");

        tituloApellido.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        tituloApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloApellido.setText("Primer apellido:");

        textoApellido.setForeground(new java.awt.Color(153, 153, 153));
        textoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoApellidoKeyReleased(evt);
            }
        });

        labelNombre.setForeground(new java.awt.Color(153, 153, 153));
        labelNombre.setText("Ingrese su nombre ");

        tituloNombre.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        tituloNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloNombre.setText("Primer nombre:");

        textoNombre.setForeground(new java.awt.Color(153, 153, 153));
        textoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoNombreKeyReleased(evt);
            }
        });

        labelSemestre.setForeground(new java.awt.Color(153, 153, 153));
        labelSemestre.setText("Ingrese su semestre");

        tituloSemestre.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        tituloSemestre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloSemestre.setText("Semestre:");

        textoSemestre.setForeground(new java.awt.Color(153, 153, 153));
        textoSemestre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoSemestreKeyReleased(evt);
            }
        });

        tituloNota1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        tituloNota1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloNota1.setText("Nota 1:");

        tituloNota2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        tituloNota2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloNota2.setText("Nota 2:");

        tituloNota3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        tituloNota3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloNota3.setText("Nota 3:");

        tituloNota4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        tituloNota4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloNota4.setText("Nota 4:");

        tituloNota5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        tituloNota5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloNota5.setText("Nota 5:");

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Laboratorio2/Logo-UNINORTE (1).png"))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        ordenar.setText("Ordenar");
        ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFormularioLayout = new javax.swing.GroupLayout(panelFormulario);
        panelFormulario.setLayout(panelFormularioLayout);
        panelFormularioLayout.setHorizontalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(titulo))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(tituloCodigo)
                        .addGap(12, 12, 12)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(labelCodigo))
                            .addComponent(textoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(tituloApellido)
                        .addGap(12, 12, 12)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(labelApellido))
                            .addComponent(textoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(tituloNombre)
                        .addGap(12, 12, 12)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(labelNombre))
                            .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(tituloNota4)
                        .addGap(18, 18, 18)
                        .addComponent(textoNota4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(tituloNota5)
                        .addGap(18, 18, 18)
                        .addComponent(textoNota5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(tituloSemestre)
                        .addGap(12, 12, 12)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(ordenar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(labelSemestre))
                            .addComponent(textoSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(tituloNota1)
                                .addGap(18, 18, 18)
                                .addComponent(textoNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(tituloNota2)
                                .addGap(18, 18, 18)
                                .addComponent(textoNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(tituloNota3))
                            .addComponent(imagen))
                        .addGap(27, 27, 27)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(verTabla)
                            .addComponent(textoNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelFormularioLayout.setVerticalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCodigo)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(labelCodigo))
                    .addComponent(textoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloApellido)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(labelApellido))
                    .addComponent(textoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloNombre)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloSemestre)
                    .addComponent(labelSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloNota1)
                    .addComponent(textoNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloNota2)
                    .addComponent(textoNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloNota3)
                    .addComponent(textoNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloNota4)
                    .addComponent(textoNota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloNota5)
                    .addComponent(textoNota5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(ordenar))
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(imagen))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormularioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verTabla)
                        .addGap(35, 35, 35))))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout fondoPanelLayout = new javax.swing.GroupLayout(fondoPanel);
        fondoPanel.setLayout(fondoPanelLayout);
        fondoPanelLayout.setHorizontalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoPanelLayout.createSequentialGroup()
                .addComponent(panelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(463, 463, 463)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        fondoPanelLayout.setVerticalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        String codigo = textoCodigo.getText();
        String nombre = textoNombre.getText();
        String apellido = textoApellido.getText();
        String semestre = textoSemestre.getText();
        String nota1 = textoNota1.getText();
        String nota2 = textoNota2.getText();
        String nota3 = textoNota3.getText();
        String nota4 = textoNota4.getText();
        String nota5 = textoNota5.getText();

        if (my.validarCodigo(codigo) && my.validarNombres(nombre) && my.validarNombres(apellido) && my.validarSemestre(semestre) && my.validarNota(nota1) && my.validarNota(nota2) && my.validarNota(nota3) && my.validarNota(nota4) && my.validarNota(nota5) && !my.buscarElemento(lista, numEstudiantes, codigo)) {
            lista[numEstudiantes][0] = codigo;
            lista[numEstudiantes][1] = apellido;
            lista[numEstudiantes][2] = nombre;
            lista[numEstudiantes][3] = semestre;
            lista[numEstudiantes][4] = nota1;
            lista[numEstudiantes][5] = nota2;
            lista[numEstudiantes][6] = nota3;
            lista[numEstudiantes][7] = nota4;
            lista[numEstudiantes][8] = nota5;
            my.definitivaEstudiantes(lista, numEstudiantes);

            numEstudiantes++;
            my.actualizarTabla(jTable1, lista, numEstudiantes, columnNames);
            textoCodigo.setText("");
            labelCodigo.setVisible(true);
            labelCodigo.setText("Ingrese su codigo estudiantil");
            textoNombre.setText("");
            labelNombre.setVisible(true);
            labelNombre.setText("Ingrese su nombre");
            textoApellido.setText("");
            labelApellido.setVisible(true);
            labelApellido.setText("Ingrese su apellido");
            textoSemestre.setText("");
            labelSemestre.setVisible(true);
            labelSemestre.setText("Ingrese su semestre");
            textoNota1.setText("");
            textoNota2.setText("");
            textoNota3.setText("");
            textoNota4.setText("");
            textoNota5.setText("");

        } else {
            if (codigo.equals("") || nombre.equals("") || apellido.equals("") || semestre.equals("") || nota1.equals("") || nota2.equals("") || nota3.equals("") || nota4.equals("") || nota5.equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor primero llena todos los campos");
            } else {
                if (my.buscarElemento(lista, numEstudiantes, codigo)) {
                    JOptionPane.showMessageDialog(null, "Por favor valida el codigo estudiantil. ya existe un estudiante con este mismo codigo");
                }

                if (!my.validarCodigo(codigo)) {
                    JOptionPane.showMessageDialog(null, "Por favor valida el codigo estudiantil. Debe tener solo numeros y ser de 8 digitos");
                }
                if (!my.validarNombres(nombre)) {
                    JOptionPane.showMessageDialog(null, "Por favor valida el primer nombre, este no debe contener numeros");
                }
                if (!my.validarNombres(apellido)) {
                    JOptionPane.showMessageDialog(null, "Por favor valida el primer apellido, este no debe contener numeros");
                }
                if (!my.validarSemestre(semestre)) {
                    JOptionPane.showMessageDialog(null, "Por favor valida el semestre ingresado, escriba un numero del 1-12");
                }
                if (!my.validarNota(nota1)) {
                    if (my.validarEntero(nota1)) {
                        JOptionPane.showMessageDialog(null, "Por favor valida la nota 1. Debe escribirla con punto decimal");
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor valida la nota 1. Debe ser entre 0.0 y 5.0");
                    }
                }
                if (!my.validarNota(nota2)) {
                    if (my.validarEntero(nota2)) {
                        JOptionPane.showMessageDialog(null, "Por favor valida la nota 2. Debe escribirla con punto decimal");
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor valida la nota 2. Debe ser entre 0.0 y 5.0");
                    }
                }
                if (!my.validarNota(nota3)) {
                    if (my.validarEntero(nota3)) {
                        JOptionPane.showMessageDialog(null, "Por favor valida la nota 3. Debe escribirla con punto decimal");
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor valida la nota 3. Debe ser entre 0.0 y 5.0");
                    }
                }
                if (!my.validarNota(nota4)) {
                    if (my.validarEntero(nota4)) {
                        JOptionPane.showMessageDialog(null, "Por favor valida la nota 4. Debe escribirla con punto decimal");
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor valida la nota 4. Debe ser entre 0.0 y 5.0");
                    }
                }
                if (!my.validarNota(nota5)) {
                    if (my.validarEntero(nota5)) {
                        JOptionPane.showMessageDialog(null, "Por favor valida la nota 5. Debe escribirla con punto decimal");
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor valida la nota 5. Debe ser entre 0.0 y 5.0");
                    }
                }
            }
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void verTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verTablaActionPerformed
        // TODO add your handling code here:
        MOSTRAR showme = new MOSTRAR();

        showme.setVisible(true);
    }//GEN-LAST:event_verTablaActionPerformed

    private void textoCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoCodigoKeyReleased
        String mensaje = "Ingrese su codigo estudiantil";
        my.showLabel(textoCodigo, labelCodigo, mensaje);
    }//GEN-LAST:event_textoCodigoKeyReleased

    private void textoApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoApellidoKeyReleased
        String mensaje = "Ingrese su apellido";
        my.showLabel(textoApellido, labelApellido, mensaje);
    }//GEN-LAST:event_textoApellidoKeyReleased

    private void textoNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNombreKeyReleased
        String mensaje = "Ingrese su nombre";
        my.showLabel(textoNombre, labelNombre, mensaje);
    }//GEN-LAST:event_textoNombreKeyReleased

    private void textoSemestreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoSemestreKeyReleased
        String mensaje = "Ingrese su semestre";
        my.showLabel(textoSemestre, labelSemestre, mensaje);
    }//GEN-LAST:event_textoSemestreKeyReleased

    private void ordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarActionPerformed
        my.ordenamientoMatriz(lista, numEstudiantes, 10);
        my.actualizarTabla(jTable1, lista, numEstudiantes, columnNames);
    }//GEN-LAST:event_ordenarActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelSemestre;
    private javax.swing.JButton ordenar;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JTextField textoApellido;
    private javax.swing.JTextField textoCodigo;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoNota1;
    private javax.swing.JTextField textoNota2;
    private javax.swing.JTextField textoNota3;
    private javax.swing.JTextField textoNota4;
    private javax.swing.JTextField textoNota5;
    private javax.swing.JTextField textoSemestre;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloApellido;
    private javax.swing.JLabel tituloCodigo;
    private javax.swing.JLabel tituloNombre;
    private javax.swing.JLabel tituloNota1;
    private javax.swing.JLabel tituloNota2;
    private javax.swing.JLabel tituloNota3;
    private javax.swing.JLabel tituloNota4;
    private javax.swing.JLabel tituloNota5;
    private javax.swing.JLabel tituloSemestre;
    private javax.swing.JButton verTabla;
    // End of variables declaration//GEN-END:variables
}
