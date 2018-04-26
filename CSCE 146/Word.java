
public class Word
{
	//has a weight and a name
		private String name;
		private int count;
		
		//constructors and all that other jazz
		public Sheep(String name,int weight)
		{
			this.name=name;
			this.weight=weight;
		}

		public String getName() {
			return name;
		}

		public int getCount() {
			return weight;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}
		public String toString() //toString
		{
			return "Name= "+this.name+" Weight= "+this.weight;
		}

}
