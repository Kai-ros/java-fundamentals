package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater
{
    String name;
    List<String> movieList = new ArrayList<>();
    double stars;
    List<TheaterReview> reviews = new ArrayList<>();

    // Constructors

    public Theater() {}

    public Theater(String name, List<String> movieList, double stars)
    {
        this.name = name;
        this.movieList = movieList;
        this.stars = stars;
    }

    // Getters

    public String getName()
    {
        return name;
    }

    public List<String> getMovieList() { return movieList; }

    public double getStars() { return stars;}

    // Setters

    public void setName(String newName)
    {
        this.name = newName;
    }

    public void setMovieList(List<String> newMovieList) { this.movieList = newMovieList; }

    public void setStars(double newStars) { this.stars = newStars;}

    // Functionality

    public void addMovie(String movieToAdd)
    {
        movieList.add(movieToAdd);
    }

    public void removeMovie(String movieToRemove)
    {
        movieList.remove(movieToRemove);
    }

    public String getMovie(int movieToGet)
    {
        return movieList.get(movieToGet);
    }

    public void addReview(TheaterReview review)
    {
        if (!reviews.contains(review))
        {
            this.reviews.add(review);
            review.setTheater(this);
            this.stars = calculateStars();
        }
    }

    public double calculateStars()
    {
        double sum = 0.0;

        for(TheaterReview review : reviews)
        {
            sum += review.getStars();
        }
        return sum/reviews.size();
    }

    @Override
    public String toString()
    {
        StringBuilder outputMessage = new StringBuilder();

        outputMessage
                .append("Theater name: ").append(getName()).append("\n")
                .append("Movie List: ").append(getMovieList()).append("\n")
                .append("Stars: ").append(getStars()).append("\n")
                .append("Reviews: ").append(this.reviews).append("\n");

        return outputMessage.toString();
    }
}
