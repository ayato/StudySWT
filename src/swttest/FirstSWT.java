package swttest;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class FirstSWT {

	public static void main(String[] org){
		Display display = new Display();
		Shell shell = new Shell(display);
		
		shell.pack();
		shell.open();
		
		while(!shell.isDisposed()){
			if (!display.readAndDispatch()){
				display.sleep();
			}
		}
		
		display.dispose();
	}
	
}
