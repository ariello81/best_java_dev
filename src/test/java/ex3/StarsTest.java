package ex3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StarsTest {

    Stars stars;

    @Before
    public void beforeTest(){
        stars = new Draw();
    }

    @Test
    public void drawSquare1Test(){
        //is
        int n = 2;
        //when
        String square = stars.drawSquare(n);
        //expected
        String expected =
                "**\n" +
                "**";
        Assert.assertEquals(square, expected);

    }

    @Test
    public void drawSquare2Test(){
        //is
        int n = 10;
        //when
        String square = stars.drawSquare(n);
        //expected
        String expected =
                        "**********\n" +
                        "**********\n" +
                        "**********\n" +
                        "**********\n" +
                        "**********\n" +
                        "**********\n" +
                        "**********\n" +
                        "**********\n" +
                        "**********\n" +
                        "**********";
        Assert.assertEquals(square, expected);
    }

    @Test
    public void testDrawSquare() {
        //given
        int n = 4;
        //is
        String square = stars.drawSquare(n);
        //expected
        String expected = "****\n****\n****\n****";
        Assert.assertEquals(square, expected);
    }

    @Test
    public void drawRectangle1Test(){
        //is
        final int n = 2;
        final int m = 5;
        //when
        final String result = stars.drawRectangle(n, m);
        //expected
        final String rectangle = "**\n**\n**\n**\n**";
        Assert.assertEquals(result, rectangle);
    }

    @Test
    public void drawRectangle2Test(){
        //is
        final int n = 6;
        final int m = 3;
        //when
        final String result = stars.drawRectangle(n, m);
        //expected
        final String rectangle = "******\n******\n******";
        Assert.assertEquals(result, rectangle);
    }

    @Test
    public void testDrawRectangle() {
        //given
        final int n = 3;
        final int m = 4;
        //is
        final String result = stars.drawRectangle(n, m);
        //expected
        final String RECTANGLE = "***\n***\n***\n***";
        Assert.assertEquals(result, RECTANGLE);
    }

        @Test
    public void drawIsoscalesTriangle1Test(){
        //given
        final int n = 2;
        //is
        final String result = stars.drawIsoscelesTriangle(n);
        //expected
            final String triangle = "-*\n***";
            Assert.assertEquals(triangle, result);
    }

    @Test
    public void drawIsoscalesTriangle2Test(){
        //given
        final int n = 5;
        //is
        final String result = stars.drawIsoscelesTriangle(n);
        //expected
        final String triangle = "----*\n---***\n--*****\n-*******\n*********";
        Assert.assertEquals(triangle, result);
    }

    @Test
    public void testDrawIsoscelesTriangle() {
        //given
        final int n = 4;
        //is
        final String result = stars.drawIsoscelesTriangle(n);
        //expected
        final String triangle =
                "---*\n" +
                        "--***\n" +
                        "-*****\n" +
                        "*******";
        Assert.assertEquals(triangle, result);
    }

    @Test
    public void drawDiamond1Test(){
        //given
        int n = 3;
        //is
        String result = stars.drawDiamond(n);
        //expected
        String expected = "-*\n***\n-*";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void drawDiamond2Test(){
        //given
        int n = 5;
        //is
        String result = stars.drawDiamond(n);
        //expected
        String expected = "--*\n-***\n*****\n-***\n--*";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testDrawDiamond() {
        //given
        final int n = 7;
        //is
        final String result = stars.drawDiamond(n);
        //expected
        final String expected =
                "---*\n" +
                        "--***\n" +
                        "-*****\n" +
                        "*******\n" +
                        "-*****\n" +
                        "--***\n" +
                        "---*";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void drawRectangleTriangle1Test(){
        //given
        int n = 2;
        //is
        String result = stars.drawRectangleTriangle(n);
        //expected
        String triangle = "*\n**";
        Assert.assertEquals(triangle, result);
    }

    @Test
    public void drawRectangleTriangle2Test(){
        //given
        int n = 5;
        //is
        String result = stars.drawRectangleTriangle(n);
        //expected
        String triangle = "*\n**\n***\n****\n*****";
        Assert.assertEquals(triangle, result);
    }

    @Test
    public void testDrawRectangleTriangle() {
        //given
        final int n = 6;
        //is
        final String result = stars.drawRectangleTriangle(n);
        //expected
        final String triangle =
                "*\n" +
                        "**\n" +
                        "***\n" +
                        "****\n" +
                        "*****\n" +
                        "******";
        Assert.assertEquals(triangle, result);
    }

    }
