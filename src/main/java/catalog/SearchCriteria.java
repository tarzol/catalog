package catalog;

import java.util.List;

final  class SearchCriteria {

    private String title;
    private String author;


    public SearchCriteria getContributor() {
        return null;
    }

    public static SearchCriteria createByContributor(String contributor) {
        return null;
    }


    public static SearchCriteria createByTitle(String title) {

        return null;
    }


    public static SearchCriteria createByBoth(String... title) {
        return null;
    }

    public boolean hasTitle() {
        return false;    }

    public boolean hasContributor() {
        return false;    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
