package ro.fasttrackit.H14;

import java.util.Objects;

public class Quote {


    private final String Author;
    private final String quote;

    public Quote(String author, String quote) {
        Author = author;
        this.quote = quote;
    }

    public String getAuthor() {
        return Author;
    }

    public String getQuote() {
        return quote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quote quote1 = (Quote) o;
        return Objects.equals(Author, quote1.Author) &&
                Objects.equals(quote, quote1.quote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Author, quote);
    }

    @Override
    public String toString() {
        return "Quote{" +
                "Author='" + Author + '\'' +
                ", quote='" + quote + '\'' +
                '}';
    }
}
