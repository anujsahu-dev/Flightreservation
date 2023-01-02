import javax.swing.*;
import java.awt.*;

public class WindowUtilities 
{
	public static void setNativeLookAndFeel() 
	{
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(Exception e)
		{
			System.out.println("Error setting native LAF: " + e);
		}
	}
      // UIManager. LookAndFeelInfo(UIManager.LookAndFeelInfo());
      // UIManager.LookAndFeelInfo ( "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
}