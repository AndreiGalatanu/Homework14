package ro.fasttrackit.H14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteService {
    private final List<Quote> quotes;

    public QuoteService(List<Quote> quotes) {
        this.quotes = quotes == null ? new ArrayList<>() : new ArrayList<>(quotes);
    }


    public List<String> getAllQuotes() {
        List<String> result = new ArrayList<>();
        for (Quote quote : quotes) {
            result.add(quote.getQuote());

        }
        return result;

    }

    public List<Quote> getQuotesForAuthor(String author) {
        List<Quote> result = new ArrayList<>();
        for (Quote quote : quotes) {
            if (quote.getAuthor().equalsIgnoreCase(author.trim())) {
                result.add(quote);
            }

        }
        return result;
    }


    public List<String> getAuthors() {
        List<String> authors = new ArrayList<>();
        for (Quote quote : quotes) {
            authors.add(quote.getAuthor());
        }
        return authors;
    }

    public void setFavourite(int id) {
        Quote quote = getById(id);
        if (quote != null) {
            quote.setFavorites(true);
        }
    }

    public Quote getById(int id) {
        for (Quote quote : quotes) {
            if (quote.getId() == id) {
                return quote;
            }
        }
        return null;
    }

    public List<Quote> getFavorites() {
        List<Quote> result = new ArrayList<>();
        for (Quote quote : quotes) {
            if (quote.isFavorites()) {
                result.add(quote);
            }
        }
        return result;

    }

    public Quote getRandomQuote(){

        int randomId=new Random().nextInt(quotes.size());
        return getById(randomId);

    }


}


