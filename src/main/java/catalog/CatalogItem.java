package catalog;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CatalogItem {


    private String registrationNumber;
    private int price;
    private List<Feature> features = new ArrayList<>();

    public CatalogItem(String registrationNumber, int price, Feature... features) {

        this.registrationNumber = registrationNumber;
        this.price = price;
        this.features = List.of(features);
    }

//
//    híváskor:  (az elemek fel vannak sorolva, ezért kell őket tö,bként kezelni (Feature... features)
//          CatalogItem catalogItem = new CatalogItem("R-1", 300,
//            new AudioFeatures("Night Visions", 185, Arrays.asList("Dan Raynolds"), Arrays.asList("Imagine Dragons")),
//            new PrintedFeatures("Harry Potter", 600, Arrays.asList("J.K. Rowling")),
//            new AudioFeatures("Piece of Mind", 200, Arrays.asList("Steve Harris"), Arrays.asList("Iron Maiden"))
//    );
//    konstruktorban
//          public CatalogItem(String registrationNumber, int price, Feature... features) {
//              this.registrationNumber = registrationNumber;
//              this.price = price;
//              this.features = List.of(features);
//          }


    public int numberOfPagesAtOneItem() {
        int pages = 0;
        for (Feature actualFeature : features) {
            if (actualFeature instanceof PrintedFeatures) {
                pages += ((PrintedFeatures) actualFeature).getNumberOfPages();
            }
        }
        return pages;
    }

    public  int fullLengthAtOneItem() {
        int fullLength = 0;
        for (Feature actualFeature : features ) {
            if (actualFeature instanceof AudioFeatures ) {
                fullLength += ((AudioFeatures) actualFeature).getLength();
            }
        }
        return fullLength;
    }

    public boolean hasAudioFeature() {
        for (Feature actualFeature : features ) {
            if ( actualFeature instanceof AudioFeatures ) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature() {
        for (Feature actualFeature : features ) {
            if ( actualFeature instanceof PrintedFeatures ) {
                return true;
            }
        }
        return false;
    }

    public List<String> getContributors() {
        List<String> result = new ArrayList<>();
        for (Feature actualFeature : features ) {
            result.addAll(actualFeature.getContributors());
        }
        return result;
    }


    public List<String> getTitles() {
        List<String> result = new ArrayList<>();
        for (Feature actualFeature : features ) {
            result.add(actualFeature.getTitle());
        }
        return result;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
