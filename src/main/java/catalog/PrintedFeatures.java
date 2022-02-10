package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature {

    private String title;
    private int numberOfPages;
    private List<String> authors = new ArrayList<>();



    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        if (title == null || title == "" ) {
            throw new IllegalArgumentException("Empty title");
        }
        if ( authors == null || authors.size() == 0 || numberOfPages <= 0 ) {
            throw new IllegalArgumentException("No contributor was provided or number of pages is not correct!");
        }
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public List<String> getContributors() {
        return authors;
    }
}
