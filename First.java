import java.awt.*;
import java.applet.*;

public class First extends Applet{
	private static Second second = new Second();
	public static void plotpoint(int a,int b,Graphics g){
		second.point(a,b,g);
	}
	public void init(Graphics g){
		setBackground(Color.black);
		repaint();
	}
	
	public void paint(Graphics g){
		int a=1,rowcount, colcount;
		try
		{
			while(a!=0){
				setForeground(Color.black);
				rowcount = 0; colcount=(getWidth()/20)-1;
			for(int j=0;j<=colcount;j++){
                        Color c1= new Color((200/(j+1)),(200/(j+2))*(j%2)+8*j,(200/(j+2))*(j%4)+10*j);
                        g.setColor(c1);
                        for(int i = rowcount;i<colcount;i++){
			       	First.plotpoint(20*i,20*j,g);
				Thread.sleep(10);
                        }
                        for(int k=rowcount;k<colcount;k++){
				First.plotpoint(20*colcount,20*k,g);
				Thread.sleep(10);
                        }
                        for(int l=colcount;l>rowcount;l--){
				First.plotpoint(20*l,20*colcount,g);
				Thread.sleep(10);
                        }

                        for(int m=colcount;m>rowcount;m--){
				First.plotpoint(20*rowcount-1,20*m,g);
				Thread.sleep(10);
                        }
                        colcount--;
			rowcount++;
                }
				rowcount = 0; colcount=(getWidth()/20)-1;
				for(int j=0;j<=colcount;j++){
                        Color c1= new Color(255,255,255);
                        g.setColor(c1);
                        for(int i = rowcount;i<=colcount;i++){
			       	First.plotpoint(20*i,20*j,g);
				Thread.sleep(10);
                        }
                        for(int k=rowcount;k<=colcount;k++){
				First.plotpoint(20*colcount,20*k,g);
				Thread.sleep(10);
                        }
                        for(int l=colcount;l>=rowcount;l--){
				First.plotpoint(20*l,20*colcount,g);
				Thread.sleep(10);
                        }

                        for(int m=colcount;m>=rowcount;m--){
				First.plotpoint(20*rowcount-1,20*m,g);
				Thread.sleep(10);
                        }
                        colcount--;
			rowcount++;
			}}

		//...YOUR LOGIC
		}
		catch (InterruptedException ie)
		{
			ie.printStackTrace();
		}
    }

}

