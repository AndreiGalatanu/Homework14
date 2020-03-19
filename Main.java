package ro.fasttrackit.H14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
   /*     QuoteReader reader= new QuoteReader();
       List<Quote> authors= reader.readFile("quotes.txt");

       QuoteService a= new QuoteService(authors);
        System.out.println(a.getQuotes());

    Quote quote= new Quote("author","ss");
        System.out.println(quote);

        System.out.println("====================================================");

        System.out.println(a.getQuotesForAuthor("Buddha"));


    }
*/
        System.out.println(new File(".").getAbsolutePath());
    QuoteReader reader= new QuoteReader("quotes.txt");
    QuoteService service=new QuoteService(reader.readFile());
    MainMenu menu= new MainMenu(service);
    menu.run();




    }


}