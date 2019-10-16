package daria;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AppTest {

  private OddArray oddArray;

  @Before
  public void testSetup() throws Exception {
    oddArray = new OddArray();
  }

  @Test
  public void shouldReturnTrue() throws Exception {
    //given
    final int[] array = {4, 4, 9, 9, 3, 3, 8};

    //when
    int result = oddArray.solution(array);

    //then
    assertEquals(8, result);
  }

  @Test
  public void shouldReturnZero() throws Exception {
    //given
    final int[] array = {};

    //when
    int result = oddArray.solution(array);

    //then
    assertEquals(0, result);
  }

  @Test
  public void shouldReturnNegative() throws Exception {
    //given
    final int[] array = {-4, -4, -9, -11, -9, -3, -3};

    //when
    int result = oddArray.solution(array);

    //then
    assertEquals(-11, result);
  }

  @Test
  public void shouldReturnZeroToo() throws Exception {
    //given
    final int[] array = {0, 0, 0, 0, 0};

    //when
    int result = oddArray.solution(array);

    //then
    assertEquals(0, result);
  }

}
