package Culture;
import Iniciador_principal.Inicio_de_sesion;
import static Iniciador_principal.Inicio_de_sesion.jugador;
import Pacman_clase.Pacman_JuegoPrincipal;
import Pacman_clase.Clase_pacman;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Culture_ClaseDinamica extends Pacman_JuegoPrincipal {
    JFrame Principal;
    JLabel btnsalir;
    //panel inicio
    JPanel pprincipal;
    JLabel fprincipal,btnJugar,btncre,btnayu;
     //ventana menu
    JFrame Menu,p1,p2,p3;
    //panel menu
    JPanel pmenu;
    JLabel fmenu,cate1,cate2,cate3,btnsalirs,btnregre,n1J;
    
    //paneles Historia
    //pregunta 01
    JPanel p1cate1;
    JLabel f1cate1,btn1p1c1,btn2p1c1,btn3p1c1,btn4p1c1;
    //Pregunta 02
    JPanel p2cate1;
    JLabel f2cate1,btn1p2c1,btn2p2c1,btn3p2c1,btn4p2c1;
    //Pregunta 03
    JPanel p3cate1;
    JLabel f3cate1,btn1p3c1,btn2p3c1,btn3p3c1,btn4p3c1;
    
    
    //Paneles Ciencia
    //Pregunta 01
    JPanel p1cate2;
    JLabel f1cate2,btn1p1c2,btn2p1c2,btn3p1c2;
    //Pregunta 02
    JPanel p2cate2;
    JLabel f2cate2,btn1p2c2,btn2p2c2,btn3p2c2;
    //Pregunta 03
    JPanel p3cate2;
    JLabel f3cate2,btn1p3c2,btn2p3c2,btn3p3c2;
    
    
    //Paneles geografia
    //Pregunta 01
    JPanel p1cate3;
    JLabel f1cate3,btn1p1c3,btn2p1c3,btn3p1c3,btn4p1c3;
    //Pregunta 02
    JPanel p2cate3;
    JLabel f2cate3,btn1p2c3,btn2p2c3,btn3p2c3,btn4p2c3;
    //Pregunta 03
    JPanel p3cate3;
    JLabel f3cate3,btn1p3c3,btn2p3c3,btn3p3c3,btn4p3c3;
   
 
    
    
    public Culture_ClaseDinamica(){
        //inicio
        Principal = new JFrame("Juego");
        Principal.setSize(1300, 750);
        Principal.setLayout(null);
        Principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Principal.setLocationRelativeTo(null);
        Principal.setResizable(false);
        
        pprincipal = new JPanel();
        pprincipal.setSize(Principal.getWidth(), Principal.getHeight());
        pprincipal.setLocation(0, 0);
        pprincipal.setLayout(null);
        pprincipal.setVisible(true);
        
        fprincipal = new JLabel();
        fprincipal.setSize(Principal.getWidth(), Principal.getHeight());
        fprincipal.setLocation(0, 0);
        fprincipal.setIcon(new ImageIcon("Juego/fondop.png"));
        fprincipal.setVisible(true);
        pprincipal.add(fprincipal,0);
        
        btnJugar= new JLabel();
        btnJugar.setSize(400, 100);
        btnJugar.setLocation(250, 440);
        btnJugar.setIcon(new ImageIcon("Juego/jugar.png"));
        btnJugar.setVisible(true);
        pprincipal.add(btnJugar,0);
        
        btnsalir = new JLabel();
        btnsalir.setSize(400, 100);
        btnsalir.setLocation(650, 440);
        btnsalir.setIcon(new ImageIcon("Juego/salirp.png"));
        btnsalir.setVisible(true);
        pprincipal.add(btnsalir,0);
        
        
        
        btnayu = new JLabel();
        btnayu.setSize(300, 50);
        btnayu.setLocation(900, 600);
        btnayu.setIcon(new ImageIcon("Juego/ayuda.png"));
        btnayu.setVisible(true);
        pprincipal.add(btnayu,0);
        
        
        //Ventana Menu
        Menu = new JFrame("Menu del Juego");
        Menu.setSize(1300, 750);
        Menu.setLayout(null);
        Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Menu.setLocationRelativeTo(null);
        Menu.setResizable(false);
        Menu.setVisible(false);
        
        pmenu = new JPanel();
        pmenu.setSize(Menu.getWidth(), Menu.getHeight());
        pmenu.setLocation(0, 0);
        pmenu.setLayout(null);
        pmenu.setVisible(true);
                
        fmenu = new JLabel();
        fmenu.setSize(Menu.getWidth(), Menu.getHeight());
        fmenu.setLocation(0, 0);
        fmenu.setIcon(new ImageIcon("Juego/fondom.png"));
        fmenu.setVisible(true);
        pmenu.add(fmenu,0);
        
        cate1 = new JLabel();
        cate1.setSize(250, 400);
        cate1.setLocation(150, 150);
        cate1.setIcon(new ImageIcon("Juego/h.png"));
        cate1.setVisible(true);
        
        cate2 = new JLabel();
        cate2.setSize(250, 400);
        cate2.setLocation(550, 150);
        cate2.setIcon(new ImageIcon("Juego/c.png"));
        cate2.setVisible(true);
        
        cate3 = new JLabel();
        cate3.setSize(250, 400);
        cate3.setLocation(950, 150);
        cate3.setIcon(new ImageIcon("Juego/g.png"));
        cate3.setVisible(true);
        
        btnsalirs = new JLabel();
        btnsalirs.setSize(200, 50);
        btnsalirs.setLocation(1000, 620);
        btnsalirs.setIcon(new ImageIcon("Juego/salirs.png"));
        btnsalirs.setVisible(true);
        
        btnregre = new JLabel();
        btnregre.setSize(200, 50);
        btnregre.setLocation(100, 620);
        btnregre.setIcon(new ImageIcon("Juego/regresar.png"));
        btnregre.setVisible(true);
        
        //nombre del jugador
        n1J = new JLabel();
        n1J.setBounds(1050,35,400,50);
        n1J.setFont( new Font("Times New Roman", Font.BOLD,40));
        n1J.setBackground(Color.WHITE);
        n1J.setVisible(true);
        
        
        //form donde estaran los paneles
        p1 = new JFrame("Preguntas");
        p1.setSize(1300, 750);
        p1.setLayout(null);
        p1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p1.setLocationRelativeTo(null);
        p1.setResizable(false);
        p1.setVisible(false);
        
        //pregunta 1 de historia
        p1cate1 = new JPanel();
        p1cate1.setSize(p1.getWidth(), p1.getHeight());
        p1cate1.setLocation(0, 0);
        p1cate1.setLayout(null);
        p1cate1.setVisible(true);
        
        f1cate1 = new JLabel();
        f1cate1.setSize(p1.getWidth(), p1.getHeight());
        f1cate1.setLocation(0, 0);
        f1cate1.setIcon(new ImageIcon("Juego/historiap1.png"));
        f1cate1.setVisible(true);
        p1cate1.add(f1cate1,0);
        
        btn1p1c1 = new JLabel();
        btn1p1c1.setSize(350, 100);
        btn1p1c1.setLocation(130, 430);
        btn1p1c1.setIcon(new ImageIcon("Juego/historiar1.png"));
        btn1p1c1.setVisible(true);
        
        btn2p1c1 = new JLabel();
        btn2p1c1.setSize(350, 100);
        btn2p1c1.setLocation(500, 430);
        btn2p1c1.setIcon(new ImageIcon("Juego/historiar2.png"));
        btn2p1c1.setVisible(true);
        
        btn3p1c1 = new JLabel();
        btn3p1c1.setSize(350, 100);
        btn3p1c1.setLocation(130, 580);
        btn3p1c1.setIcon(new ImageIcon("Juego/historiar3.png"));
        btn3p1c1.setVisible(true);
        
        btn4p1c1 = new JLabel();
        btn4p1c1.setSize(350, 100);
        btn4p1c1.setLocation(500, 580);
        btn4p1c1.setIcon(new ImageIcon("Juego/historiar4.png"));
        btn4p1c1.setVisible(true);
        
       
       
        //pregunta 2 de historia
        p2cate1 = new JPanel();
        p2cate1.setSize(p1.getWidth(), p1.getHeight());
        p2cate1.setLocation(0, 0);
        p2cate1.setLayout(null);
        p2cate1.setVisible(true);
        
        f2cate1 = new JLabel();
        f2cate1.setSize(p1.getWidth(), p1.getHeight());
        f2cate1.setLocation(0, 0);
        f2cate1.setIcon(new ImageIcon("Juego/historiap2.png"));
        f2cate1.setVisible(true);
        p2cate1.add(f2cate1,0);
        
        btn1p2c1 = new JLabel();
        btn1p2c1.setSize(350, 100);
        btn1p2c1.setLocation(130, 430);
        btn1p2c1.setIcon(new ImageIcon("Juego/historiap2r4.png"));
        btn1p2c1.setVisible(true);
        
        btn2p2c1 = new JLabel();
        btn2p2c1.setSize(350, 100);
        btn2p2c1.setLocation(500, 430);
        btn2p2c1.setIcon(new ImageIcon("Juego/historiap2r2.png"));
        btn2p2c1.setVisible(true);
        
        btn3p2c1 = new JLabel();
        btn3p2c1.setSize(350, 100);
        btn3p2c1.setLocation(130, 580);
        btn3p2c1.setIcon(new ImageIcon("Juego/historiap2r3.png"));
        btn3p2c1.setVisible(true);
        
        btn4p2c1 = new JLabel();
        btn4p2c1.setSize(350, 100);
        btn4p2c1.setLocation(500, 580);
        btn4p2c1.setIcon(new ImageIcon("Juego/historiap2r1.png"));
        btn4p2c1.setVisible(true);
        
        
        //pregunta 3 de historia
        p3cate1 = new JPanel();
        p3cate1.setSize(p1.getWidth(), p1.getHeight());
        p3cate1.setLocation(0, 0);
        p3cate1.setLayout(null);
        p3cate1.setVisible(true);
        
        f3cate1 = new JLabel();
        f3cate1.setSize(p1.getWidth(), p1.getHeight());
        f3cate1.setLocation(0, 0);
        f3cate1.setIcon(new ImageIcon("Juego/historiap3.png"));
        f3cate1.setVisible(true);
        p3cate1.add(f3cate1,0);
        
        btn1p3c1 = new JLabel();
        btn1p3c1.setSize(350, 100);
        btn1p3c1.setLocation(130, 430);
        btn1p3c1.setIcon(new ImageIcon("Juego/historiap3r3.png"));
        btn1p3c1.setVisible(true);
        
        btn2p3c1 = new JLabel();
        btn2p3c1.setSize(350, 100);
        btn2p3c1.setLocation(500, 430);
        btn2p3c1.setIcon(new ImageIcon("Juego/historiap3r2.png"));
        btn2p3c1.setVisible(true);
        
        btn3p3c1 = new JLabel();
        btn3p3c1.setSize(350, 100);
        btn3p3c1.setLocation(130, 580);
        btn3p3c1.setIcon(new ImageIcon("Juego/historiap3r1.png"));
        btn3p3c1.setVisible(true);
        
        btn4p3c1 = new JLabel();
        btn4p3c1.setSize(350, 100);
        btn4p3c1.setLocation(500, 580);
        btn4p3c1.setIcon(new ImageIcon("Juego/historiap3r4.png"));
        btn4p3c1.setVisible(true);
        
        
        
        
        
        //form donde estaran los paneles
        p2 = new JFrame("Preguntas");
        p2.setSize(1300, 750);
        p2.setLayout(null);
        p2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p2.setLocationRelativeTo(null);
        p2.setResizable(false);
        p2.setVisible(false);
        
        //preguntas de Ciencia
        //pregunta 1 de ciencia
        p1cate2 = new JPanel();
        p1cate2.setSize(p2.getWidth(), p2.getHeight());
        p1cate2.setLocation(0, 0);
        p1cate2.setLayout(null);
        p1cate2.setVisible(true);
        
        f1cate2 = new JLabel();
        f1cate2.setSize(p2.getWidth(), p2.getHeight());
        f1cate2.setLocation(0, 0);
        f1cate2.setIcon(new ImageIcon("Juego/cienciap1.png"));
        f1cate2.setVisible(true);
        p1cate2.add(f1cate2,0);
        
        btn1p1c2 = new JLabel();
        btn1p1c2.setSize(350, 100);
        btn1p1c2.setLocation(130, 430);
        btn1p1c2.setIcon(new ImageIcon("Juego/cienciap1r1.png"));
        btn1p1c2.setVisible(true);
        
        btn2p1c2 = new JLabel();
        btn2p1c2.setSize(350, 100);
        btn2p1c2.setLocation(500, 430);
        btn2p1c2.setIcon(new ImageIcon("Juego/cienciap1r2.png"));
        btn2p1c2.setVisible(true);
        
        btn3p1c2 = new JLabel();
        btn3p1c2.setSize(350, 100);
        btn3p1c2.setLocation(130, 580);
        btn3p1c2.setIcon(new ImageIcon("Juego/cienciap1r3.png"));
        btn3p1c2.setVisible(true);
        
       
       
        //pregunta 2 de ciencia
        p2cate2 = new JPanel();
        p2cate2.setSize(p2.getWidth(), p2.getHeight());
        p2cate2.setLocation(0, 0);
        p2cate2.setLayout(null);
        p2cate2.setVisible(true);
       
        f2cate2 = new JLabel();
        f2cate2.setSize(p2.getWidth(), p2.getHeight());
        f2cate2.setLocation(0, 0);
        f2cate2.setIcon(new ImageIcon("Juego/cienciap2.png"));
        f2cate2.setVisible(true);
        p2cate2.add(f2cate2,0);
        
        btn1p2c2 = new JLabel();
        btn1p2c2.setSize(350, 100);
        btn1p2c2.setLocation(130, 430);
        btn1p2c2.setIcon(new ImageIcon("Juego/cienciap2r1.png"));
        btn1p2c2.setVisible(true);
       
        btn2p2c2 = new JLabel();
        btn2p2c2.setSize(350, 100);
        btn2p2c2.setLocation(500, 430);
        btn2p2c2.setIcon(new ImageIcon("Juego/cienciap2r2.png"));
        btn2p2c2.setVisible(true);
        
        btn3p2c2 = new JLabel();
        btn3p2c2.setSize(350, 100);
        btn3p2c2.setLocation(130, 580);
        btn3p2c2.setIcon(new ImageIcon("Juego/cienciap2r3.png"));
        btn3p2c2.setVisible(true);
        
        
        //pregunta 3 de ciencia
        p3cate2 = new JPanel();
        p3cate2.setSize(p2.getWidth(), p2.getHeight());
        p3cate2.setLocation(0, 0);
        p3cate2.setLayout(null);
        p3cate2.setVisible(true);
       
        f3cate2 = new JLabel();
        f3cate2.setSize(p2.getWidth(), p2.getHeight());
        f3cate2.setLocation(0, 0);
        f3cate2.setIcon(new ImageIcon("Juego/cienciap3.png"));
        f3cate2.setVisible(true);
        p3cate2.add(f3cate2,0);
        
        btn1p3c2 = new JLabel();
        btn1p3c2.setSize(350, 100);
        btn1p3c2.setLocation(130, 430);
        btn1p3c2.setIcon(new ImageIcon("Juego/cienciap3r1.png"));
        btn1p3c2.setVisible(true);
       
        btn2p3c2 = new JLabel();
        btn2p3c2.setSize(350, 100);
        btn2p3c2.setLocation(500, 430);
        btn2p3c2.setIcon(new ImageIcon("Juego/cienciap3r2.png"));
        btn2p3c2.setVisible(true);
        
        btn3p3c2 = new JLabel();
        btn3p3c2.setSize(350, 100);
        btn3p3c2.setLocation(130, 580);
        btn3p3c2.setIcon(new ImageIcon("Juego/cienciap3r3.png"));
        btn3p3c2.setVisible(true);
       
        
        
        
        
        //form donde estaran los paneles
        p3 = new JFrame("Preguntas");
        p3.setSize(1300, 750);
        p3.setLayout(null);
        p3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p3.setLocationRelativeTo(null);
        p3.setResizable(false);
        p3.setVisible(false);
        
        //preguntas de Geografia
        //pregunta 1 de geografia
        p1cate3 = new JPanel();
        p1cate3.setSize(p3.getWidth(), p3.getHeight());
        p1cate3.setLocation(0, 0);
        p1cate3.setLayout(null);
        p1cate3.setVisible(true);
        
        f1cate3 = new JLabel();
        f1cate3.setSize(p3.getWidth(), p3.getHeight());
        f1cate3.setLocation(0, 0);
        f1cate3.setIcon(new ImageIcon("Juego/geop1.png"));
        f1cate3.setVisible(true);
        p1cate3.add(f1cate3,0);
        
        btn1p1c3 = new JLabel();
        btn1p1c3.setSize(350, 100);
        btn1p1c3.setLocation(130, 430);
        btn1p1c3.setIcon(new ImageIcon("Juego/geop1r1.png"));
        btn1p1c3.setVisible(true);
        
        btn2p1c3 = new JLabel();
        btn2p1c3.setSize(350, 100);
        btn2p1c3.setLocation(500, 430);
        btn2p1c3.setIcon(new ImageIcon("Juego/geop1r2.png"));
        btn2p1c3.setVisible(true);
       
        btn3p1c3 = new JLabel();
        btn3p1c3.setSize(350, 100);
        btn3p1c3.setLocation(130, 580);
        btn3p1c3.setIcon(new ImageIcon("Juego/geop1r3.png"));
        btn3p1c3.setVisible(true);
        
        btn4p1c3 = new JLabel();
        btn4p1c3.setSize(350, 100);
        btn4p1c3.setLocation(500, 580);
        btn4p1c3.setIcon(new ImageIcon("Juego/geop1r4.png"));
        btn4p1c3.setVisible(true);
        
        
        //pregunta 2 de geografia
        p2cate3 = new JPanel();
        p2cate3.setSize(p3.getWidth(), p3.getHeight());
        p2cate3.setLocation(0, 0);
        p2cate3.setLayout(null);
        p2cate3.setVisible(true);
        
        f2cate3 = new JLabel();
        f2cate3.setSize(p3.getWidth(), p3.getHeight());
        f2cate3.setLocation(0, 0);
        f2cate3.setIcon(new ImageIcon("Juego/geop2.png"));
        f2cate3.setVisible(true);
        p2cate3.add(f2cate3,0);
        
        btn1p2c3 = new JLabel();
        btn1p2c3.setSize(350, 100);
        btn1p2c3.setLocation(130, 430);
        btn1p2c3.setIcon(new ImageIcon("Juego/geop2r1.png"));
        btn1p2c3.setVisible(true);
        
        btn2p2c3 = new JLabel();
        btn2p2c3.setSize(350, 100);
        btn2p2c3.setLocation(500, 430);
        btn2p2c3.setIcon(new ImageIcon("Juego/geop2r2.png"));
        btn2p2c3.setVisible(true);
       
        btn3p2c3 = new JLabel();
        btn3p2c3.setSize(350, 100);
        btn3p2c3.setLocation(130, 580);
        btn3p2c3.setIcon(new ImageIcon("Juego/geop2r3.png"));
        btn3p2c3.setVisible(true);
        
        btn4p2c3 = new JLabel();
        btn4p2c3.setSize(350, 100);
        btn4p2c3.setLocation(500, 580);
        btn4p2c3.setIcon(new ImageIcon("Juego/geop2r4.png"));
        btn4p2c3.setVisible(true);
        
        
        //pregunta 3 de geografia
        p3cate3 = new JPanel();
        p3cate3.setSize(p3.getWidth(), p3.getHeight());
        p3cate3.setLocation(0, 0);
        p3cate3.setLayout(null);
        p3cate3.setVisible(true);
        
        f3cate3 = new JLabel();
        f3cate3.setSize(p3.getWidth(), p3.getHeight());
        f3cate3.setLocation(0, 0);
        f3cate3.setIcon(new ImageIcon("Juego/geop3.png"));
        f3cate3.setVisible(true);
        p3cate3.add(f3cate3,0);
        
        btn1p3c3 = new JLabel();
        btn1p3c3.setSize(350, 100);
        btn1p3c3.setLocation(130, 430);
        btn1p3c3.setIcon(new ImageIcon("Juego/geop3r1.png"));
        btn1p3c3.setVisible(true);
       
        btn2p3c3 = new JLabel();
        btn2p3c3.setSize(350, 100);
        btn2p3c3.setLocation(500, 430);
        btn2p3c3.setIcon(new ImageIcon("Juego/geop3r2.png"));
        btn2p3c3.setVisible(true);
       
        btn3p3c3 = new JLabel();
        btn3p3c3.setSize(350, 100);
        btn3p3c3.setLocation(130, 580);
        btn3p3c3.setIcon(new ImageIcon("Juego/geop3r3.png"));
        btn3p3c3.setVisible(true);
        
        btn4p3c3 = new JLabel();
        btn4p3c3.setSize(350, 100);
        btn4p3c3.setLocation(500, 580);
        btn4p3c3.setIcon(new ImageIcon("Juego/geop3r4.png"));
        btn4p3c3.setVisible(true);
        Inicio_de_sesion name=new Inicio_de_sesion();
        
        n1J.setText(name.jugador);
        
        //inicio
        //accion del boton jugar
        btnJugar.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
               
                 Inicio_de_sesion name=new Inicio_de_sesion();  
                   n1J.setText( name.jugador);
                  
                Principal.setVisible(false);
                Menu.add(pmenu);
                Menu.setVisible(true);
                fmenu.add(cate1);//historia
                fmenu.add(cate2);//ciencia
                fmenu.add(cate3);//geografia
                fmenu.add(btnsalirs);
                fmenu.add(btnregre);
            }});
        
        //accion del boton salir
        btnsalir.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                System.exit(0);
            }});
        
        
        //accion del boton ayuda
        btnayu.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                try
                {
                     File path = new File ("Juego/manual.pdf");
                     Desktop.getDesktop().open(path);
                }
                catch (IOException ex)
                {
                    ex.printStackTrace();
                }
                    
            }});
        
        
        //Menu
        //accion del boton salir
        btnsalirs.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                System.exit(0);
            }});
        
        btnregre.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                Menu.setVisible(false);
                Principal.setVisible(true);
            }});
        
        //boton de preguntas de historia
        cate1.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                Principal.setVisible(false);
                Menu.setVisible(false);
                p1.add(p1cate1);
                p1.setVisible(true);
                f1cate1.add(btn1p1c1);
                f1cate1.add(btn2p1c1);
                f1cate1.add(btn3p1c1);
                f1cate1.add(btn4p1c1);
                f1cate1.add(n1J,0);
            }
        });
        
        
        //Seccion de Historia botones
        //PREGUNTA 1
        //boton 1 correcto 
        btn1p1c1.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                JOptionPane.showMessageDialog(Principal, "Muy Bien "+jugador+" Vamos por la siguiente...");
                Principal.setVisible(false);
                Menu.setVisible(false);
                p1cate1.setVisible(false);
                p1.add(p2cate1);
                p2cate1.setVisible(true);
                f2cate1.add(btn1p2c1);
                f2cate1.add(btn2p2c1);
                f2cate1.add(btn3p2c1);
                f2cate1.add(btn4p2c1);
                f2cate1.add(n1J,0);
            }
        });
        
        
        //boton 2 incorrecto
        btn2p1c1.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
        JOptionPane.showMessageDialog(Principal, "Suerte a la próxima "+jugador+". Lo sentimos es turno de otro amigo....");
                Principal.setVisible(false);
                Menu.setVisible(false);
                p1.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        });
         
        
                
            
            }
        });
        
        
        //boton 3 incorrecto
        btn3p1c1.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
               JOptionPane.showMessageDialog(Principal, "Suerte a la próxima "+jugador+". Lo sentimos es turno de otro amigo....");
            Principal.setVisible(false);
                Menu.setVisible(false);
                p1.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        });
            }
        });
        
        
        //boton 4 incorrecto
        btn4p1c1.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                JOptionPane.showMessageDialog(Principal, "Suerte a la próxima "+jugador+". Lo sentimos es turno de otro amigo....");
            Principal.setVisible(false);
                Menu.setVisible(false);
                p1.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        });
            }
        });
        
        
        //PREGUNTA 2
        //boton 1 incorrecto
        btn1p2c1.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
               JOptionPane.showMessageDialog(Principal, "Suerte a la próxima "+jugador+". Lo sentimos es turno de otro amigo....");
           Principal.setVisible(false);
                Menu.setVisible(false);
                p1.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        }); }
        });
        
        
        //boton 2 incorrecto
        btn2p2c1.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                JOptionPane.showMessageDialog(Principal, "Suerte a la próxima "+jugador+". Lo sentimos es turno de otro amigo....");
            Principal.setVisible(false);
                Menu.setVisible(false);
                p1.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        });}
        });
        
        
        //boton 3 incorrecto
        btn3p2c1.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
      JOptionPane.showMessageDialog(Principal, "Suerte a la próxima "+jugador+". Lo sentimos es turno de otro amigo....");
           Principal.setVisible(false);
                Menu.setVisible(false);
                p1.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        }); }
        });
        
        
        //boton 4 correcto 
        btn4p2c1.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                JOptionPane.showMessageDialog(Principal, "Muy Bien "+jugador+" Vamos por la siguiente...");
                Principal.setVisible(false);
                Menu.setVisible(false);
                p2cate1.setVisible(false);
                p1.add(p3cate1);
                p3cate1.setVisible(true);
                f3cate1.add(btn1p3c1);
                f3cate1.add(btn2p3c1);
                f3cate1.add(btn3p3c1);
                f3cate1.add(btn4p3c1);
                f3cate1.add(n1J,0);
            }
        });
        
        
        
        //PREGUNTA 3
        //boton 1 incorrecto
        btn1p3c1.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
   JOptionPane.showMessageDialog(Principal, "Suerte a la próxima "+jugador+". Lo sentimos es turno de otro amigo....");
            Principal.setVisible(false);
                Menu.setVisible(false);
                p1.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        });}
        });
        
        
        //boton 2 correcto 
        btn2p3c1.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                JOptionPane.showMessageDialog(Principal, "Bien hecho "+jugador+" ¡Sigue así!");
               Principal.setVisible(false);
                Menu.setVisible(false);
                p1.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        });
                
            }
        });
        
        
        //boton 3 incorrecto
        btn3p3c1.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
 JOptionPane.showMessageDialog(Principal, "Suerte a la próxima "+jugador+". Lo sentimos es turno de otro amigo....");
            Principal.setVisible(false);
                Menu.setVisible(false);
                p1.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        });}
        });
        
        
        //boton 4 incorrecto
        btn4p3c1.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
 JOptionPane.showMessageDialog(Principal, "Suerte a la próxima "+jugador+". Lo sentimos es turno de otro amigo....");
            Principal.setVisible(false);
                Menu.setVisible(false);
                p1.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        });}
        });
        
        
        
        
        
        
        //boton de preguntas de ciencia
        cate2.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                Principal.setVisible(false);
                Menu.setVisible(false);
                p1.setVisible(false);
                p2.add(p1cate2);
                p2.setVisible(true);
                f1cate2.add(btn1p1c2);
                f1cate2.add(btn2p1c2);
                f1cate2.add(btn3p1c2);
                f1cate2.add(n1J,0);
            }
        });
        
        
        //Seccion de Ciencia botones
        //PREGUNTA 1
        //boton 1 incorrecto
        btn1p1c2.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
             
              JOptionPane.showMessageDialog(Principal, "Suerte a la próxima "+jugador+". Lo sentimos es turno de otro amigo....");
            
            Principal.setVisible(false);
                Menu.setVisible(false);
                p2.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        });
            }
        });
        
        
        //boton 2 incorrecto
        btn2p1c2.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
    JOptionPane.showMessageDialog(Principal, "Suerte a la próxima "+jugador+". Lo sentimos es turno de otro amigo....");
            Principal.setVisible(false);
                Menu.setVisible(false);
                p2.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        });}
        });
        
        
        //boton 3 correcto
        btn3p1c2.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                JOptionPane.showMessageDialog(Principal, "Muy Bien "+jugador+" Vamos por la siguiente...");
                Principal.setVisible(false);
                Menu.setVisible(false);
                p1cate2.setVisible(false);
                p2.add(p2cate2);
                p2cate2.setVisible(true);
                f2cate2.add(btn1p2c2);
                f2cate2.add(btn2p2c2);
                f2cate2.add(btn3p2c2);
                f2cate2.add(n1J,0);
            }
        });
        
        
        //PREGUNTA 2
        //boton 1 correcto
        btn1p2c2.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                JOptionPane.showMessageDialog(Principal, "Muy Bien "+jugador+" Vamos por la siguiente...");
                Principal.setVisible(false);
                Menu.setVisible(false);
                p2cate2.setVisible(false);
                p2.add(p3cate2);
                p3cate2.setVisible(true);
                f3cate2.add(btn1p3c2);
                f3cate2.add(btn2p3c2);
                f3cate2.add(btn3p3c2);
                f3cate2.add(n1J,0);
            }
        });
        
        
        //boton 2 incorrecto
        btn2p2c2.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
     JOptionPane.showMessageDialog(Principal, "Suerte a la próxima "+jugador+". Lo sentimos es turno de otro amigo....");
            Principal.setVisible(false);
                Menu.setVisible(false);
                p2.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        });}
        });
        
        
        //boton 3 incorrecto
        btn3p2c2.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
     JOptionPane.showMessageDialog(Principal, "Suerte a la próxima "+jugador+". Lo sentimos es turno de otro amigo....");
            Principal.setVisible(false);
                Menu.setVisible(false);
                p2.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        });}
        });
        
        
        //PREGUNTA 3
        //boton 1 incorrecto
        btn1p3c2.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                 JOptionPane.showMessageDialog(Principal, "Suerte a la próxima "+jugador+". Lo sentimos es turno de otro amigo....");
            Principal.setVisible(false);
                Menu.setVisible(false);
                p2.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        });   
            }
        });
        
        
        //boton 2 correcto
        btn2p3c2.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                JOptionPane.showMessageDialog(Principal, "Bien hecho "+jugador+" ¡Sigue así!");
              Principal.setVisible(false);
                Menu.setVisible(false);
                p2.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        });  
            }
        });
        
        
        //boton 3 incorrecto
        btn3p3c2.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
             JOptionPane.showMessageDialog(Principal, "Suerte a la próxima "+jugador+". Lo sentimos es turno de otro amigo....");
            Principal.setVisible(false);
                Menu.setVisible(false);
                p2.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        });}
        });
        
        
        
        
        //boton de preguntas de geografia
        cate3.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                
                Principal.setVisible(false);
                Menu.setVisible(false);
                p3.add(p1cate3);
                p3.setVisible(true);
                f1cate3.add(btn1p1c3);
                f1cate3.add(btn2p1c3);
                f1cate3.add(btn3p1c3);
                f1cate3.add(btn4p1c3);
                f1cate3.add(n1J,0);
            }
        });
        
        
        //Seccion de Geografia botones
        //PREGUNTA 1
        //boton 1 incorrecto 
        btn1p1c3.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
      JOptionPane.showMessageDialog(Principal, "Suerte a la próxima "+jugador+". Lo sentimos es turno de otro amigo....");
           Principal.setVisible(false);
                Menu.setVisible(false);
                p3.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        }); }
        });
        
        
        //boton 2 correcto
        btn2p1c3.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                JOptionPane.showMessageDialog(Principal, "Muy Bien "+jugador+" Vamos por la siguiente...");
                Principal.setVisible(false);
                Menu.setVisible(false);
                p1cate3.setVisible(false);
                p3.add(p2cate3);
                p2cate3.setVisible(true);
                f2cate3.add(btn1p2c3);
                f2cate3.add(btn2p2c3);
                f2cate3.add(btn3p2c3);
                f2cate3.add(btn4p2c3);
                f2cate3.add(n1J,0);
            }
        });
        
        
        //boton 3 incorrecto
        btn3p1c3.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
      JOptionPane.showMessageDialog(Principal, "Suerte a la próxima "+jugador+". Lo sentimos es turno de otro amigo....");
             Principal.setVisible(false);
                Menu.setVisible(false);
                p3.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        });}
        });
        
        
        //boton 4 incorrecto
        btn4p1c3.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
         JOptionPane.showMessageDialog(Principal, "Suerte a la próxima "+jugador+". Lo sentimos es turno de otro amigo....");
            Principal.setVisible(false);
                Menu.setVisible(false);
                p3.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        }); }
        });
        
        
        
        //PREGUNTA 2
        //boton 1 incorrecto 
        btn1p2c3.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
         JOptionPane.showMessageDialog(Principal, "Suerte a la próxima "+jugador+". Lo sentimos es turno de otro amigo....");
             Principal.setVisible(false);
                Menu.setVisible(false);
                p3.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        });}
        });
        
        
        //boton 2 correcto
        btn2p2c3.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                JOptionPane.showMessageDialog(Principal, "Muy Bien "+jugador+" Vamos por la siguiente...");
                Principal.setVisible(false);
                Menu.setVisible(false);
                p2cate3.setVisible(false);
                p3.add(p3cate3);
                p3cate3.setVisible(true);
                f3cate3.add(btn1p3c3);
                f3cate3.add(btn2p3c3);
                f3cate3.add(btn3p3c3);
                f3cate3.add(btn4p3c3);
                f3cate3.add(n1J,0);
            }
        });
        
        
        //boton 3 incorrecto
        btn3p2c3.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
      JOptionPane.showMessageDialog(Principal, "Suerte a la próxima "+jugador+". Lo sentimos es turno de otro amigo....");
            Principal.setVisible(false);
                Menu.setVisible(false);
                p3.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        }); }
        });
        
        
        //boton 4 incorrecto
        btn4p2c3.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
       JOptionPane.showMessageDialog(Principal, "Suerte a la próxima "+jugador+". Lo sentimos es turno de otro amigo....");
           Principal.setVisible(false);
                Menu.setVisible(false);
                p3.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        });  }
        });
        
        
        
        //PREGUNTA 3
        //boton 1 incorrecto 
        btn1p3c3.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
      JOptionPane.showMessageDialog(Principal, "Suerte a la próxima "+jugador+". Lo sentimos es turno de otro amigo....");
             Principal.setVisible(false);
                Menu.setVisible(false);
                p3.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        });}
        });
        
        
        //boton 2 correcto
        btn2p3c3.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                JOptionPane.showMessageDialog(Principal, "Bien hecho "+jugador+" ¡Sigue así!");
                 Principal.setVisible(false);
                Menu.setVisible(false);
                p3.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        });
            }
        });
        
        
        //boton 3 incorrecto
        btn3p3c3.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
        JOptionPane.showMessageDialog(Principal, "Suerte a la próxima "+jugador+". Lo sentimos es turno de otro amigo....");
             Principal.setVisible(false);
                Menu.setVisible(false);
                p3.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        });}
        });
        
        
        //boton 4 incorrecto
        btn4p3c3.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
        JOptionPane.showMessageDialog(Principal, "Suerte a la próxima "+jugador+". Lo sentimos es turno de otro amigo....");
             Principal.setVisible(false);
                Menu.setVisible(false);
                p3.setVisible(false);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        });}
        });
        
        
        Principal.add(pprincipal);
        Principal.setVisible(true);
    }
    
}
