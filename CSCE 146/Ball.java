import java.awt.*;
public class Ball {
	private int x;
	private int y;
	private int size;
	private int xForce;
	private int yForce;
	
	public static final int TERM_VEL = 20;
	public static final int GRAV = 2;
	
	
	
	public Ball(int x, int y, int size, int xForce, int yForce) {
		this.x = x;
		this.y = y;
		this.size = size;
		this.xForce = xForce;
		this.yForce = yForce;
	}
	public void update()
	{
		this.y += yForce;
		if(yForce < TERM_VEL)
			yForce += GRAV;
		else
			yForce = TERM_VEL;
		
	}
	public int getX()
	{
		return this.x;
	}
	public int getY()
	{
		return this.y;
	}
	public void draw(Graphics g)
	{
		g.fillOval(x, y, size, size);
	}
	public void addForce(int aYForce)
	{
		yForce = aYForce;
	}
}
