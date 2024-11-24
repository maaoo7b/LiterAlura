package com.gutendex.gutendex.main;

import com.gutendex.gutendex.model.GeneralData;
import com.gutendex.gutendex.service.APIConsumption;
import com.gutendex.gutendex.service.ConvertData;

import java.util.Scanner;

public class Main {

    private Scanner sc = new Scanner(System.in);
    private APIConsumption apiConsumption = new APIConsumption();
    private final String BASE_URL = "https://gutendex.com/books/";
    private ConvertData converter = new ConvertData();


    public void startApp() {

        System.out.println("Welcome to LiterAlura");
        var option = -1;
        var menu = """
                1) Search book by title
                0) Exit
                """;
        while (option != 0) {
            System.out.println(menu);
            option=sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    searchBookByTitle();
                    break;
                case 0:
                    System.out.println("Exiting app, bye!!!");
                    break;
            }
        }
    }

    private void searchBookByTitle() {
        System.out.println("Type the book's title to search:");
        var bookTitle = sc.nextLine();
        var json = apiConsumption.getData(BASE_URL + "?search=" + bookTitle.replace(" ", "%20"));
        System.out.println(json);
        var data = converter.getData(json, GeneralData.class);
        System.out.println(data);
    }
}
