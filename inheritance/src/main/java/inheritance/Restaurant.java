package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant
{
    String name;
    int stars;
    int priceCategory;
    List<Review> reviews = new ArrayList<>();

    public Restaurant() {}

    public Restaurant(String name, int stars, int priceCategory)
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

    public int getStars()
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

    public void setStars(int newStars)
    {
        this.stars = newStars;
    }

    public void setPriceCategory(int newPriceCategory)
    {
        this.priceCategory = newPriceCategory;
    }

    public void addReview(Review review)
    {
        if (!reviews.contains(review))
        {
            this.reviews.add(review);
            review.setRestaurant(this);
            this.stars = review.stars;
        }
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
