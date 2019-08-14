package inheritance;

public class Review
{
    String body;
    String author;
    double stars;
    Restaurant restaurant;

    public Review() {}

    public Review(String body, String author, double stars)
    {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    // Getters

    public String getBody()
    {
        return body;
    }

    public String getAuthor()
    {
        return author;
    }

    public double getStars()
    {
        return stars;
    }

    public String getRestaurantName()
    {
        return restaurant.getName();
    }

    // Setters

    public void setBody(String newBody)
    {
        this.body = newBody;
    }

    public void setAuthor(String newAuthor)
    {
        this.author = newAuthor;
    }

    public void setStars(double newStars)
    {
        this.stars = newStars;
    }

    public void setRestaurant(Restaurant newRestaurant)
    {
        this.restaurant = newRestaurant;
    }

    @Override
    public String toString()
    {
        StringBuilder outputMessage = new StringBuilder();

        outputMessage
                .append("Restaurant name: ").append(getRestaurantName()).append("\n")
                .append("Review: ").append(getBody()).append("\n")
                .append("Author: ").append(getAuthor()).append("\n")
                .append("Stars: ").append(getStars()).append("\n");

        return outputMessage.toString();
    }
}
