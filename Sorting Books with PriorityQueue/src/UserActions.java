import javax.sound.midi.Soundbank;
import java.awt.*;
import java.util.*;

public class UserActions {
    public Scanner scanner = new Scanner(System.in);
    Set<Book> books=new TreeSet<>();

    public void run(){
        System.out.println("Welcome to the Book Sorting App");
        while(true){
            System.out.println("Menu \n" +
                    "1-Add Book\n" +
                    "2-Sort By Page Number\n" +
                    "3-Sort By Book Name\n" +
                    "0-Exit");
            System.out.print("Please Select From Menu : ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    getBookInfo();
                    break;
                case 2:
                    if(books.isEmpty()){
                        System.out.println("You need to Add Book!");
                    }else{
                        sortByNumber(books);
                    }

                    break;
                case 3:
                    if(books.isEmpty()) {
                        System.out.println("You need to Add Book!");
                    }else{
                        sortByName(books);
                    }
                    break;
                case 0:
                    return;
            }
        }

    }
    public void sortByName(Set<Book> books) {
        TreeSet<Book> names = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.compareTo(o2);
            }
        });
        names.addAll(books);
        for(Book book: names){
            System.out.println("Book Name : " + book.getName()+
                    "\t Book Page Number : " + book.getLength() +
                    "\t Book Author : " + book.getAuthor()+
                    "\t Book Publish Date : " + book.getDateOfPublish());
        }
    }
    public void sortByNumber(Set<Book> books){

        TreeSet<Book>pages = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o1.getLength(), o2.getLength());
            }
        });
        pages.addAll(books);
        System.out.println("Books");
        for(Book book: pages){
            System.out.println("Book Name : " + book.getName()+
                    "\t Book Page Number : " + book.getLength() +
                    "\t Book Author : " + book.getAuthor()+
                    "\t Book Publish Date : " + book.getDateOfPublish());
        }

    }
    public void getBookInfo(){
        System.out.print("Book name :");
        String bookName = scanner.next();
        System.out.print("Book Page Number :");
        int pageNumber = scanner.nextInt();
        System.out.print("Book Author :");
        String authorName = scanner.next();
        System.out.print("Book Public Date :");
        String publishDate = scanner.next();

        Book b = new Book(bookName,pageNumber,authorName,publishDate);
        books.add(b);



    }


}






