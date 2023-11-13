package lab6;

public class Queen {
	private int row;
	private int column;

	public Queen(int row, int column) {
		super();
		this.row = row;
		this.column = column;
	}

	public void move() {
		// Enter your code here
		this.row++;
		if(row==Node.N) {
			row=0;
		}
		
	}

	// check whether this Queen can attack the given Queen (q)
	public boolean isConflict(Queen q) {
		// Enter your code here
		if(row==q.row) {
			return true;
		}else if(column==q.column) {
			return true;
		}else if(Math.abs(row-q.row)==Math.abs(column-q.column)) {
			return true;
		}
		return false;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public void setRow(int row) {
		this.row = row;
	}

	@Override
	public String toString() {
		return "(" + row + ", " + column + ")";
	}
}
