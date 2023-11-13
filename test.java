package lab6;

public class test {
	public static void main(String[] args) {
		Node node=new Node();
		node.generateBoard();
		node.displayBoard();
		System.out.println(node.getH());
		HillClimbingSearchNQueen hcs=new HillClimbingSearchNQueen();
		System.out.println(hcs.excute(node).getH());
		System.out.println(hcs.executeHillClimbingWithRandomRestart(node).getH());
	}
   
}
