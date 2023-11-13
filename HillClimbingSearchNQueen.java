package lab6;

public class HillClimbingSearchNQueen {
public Node excute(Node initialState) {
	Node current=initialState;
	Node neighbor=null;
	while(true) {
		neighbor=current.getBest();
		if(neighbor.getH()<current.getH()) {
			current=neighbor;
		}else {
			return current;
		}
	}
	
}
public Node executeHillClimbingWithRandomRestart(Node initialState) {
	// Enter your code here.
	Node node=excute(initialState);
	 while(node.getH()!=0) {
		 
		 initialState.generateBoard();
		 node=excute(initialState);

	
	 }
	return node;
}
}

