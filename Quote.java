package ro.fasttrackit.H14;

import java.util.Objects;

public class Quote {

    private final int id;
    private final String Author;
    private final String quote;
    boolean favorite;


    public Quote(int id, String author, String quote, boolean favorite) {
        this.id = id;
        Author = author;
        this.quote = quote;
        this.favorite = favorite;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return Author;
    }

    public String getQuote() {
        return quote;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quote quote1 = (Quote) o;
        return id == quote1.id &&
                favorite == quote1.favorite &&
                Objects.equals(Author, quote1.Author) &&
                Objects.equals(quote, quote1.quote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Author, quote, favorite);
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", Author='" + Author + '\'' +
                ", quote='" + quote + '\'' +
                ", favorite=" + favorite +
                '}';
    }
}
