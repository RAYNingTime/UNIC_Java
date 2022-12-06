package Library;

public class BookArray {

	public static void main(String[] args) {
		Book[] books = {
			new Fiction(),
			new Fiction(),
			new Fiction(),
			new Fiction(),
			new Fiction(),
			new NonFiction(),
			new NonFiction(),
			new NonFiction(),
			new NonFiction(),
			new NonFiction(),
		};
		
		for(int i = 0; i<10; ++i) {
			System.out.println(i+1);
			System.out.println("Book number: " + i + 
					"\nName of the Library: " + books[i].getName() + 
					"\nNumber of books: " + books[i].getCapacity() +
					"\nArea: " + books[i].getArea() + "\n" +
					"\nTitle: " + books[i].getTitle() + 
					"\nPages: " + books[i].getPages() + 
					"\nPrice: " + books[i].getPrice());

			System.out.println("\n\n| | | | | | | | | | | | | |\n\n");
		}
		
		

	}

}
