package inheritance;

public class ShopReview extends Review
{
    Shop shop;

    // Constructor

    public ShopReview(String body, String author, double stars, Shop shop)
    {
        super(body, author, stars);
        this.shop = shop;
    }

    // Getters

    public String getShopName()
    {
        return shop.getName();
    }

    // Setters

    public void setShop(Shop newShop)
    {
        this.shop = newShop;
    }


    @Override
    public String toString()
    {
        StringBuilder outputMessage = new StringBuilder();

        outputMessage
                .append("Shop name: ").append(getShopName()).append("\n")
                .append("Review: ").append(getBody()).append("\n")
                .append("Author: ").append(getAuthor()).append("\n")
                .append("Stars: ").append(getStars()).append("\n");

        return outputMessage.toString();
    }
}
