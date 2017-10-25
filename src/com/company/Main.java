package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        NewsPaper newNewsPaper = new NewsPaper();
        Article newArticle = new Article();
        ArrayList<Article> articles = new ArrayList<>();
        ArrayList<NewsPaper> newsPaper1 = new ArrayList<>();
        int count = 0;
        String answer= "yes ";

            System.out.print("enter brandName :");
            newNewsPaper.setBrand(keyboard.nextLine());

            do {

                System.out.println("enter title :");
                newArticle.setTitle(keyboard.nextLine());

                System.out.println("enter date as (DD/MM/YYYY):");
                newArticle.setDate(keyboard.nextLine());

                System.out.println("do you want to enter title(y/n)");
                answer = keyboard.nextLine();
            while(answer.equalsIgnoreCase("yes")){
                   System.out.println("enter the title:");
                   answer = keyboard.nextLine();
                   System.out.println("enter the date:");
                   answer= keyboard.nextLine();

               }
                //System.out.println(" print details:" +newArticle.getTitle()+ " " +newArticle.getDate());

            }while(count == 3);
            count= count+1;

            for(Article eacharticles : articles) {
            System.out.println(" print Article Name:" + eacharticles.getTitle());
            System.out.println(" print Article date:" + eacharticles.getDate());
            count = count + 1;
        }
        System.out.println("NewsPaper Name: "        + newNewsPaper.getBrand());
        System.out.println("Article Name: "          + newArticle.getTitle());
        System.out.println("Article published date:" + newArticle.getDate());

    }
}
