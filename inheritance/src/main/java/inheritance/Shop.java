package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop
{
    String name;
    String description;
    double stars;
    int priceCategory;
    List<ShopReview> reviews = new ArrayList<>();

    // Constructors

    public Shop() {}

    public Shop(String name, String description, double stars, int priceCategory)
    {
        this.name = name;
        this.description = description;
        this.stars = stars;
        this.priceCategory = priceCategory;
    }

    // Getters

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public double getStars() { return stars;}

    public int getPriceCategory()
    {
        return priceCategory;
    }

    // Setters

    public void setName(String newName)
    {
        this.name = newName;
    }

    public void setDescription(String newDescription)
    {
        this.description = newDescription;
    }

    public void setStars(double newStars) { this.stars = newStars;}

    public void setPriceCategory(int newPriceCategory)
    {
        this.priceCategory = newPriceCategory;
    }

    // Functionality

    public void addReview(ShopReview review)
    {
        if (!reviews.contains(review))
        {
            this.reviews.add(review);
            review.setShop(this);
            this.stars = calculateStars();
        }
    }

    public double calculateStars()
    {
        double sum = 0.0;

        for(ShopReview review : reviews)
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
                .append("Shop name: ").append(getName()).append("\n")
                .append("Stars: ").append(getStars()).append("\n")
                .append("Price Category: ").append(getPriceCategory()).append("\n")
                .append("Reviews: ").append(this.reviews).append("\n");

        return outputMessage.toString();
    }
}
