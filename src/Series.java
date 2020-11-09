public class Series {

    private String seriesName;
    private int numOfCompletedSeasons;
    // private boolean canViewIncompleteSeason;
    // private String locationFilmed;
    // private String locationSet;
    private String medium;
//    private String description;
//    private boolean seriesFinished;
//    private boolean anySeasonsOwned;
//    private boolean favouriteSeries;
//    private Object genre;
//    // private Object seasonNum;
//    private Object mainActors;

    public Series(String name, int numSeasons, String seriesMedium){
        this.seriesName=name;
        this.numOfCompletedSeasons=numSeasons;
        this.medium=seriesMedium;
    }

    // Returns the name of the series
    public String getSeriesName() {
        return seriesName;
    }

    // Returns the number of complete seasons in the series
    public int getNumOfCompletedSeasons(){
        return numOfCompletedSeasons;
    }

    // Returns the medium of the series
    public String getSeriesMedium(){
        return medium;
    }
}
