package ro.fasttrackit.H14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QuotesReader {
    public List<Quote> readFile(String fileLocation) throws FileNotFoundException {

       Scanner scanner =new Scanner(new FileReader(fileLocation));
       List<Quote> author= new ArrayList<>();
       while(scanner.hasNextLine()){
           Quote quote= fetchQuote(scanner.nextLine());
           author.add(quote);

       }


       return author;


    }

    private Quote fetchQuote(String line) {
        String[] tokens = line.split("[~]");
        System.out.println(Arrays.toString(tokens));
        return new Quote( tokens[0], tokens[1]);

    }
}
