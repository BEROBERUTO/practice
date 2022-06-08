public class Book extends TangibleAsset{
	private Stiring isbn;

	public Book(Stirng name, int price, String color, String isbn){
		super(name, price, color);
		this.isbn=isbn;
	}

	public String getIsbn(){return this.isbn;}

}
