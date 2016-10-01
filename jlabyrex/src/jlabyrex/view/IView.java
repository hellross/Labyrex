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
public interface IView {
    
    public void openStartWindow2();
    
    public void closeStartWindow2();
    
    public void openMainGUI();
    
    public void closeMainGUI();
    
    public void updateMirrorLabel();
    
    public void updateConnectionLabel();
    
    public void openHelpWindow();
    
    public void closeHelpWindow();
    
    public void openLevelWindow();
    
    public void closeLevelWindow();
}
