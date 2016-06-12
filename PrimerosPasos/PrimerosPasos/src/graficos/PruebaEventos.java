/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author haplo
 */
public class PruebaEventos {
    
    public static void main(String [] args){
        
        MarcoBotones miMarco= new MarcoBotones();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
        
    }
    
}

class MarcoBotones extends JFrame {
    
    public MarcoBotones() {
        setTitle("Botones y eventos");
        setBounds(700,300,500,300);
        LaminaBotones miLamina= new LaminaBotones();
        add(miLamina);
    }
}

class LaminaBotones extends JPanel{
    JButton botonAzul=new JButton("Azul");
    JButton botonAmarillo= new JButton("Amarillo");
    JButton botonRojo= new JButton("Rojo");
    
    public LaminaBotones() {
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);
        ColorFondo amarillo= new ColorFondo(Color.yellow);
        ColorFondo Azul= new ColorFondo(Color.blue);
        ColorFondo Rojo= new ColorFondo(Color.red);
        //El evento lo recibe "this" que es la clase actual y se pone a la escucha.
        botonAzul.addActionListener(this);
        botonAmarillo.addActionListener(this);
        botonRojo.addActionListener(this);
    }
        class ColorFondo implements ActionListener{
    
    public ColorFondo(Color c) {
        colorDeFondo=c;
        
    } 
    
    public void actionPerformed(ActionEvent e) {
        setBackground(colorDeFondo);
    }
    private Color colorDeFondo;
}
    }
    
        
    


