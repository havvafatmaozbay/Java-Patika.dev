public class Book implements Comparable<Book>{
    private String name;
    private int length;
    private String author;
    private String dateOfPublish;
    public Book(String name, int length, String author, String dateOfPublish){
        this.name=name;
        this.length=length;
        this.author=author;
        this.dateOfPublish=dateOfPublish;
    }

    @Override
    public int compareTo(Book b) {
        return this.name.compareTo(b.name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDateOfPublish() {
        return dateOfPublish;
    }

    public void setDateOfPublish(String dateOfPublish) {
        this.dateOfPublish = dateOfPublish;
    }
}
