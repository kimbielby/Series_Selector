import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class SeriesSelectorTest {
    private SeriesSelector seriesSelector;

    // Creates new Series Selector Object before any tests are carried out
    @Before
    public void setup (){
        seriesSelector = new SeriesSelector("Alias", 6, "DVD");
    }

    // Tests that the series name is correct
    @Test
    public void seriesNameTest(){
        assertTrue("Series name is incorrect", seriesSelector.getSeriesName().equals("Alias"));
    }

    // Tests that the number of seasons is correct
    @Test
    public void numOfSeasonsTest(){
        assertTrue("Number of seasons are incorrect", seriesSelector.getNumOfCompleteSeasons() == 6);
    }

    // Tests that the medium of the series is correct
    @Test
    public void seriesMediumTest(){
        assertTrue("Medium is incorrect", seriesSelector.getSeriesMedium().equals("DVD"));
    }
}
