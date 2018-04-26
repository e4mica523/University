/*
 * Written by Eric Formica
 * Song
 * April 15th 2015
 *
 */
public class Song
{
	//required variables
	private String name;
	private String artist;
	private double duration;
	
	public Song() //default constructor
	{
		name = "no name";
		artist = "no artist";
		duration = 0.00;
	}
	
	//parameterized constructor
	public Song(String aName, String anArtist, double aDuration)
	{
		setName(aName);
		setArtist(anArtist);
		setDuration(aDuration);
	}

	//accessors and mutators
	public String getName()
	{
		return name;
	}

	public void setName(String aName)
	{
		this.name = aName;
	}

	public String getArtist()
	{
		return artist;
	}

	public void setArtist(String anArtist)
	{
		this.artist = anArtist;
	}

	public double getDuration()
	{
		return duration;
	}

	public void setDuration(double aDuration)
	{
		if(aDuration < 0)
		{
			System.out.println("Can't have negative duration");
			System.exit(0);
		}
		this.duration = aDuration;
	}
	
	//toString method
	public String toString()
	{
		return ("Name: " + this.getName() + "  Artist: " + this.getArtist()
						+ "  Duration: " + this.getDuration());
	}
	
	

}
