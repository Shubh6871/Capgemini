package Lab2;

public class JournalPaper extends WrittenItem {
	private int pubYear;

	public JournalPaper(int idNum, String str, int n, String author, int y) {
		super(idNum, str, n, author);
		pubYear = y;
	}
	
	JournalPaper() {
		super();

	}


	public String toString() {
		return super.toString() + " Year published: " + pubYear;
	}

	public int getIdNum() {
		return super.getidNum();
	}

	public String title() {
		return super.getTitle();
	}

	public int numCopies() {
		return super.getNumCopies();
	}

	public String getAuthor() {
		return super.getAuthor();
	}

	public int yearPub() {
		return pubYear;
	}

	public void print() {
		super.print();
		System.out.println("Year published: " + pubYear);
	}

	public void checkIn() {

	}

	public void checkOut() {

	}

	public void addItem() {
		super.addItem();
	}
}
