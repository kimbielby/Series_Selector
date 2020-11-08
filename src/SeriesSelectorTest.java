import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class SeriesSelectorTest {
    private SeriesSelector seriesSelector;

    @Before

    public void setup (){
        seriesSelector = new SeriesSelector("Alias", 6);
    }

    @Test
    public void seriesNameTest(){
        assertTrue("Series name is incorrect", seriesSelector.getSeriesName().equals("Alias"));
    }

    @Test
    public void numOfSeasonsTest(){
        assertTrue("Number of seasons are incorrect", seriesSelector.getNumOfCompleteSeasons() == 6);
    }
}
