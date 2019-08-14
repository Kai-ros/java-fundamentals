package inheritance;

public class RestaurantReview extends Review
{
    Restaurant restaurant;

    // Constructor

    public RestaurantReview(String body, String author, double stars, Restaurant restaurant)
    {
        super(body, author, stars);
        this.restaurant = restaurant;
    }

    // Getters

    public String getRestaurantName()
    {
        return restaurant.getName();
    }

    // Setters

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
