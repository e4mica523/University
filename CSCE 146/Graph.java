/*
 * Written by Eric Formica
 * Graph
 * April 1st 2015
 *
 */
import java.util.*;

public class Graph {
	private class Vertex {
		String name;
		ArrayList<Edge> neighbors;

		public Vertex(String aName) {
			this.name = aName;
			this.neighbors = new ArrayList<Edge>();
		}
	}

	private class Edge {
		Vertex nextVert;
		double weight;

		public Edge(Vertex aV1, double aWeight) {
			nextVert = aV1;
			weight = aWeight;
		}
	}

	private Vertex origin;
	private ArrayList<Vertex> verticies;
	private ArrayList<Vertex> markedVerts;
	private ArrayList<Vertex> visitedVerts;
	private double maxLength;

	public Graph(double aLength) {
		origin = null;
		verticies = new ArrayList<Vertex>();
		markedVerts = new ArrayList<Vertex>();
		visitedVerts = new ArrayList<Vertex>();
		maxLength = aLength;
	}
	
	//add vertex method
	public void addVertex(String aName)
	{

			if(verticies.contains(aName))
			{
				System.out.println(" It is Already there");
				return;
			}
			Vertex v = new Vertex(aName);
			verticies.add(v);
			if(origin == null)
			{
				origin = v;
			}
			//if not there, then add it
	}
	
	//checks if the name is in the vertex already
	public boolean vertexIsContained(String aName)
	{
		for(Vertex v : verticies) //for each through the vertex
		{
			if(v.name.equals(aName))
			{
				System.out.println("Already there");
				return true;
			}
			

		}
		return false;
	}
	//add the edge
	
	public void addEdge(String vertex1, String vertex2, double weight)
	{
		Vertex v1 = getVertex(vertex1);
		Vertex v2 = getVertex(vertex2);
		
		if(v1 == null || v2 == null) //if both are null
		{
			return;
		}
		
		v1.neighbors.add(new Edge(v2, weight)); //add the neighbors
	}
	
	//gets the vertex
	public Vertex getVertex(String aName)
	{
		for(Vertex x : verticies) //for each through the vertices
		{
			if(x.name == aName)
			{
				return x;
			}
			
		}
		return null;
		
	}
	
	//is marked and is visited methods to see if they have already been there
	private boolean isMarked(Vertex v)
	{
		for(Vertex a : markedVerts)
		{
			if(a.name.equals(v.name))
			{
				return true; //if yes then return true
			}
		}
		return false;
	}
	
	private boolean isVisited(Vertex ver)
	{
		for(Vertex v : visitedVerts)
		{
			if(v.name.equals(ver.name))
			{
				return true;
			}
		}
		return false;
	}
	
	public void printDFS()
	{
		printDFS(origin);//calls the recursive dfs method
	}
	
	public void printDFS(Vertex v)
	{
		if(isMarked(v))
		{
			return;
		}
		markedVerts.add(v);
		System.out.println(v.name);
		for(Edge e : v.neighbors)
		{
			printDFS(e.nextVert);
		}
	}
	
	public void printBFS()
	{
		markedVerts.clear();
		printBFS(origin);
		System.out.println(origin);
		
	}
	
	public void printBFS(Vertex aV)
	{
		visitedVerts.add(aV);
		//System.out.println(aV.name);
		for(Edge e : aV.neighbors)
		{
			if(!isMarked(e.nextVert))
			{
				System.out.println(e.nextVert.name);
				markedVerts.add(e.nextVert);
			}
		}
		for(Edge e : aV.neighbors)
		{
			if(!isVisited(e.nextVert))
			{
				visitedVerts.add(e.nextVert);
				printBFS(e.nextVert);
			}
		}
	}
	
	public void printLazyDFS()
	{
		
		printLazyDFS(origin);
	}
	
	
	public void printLazyDFS(Vertex v)
	{
		
	}

}
