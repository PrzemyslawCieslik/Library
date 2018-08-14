package Library.data;

import java.util.Objects;

public class Publication {
    private int year;
    private String title;
    private String publisher;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    protected Publication(int year, String title, String publisher){
        setYear(year);
        setTitle(title);
        setPublisher(publisher);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publication)) return false;
        Publication that = (Publication) o;
        return getYear() == that.getYear() &&
                Objects.equals(getTitle(), that.getTitle()) &&
                Objects.equals(getPublisher(), that.getPublisher());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getYear(), getTitle(), getPublisher());
    }
}
