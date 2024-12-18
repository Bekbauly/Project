public class Artwork {
    private String title;
    private String artist;
    private int year;
    private String medium;
    private double price;

    public Artwork(String title, String artist, int year, String medium, double price) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.medium = medium;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Artwork: '" + title + "' by " + artist + " (" + year + ") [" + medium + "] - $" + price;
    }
}
