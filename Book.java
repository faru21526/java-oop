
package newpackage;


public class Book {

    
    String title;
    String author;
    int year ;
    
    private static String genre="Fiction";
    private static int totalBooks=0;
    
    public Book(String title,String author,int year){
        this.title=title;
        this.author=author;
        this.year=year;
        totalBooks++;         
    }
    
    public void displayDetails(){
        System.out.println("Title: "+title+" Author name: "+author+" Year: "+year+" Genre: "+genre);
    }
    
    public static int getTotalBooks(){
        return totalBooks;
        
    }
    public static void main(String[] args){
        Book s1=new Book("Harry Potter","J. K. Rowling",1991);
        Book s2=new Book("The Alchemist","Paulo Coelho",1988);
        Book s3=new Book("Nineteen Eighty-Four","Secker & Warburg",1949);
        
        
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
        
        System.out.println("Total num of books: "+Book.getTotalBooks());
        
        
        
        
    }
       
}
