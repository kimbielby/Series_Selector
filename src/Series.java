public class Series {

    private String seriesName;
    private int numOfCompletedSeasons;
    // private boolean canViewIncompleteSeason;
    // private String locationFilmed;
    // private String locationSet;
    // private String medium;
//    private String description;
//    private boolean seriesFinished;
//    private boolean anySeasonsOwned;
//    private boolean favouriteSeries;
//    private Object genre;
//    // private Object seasonNum;
//    private Object mainActors;

    public Series(String name, int numSeasons){
        this.seriesName=name;
        this.numOfCompletedSeasons=numSeasons;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public int getNumOfCompletedSeasons(){
        return numOfCompletedSeasons;
    }
}
