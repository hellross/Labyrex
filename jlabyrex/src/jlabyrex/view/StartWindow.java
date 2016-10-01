/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlabyrex.view;

import java.awt.Font;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.GroupLayout;

public class StartWindow extends JFrame {

    private JButton start;                                                      
    private JButton tutorial;
    private JButton music;
 
    
    public StartWindow(){
        
            super("JLabyrex");                                
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        
            this.start=new JButton("Start");                                        //da complet.
        
            this.tutorial=new JButton("How to play");                               //finestra da creare
        
            this.music=new JButton("Music");                                        //gestione pulsanti Da Completare
            this.setResizable(false);
            
        
        
            JLabel title=new JLabel("Labyrex");                                     //Stampa il nome del gioco e
            title.setFont(new Font("Arial Black",Font.BOLD,24));                    //imposta il Font         
        
            Container contpane=this.getContentPane();
        
            GroupLayout layout=new GroupLayout(contpane);                           //associa al panel
            contpane.setLayout(layout);                                             //un grouplayout
        
            layout.setAutoCreateGaps(true);                                         //crea automaticamente spazi tra i componenti
            layout.setAutoCreateContainerGaps(true);                                //crea automaticamente spazi tra componenti e bordi del panel
        
            layout.setHorizontalGroup(
		layout.createSequentialGroup()
			.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(title)
                            .addComponent(start))
			.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(music)
				.addComponent(tutorial))
		);

		layout.setVerticalGroup(
			layout.createSequentialGroup()
			.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(title)
				.addComponent(music))
			.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(start)
				.addComponent(tutorial
                                  ))
		);
        
        
            this.pack();

    }
    
                                                   //gestisci operazioni pulsanti
        
    
}

