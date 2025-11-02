
package stringpackage;

import java.util.Scanner;


public class Book {
   String title;
   String author;
   int year;
   static String genre="Horror"; 
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
    
    public static void main(String args[]){
        Book n[]=new Book[2];
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<2;i++){
            System.out.println("Enter details for the book: "+(i+1)+"");
            System.out.println("Enter title: ");
            String t=sc.nextLine();
            System.out.println("Enter Author name: ");
            String a=sc.nextLine();
            System.out.println("Enter year: ");
            int y=sc.nextInt();
            sc.nextLine();
            
            n[i]=new Book(t,a,y);
            
        }
        for(int i=0;i<2;i++){
            n[i].displayDetails();
        }
        System.out.println("Total num of Books: "+getTotalBooks());
    }
        
        
    }
    

