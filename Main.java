package ro.fasttrackit.H14;

import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        QuotesReader reader= new QuotesReader();
       List<Quote> authors= reader.readFile("quotes.txt");

       QuoteService a= new QuoteService(authors);
        System.out.println(a.getQuotes());

    Quote quote= new Quote("author","ss");
        System.out.println(quote);

        System.out.println("====================================================");

        System.out.println(a.getQuotesForAuthor("Buddha"));


    }

}
