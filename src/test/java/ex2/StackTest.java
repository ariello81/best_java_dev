package ex2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

    @Test
    public void firstStackTest() {
        //is
        Stack<String> stack = new StackImpl<>();
        stack.push("Pablo");
        stack.push("Katarina");
        stack.push("XYZ");
        stack.pop();

        //when
        String popValue = stack.pop();

        //expected
        Assert.assertEquals("Katarina", popValue);
    }


    @Test
    public void secondStackTest() {
        //is
        Stack<String> stack = new StackImpl<>();
        stack.push("Pablo");
        stack.push("Katarina");
        stack.pop();
        stack.pop();
        //when
        int size = stack.size();
        //expected
        Assert.assertEquals(0, size);
    }


    @Test
    public void thirdStackTest() {
        //is
        Stack<Integer> stack = new StackImpl<>();
        for(int i=0;i<1000;i++) {
            stack.push(i);
        }
        //when
        int size = stack.size();
        //expected
        Assert.assertEquals(1000, size);
    }


    @Test
    public void fourthStackTest() {
        //is
        Stack<Integer> stack = new StackImpl<>();
        for(int i=0;i<1000;i++) {
            stack.push(i);
        }
        //when
        stack.clear();
        boolean isEmpty = stack.isEmpty();
        //expected
        Assert.assertTrue(isEmpty);
    }

    @Test
    public void fifthStackTest(){
        //is
        Stack<String> stack = new StackImpl<>();
        stack.push("Liverpool");
        stack.push("Liverpool");
        stack.push("Everton");
        stack.push("Arsenal");
        stack.pop();
        stack.pop();
        stack.pop();

        //when
        String popValue = stack.pop();

        //expected
        Assert.assertEquals("Liverpool", popValue);
    }

}
