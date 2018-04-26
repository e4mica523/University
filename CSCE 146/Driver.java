
public class Driver
{
		public static void main(String[] args)
		{
			try
			{
				Scanner keyboard = new Scanner(System.in);
				//Create output to a file that doesn't append-------------------------------
				//Read from a file and print it out------------------------------------------
				Scanner fileScanner = new Scanner(new File("StarWarsNewHopeScript.txt"));
				System.out.println("Reading from file");
				while(fileScanner.hasNext())
				{
					System.out.println(fileScanner.nextLine());
				}
				fileScanner.close();//Once again it is important to close streams
				//---------------------------------------------------------------------------
				
			}
			catch(IOException e)
			{
				System.out.println("An IOException has occured!  Ending life");
				System.exit(0);
			}
		}
		

}
