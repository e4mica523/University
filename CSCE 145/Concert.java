
public class Concert
{
	private String name;  //variables for all the fields
	private int capacity;
	private int phoneSales;
	private int venueSales;
	private double phonePrice;
	private double venuePrice;
	
	public Concert() //default constructor
	{
		initialize("No name", 100, 0, 0); //sets initial capacity to 100 
	}
	
	public Concert(String newName, int newCapacity, double newPhonePrice, double newVenueTicket) //constructor to initialize
	{
		initialize(newName, newCapacity,newPhonePrice,newVenueTicket); 
		
	}
	
	private void initialize(String newName, int newCapacity, double newPhonePrice, double newVenuePrice) //initializes variables
	{
		name = newName;
		if((capacity < 0) || (phoneSales < 0) || (venueSales < 0) || (phonePrice < 0) || (venuePrice < 0)) //checks for negatives
		{
			System.out.println("Can't have a negative!");
			System.exit(0);
		}
		else
		{
			capacity = newCapacity;
			phonePrice = newPhonePrice;
			venuePrice = newVenuePrice;
		}
	}

	//accessors and mutators
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity)
	{
		if(capacity < 0) //cant have negative capacity
		{
			System.out.println("Must enter a positive number!");
		}
		else
		{	
			this.capacity = capacity;
		}	
	}

	public int getPhoneSales() {
		return phoneSales;
	}

	public int getVenueSales() {
		return venueSales;
	}


	public double getPhonePrice() {
		return phonePrice;
	}

	public void setPriceByPhone(double phonePrice) {
		if(phonePrice < 0)
		{
			System.out.println("Must enter a positive number!");
		}
		else
		{	
			this.phonePrice = phonePrice;
		}	
	}

	public double getVenuePrice() {
		return venuePrice;
	}

	public void setPriceAtVenue(double newVenuePrice) {
		if(newVenuePrice < 0)
		{
			System.out.println("Must enter a positive number!");
		}
		else
		{	
			this.venuePrice = newVenuePrice;
		}	
	}
	
	//finds the tickets sold
	public int TotalNumberOfTicketsSold()
	{
		return (phoneSales + venueSales);
		
	}
	
	//how many tickets are left?
	public int TicketsRemaining()
	{
		int remaining = capacity - (phoneSales + venueSales);
		if(remaining <= 0)
		{
			System.out.println("No more Tickets left :(");
			return 0;
		}
		else
		{
			return remaining;
		}
	}
	
	//buying tickets for both phone and venue
	void BuyTicketsAtVenue(int tickets)
	{
		if((venueSales + tickets > capacity))
		{
			System.out.println("The concert is full!");
		}
		else if(tickets <= 0)
		{
			System.out.println("You can't buy negative tickets");
		}
		else
		{
			venueSales+= tickets;
		}
	}
	
	void BuyTicketsByPhone(int tickets)
	{
		if((phoneSales + tickets > capacity))
		{
			System.out.println("The concert is full!");
		}
		else if(tickets <= 0)
		{
			System.out.println("You can't buy negative tickets");
		}
		else
		{
			phoneSales+= tickets;
		}
	}
	
	//calculates the gross
	double TotalSales()
	{
		double totalSales;
		double totalPhone = (phonePrice * phoneSales);
		double totalVenue = (venuePrice * venueSales);
		totalSales = totalPhone + totalVenue;
		return totalSales;
	}

}
