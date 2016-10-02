/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlabyrex.view;

/**
 *
 * @author Utente
 */
public class View implements IView {
    //static var
    //--------------------------------------------------------------------------
    public static View instance =null;
    
    //static method
    //--------------------------------------------------------------------------
    public static IView getInstance(){
        if(instance==null)
            instance=new View();
        return instance;
    }
    
    //instance attribute
    //--------------------------------------------------------------------------
    protected StartWindow startwindow=null;
    protected HelpWindow helpwindow=null;
    protected LevelWindow levelwindow=null;
    protected MainGUI mainGUI=null;
    
    //instance method
    //--------------------------------------------------------------------------
    public void openStartWindow(){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				if (startwindow == null)
					startwindow = new StartWindow();
				startwindow.setVisible(true);
			}
		});
    }
    
    public void closeStartWindow(){
    }
    
    public void openMainGUI(){
    }
    
    public void closeMainGUI(){
    }
    
    public void updateMirrorLabel(){
    }
    
    public void updateConnectionLabel(){
    }
    
    public void openHelpWindow(){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				if (startwindow == null)
					startwindow = new StartWindow();
				startwindow.setVisible(true);
			}
		});
    }
    
    public void closeHelpWindow(){
    }
    
    public void openLevelWindow(){
    }
    
    public void closeLevelWindow(){
    };
    
}
