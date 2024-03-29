package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant
{
    String name;
    double stars;
    int priceCategory;
    List<RestaurantReview> reviews = new ArrayList<>();

    // Constructors

    public Restaurant() {}

    public Restaurant(String name, double stars, int priceCategory)
    {
        this.name = name;
        this.stars = stars;
        this.priceCategory = priceCategory;
    }

    // Getters

    public String getName()
    {
        return name;
    }

    public double getStars()
    {
        return stars;
    }

    public int getPriceCategory()
    {
        return priceCategory;
    }

    // Setters

    public void setName(String newName)
    {
        this.name = newName;
    }

    public void setStars(double newStars)
    {
        this.stars = newStars;
    }

    public void setPriceCategory(int newPriceCategory)
    {
        this.priceCategory = newPriceCategory;
    }

    // Functionality

    public void addReview(RestaurantReview review)
    {
        if (!reviews.contains(review))
        {
            this.reviews.add(review);
            review.setRestaurant(this);
            this.stars = calculateStars();
        }
    }

    public double calculateStars()
    {
        double sum = 0.0;

        for(RestaurantReview review : reviews)
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
                .append("Restaurant name: ").append(getName()).append("\n")
                .append("Stars: ").append(getStars()).append("\n")
                .append("Price Category: ").append(getPriceCategory()).append("\n")
                .append("Reviews: ").append(this.reviews).append("\n");

        return outputMessage.toString();
    }
}

// Resources
// https://www.geeksforgeeks.org/classes-objects-java/
// https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
// https://www.w3schools.com/java/java_arraylist.asp
