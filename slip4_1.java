import java.awt.*;
import javax.swing.*;
class slip4_1 implements Runnable
{
	JLabel label;
	boolean blink=true;
	
	slip4_1()
	{
		JFrame frame=new JFrame("text");
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		label=new JLabel("text",JLabel.CENTER);
		frame.add(label);
		frame.setVisible(true);
	} 	
	public void run()
	{
		try{
			while(true)
			{
				blink=!blink;
				if(blink)
					label.setForeground(Color.RED);
				else
					label.setForeground(Color.BLACK);
				Thread.sleep(500);
			}
		}
		catch(Exception e)
		{
			
		}	
	}
	public static void main(String args[])
	{
		Thread t1=new Thread(new slip4_1());
		t1.start();
	}
}
