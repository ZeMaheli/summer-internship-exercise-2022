package com.premiumminds.internship.screenlocking;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by aamado on 05-05-2022.
 */
@RunWith(JUnit4.class)
public class ScreenLockinPatternTest {

  @Test
  public void ScreenLockinPatternTestLength9()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count1  = new ScreenLockinPattern().countPatternsFrom(1, 8);
    Future<Integer> count2 = new ScreenLockinPattern().countPatternsFrom(2, 8);
    Future<Integer> count3  = new ScreenLockinPattern().countPatternsFrom(3, 8);
    Future<Integer> count4  = new ScreenLockinPattern().countPatternsFrom(4, 8);
    Future<Integer> count5  = new ScreenLockinPattern().countPatternsFrom(5, 8);
    Future<Integer> count6  = new ScreenLockinPattern().countPatternsFrom(6, 8);
    Future<Integer> count7  = new ScreenLockinPattern().countPatternsFrom(7, 8);
    Future<Integer> count8  = new ScreenLockinPattern().countPatternsFrom(8, 8);
    Future<Integer> count9  = new ScreenLockinPattern().countPatternsFrom(9, 8);
    Integer result = count1.get(10, TimeUnit.SECONDS)+count2.get(10, TimeUnit.SECONDS)
    +count3.get(10, TimeUnit.SECONDS)+count4.get(10, TimeUnit.SECONDS)+count5.get(10, TimeUnit.SECONDS)
    +count6.get(10, TimeUnit.SECONDS)+count7.get(10, TimeUnit.SECONDS)+count8.get(10, TimeUnit.SECONDS)+count9.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 140704);
  }

  @Test
  public void ScreenLockinPatternTestLength8()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count1  = new ScreenLockinPattern().countPatternsFrom(1, 8);
    Future<Integer> count2 = new ScreenLockinPattern().countPatternsFrom(2, 8);
    Future<Integer> count3  = new ScreenLockinPattern().countPatternsFrom(3, 8);
    Future<Integer> count4  = new ScreenLockinPattern().countPatternsFrom(4, 8);
    Future<Integer> count5  = new ScreenLockinPattern().countPatternsFrom(5, 8);
    Future<Integer> count6  = new ScreenLockinPattern().countPatternsFrom(6, 8);
    Future<Integer> count7  = new ScreenLockinPattern().countPatternsFrom(7, 8);
    Future<Integer> count8  = new ScreenLockinPattern().countPatternsFrom(8, 8);
    Future<Integer> count9  = new ScreenLockinPattern().countPatternsFrom(9, 8);
    Integer result = count1.get(10, TimeUnit.SECONDS)+count2.get(10, TimeUnit.SECONDS)
    +count3.get(10, TimeUnit.SECONDS)+count4.get(10, TimeUnit.SECONDS)+count5.get(10, TimeUnit.SECONDS)
    +count6.get(10, TimeUnit.SECONDS)+count7.get(10, TimeUnit.SECONDS)+count8.get(10, TimeUnit.SECONDS)+count9.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 140704);
  }

  @Test
  public void ScreenLockinPatternTestLength7()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count1  = new ScreenLockinPattern().countPatternsFrom(1, 7);
    Future<Integer> count2 = new ScreenLockinPattern().countPatternsFrom(2, 7);
    Future<Integer> count3  = new ScreenLockinPattern().countPatternsFrom(3, 7);
    Future<Integer> count4  = new ScreenLockinPattern().countPatternsFrom(4, 7);
    Future<Integer> count5  = new ScreenLockinPattern().countPatternsFrom(5, 7);
    Future<Integer> count6  = new ScreenLockinPattern().countPatternsFrom(6, 7);
    Future<Integer> count7  = new ScreenLockinPattern().countPatternsFrom(7, 7);
    Future<Integer> count8  = new ScreenLockinPattern().countPatternsFrom(8, 7);
    Future<Integer> count9  = new ScreenLockinPattern().countPatternsFrom(9, 7);
    Integer result = count1.get(10, TimeUnit.SECONDS)+count2.get(10, TimeUnit.SECONDS)
    +count3.get(10, TimeUnit.SECONDS)+count4.get(10, TimeUnit.SECONDS)+count5.get(10, TimeUnit.SECONDS)
    +count6.get(10, TimeUnit.SECONDS)+count7.get(10, TimeUnit.SECONDS)+count8.get(10, TimeUnit.SECONDS)+count9.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 72912);
  }

  @Test
  public void ScreenLockinPatternTestLength6()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count1  = new ScreenLockinPattern().countPatternsFrom(1, 6);
    Future<Integer> count2 = new ScreenLockinPattern().countPatternsFrom(2, 6);
    Future<Integer> count3  = new ScreenLockinPattern().countPatternsFrom(3, 6);
    Future<Integer> count4  = new ScreenLockinPattern().countPatternsFrom(4, 6);
    Future<Integer> count5  = new ScreenLockinPattern().countPatternsFrom(5, 6);
    Future<Integer> count6  = new ScreenLockinPattern().countPatternsFrom(6, 6);
    Future<Integer> count7  = new ScreenLockinPattern().countPatternsFrom(7, 6);
    Future<Integer> count8  = new ScreenLockinPattern().countPatternsFrom(8, 6);
    Future<Integer> count9  = new ScreenLockinPattern().countPatternsFrom(9, 6);
    Integer result = count1.get(10, TimeUnit.SECONDS)+count2.get(10, TimeUnit.SECONDS)
    +count3.get(10, TimeUnit.SECONDS)+count4.get(10, TimeUnit.SECONDS)+count5.get(10, TimeUnit.SECONDS)
    +count6.get(10, TimeUnit.SECONDS)+count7.get(10, TimeUnit.SECONDS)+count8.get(10, TimeUnit.SECONDS)+count9.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 26016);
  }

  @Test
  public void ScreenLockinPatternTestLength5()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count1  = new ScreenLockinPattern().countPatternsFrom(1, 5);
    Future<Integer> count2 = new ScreenLockinPattern().countPatternsFrom(2, 5);
    Future<Integer> count3  = new ScreenLockinPattern().countPatternsFrom(3, 5);
    Future<Integer> count4  = new ScreenLockinPattern().countPatternsFrom(4, 5);
    Future<Integer> count5  = new ScreenLockinPattern().countPatternsFrom(5, 5);
    Future<Integer> count6  = new ScreenLockinPattern().countPatternsFrom(6, 5);
    Future<Integer> count7  = new ScreenLockinPattern().countPatternsFrom(7, 5);
    Future<Integer> count8  = new ScreenLockinPattern().countPatternsFrom(8, 5);
    Future<Integer> count9  = new ScreenLockinPattern().countPatternsFrom(9, 5);
    Integer result = count1.get(10, TimeUnit.SECONDS)+count2.get(10, TimeUnit.SECONDS)
    +count3.get(10, TimeUnit.SECONDS)+count4.get(10, TimeUnit.SECONDS)+count5.get(10, TimeUnit.SECONDS)
    +count6.get(10, TimeUnit.SECONDS)+count7.get(10, TimeUnit.SECONDS)+count8.get(10, TimeUnit.SECONDS)+count9.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 7152);
  }

  @Test
  public void ScreenLockinPatternTestLength4()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count1  = new ScreenLockinPattern().countPatternsFrom(1, 4);
    Future<Integer> count2 = new ScreenLockinPattern().countPatternsFrom(2, 4);
    Future<Integer> count3  = new ScreenLockinPattern().countPatternsFrom(3, 4);
    Future<Integer> count4  = new ScreenLockinPattern().countPatternsFrom(4, 4);
    Future<Integer> count5  = new ScreenLockinPattern().countPatternsFrom(5, 4);
    Future<Integer> count6  = new ScreenLockinPattern().countPatternsFrom(6, 4);
    Future<Integer> count7  = new ScreenLockinPattern().countPatternsFrom(7, 4);
    Future<Integer> count8  = new ScreenLockinPattern().countPatternsFrom(8, 4);
    Future<Integer> count9  = new ScreenLockinPattern().countPatternsFrom(9, 4);
    Integer result = count1.get(10, TimeUnit.SECONDS)+count2.get(10, TimeUnit.SECONDS)
    +count3.get(10, TimeUnit.SECONDS)+count4.get(10, TimeUnit.SECONDS)+count5.get(10, TimeUnit.SECONDS)
    +count6.get(10, TimeUnit.SECONDS)+count7.get(10, TimeUnit.SECONDS)+count8.get(10, TimeUnit.SECONDS)+count9.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 1624);
  }

  @Test
  public void ScreenLockinPatternTestLength3()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count1  = new ScreenLockinPattern().countPatternsFrom(1, 3);
    Future<Integer> count2 = new ScreenLockinPattern().countPatternsFrom(2, 3);
    Future<Integer> count3  = new ScreenLockinPattern().countPatternsFrom(3, 3);
    Future<Integer> count4  = new ScreenLockinPattern().countPatternsFrom(4, 3);
    Future<Integer> count5  = new ScreenLockinPattern().countPatternsFrom(5, 3);
    Future<Integer> count6  = new ScreenLockinPattern().countPatternsFrom(6, 3);
    Future<Integer> count7  = new ScreenLockinPattern().countPatternsFrom(7, 3);
    Future<Integer> count8  = new ScreenLockinPattern().countPatternsFrom(8, 3);
    Future<Integer> count9  = new ScreenLockinPattern().countPatternsFrom(9, 3);
    Integer result = count1.get(10, TimeUnit.SECONDS)+count2.get(10, TimeUnit.SECONDS)
    +count3.get(10, TimeUnit.SECONDS)+count4.get(10, TimeUnit.SECONDS)+count5.get(10, TimeUnit.SECONDS)
    +count6.get(10, TimeUnit.SECONDS)+count7.get(10, TimeUnit.SECONDS)+count8.get(10, TimeUnit.SECONDS)+count9.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 320);
  }

  //Length 2
  @Test
  public void ScreenLockinPatternTestFirst9Length2Test()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count  = new ScreenLockinPattern().countPatternsFrom(9, 2);
    Integer result = count.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 5);
  }

  @Test
  public void ScreenLockinPatternTestFirst8Length2Test()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count  = new ScreenLockinPattern().countPatternsFrom(8, 2);
    Integer result = count.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 7);
  }

  @Test
  public void ScreenLockinPatternTestFirst7Length2Test()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count  = new ScreenLockinPattern().countPatternsFrom(7, 2);
    Integer result = count.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 5);
  }

  @Test
  public void ScreenLockinPatternTestFirst6Length2Test()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count  = new ScreenLockinPattern().countPatternsFrom(6, 2);
    Integer result = count.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 7);
  }

  @Test
  public void ScreenLockinPatternTestFirst4Length2Test()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count  = new ScreenLockinPattern().countPatternsFrom(4, 2);
    Integer result = count.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 7);
  }

  @Test
  public void ScreenLockinPatternTestFirst5Length2Test()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count  = new ScreenLockinPattern().countPatternsFrom(5, 2);
    Integer result = count.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 8);
  }

  @Test
  public void ScreenLockinPatternTestFirst1Length2Test()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count  = new ScreenLockinPattern().countPatternsFrom(3, 2);
    Integer result = count.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 5);
  }

  @Test
  public void ScreenLockinPatternTestFirst3Length2Test()  throws InterruptedException, ExecutionException, TimeoutException {
    Future<Integer> count  = new ScreenLockinPattern().countPatternsFrom(3, 2);
    Integer result = count.get(10, TimeUnit.SECONDS);
    assertEquals(result.intValue(), 5);
  }
}