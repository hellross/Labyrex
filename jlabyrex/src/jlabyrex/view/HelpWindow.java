/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlabyrex.view;

import javax.swing.*;

import jlabyrex.controller.ControllerForView;

/**
 *
 * @author Utente
 */
public class HelpWindow extends JFrame {
    
    
    public HelpWindow() {
        JFrame help;
        help = new JFrame("How to Play");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        
    this.pack();
    }
    
}
