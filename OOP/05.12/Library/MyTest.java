package Library;

public class MyTest {

	public static void main(String[] args) {
		Fiction FictionBook = new Fiction();
		NonFiction NonFictionBook = new NonFiction();
		
		System.out.println("Name of the Library: " + FictionBook.getName() + 
				"\nNumber of books: " + FictionBook.getCapacity() +
				"\nArea: " + FictionBook.getArea() + "\n" +
				"\nTitle: " + FictionBook.getTitle() + 
				"\nPages: " + FictionBook.getPages() + 
				"\nPrice: " + FictionBook.getPrice());

		System.out.println("\n\n| | | | | | | | | | | | | |\n\n");
		
		System.out.println("Name of the Library: " + NonFictionBook.getName() + 
				"\nNumber of books: " + NonFictionBook.getCapacity() +
				"\nArea: " + NonFictionBook.getArea() + "\n" +
				"\nTitle: " + NonFictionBook.getTitle() + 
				"\nPages: " + NonFictionBook.getPages() + 
				"\nPrice: " + NonFictionBook.getPrice());
	}
}
