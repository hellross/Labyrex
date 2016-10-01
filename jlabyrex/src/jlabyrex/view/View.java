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
    protected StartWindow2 startwindow2=null;
    protected HelpWindow helpwindow=null;
    protected LevelWindow levelwindow=null;
    protected MainGUI mainGUI=null;
    
    //instance method
    //--------------------------------------------------------------------------
    public void openStartWindow2(){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				if (startwindow2 == null)
					startwindow2 = new StartWindow2();
				startwindow2.setVisible(true);
			}
		});
    }
    
    public void closeStartWindow2(){
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
    }
    
    public void closeHelpWindow(){
    }
    
    public void openLevelWindow(){
    }
    
    public void closeLevelWindow(){
    };
    
}
