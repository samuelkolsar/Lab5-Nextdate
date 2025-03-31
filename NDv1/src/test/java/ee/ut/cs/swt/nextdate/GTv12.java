package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv12 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 33, 1);
	    String string0 = nextDate0.run(3, 12, 2021);
	    assertEquals("3/13/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 3701);
	    String string0 = nextDate0.run(10, 8, 2021);
	    assertEquals("10/9/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(1819, 1819, 1819);
	    String string0 = nextDate0.run(2, 29, 1819);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 1828);
	    assertEquals("1/2/1828", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(2903, 1957, 1957);
	    String string0 = nextDate0.run(2, 11, 2021);
	    assertEquals("2/12/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(33, 33, 33);
	    String string0 = nextDate0.run(2, 28, 2021);
	    assertEquals("3/1/2021", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 1748, (-109));
	    String string0 = nextDate0.run((-1757), 11, (-1757));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(11, 1993, 1993);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(5, 5, 2021);
	    assertEquals("5/6/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 1748, (-109));
	    String string0 = nextDate0.run(11, 30, 11);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 12, 2028);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate17() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(20, 2017, 390);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(1957, 1957, 1957);
	    String string0 = nextDate0.run(12, 31, 1957);
	    assertEquals("1/1/1958", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(1944, 1944, 1944);
	    String string0 = nextDate0.run(7, 7, 1944);
	    assertEquals("7/7/1944", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(1939, 4, 1939);
	    String string0 = nextDate0.run(2, 31, 1939);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(2490, 2490, 2490);
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(11, 31, 1957);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(1939, 8, 1939);
	    String string0 = nextDate0.run(8, 31, 1939);
	    assertEquals("9/1/1939", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 11, 11);
	    String string0 = nextDate0.run(11, 30, 1869);
	    assertEquals("12/1/1869", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateAndCallsRun() throws Throwable {
	    NextDate nextDate0 = new NextDate((-2348), 1368, (-1));
	    String string0 = nextDate0.run(6, 1, 2021);
	    assertEquals("6/2/2021", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndZero() throws Throwable {
	    NextDate nextDate0 = new NextDate(33, 33, 33);
	    String string0 = nextDate0.run((-1465), (-3235), 0);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate((-2348), 1368, (-1));
	    String string0 = nextDate0.run(6, 1, 2021);
	    assertEquals("6/2/2021", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(1975, 1975, 1975);
	    String string0 = nextDate0.run(9, 9, 1975);
	    assertEquals("9/10/1975", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(12, 1, 1801);
	    assertEquals("12/2/1801", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(4, 4, 4);
	    String string0 = nextDate0.run(4, 4, 2010);
	    assertEquals("4/5/2010", string0);
	}

}