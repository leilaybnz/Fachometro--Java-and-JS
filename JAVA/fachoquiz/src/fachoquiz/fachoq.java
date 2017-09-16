package fachoquiz;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wolf
 */
public class fachoq extends javax.swing.JFrame {

   int contador = 0;
   int [] resultado = {0,0,0,0,0,0,0,0,0,0};

   
   public void validacionGrupoBoton1(){
        if((botonQ1RN.isSelected()==true) && (botonQ1RM.isSelected()==false) && (botonQ1RK.isSelected()==false))
        {resultado[0]=1;}
        else if (botonQ1RM.isSelected()==true  && (botonQ1RN.isSelected()==false && (botonQ1RK.isSelected()==false)))
        {resultado[0]=2;} 
        else if (botonQ1RK.isSelected()==true  && (botonQ1RN.isSelected()==false && (botonQ1RM.isSelected()==false)))
       { resultado[0]=0;}       
    }
   
    public void validacionGrupoBoton2(){
        if((botonQ2RN.isSelected()==true) && (botonQ2RM.isSelected()==false) && (botonQ2RK.isSelected()==false))
        {resultado[1]=1;}
        else if (botonQ2RM.isSelected()==true  && (botonQ2RN.isSelected()==false && (botonQ2RK.isSelected()==false)))
            {resultado[1]=2;} 
        else if (botonQ2RK.isSelected()==true  && (botonQ2RN.isSelected()==false && (botonQ2RM.isSelected()==false)))
           { resultado[1]=0;} 
    }  
        
     public void validacionGrupoBoton3(){   
        if((botonQ3RN.isSelected()==true) && (botonQ3RM.isSelected()==false)&& (botonQ3RK.isSelected()==false))
        {resultado[2]=1;}
        else if (botonQ3RM.isSelected()==true  && (botonQ3RN.isSelected()==false)&& (botonQ3RK.isSelected()==false)){
            resultado[2]=2;} 
        else if (botonQ3RK.isSelected()==true  && (botonQ3RN.isSelected()==false && (botonQ3RM.isSelected()==false)))
           { resultado[2]=0;} 
       } 
        
     public void validacionGrupoBoton4(){   
        if((botonQ4RN.isSelected()==true) && (botonQ4RM.isSelected()==false)&& (botonQ4RK.isSelected()==false))
        {resultado[3]=1;}
        else if (botonQ4RM.isSelected()==true  && (botonQ4RN.isSelected()==false)&& (botonQ4RK.isSelected()==false)){
            resultado[3]=2;} 
        else if (botonQ4RK.isSelected()==true  && (botonQ4RN.isSelected()==false && (botonQ4RM.isSelected()==false)))
           { resultado[3]=0;} 
      }  
        
     public void validacionGrupoBoton5(){   
        if((botonQ5RN.isSelected()==true) && (botonQ5RM.isSelected()==false)&& (botonQ5RK.isSelected()==false))
        {resultado[4]=1;}
        else if (botonQ5RM.isSelected()==true  && (botonQ5RN.isSelected()==false)&& (botonQ5RK.isSelected()==false)){
            resultado[4]=2;}
        else if (botonQ5RK.isSelected()==true  && (botonQ5RN.isSelected()==false && (botonQ5RM.isSelected()==false)))
           { resultado[4]=0;} 
     }   
        
     public void validacionGrupoBoton6(){   
        if((botonQ6RN.isSelected()==true) && (botonQ6RM.isSelected()==false)&& (botonQ6RK.isSelected()==false))
        {resultado[5]=1;}
        else if (botonQ6RM.isSelected()==true  && (botonQ6RN.isSelected()==false)&& (botonQ6RK.isSelected()==false)){
            resultado[5]=2;} 
        else if (botonQ6RK.isSelected()==true  && (botonQ6RN.isSelected()==false && (botonQ6RM.isSelected()==false)))
           { resultado[5]=0;} 
      }  
        
      public void validacionGrupoBoton7(){  
        if((botonQ7RN.isSelected()==true) && (botonQ7RM.isSelected()==false)&& (botonQ7RK.isSelected()==false))
        {resultado[6]=1;}
        else if (botonQ7RM.isSelected()==true  && (botonQ7RN.isSelected()==false)&& (botonQ7RK.isSelected()==false)){
            resultado[6]=2;} 
        else if (botonQ7RK.isSelected()==true  && (botonQ7RN.isSelected()==false && (botonQ7RM.isSelected()==false)))
           { resultado[6]=0;} 
      }  
      public void validacionGrupoBoton8(){  
        if((botonQ8RN.isSelected()==true) && (botonQ8RM.isSelected()==false)&& (botonQ8RK.isSelected()==false))
        {resultado[7]=1;}
        else if (botonQ8RM.isSelected()==true  && (botonQ8RN.isSelected()==false)&& (botonQ8RK.isSelected()==false)){
            resultado[7]=2;} 
        else if (botonQ8RK.isSelected()==true  && (botonQ8RN.isSelected()==false && (botonQ8RM.isSelected()==false)))
           { resultado[7]=0;}
      }  
        
        public void validacionGrupoBoton9(){
        if((botonQ9RN.isSelected()==true) && (botonQ9RM.isSelected()==false)&& (botonQ9RK.isSelected()==false))
        {resultado[8]=1;}
        else if (botonQ2RM.isSelected()==true  && (botonQ9RN.isSelected()==false)&& (botonQ9RK.isSelected()==false)){
            resultado[8]=2;} 
        else if (botonQ9RK.isSelected()==true  && (botonQ9RN.isSelected()==false && (botonQ9RM.isSelected()==false)))
           { resultado[8]=0;} 
       } 
         public void validacionGrupoBoton10(){               
        if((botonQ10RN.isSelected()==true) && (botonQ10RM.isSelected()==false)&& (botonQ10RK.isSelected()==false))
        {resultado[9]=1;}
        else if (botonQ10RM.isSelected()==true  && (botonQ10RN.isSelected()==false)&& (botonQ10RK.isSelected()==false)){
            resultado[9]=2;} 
        else if (botonQ10RK.isSelected()==true  && (botonQ10RN.isSelected()==false && (botonQ10RM.isSelected()==false)))
           { resultado[9]=0;}
   }
   
   public fachoq() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RESPUESTA1 = new javax.swing.ButtonGroup();
        RESPUESTA2 = new javax.swing.ButtonGroup();
        RESPUESTA3 = new javax.swing.ButtonGroup();
        RESPUESTA4 = new javax.swing.ButtonGroup();
        RESPUESTA5 = new javax.swing.ButtonGroup();
        RESPUESTA6 = new javax.swing.ButtonGroup();
        RESPUESTA7 = new javax.swing.ButtonGroup();
        RESPUESTA8 = new javax.swing.ButtonGroup();
        RESPUESTA9 = new javax.swing.ButtonGroup();
        RESPUESTA10 = new javax.swing.ButtonGroup();
        txtpantalla = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        foto = new javax.swing.JLabel();
        preg1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botonQ1RK = new javax.swing.JRadioButton();
        botonQ1RM = new javax.swing.JRadioButton();
        botonQ1RN = new javax.swing.JRadioButton();
        preg2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        botonQ2RN = new javax.swing.JRadioButton();
        botonQ2RM = new javax.swing.JRadioButton();
        botonQ2RK = new javax.swing.JRadioButton();
        preg3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        botonQ3RK = new javax.swing.JRadioButton();
        botonQ3RN = new javax.swing.JRadioButton();
        botonQ3RM = new javax.swing.JRadioButton();
        preg4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        botonQ4RM = new javax.swing.JRadioButton();
        botonQ4RK = new javax.swing.JRadioButton();
        botonQ4RN = new javax.swing.JRadioButton();
        preg5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        botonQ5RN = new javax.swing.JRadioButton();
        botonQ5RK = new javax.swing.JRadioButton();
        botonQ5RM = new javax.swing.JRadioButton();
        preg6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        botonQ6RM = new javax.swing.JRadioButton();
        botonQ6RK = new javax.swing.JRadioButton();
        botonQ6RN = new javax.swing.JRadioButton();
        preg7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        botonQ7RM = new javax.swing.JRadioButton();
        botonQ7RN = new javax.swing.JRadioButton();
        botonQ7RK = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        botonQ8RM = new javax.swing.JRadioButton();
        botonQ8RK = new javax.swing.JRadioButton();
        botonQ8RN = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        preg9 = new javax.swing.JLabel();
        botonQ9RN = new javax.swing.JRadioButton();
        botonQ9RK = new javax.swing.JRadioButton();
        botonQ9RM = new javax.swing.JRadioButton();
        jPanel10 = new javax.swing.JPanel();
        preg10 = new javax.swing.JLabel();
        botonQ10RK = new javax.swing.JRadioButton();
        botonQ10RN = new javax.swing.JRadioButton();
        botonQ10RM = new javax.swing.JRadioButton();
        jPanel11 = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        setMaximumSize(new java.awt.Dimension(1100, 800));
        setMinimumSize(new java.awt.Dimension(1100, 800));
        setPreferredSize(new java.awt.Dimension(1100, 800));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtpantalla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtpantalla.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtpantalla.setEnabled(false);
        getContentPane().add(txtpantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 330, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FACHOMETRO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 170, 23));

        jButton1.setText("RESULTADO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        jButton2.setText("LIMPIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 91, -1));

        foto.setMaximumSize(new java.awt.Dimension(230, 210));
        foto.setMinimumSize(new java.awt.Dimension(230, 210));
        foto.setPreferredSize(new java.awt.Dimension(230, 210));
        getContentPane().add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 230, 210));

        preg1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        preg1.setText("1. ¿La diabetes es una enfermedad de alto poder adquisitivo?");
        getContentPane().add(preg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 430, 23));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 430, 20));

        RESPUESTA1.add(botonQ1RK);
        botonQ1RK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ1RK.setForeground(new java.awt.Color(255, 255, 255));
        botonQ1RK.setText("Sí, maldito gobierno americano.");
        botonQ1RK.setContentAreaFilled(false);
        botonQ1RK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ1RKActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ1RK, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        RESPUESTA1.add(botonQ1RM);
        botonQ1RM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ1RM.setForeground(new java.awt.Color(255, 255, 255));
        botonQ1RM.setText("¿Qué barbaridad estás diciendo?");
        botonQ1RM.setContentAreaFilled(false);
        botonQ1RM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ1RMActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ1RM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 230, -1));

        RESPUESTA1.add(botonQ1RN);
        botonQ1RN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ1RN.setForeground(new java.awt.Color(255, 255, 255));
        botonQ1RN.setText("Te la debo, no estoy en el tema.");
        botonQ1RN.setContentAreaFilled(false);
        botonQ1RN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ1RNActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ1RN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        preg2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        preg2.setText("2. Las kukas son:");
        getContentPane().add(preg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 150, 23));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 130, 20));

        RESPUESTA2.add(botonQ2RN);
        botonQ2RN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ2RN.setForeground(new java.awt.Color(255, 255, 255));
        botonQ2RN.setText("Un ser que sobrevive la bomba nuclear");
        botonQ2RN.setContentAreaFilled(false);
        botonQ2RN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ2RNActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ2RN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 270, -1));

        RESPUESTA2.add(botonQ2RM);
        botonQ2RM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ2RM.setForeground(new java.awt.Color(255, 255, 255));
        botonQ2RM.setText("Los que no vuelven más");
        botonQ2RM.setContentAreaFilled(false);
        botonQ2RM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ2RMActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ2RM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        RESPUESTA2.add(botonQ2RK);
        botonQ2RK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ2RK.setForeground(new java.awt.Color(255, 255, 255));
        botonQ2RK.setText("La resistencia. ¡Volveremos!");
        botonQ2RK.setContentAreaFilled(false);
        botonQ2RK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ2RKActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ2RK, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 200, -1));

        preg3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        preg3.setText("3. Sobre la toma de colegios opino que:");
        getContentPane().add(preg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 310, 23));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 290, 20));

        RESPUESTA3.add(botonQ3RK);
        botonQ3RK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ3RK.setForeground(new java.awt.Color(255, 255, 255));
        botonQ3RK.setText("Es la única forma de hacerse escuchar, luchar por los derechos.");
        botonQ3RK.setContentAreaFilled(false);
        botonQ3RK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ3RKActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ3RK, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        RESPUESTA3.add(botonQ3RN);
        botonQ3RN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ3RN.setForeground(new java.awt.Color(255, 255, 255));
        botonQ3RN.setText("Son unos vagos, deberían ponerse a estudiar y dejar el charuto.");
        botonQ3RN.setContentAreaFilled(false);
        botonQ3RN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ3RNActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ3RN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 420, -1));

        RESPUESTA3.add(botonQ3RM);
        botonQ3RM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ3RM.setForeground(new java.awt.Color(255, 255, 255));
        botonQ3RM.setText("Que vuelva el servicio militar");
        botonQ3RM.setContentAreaFilled(false);
        botonQ3RM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ3RMActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ3RM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 200, -1));

        preg4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        preg4.setText("4.¿Qué hay que hacer para mejorar el país?");
        getContentPane().add(preg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 310, 23));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 310, 20));

        RESPUESTA4.add(botonQ4RM);
        botonQ4RM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ4RM.setForeground(new java.awt.Color(255, 255, 255));
        botonQ4RM.setText("No prender la estufa en invierno para estar en remera.");
        botonQ4RM.setContentAreaFilled(false);
        botonQ4RM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ4RMActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ4RM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, -1, -1));

        RESPUESTA4.add(botonQ4RK);
        botonQ4RK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ4RK.setForeground(new java.awt.Color(255, 255, 255));
        botonQ4RK.setText("Concretar la revolución proletaria.");
        botonQ4RK.setContentAreaFilled(false);
        botonQ4RK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ4RKActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ4RK, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, -1, -1));

        RESPUESTA4.add(botonQ4RN);
        botonQ4RN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ4RN.setForeground(new java.awt.Color(255, 255, 255));
        botonQ4RN.setText("Vivir y dejar vivir. No meterse en problemas.");
        botonQ4RN.setContentAreaFilled(false);
        botonQ4RN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ4RNActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ4RN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));

        preg5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        preg5.setText("5. Sobre la pobreza, pensás:");
        getContentPane().add(preg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, 260, 23));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, 210, 20));

        RESPUESTA5.add(botonQ5RN);
        botonQ5RN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ5RN.setForeground(new java.awt.Color(255, 255, 255));
        botonQ5RN.setText("Es un bajón, mejor no hablar de ciertas cosas.");
        botonQ5RN.setContentAreaFilled(false);
        botonQ5RN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ5RNActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ5RN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 660, -1, -1));

        RESPUESTA5.add(botonQ5RK);
        botonQ5RK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ5RK.setForeground(new java.awt.Color(255, 255, 255));
        botonQ5RK.setText("Odio a los blancos y a la puta oligarquía.");
        botonQ5RK.setContentAreaFilled(false);
        botonQ5RK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ5RKActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ5RK, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 690, -1, -1));

        RESPUESTA5.add(botonQ5RM);
        botonQ5RM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ5RM.setForeground(new java.awt.Color(255, 255, 255));
        botonQ5RM.setText("Un problema estructural.");
        botonQ5RM.setContentAreaFilled(false);
        botonQ5RM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ5RMActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ5RM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 720, -1, -1));

        preg6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        preg6.setText("6. Mi principal fuente de información es:");
        getContentPane().add(preg6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 290, 23));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 290, 20));

        RESPUESTA6.add(botonQ6RM);
        botonQ6RM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ6RM.setForeground(new java.awt.Color(255, 255, 255));
        botonQ6RM.setText("Periodismo Para Todos, TN, Clarín, Mitre.");
        botonQ6RM.setContentAreaFilled(false);
        botonQ6RM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ6RMActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ6RM, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 320, -1));

        RESPUESTA6.add(botonQ6RK);
        botonQ6RK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ6RK.setForeground(new java.awt.Color(255, 255, 255));
        botonQ6RK.setText("C5N, Página 12, La Garganta Poderosa.");
        botonQ6RK.setContentAreaFilled(false);
        botonQ6RK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ6RKActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ6RK, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        RESPUESTA6.add(botonQ6RN);
        botonQ6RN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ6RN.setForeground(new java.awt.Color(255, 255, 255));
        botonQ6RN.setText("Me informo de manera integral, escucho las dos campanas.");
        botonQ6RN.setContentAreaFilled(false);
        botonQ6RN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ6RNActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ6RN, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, -1, -1));

        preg7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        preg7.setText("7. Los homosexuales deberían:");
        getContentPane().add(preg7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 270, 23));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 230, 20));

        RESPUESTA7.add(botonQ7RM);
        botonQ7RM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ7RM.setForeground(new java.awt.Color(255, 255, 255));
        botonQ7RM.setText("Esconderse ¿Cómo le explico a la criatura?");
        botonQ7RM.setContentAreaFilled(false);
        botonQ7RM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ7RMActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ7RM, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 290, -1));

        RESPUESTA7.add(botonQ7RN);
        botonQ7RN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ7RN.setForeground(new java.awt.Color(255, 255, 255));
        botonQ7RN.setText("Tener lo mismo derechos que los hombres heterosexuales blancos de clase media.");
        botonQ7RN.setContentAreaFilled(false);
        botonQ7RN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ7RNActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ7RN, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));

        RESPUESTA7.add(botonQ7RK);
        botonQ7RK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ7RK.setForeground(new java.awt.Color(255, 255, 255));
        botonQ7RK.setText("Armar un partido y ganar las elecciones.");
        botonQ7RK.setContentAreaFilled(false);
        botonQ7RK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ7RKActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ7RK, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("8.Tu comida típica es:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 160, 23));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 160, 20));

        RESPUESTA8.add(botonQ8RM);
        botonQ8RM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ8RM.setForeground(new java.awt.Color(255, 255, 255));
        botonQ8RM.setText("Sandwich de pan árabe en un colchón de verdes y salsa de soja.");
        botonQ8RM.setContentAreaFilled(false);
        botonQ8RM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ8RMActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ8RM, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 440, -1));

        RESPUESTA8.add(botonQ8RK);
        botonQ8RK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ8RK.setForeground(new java.awt.Color(255, 255, 255));
        botonQ8RK.setText("La olla comunitaria de la unidad básica del PO.");
        botonQ8RK.setContentAreaFilled(false);
        botonQ8RK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ8RKActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ8RK, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, -1, -1));

        RESPUESTA8.add(botonQ8RN);
        botonQ8RN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ8RN.setForeground(new java.awt.Color(255, 255, 255));
        botonQ8RN.setText("El pollito con papas de mamá aunque la ultima vez se le quemó y no le salieron");
        botonQ8RN.setContentAreaFilled(false);
        botonQ8RN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ8RNActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ8RN, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("como antes *cries in  gay spanish*");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, 338, 23));

        preg9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        preg9.setText("9.“El comandante” es:");
        getContentPane().add(preg9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 170, 23));

        RESPUESTA9.add(botonQ9RN);
        botonQ9RN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ9RN.setForeground(new java.awt.Color(255, 255, 255));
        botonQ9RN.setText("Ricky Fort");
        botonQ9RN.setContentAreaFilled(false);
        botonQ9RN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ9RNActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ9RN, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, -1, -1));

        RESPUESTA9.add(botonQ9RK);
        botonQ9RK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ9RK.setForeground(new java.awt.Color(255, 255, 255));
        botonQ9RK.setText("Juan Domingo");
        botonQ9RK.setContentAreaFilled(false);
        botonQ9RK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ9RKActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ9RK, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 570, 130, -1));

        RESPUESTA9.add(botonQ9RM);
        botonQ9RM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ9RM.setForeground(new java.awt.Color(255, 255, 255));
        botonQ9RM.setText("Un montonero pone bomba.");
        botonQ9RM.setContentAreaFilled(false);
        botonQ9RM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ9RMActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ9RM, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 600, -1, -1));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 160, 20));

        preg10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        preg10.setText("10. Las feministas:  ");
        getContentPane().add(preg10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 630, 338, 23));

        RESPUESTA10.add(botonQ10RK);
        botonQ10RK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ10RK.setForeground(new java.awt.Color(255, 255, 255));
        botonQ10RK.setText("Luchan contra la sociedad patriarcal que lo único que quiere es ver a la mujer sometida.");
        botonQ10RK.setContentAreaFilled(false);
        botonQ10RK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ10RKActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ10RK, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 660, -1, -1));

        RESPUESTA10.add(botonQ10RN);
        botonQ10RN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ10RN.setForeground(new java.awt.Color(255, 255, 255));
        botonQ10RN.setText("Reclaman por una causa justa pero no deberían pintar paredes.");
        botonQ10RN.setContentAreaFilled(false);
        botonQ10RN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ10RNActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ10RN, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 690, -1, -1));

        RESPUESTA10.add(botonQ10RM);
        botonQ10RM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonQ10RM.setForeground(new java.awt.Color(255, 255, 255));
        botonQ10RM.setText("Son una ridiculez.");
        botonQ10RM.setContentAreaFilled(false);
        botonQ10RM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQ10RMActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ10RM, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 720, -1, -1));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 630, 140, 20));

        fondo.setForeground(new java.awt.Color(255, 255, 255));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        fondo.setText("Es un bajón, mejor no hablar de ciertas cosas.");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1100, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonQ1RKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ1RKActionPerformed
       validacionGrupoBoton1();
    }//GEN-LAST:event_botonQ1RKActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

             
    for (int i=0; i<10;i++){
       contador=contador+resultado[i];
    }         
        
        
       if (contador>=0 && contador<7){ 
             txtpantalla.setText("Nivel:"+contador+" - Sos un facho de Izquierda");
             foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hozbyn.png")));
                } 
         else if (contador>=7 && contador<11){
             txtpantalla.setText("Nivel:"+contador+" - Vivis en una burbuja");
             foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pamela.png")));
             }
         else if (contador>=11 && contador<21){ 
            txtpantalla.setText("Nivel:"+contador+" - Sos un facho de derecha");
             foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/macanabyn.png")));
            } 
      contador=0;    
      
       
               
      
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtpantalla.setText("");
       contador=0;
       resultado[0]=0;
       resultado[1]=0; 
       resultado[2]=0;
       resultado[3]=0;
       resultado[4]=0;
       resultado[5]=0;
       resultado[6]=0;
       resultado[7]=0;
       resultado[8]=0;
       resultado[9]=0;
        RESPUESTA1.clearSelection();
        RESPUESTA2.clearSelection();
        RESPUESTA3.clearSelection();
        RESPUESTA4.clearSelection();
        RESPUESTA5.clearSelection();
        RESPUESTA6.clearSelection();
        RESPUESTA7.clearSelection();
        RESPUESTA8.clearSelection();
        RESPUESTA9.clearSelection();
        RESPUESTA10.clearSelection();
        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonQ1RNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ1RNActionPerformed
     validacionGrupoBoton1();
       
    }//GEN-LAST:event_botonQ1RNActionPerformed

    private void botonQ2RNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ2RNActionPerformed
    validacionGrupoBoton2();     
    }//GEN-LAST:event_botonQ2RNActionPerformed

    private void botonQ1RMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ1RMActionPerformed
       validacionGrupoBoton1();    
    }//GEN-LAST:event_botonQ1RMActionPerformed

    private void botonQ2RMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ2RMActionPerformed
    validacionGrupoBoton2();     
    }//GEN-LAST:event_botonQ2RMActionPerformed

    private void botonQ3RNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ3RNActionPerformed
    validacionGrupoBoton3();       
    }//GEN-LAST:event_botonQ3RNActionPerformed

    private void botonQ4RKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ4RKActionPerformed
    validacionGrupoBoton4();   
    }//GEN-LAST:event_botonQ4RKActionPerformed

    private void botonQ5RKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ5RKActionPerformed
    validacionGrupoBoton5();    
    }//GEN-LAST:event_botonQ5RKActionPerformed

    private void botonQ6RKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ6RKActionPerformed
    validacionGrupoBoton6();            
    }//GEN-LAST:event_botonQ6RKActionPerformed

    private void botonQ7RNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ7RNActionPerformed
    validacionGrupoBoton7();     
    }//GEN-LAST:event_botonQ7RNActionPerformed

    private void botonQ8RKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ8RKActionPerformed
    validacionGrupoBoton8();
    }//GEN-LAST:event_botonQ8RKActionPerformed

    private void botonQ9RKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ9RKActionPerformed
    validacionGrupoBoton9();  
    }//GEN-LAST:event_botonQ9RKActionPerformed

    private void botonQ10RNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ10RNActionPerformed
    validacionGrupoBoton10();     
    }//GEN-LAST:event_botonQ10RNActionPerformed

    private void botonQ2RKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ2RKActionPerformed
    validacionGrupoBoton2(); 
    }//GEN-LAST:event_botonQ2RKActionPerformed

    private void botonQ3RMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ3RMActionPerformed
    validacionGrupoBoton3();          
    }//GEN-LAST:event_botonQ3RMActionPerformed

    private void botonQ4RNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ4RNActionPerformed
    validacionGrupoBoton4();            
    }//GEN-LAST:event_botonQ4RNActionPerformed

    private void botonQ5RMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ5RMActionPerformed
    validacionGrupoBoton5();        
    }//GEN-LAST:event_botonQ5RMActionPerformed

    private void botonQ6RNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ6RNActionPerformed
    validacionGrupoBoton6();            
    }//GEN-LAST:event_botonQ6RNActionPerformed

    private void botonQ7RKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ7RKActionPerformed
    validacionGrupoBoton7();        
    }//GEN-LAST:event_botonQ7RKActionPerformed

    private void botonQ8RNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ8RNActionPerformed
    validacionGrupoBoton8();
    }//GEN-LAST:event_botonQ8RNActionPerformed

    private void botonQ10RMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ10RMActionPerformed
    validacionGrupoBoton10();  
    }//GEN-LAST:event_botonQ10RMActionPerformed

    private void botonQ9RMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ9RMActionPerformed
    validacionGrupoBoton9();         
    }//GEN-LAST:event_botonQ9RMActionPerformed

    private void botonQ3RKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ3RKActionPerformed
    validacionGrupoBoton3();        
    }//GEN-LAST:event_botonQ3RKActionPerformed

    private void botonQ4RMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ4RMActionPerformed
    validacionGrupoBoton4();           
    }//GEN-LAST:event_botonQ4RMActionPerformed

    private void botonQ5RNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ5RNActionPerformed
    validacionGrupoBoton5();           
    }//GEN-LAST:event_botonQ5RNActionPerformed

    private void botonQ6RMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ6RMActionPerformed
    validacionGrupoBoton6();           
    }//GEN-LAST:event_botonQ6RMActionPerformed

    private void botonQ7RMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ7RMActionPerformed
    validacionGrupoBoton7();      
    }//GEN-LAST:event_botonQ7RMActionPerformed

    private void botonQ8RMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ8RMActionPerformed
    validacionGrupoBoton8();    
    }//GEN-LAST:event_botonQ8RMActionPerformed

    private void botonQ9RNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ9RNActionPerformed
    validacionGrupoBoton9();        
    }//GEN-LAST:event_botonQ9RNActionPerformed

    private void botonQ10RKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQ10RKActionPerformed
    validacionGrupoBoton10();  
    }//GEN-LAST:event_botonQ10RKActionPerformed

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
            java.util.logging.Logger.getLogger(fachoq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fachoq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fachoq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fachoq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fachoq().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup RESPUESTA1;
    private javax.swing.ButtonGroup RESPUESTA10;
    private javax.swing.ButtonGroup RESPUESTA2;
    private javax.swing.ButtonGroup RESPUESTA3;
    private javax.swing.ButtonGroup RESPUESTA4;
    private javax.swing.ButtonGroup RESPUESTA5;
    private javax.swing.ButtonGroup RESPUESTA6;
    private javax.swing.ButtonGroup RESPUESTA7;
    private javax.swing.ButtonGroup RESPUESTA8;
    private javax.swing.ButtonGroup RESPUESTA9;
    private javax.swing.JRadioButton botonQ10RK;
    private javax.swing.JRadioButton botonQ10RM;
    private javax.swing.JRadioButton botonQ10RN;
    private javax.swing.JRadioButton botonQ1RK;
    private javax.swing.JRadioButton botonQ1RM;
    private javax.swing.JRadioButton botonQ1RN;
    private javax.swing.JRadioButton botonQ2RK;
    private javax.swing.JRadioButton botonQ2RM;
    private javax.swing.JRadioButton botonQ2RN;
    private javax.swing.JRadioButton botonQ3RK;
    private javax.swing.JRadioButton botonQ3RM;
    private javax.swing.JRadioButton botonQ3RN;
    private javax.swing.JRadioButton botonQ4RK;
    private javax.swing.JRadioButton botonQ4RM;
    private javax.swing.JRadioButton botonQ4RN;
    private javax.swing.JRadioButton botonQ5RK;
    private javax.swing.JRadioButton botonQ5RM;
    private javax.swing.JRadioButton botonQ5RN;
    private javax.swing.JRadioButton botonQ6RK;
    private javax.swing.JRadioButton botonQ6RM;
    private javax.swing.JRadioButton botonQ6RN;
    private javax.swing.JRadioButton botonQ7RK;
    private javax.swing.JRadioButton botonQ7RM;
    private javax.swing.JRadioButton botonQ7RN;
    private javax.swing.JRadioButton botonQ8RK;
    private javax.swing.JRadioButton botonQ8RM;
    private javax.swing.JRadioButton botonQ8RN;
    private javax.swing.JRadioButton botonQ9RK;
    private javax.swing.JRadioButton botonQ9RM;
    private javax.swing.JRadioButton botonQ9RN;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel foto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel preg1;
    private javax.swing.JLabel preg10;
    private javax.swing.JLabel preg2;
    private javax.swing.JLabel preg3;
    private javax.swing.JLabel preg4;
    private javax.swing.JLabel preg5;
    private javax.swing.JLabel preg6;
    private javax.swing.JLabel preg7;
    private javax.swing.JLabel preg9;
    private javax.swing.JTextField txtpantalla;
    // End of variables declaration//GEN-END:variables
}
