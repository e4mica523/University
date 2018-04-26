/*
 * Written by Eric Formica
 * Star Wars Heap Tester
 * April 8th 2015
 *
 */
import java.util.*;
import java.io.*;
public class StarWarsTester
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Writing to files
		
		int jabbacount = 0;
		int wookiecount = 0;
		int forcecount = 0;
		int dscount = 0;
		
		//StarWarsHeap s = new StarWarsHeap();
		
		try
		{
			Scanner fileScanner = new Scanner(new File("StarWarsNewHopeScript.txt"));
			System.out.println("Scanning Star Wars and sorting the words “force”, “wookiee”, “jabba”, “death star”");
			while(fileScanner.hasNext())
			{
				String token = fileScanner.next().toLowerCase();
				if(token.equals("jabba") || token.equals("jabba.") || token.equals("jabba!") || token.equals("jabba?") || token.equals("jabba,"))
				{
					jabbacount++;
				}
				else if(token.equals("wookiee") || token.equals("wookiee.") || token.equals("wookiee!") || token.equals("wookiee?") || token.equals("wookiee,"))
				{
					wookiecount++;
				}
				else if(token.equals("force") || token.equals("force.") || token.equals("force!") || token.equals("force?") || token.equals("force,"))
				{
					forcecount++;
				}
				else if(token.equals("death"))
				{
					String token2 = fileScanner.next().toLowerCase();
					if(token2.equals("star") || token2.equals("star.") || token2.equals("star!") || token2.equals("star?") || token2.equals("star,"))
					dscount++;
				}
			}
			fileScanner.close();
		}
		catch(IOException e)
		{
			System.out.println("An IOException has occured!  Ending life");
			System.exit(0);
		}
		//outputs the counters because errors occur
		System.out.println("Jabba: " + jabbacount);
		System.out.println("Wookie: " + wookiecount);
		System.out.println("Force: " + forcecount);
		System.out.println("Death Star: " + dscount);
		StarWarsHeap heap = new StarWarsHeap();
		heap.addWord(new Word("Jabba",jabbacount));
		heap.addWord(new Word("Wookie",wookiecount));
		heap.addWord(new Word("Force",forcecount));
		heap.addWord(new Word("Death Star",dscount));
		System.out.println(heap.getSize());
		//heap.setSize( heap.getHeap().length);
		//for(int i=0;i<5;i++) System.out.println(heap.getHeap()[i]);
		heap.WordHeapSort();
		//Script[] aa = s.ScriptHeapSort();
		//System.out.println(aa[1].getName());
		//System.out.println(Arrays.toString(s.ScriptHeapSort()));
	}
	
}
