package Lab2;

public abstract class WrittenItem extends Item {
	private String author;
	
	public WrittenItem(int idNum, String str, int n, String author) {
		super(idNum, str, n) ;
		this.author = author ;
	}
	
	public WrittenItem(int idNum, String str, int n) {
		super(idNum, str, n) ;
	}
	
	
	public WrittenItem() {
		super() ;
	}
	
	void setAuthor(String str){
	author = str;
	}
	String getAuthor(){
	return author;
	}
	public int getidNum(){
	return super.getidNum();
	}
	public String getTitle(){
	return super.getTitle();
	}
	public int getNumCopies(){
	return super.getCopies();
	}
	public boolean equals(Object obj){
	if(obj == null)
	return false;
	WrittenItem otherWrittenItem = (WrittenItem) obj;
	return super.equals(otherWrittenItem) && author == otherWrittenItem.author;
	}
}
