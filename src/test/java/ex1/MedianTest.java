package ex1;

import ex1.Median;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MedianTest {

    Median median;

    @Before
    public void BeforeTest(){
        median = new Median();
    }

    @Test
    public void firstMedianTest() {
        //is
        float numbers[] = {-2.1f, -.7f, 1.5f, .0f, 136.5f, 4.0f, .3f, 800.3f};
        //when
        float result = median.median(numbers);
        //expected
        Assert.assertEquals(.15f, result, 0);
    }


    @Test
    public void secondMedianTest() {
        //is
        float numbers[] = {100.001f, 102.03f, -23.4f, -17.8f, 400.0f};
        //when
        float result = median.median(numbers);
        //expected
        Assert.assertEquals(100.001f, result, 0);
    }


        @Test
    public void thirdMedianTest(){
        //is
        float numbers[] = {-2004.5f, 0.0001f, -0.001f, -14894.1f};

        //when
        float result = median.median(numbers);

        //expected
        Assert.assertEquals(-1002.2505f, result, 0);
    }

    @Test
    public void fourthMedianTest() {
        //is
        float numbers[] = {.0f, -483.5f};
        //when
        float result = median.median(numbers);
        //expected
        Assert.assertEquals(-241.75f, result, 0);
    }
    @Test
    public void fifthMedianTest() {
        //is
        float numbers[] = {0.7f};
        //when
        float result = median.median(numbers);
        //expected
        Assert.assertEquals(.7f, result, 0);
    }

}
