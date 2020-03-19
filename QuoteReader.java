package ro.fasttrackit.H14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QuoteReader {


    private final String filePath;

    public QuoteReader(String filePath) {
        this.filePath = filePath;
    }

    public List<Quote> readFile() {

        List<Quote> result = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new FileInputStream(filePath));
            int id = 0;

            while (scanner.hasNextLine()) {
                result.add(fetchQuote(id++, scanner.nextLine()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        return result;

    }

    private Quote fetchQuote(int id, String line) {
        String[] tokens = line.split("[~]");
        System.out.println(Arrays.toString(tokens));
        return new Quote(id, tokens[0], tokens[1]);
    }
}
   /* public List<Quote> readFile(String fileLocation) throws FileNotFoundException {

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
    */