Class Book{   
   int id;
   String title;
   boolean available = true;
   Book(int id, String title){
    this.id = id;
    this.title = title;
   }
   void display(){
    System.out.println(id + " " + title + " " +(available? "Available":"Issued"));
   }
}
class Library{
  Book[] books = new Book[3];
  int count = 0;
  void addBook(Book b){
    books[count[++\ = b;
  }
  void displayBooks(){
    for(int i = 0; i < count; i++)
      book[i].display();
  }
  void issueBook(int id){
    for(Book b: books){
       if(b != null && b.id == id){
          b.available = false;
          System.out.println("Book Issued");
      }
    }
}
void returnBook(int id){
   for(Book b: books){
      if(b != null && b.id == id){
         b.available = true;
         System.out.println("Book Returned");
      }
    }
  }
}
public class LibraryManagement{
  public static void main(String[] args){
    Library I = new Library();
    I.addBook(new Book(101, "Artificial Intelligence"));
    I.addBook(new Book(102, "Data Structure"));
    I.addBook(nnew Book(103, "Operating System"));
    System.outy.println("Library Books:");
    I.displayBooks();
    I.issueBook(101);
    I.returnBook(101);
    System.out.priny]tln("\nUpdated Books:");
    I.displayBooks();
  }
} 

