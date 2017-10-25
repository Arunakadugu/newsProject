package com.company;

import java.util.ArrayList;

public class NewsPaper {
    private String brand;
   // private String articleMore;
    private ArrayList<Article> article;
    public   NewsPaper(){
        articles = new ArrayList<Article>();
    }
//    public String getArticleMore() {
//        return articleMore;
//    }

//    public void setArticleMore(String articleMore) {
//        this.articleMore = articleMore;
//    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }


    ArrayList<Article> articles = new ArrayList<>();
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void addArticle(Article anArticle)
    {
        article.add(anArticle);
    }

}
