import java.util.ArrayList;
import java.util.List;

public class Gallery {
    private String name;
    private String location;
    private List<Artwork> artworks;

    public Gallery(String name, String location) {
        this.name = name;
        this.location = location;
        this.artworks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Artwork> getArtworks() {
        return artworks;
    }

    public void addArtwork(Artwork artwork) {
        if (artwork != null) {
            artworks.add(artwork);
        }
    }

    public void removeArtwork(String title) {
        artworks.removeIf(artwork -> artwork.getTitle().equals(title));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Gallery: ").append(name).append(" located at ").append(location).append("\nArtworks:\n");
        for (Artwork artwork : artworks) {
            sb.append(artwork.toString()).append("\n");
        }
        return sb.toString();
    }
}
