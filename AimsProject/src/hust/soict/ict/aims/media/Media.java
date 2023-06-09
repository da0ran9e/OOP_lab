package hust.soict.ict.aims.media;

public class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    public Media(String title){
        this.title = title;
    }
    public Media(String title, String category){
        this(title);
        this.category = category;
    }
    public Media(String title, String category, float cost){
        this(title, category);
        this.cost = cost;
    }
    public Media(int id, String title, String category, float cost){
        this(title, category, cost);
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public boolean isMatch(String keywords) {
        String[] words = keywords.toLowerCase().split("\\s+");
		for (String word : words) {
			if (this.getTitle().toLowerCase().contains(word)) {
				return true;
			}
		}
		return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Media) {
            Media media = (Media) obj;
            return this.getTitle().equals(media.getTitle());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Media [id=" + id + ", title=" + title + ", category="
                + category + ", cost=" + cost + "]";
    }
}
