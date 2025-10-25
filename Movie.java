
public class Movie {
    String title, genre, leadActor, director, review;
    int releaseYear;
    double rating;
    
    void display(){
        System.out.println("Title: " + title+ " Genre: " + genre+ " Lead Actor: " + leadActor+ " Director: " + director+" Release Year: " + releaseYear+" Rating: " + rating+
        " Review: " + review);
    }
    Movie(String title,String genre,String leadActor,String director,int releaseYear,double rating){
        this.title = title;
        this.genre = genre;
        this.leadActor = leadActor;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;

             if (rating < 5) {
            this.review = "Not Good";
        } else {
            this.review = "Good";
        }
    }
    public static void main(String[] args) {
        
        Movie m1 = new Movie("Final Destination Bloodline", "Horror", "Kaitlyn Santa Juana", "Zach Lipovsky", 2025, 6.7);
        Movie m2 = new Movie("My Oxford Year", "Romance", "Corey Mylchreest", "Iain Morris", 2025, 4.9);

       
        m1.display();
        m2.display();
    }
}

