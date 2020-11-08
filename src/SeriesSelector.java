import java.util.ArrayList;

public class SeriesSelector {

    private Series series;


    public SeriesSelector(String seriesName, int numOfCompleteSeasons){
        series = new Series(seriesName, numOfCompleteSeasons);
    }

    public String getSeriesName(){
        return series.getSeriesName();
    }

    public int getNumOfCompleteSeasons(){
        return series.getNumOfCompletedSeasons();
    }
}
