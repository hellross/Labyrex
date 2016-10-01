
package jlabyrex.controller;

import jlabyrex.view.View;


public class ControllerForView implements IControllerForView{
    
    private static ControllerForView instance=null;
    
    //public static method
    //--------------------------------------------------------------------------
    public static IControllerForView getInstance() {
		if (instance == null)
			instance = new ControllerForView();
		return instance;
	}
    
    //pubblic instance method
    //--------------------------------------------------------------------------
    public void openStartWindow(){
        View.getInstance().openStartWindow();
    }
    
}
