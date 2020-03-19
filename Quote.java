package ro.fasttrackit.H14;


import java.util.Objects;

public class Quote {

    private final int id;
    private final String Author;
    private final String quote;
    private boolean favorites;

    public Quote(int id, String Author, String quote) {
        this.id = id;
        this.Author = Author;
        this.quote = quote;
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

    public boolean isFavorites() {
        return favorites;
    }

    public void setFavorites(boolean favorites) {
        this.favorites = favorites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quote quote1 = (Quote) o;
        return id == quote1.id &&
                Objects.equals(Author, quote1.Author) &&
                Objects.equals(quote, quote1.quote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Author, quote);
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", Author='" + Author + '\'' +
                ", quote='" + quote + '\'' +
                ", favorites=" + favorites +
                '}';
    }
}
