package inheritance;

public class Review
{
    protected String body;
    protected String author;
    protected double stars;

    // Constructors

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

    @Override
    public String toString()
    {
        StringBuilder outputMessage = new StringBuilder();

        outputMessage
                .append("Review: ").append(getBody()).append("\n")
                .append("Author: ").append(getAuthor()).append("\n")
                .append("Stars: ").append(getStars()).append("\n");

        return outputMessage.toString();
    }
}
