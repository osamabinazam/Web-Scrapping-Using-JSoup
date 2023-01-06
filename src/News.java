public class News {
    String headline;
    String fullnews;
    News next;

    public String getFullnews() {
        return fullnews;
    }

    public void setFullnews(String fullnews) {
        this.fullnews = fullnews;
    }

    public News getNext() {
        return next;
    }

    public void setNext(News next) {
        this.next = next;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    News(String headline, String fullnews) {
        this.headline = headline;
        this.fullnews = fullnews;
    }
}
