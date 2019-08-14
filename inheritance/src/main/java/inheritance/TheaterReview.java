package inheritance;

public class TheaterReview extends Review
{
    Theater theater;
    String movie;

    // Constructors

    public TheaterReview(String body, String author, double stars, Theater theater)
    {
        super(body, author, stars);
        this.theater = theater;
    }

    public TheaterReview(String body, String author, double stars, Theater theater, String movie)
    {
        super(body, author, stars);
        this.theater = theater;
        this.movie = movie;
    }

    // Getters

    public String getTheaterName()
    {
        return theater.getName();
    }

    public String getMovieName()
    {
        return theater.getMovie(0);
    }

    // Setters

    public void setTheater(Theater newTheater)
    {
        this.theater = newTheater;
    }

    public void setMovie(String newMovie) { this.movie = newMovie; }

    @Override
    public String toString()
    {
        StringBuilder outputMessage = new StringBuilder();

        outputMessage.append("Theater name: ").append(getTheaterName()).append("\n");

        if (movie != null)
        {
            outputMessage.append("Movie name: ").append(getMovieName()).append("\n");
        }

        outputMessage
                .append("Review: ").append(getBody()).append("\n")
                .append("Author: ").append(getAuthor()).append("\n")
                .append("Stars: ").append(getStars()).append("\n");

        return outputMessage.toString();
    }
}
