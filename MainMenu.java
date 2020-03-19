package ro.fasttrackit.H14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {

    private final QuoteService service;

    public MainMenu(QuoteService service) {
        this.service = service;
    }

    public void run() {
        int input;
        do {
            printMainMenu();
            input = getInput();
            executeInput(input);
        } while (input != 0);


    }

    private void printMainMenu() {

        System.out.println("===========================================");
        System.out.println("1)Get all Quotes");
        System.out.println("2)Get quotes for Author");
        System.out.println("3)Get all Authors");
        System.out.println("4)Set favorite Quote");
        System.out.println("5)Get favorite Quote");
        System.out.println("6)Random Quote");
        System.out.println("0) Exit");
        System.out.println("============================================");


    }


    private int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your Option");
        return scanner.nextInt();
    }

    private void executeInput(int input) {
        switch (input) {

            case 1:
                handleGetAllQuotes();
                break;
            case 2:
                handleGetQuotesForAuthor();
                break;
            case 3:
                handleGetAllAuthors();
                break;
            case 4:
                handleSetFavQuote();
                break;
            case 5:
                seeFavouriteQuote();
                break;
            case 6:
                handleRandomQuote();
            case 0:
                break;
            default:
                System.out.println("Invalid Input");

        }


    }

    private void handleGetAllQuotes() {
        for (String quotes : service.getAllQuotes()) {
            System.out.println(quotes);
        }


    }

    private void handleGetQuotesForAuthor() {
        System.out.println("Name the author ! ! ! ");
        String author = new Scanner(System.in).nextLine();
        List<Quote> quotes = service.getQuotesForAuthor(author);
        for (Quote quote : quotes) {
            System.out.println(quote.getQuote());
        }

    }

    private void handleGetAllAuthors() {
        for (String authors : service.getAuthors()) {
            System.out.println(authors);
        }
    }

    private void handleRandomQuote() {
        System.out.println(service.getRandomQuote());

    }

    private void handleSetFavQuote() {

        System.out.println("What's your favorite quote ?");
        int fav = new Scanner(System.in).nextInt();
        service.setFavourite(fav);
        System.out.println("Quote " + fav + "was set to favorite !");


    }

    private void seeFavouriteQuote(){
        List<Quote> quotes= service.getFavorites();
        for (Quote quote:quotes){
            System.out.println(quote);
        }
    }


}
