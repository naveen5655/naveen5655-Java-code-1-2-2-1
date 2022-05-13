package naveen;
import java.util.*;
class InventoryView {
	  Book book;
      static String searchbook;
		InventoryView(Book book) {
			this.book = book;
		}

		void searchBook(Book b) {
			if(b.getTitle()==searchbook)
				System.out.println("Book found");
			else
				System.out.println("Book is not found");
		}
		public static void  main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Book b = new Book();
			InventoryView i = new InventoryView(b);
			boolean repeat = true;
			while(repeat)
			{
				System.out.println("1.add book\n2.search book\n others exit");
				switch(sc.nextInt())
				{
				case 1:
					System.out.println("enter book name and author name");
					b.setTitle(sc.next());
					b.setAuthor(sc.next());
					break;
				case 2:
					System.out.println("enter search book\n");
					searchbook=sc.next();
					i.searchBook(b);
					break;
					default:
						System.out.println("enter incorrect input");
						repeat=false;
				}
			}
			sc.close();
		}
	}

 

