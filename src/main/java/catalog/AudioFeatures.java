package catalog;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AudioFeatures implements Feature {

    private String title;
    private int length;
    private List<String> contributors = new ArrayList<>();
    private List<String> performers = new ArrayList<>();

    public AudioFeatures(String title, int length, List<String> contributors) {
        if ( title == null || title == "") {
            throw new IllegalArgumentException("The title cannot be empty!");
        }
        this.title = title;
        if (length <= 0 ) {
            throw new IllegalArgumentException("The length of the song is not correct!");
        }
        this.length = length;
        this.contributors = contributors;
    }

    public AudioFeatures(String title, int length, List<String> contributors, List<String> performers) {
        if ( title == null || title == "") {
            throw new IllegalArgumentException("The title cannot be empty!");
        }
        this.title = title;
        if (length <= 0 ) {
            throw new IllegalArgumentException("The length of the song is not correct!");
        }
        this.length = length;
        this.contributors = contributors;
        this.performers = performers;
    }

    @Override
    public List<String> getContributors() {
        List<String> allContributors = new ArrayList<>();
        allContributors.addAll(performers);
        allContributors.addAll(contributors);
        return allContributors;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
}
