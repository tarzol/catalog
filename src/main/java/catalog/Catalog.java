package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    public List<CatalogItem>  catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem) {
        catalogItems.add(catalogItem);
    }

    public void deleteItemByRegistrationNumber(String item) {
        for ( int i = 0; i < catalogItems.size(); i++) {
            if (catalogItems.get(i).getRegistrationNumber().equals(item)) {
                catalogItems.remove(i);
            }
        }
    }

    public List<CatalogItem> CatalogItems() {
        return catalogItems;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for ( CatalogItem actual : catalogItems ) {
            for ( Feature actualFeature : actual.getFeatures()) {
                if ( actualFeature instanceof  AudioFeatures ) {
                    result.add(actual);
                }
            }
        }
        return result;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem actual : catalogItems ) {
            for ( Feature actualFeature : actual.getFeatures()) {
                if (actualFeature instanceof PrintedFeatures) {
                    result.add(actual);
                }
            }
        }
        return result;
    }

    public int getAllPageNumber() {
        int allPages = 0;
        for ( CatalogItem actualItem : catalogItems ) {
            for ( Feature actualFeature : actualItem.getFeatures() ) {
                if ( actualFeature instanceof PrintedFeatures ) {
                    allPages += ((PrintedFeatures) actualFeature).getNumberOfPages();
                }
            }
        }
        return allPages;
    }

    public int getFullLength() {
        int fullLength = 0;
        for ( CatalogItem actualItem : catalogItems ) {
            for ( Feature actualFeature : actualItem.getFeatures() ) {
                if ( actualFeature instanceof AudioFeatures ) {
                    fullLength += ((AudioFeatures) actualFeature).getLength();
                }
            }
        }
        return fullLength;
    }

    public double averagePageNumberOver(int number) {
        int numberOfAllPages = 0;
        int numberOfPrinted = 0;
        if (number <= 0 ) {
            throw new IllegalArgumentException("Page number must be positive");
        }

        for ( CatalogItem actualItem : catalogItems) {
            for (Feature actual : actualItem.getFeatures()) {
                if (actual instanceof PrintedFeatures && ((PrintedFeatures) actual).getNumberOfPages() > number) {
                    numberOfPrinted++;
                    numberOfAllPages += ((PrintedFeatures) actual).getNumberOfPages();
                }
            }
        }
        if ( (numberOfPrinted - 0) < 0.000000001 ) {
            throw new IllegalArgumentException("No page");
        }
        return numberOfAllPages / (double)numberOfPrinted;
    }


    public void createByContributor(String contributor) {

    }
    public void createByTitle(String title) {

    }

    public List<CatalogItem> findByCriteria(SearchCriteria actual) {
        List<CatalogItem> result = new ArrayList<>();
        return result;
    }
}
