package ro.fasttrackit.H14;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        QuotesReader reader= new QuotesReader();

        List<Quote> Authors= reader.readFile(quotes.txt);
        System.out.println(Authors);
    }
}
