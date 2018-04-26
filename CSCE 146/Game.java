import java.applet.*;//Needed to create the window
import java.awt.*;//Needed for drawing
import java.awt.event.*;
import java.util.*;

public class Game extends Applet implements MouseListener,ActionListener{
	private Image display;
	private Graphics drawingArea;
	private Ball ball;
	private ObstacleManager obManager;
	public static int FORCE = 10;
	public static int BALL_SIZE = 10;
	public static int DELTA_TIME = 100;
	private int width;
	private int height;
	javax.swing.Timer timer;
	private boolean gameOver;
	public void init()
	{
		this.setSize(300, 300);
		this.width = this.getWidth();
		this.height = this.getHeight();
		display = createImage(width,height);
		drawingArea = display.getGraphics();
		ball = new Ball(width/4,height/2,BALL_SIZE,0,0);
		obManager = new ObstacleManager();
		gameOver = false;
		timer = new javax.swing.Timer(DELTA_TIME,this);
		timer.start();
		this.addMouseListener(this);
		
	}
	public void update(Graphics g)
	{

		drawingArea.clearRect(0, 0, width, height);
		if(gameOver)
		{
			display.getGraphics().drawString("Game Over. Click the Mouse to Restart", 0, height/2);
			timer.stop();
		}
		else
		{
			ball.update();
			ball.draw(display.getGraphics());
			obManager.update();
			obManager.draw(display.getGraphics());
			collisionCheck();
		}
		g.drawImage(display,0,0,null);		
	}
	public void actionPerformed(ActionEvent e)
	{		
		this.repaint();		
	}

	public void mouseClicked(MouseEvent e)
	{
		if(gameOver == false)
			ball.addForce(-FORCE);
		else
			init();
	}
	public void collisionCheck()
	{
		if(ball.getY()<0 || ball.getY()>height)
		{
			gameOver = true;
		}
		for(Obstacle ob : obManager.getObstacles())
		{
			if(ob.getX() < ball.getX() && ob.getX()+Obstacle.WIDTH > ball.getX())
			{
				if(ball.getY() < ob.getHeightToGap() || ball.getY()>ob.getHeightToGap()+Obstacle.GAP_HEIGHT)
				{
					gameOver = true;
				}
			}
		}
	}
	public void mouseReleased(MouseEvent e)
	{
		
	}
	public void mouseEntered(MouseEvent e)
	{
		
	}
	public void mousePressed(MouseEvent e)
	{
		
	}
	public void mouseExited(MouseEvent e)
	{
		
	}
}