import java.awt.*;
import java.util.*;
public class Obstacle {
	private int x;	
	private int heightToGap;
	public static final int speed = 10;
	public static final int GAP_HEIGHT = 100;
	public static final int WIDTH = 100;
	public static final int MAX_GAP_TO_HEIGHT = 200;
	public static final int START_X = 350;
	
	public Obstacle()
	{
		init();
	}
	private void init()
	{
		x = START_X;
		Random r = new Random();
		heightToGap = r.nextInt(MAX_GAP_TO_HEIGHT);
	}
	public int getX()
	{
		return this.x;
	}
	public int getHeightToGap()
	{
		return this.heightToGap;
	}
	public void update()
	{
		x -= speed;
	}
	public void draw(Graphics g)
	{
		//Top rectangle
		g.fillRect(x, 0, WIDTH, heightToGap);
		//Bottom rectangle
		g.fillRect(x, heightToGap+GAP_HEIGHT, WIDTH, 1000);
	}
}
