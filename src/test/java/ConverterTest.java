package test.java;

import main.java.Converter;
import org.junit.Test;

import static org.junit.Assert.*;

/*
  @author   savina daria
  @project   Int_Rom_Converter
  @class  ConverterTest
  @version  1.0.0
  @since 17.10.25 - 22:52
*/


public class ConverterTest {

    private final Converter converter = new Converter();

    // 1 Мінімум
    @Test
    public void test1() {
        assertEquals("I", converter.convert(1));
    }

    // 2 Повтори
    @Test
    public void test3() {
        assertEquals("III", converter.convert(3));
    }

    // 3 Перелом: 4 = IV
    @Test
    public void test4() {
        assertEquals("IV", converter.convert(4));
    }

    // 4 5 = V
    @Test
    public void test5() {
        assertEquals("V", converter.convert(5));
    }

    // 5 9 = IX
    @Test
    public void test9() {
        assertEquals("IX", converter.convert(9));
    }

    // 6 10 = X
    @Test
    public void test10() {
        assertEquals("X", converter.convert(10));
    }

    // 7 40 = XL
    @Test
    public void test40() {
        assertEquals("XL", converter.convert(40));
    }

    // 8 49 = XLIX
    @Test
    public void test49() {
        assertEquals("XLIX", converter.convert(49));
    }

    // 9 90 = XC
    @Test
    public void test90() {
        assertEquals("XC", converter.convert(90));
    }

    // 10 99 = XCIX
    @Test
    public void test99() {
        assertEquals("XCIX", converter.convert(99));
    }

    // 11 400 = CD
    @Test
    public void test400() {
        assertEquals("CD", converter.convert(400));
    }

    // 12 444 = CDXLIV
    @Test
    public void test444() {
        assertEquals("CDXLIV", converter.convert(444));
    }

    // 13 900 = CM
    @Test
    public void test900() {
        assertEquals("CM", converter.convert(900));
    }

    // 14 944 = CMXLIV
    @Test
    public void test944() {
        assertEquals("CMXLIV", converter.convert(944));
    }

    // 15 1666 = MDCLXVI
    @Test
    public void test1666() {
        assertEquals("MDCLXVI", converter.convert(1666));
    }

    // 16 2024 = MMXXIV
    @Test
    public void test2024() {
        assertEquals("MMXXIV", converter.convert(2024));
    }


    // 17 3999 = MMMCMXCIX
    @Test
    public void test3999() {
        assertEquals("MMMCMXCIX", converter.convert(3999));
    }

    // 18 4000 = MMMM
    @Test
    public void test4000() {
        assertEquals("MMMM", converter.convert(4000));
    }

    // 19 4999 = MMMMCMXCIX
    @Test
    public void test4999() {
        assertEquals("MMMMCMXCIX", converter.convert(4999));
    }

    // 20 5000 = MMMMM
    @Test
    public void test5000() {
        assertEquals("MMMMM", converter.convert(5000));
    }


    // 21 9000 = MMMMMMMMM
    @Test
    public void test9000() {
        assertEquals("MMMMMMMMM", converter.convert(9000));
    }

    // 22 Верхня межа — 9999
    @Test
    public void test9999() {
        assertEquals("MMMMMMMMMCMXCIX", converter.convert(9999));
    }

    // 23 Значення понад межу → виняток
    @Test(expected = IllegalArgumentException.class)
    public void testTooLarge() {
        converter.convert(10000);
    }

    // 24 Нуль → виняток
    @Test(expected = IllegalArgumentException.class)
    public void testZero() {
        converter.convert(0);
    }

    // 25 Негативне число → виняток
    @Test(expected = IllegalArgumentException.class)
    public void testNegative() {
        converter.convert(-123);
    }
}
