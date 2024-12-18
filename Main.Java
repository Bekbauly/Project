public class Main {
    public static void main(String[] args) {

        Artist artist1 = new Artist("Pablo Picasso", 1881, "Spanish");
        Artist artist2 = new Artist("Vincent van Gogh", 1853, "Dutch");

        Artwork artwork1 = new Artwork("The Weeping Woman", artist1.getName(), 1937, "Oil on canvas", 2000000);
        Artwork artwork2 = new Artwork("Starry Night", artist2.getName(), 1889, "Oil on canvas", 100000000);

        Gallery gallery = new Gallery("Modern Art Gallery", "New York");

        gallery.addArtwork(artwork1);
        gallery.addArtwork(artwork2);

        System.out.println(gallery);

        if (artwork1.getPrice() > artwork2.getPrice()) {
            System.out.println(artwork1.getTitle() + " is more expensive than " + artwork2.getTitle() + ".");
        } else {
            System.out.println(artwork2.getTitle() + " is more expensive than " + artwork1.getTitle() + ".");
        }


        artwork1.setPrice(2500000);
        System.out.println("Updated Price for " + artwork1.getTitle() + ": $" + artwork1.getPrice());

        gallery.removeArtwork("Starry Night");
        System.out.println("\nAfter removing 'Starry Night':");
        System.out.println(gallery);
    }
}
