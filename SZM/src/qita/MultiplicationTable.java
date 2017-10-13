package qita;

public class MultiplicationTable {
	private MultiplicationLine[] lines;

	MultiplicationTable() {
		lines = new MultiplicationLine[9];
		for (int n = 0; n < 9; n++) {
			lines[n] = new MultiplicationLine(n + 1);
		}
	}

	void print() {
		for (int n = 0; n < 9; n++) {
			lines[n].printLine();
		}
	}

	public static void main(String[] args) {
		MultiplicationTable table = new MultiplicationTable();
		table.print();
	}

	public class MultiplicationLine {
		private int lineIndex = 0;

		MultiplicationLine(int line) {
			lineIndex = line;
		}

		public void printLine() {
			for (int n = 1; n <= lineIndex; n++)
				System.out.printf("%2d * %2d = %2d; ", lineIndex, n, lineIndex * n);
			System.out.println("");
		}
	}
}