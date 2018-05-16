
public class Maze extends Board {
  		
    public Maze( int rows, int cols ) {
    	super(rows,cols);
//    	 Implement this!
    }
    
    public void create() {
      graph = new ExtendedGraph();
      set = new DisjointSets(maxCell);
      amountOfSets = maxCell;
      
      while(amountOfSets > 1){
        int i; 
        i = rand.nextInt(4);
        
        if(i == 0){
          d = Point.Direction.UP;
        }
        if(i == 1){
          d = Point.Direction.LEFT;
        }
        if(i == 2){
          d = Point.Direction.RIGHT;
        } else {
          d = Point.Direction.DOWN;
        }
      }
    }
    
    public void search() {
//    	 Implement this method!
    }
    
//    ...
}
