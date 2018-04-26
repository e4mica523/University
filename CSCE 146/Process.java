public class Process {
	private int priority;
	private double time;
	private String name;

	public Process() {
		this.priority = 1;
		this.time = 1;
		this.name = "No Name";
	}

	public Process(String aName, int aPriority, double aTime) {
		setPriority(aPriority);
		setTime(aTime);
		setName(aName);
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		if (priority <= 0) {
			System.out.println("Error, invalid number");
			System.exit(0);
		} else {
			this.priority = priority;
		}
	}

	public double getTime() {
		return time;
	}

	public void setTime(double aTime) {
		if (aTime <= 0) {
			System.out.println("Error, invalid number");
			System.exit(0);
		} else {
			this.time = aTime;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString()
	{
		return getName() + "  " + getPriority() + "  " + getTime();
	
	}
	
	

}
