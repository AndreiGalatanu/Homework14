package ro.fasttrackit.H14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuotesReader {
    public List<Quote> readFile(String filelocation) throws FileNotFoundException {

        Scanner scanner = new Scanner(new FileReader(filelocation));
        List<Quote> Authors = new ArrayList<>();
        while (scanner.hasNextLine()) {
            Quote quote = fetchQuote(scanner.nextLine());
            System.out.println(quote);
        }
        return Authors;


    }

    private Quote fetchQuote(String line) {
        String[] tokens = line.split("[~]");
        return new Quote(Integer.parseInt(tokens[0]), tokens[1], tokens[2], Boolean.parseBoolean(tokens[3]));
    }
}
