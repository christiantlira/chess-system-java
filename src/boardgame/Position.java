package boardgame;

public class Position {
	private int row;
	private int column;
	
	public Position() {}

	public Position(int raw, int column) {
		this.row = raw;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRaw(int raw) {
		this.row = raw;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
	
}
