import java.util.ArrayList;

public class SeriesSelector {

    private Series series;

    // Creates new series object
    public SeriesSelector(String seriesName, int numOfCompleteSeasons, String seriesMedium){
        series = new Series(seriesName, numOfCompleteSeasons, seriesMedium);
    }

    // Fetches and returns the name of the series
    public String getSeriesName(){
        return series.getSeriesName();
    }

    // Fetches and returns the number of complete seasons in the series
    public int getNumOfCompleteSeasons(){
        return series.getNumOfCompletedSeasons();
    }

    // Fetches and returns the medium of the series
    public String getSeriesMedium(){
        return series.getSeriesMedium();
    }
}
