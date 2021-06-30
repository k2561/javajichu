
public class Graph {
     String graph; 
     public void OutputGraph(){
    	 for(int i = 0; i < 4; i++){
    		 System.out.println(graph + graph + graph + graph);
    	 }
     }
     
     public static void main(String[] args){
    	 Graph g = new Graph();  
    	 g.graph = "*";
         g.OutputGraph();
     }
}
