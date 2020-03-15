package ro.fasttrackit.H14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuoteService {
    private final List<Quote> quotes;

    public QuoteService(List<Quote> quotes) {
        this.quotes = new ArrayList<>();
    }




    public List<String> getQuotes() {
        List<String> result = new ArrayList<>();
        for (Quote quote : quotes) {
            result.add(quote.getQuote());

        }
        return result;

    }
    public List<String> getQuotesForAuthor(String authorName){
        List<String> result= new ArrayList<>();
        for (Quote quote:quotes){
            if (quote.getAuthor().equals(authorName)){
                result.add(quote.getQuote());
            }

        }
        return result;
    }

    public List<String> getAuthors() {
        List<String> result = new ArrayList<>();
        for (Quote authors : quotes) {
            result.add(authors.getAuthor());
        }
        return result;
    }

}



