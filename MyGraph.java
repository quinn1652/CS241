/* 
 * MyGraph.java
 *
 * A representation of a graph.
 * Assumes that we do not have negative cost edges in the graph.
 *
 * Students may only use functionality provided in the packages
 *     java.util 
 *     java.io
 * 
 * Use of any additional Java Class Library components is not permitted 
 * 
 * PUT YOUR NAME HERE
 */

import java.util.*;


public class MyGraph implements Graph {

   	private Collection<Vertex> myVertices;	//the vertices in this graph
   	private Collection<Edge> myEdges;	//the edges in this graph
   
   	/**
   	 * Creates a MyGraph object with the given collection of vertices
   	 * and the given collection of edges.
   	 * @param v a collection of the vertices in this graph
   	 * @param e a collection of the edges in this graph
   	 */
   	public MyGraph(Collection<Vertex> v, Collection<Edge> e) {
   
   	    // YOUR CODE HERE
   
   	}
   
   
   	/** 
   	 * Return the collection of vertices of this graph
   	 * @return the vertices as a collection (which is anything iterable)
   	 */
   	public Collection<Vertex> loadVertices() {
   
   	    // YOUR CODE HERE
   		return myVertices;
   
   	}
   
   	/**
   	 * Return the collection of edges of this graph
   	 * @return the edges as a collection
   	 */
   	public Collection<Edge> loadEdges() {
   
   	    // YOUR CODE HERE
   		return myEdges;
   
   	}
   
   	/** 
   	 * Return a collection of vertices adjacent to a given vertex v.
   	 *   i.e., the set of all vertices w where edges v -> w exist in the graph.
   	 * @param v one of the vertices in the graph
   	 * @return a collection of vertices adjacent to v in the graph
   	 */
   	public Collection<Vertex> findAdjacentVertices(Vertex a) {
   
   	    // YOUR CODE HERE
   		return myVertices;
   
   	}
   
   	 /**
      * Test whether vertex end_point is adjacent to vertex start_point (i.e. start_point -> end_point) in a directed graph.
      * @param start_point, one vertex
      * @param end_point, another vertex
      * @return an array which will contain distance, time_needed, and ticket_price of edge if there is a directed edge from start_point 
      * to end_point in the graph 
      * Return -1 otherwise.
      * (Including returning -1 if one of the two vertices does not exist.)
      * Assumes that we do not have negative cost edges in the graph.
      */
   	public int[] checkIsAdjacent(Vertex a, Vertex b) {
   
   	    // YOUR CODE HERE
   		int[] val=new int[10];
   		return val;
   
   	}
   	/**
   	 * Returns the shortest route from start_point to end_point in the graph.  
   	 * Assumes positive edge weights.
   	 * @param start_point the starting vertex
   	 * @param end_point the destination vertex
   	 * @param route a list in which the route will be stored, in order, the first
   	 * being the start vertex and the last being the destination vertex.  the
   	 * list will be empty if no such route exists.  
   	 * @param choice (1 = shortest route, 2 = cheapest route, 3 = fastest route)
   	 * NOTE: the list will be cleared of any previous data.
   	 * @return the length of the shortest route from start_point to end_point, -1 if no such path
   	 * exists.
   	 */
   	public int findRoute(Vertex start_point, Vertex end_point, List<Vertex> route, int choice) {
   
   	    // YOUR CODE HERE
   		return -1;
   
   	}
   	
}
