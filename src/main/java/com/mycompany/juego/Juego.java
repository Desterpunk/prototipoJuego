/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juego;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Pc-pro
 */
public class Juego extends Canvas implements Runnable{
    
    private static final long serialVersionUID = 1L;
    private static JFrame ventana;
    private static Thread thread;

    private static final int ANCHO = 800;
    private static final int ALTO = 800;
    private static final String NOMBRE = "Juego";
    private static Boolean enFuncionamiento = false;
    
    private Juego() {
        setPreferredSize(new Dimension(ANCHO, ALTO));
        ventana = new JFrame(NOMBRE);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setLayout(new BorderLayout());
        ventana.add(this, BorderLayout.CENTER);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
    
    public static void main(String[] args){
        Juego juego = new Juego();
        juego.iniciar();
    }

    private void iniciar() {
        enFuncionamiento = true;
        
        thread = new Thread(this, "Graficos");
        thread.start();
    }
    
    private void detener() {
        enFuncionamiento = false;
        
    }
    
    public void run() {
        while(enFuncionamiento){
            
        }
    }
}
