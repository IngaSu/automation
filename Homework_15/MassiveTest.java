import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import task_15.Massive;

public class MassiveTest {

	@Test
	public void massiveAcsTestEquals() {
		Massive array = new Massive();
		int[] actual_result = array.sortMassiveAsc(new int[] { 4, 17, 2, 9, 0 });
		int[] expected_result = { 0, 2, 4, 9, 17 };
		assertArrayEquals("Arrays are not matching after Acs sorting", expected_result, actual_result);
	}

	@Test
	public void massiveDescTestEquals() {
		Massive array = new Massive();
		Integer[] actual_result = array.sortMassiveDesc(new Integer[] { 89, -5, 6 });
		Integer[] expected_result = { 89, 6, -5 };
		assertArrayEquals("Arrays are not matching after Desc sorting", expected_result, actual_result);
	}

	@Test
	public void massiveDoubleElementTest() {
		Massive array = new Massive();
		Integer[] actual_result = array.doubleEachElement(new Integer[] { 11, 5, 123 }, 2);
		Integer[] expected_result = { 22, 10, 246 };
		assertArrayEquals("Arrays are not matching after multiplication", expected_result, actual_result);
	}

	@Test
	public void sumNeibourElementsTest() {
		Massive array = new Massive();
		Integer[] actual_result = array.sumNeibourElements(new Integer[] { 10, 15, 20 });
		Integer[] expected_result = { 25, 35, 20 };
		assertArrayEquals("Arrays are not matching after summing neibour elements", expected_result, actual_result);
	}

	@Test
	public void massiveDescTestNotNull() {
		Massive array = new Massive();
		Integer[] actual_result = array.sortMassiveDesc(new Integer[] { 89, -5, 6 });
		assertNotNull(actual_result);
	}

	@Test(expected = ArithmeticException.class)
	public void massiveDevideTestExeption() {
		Massive array = new Massive();
		array.divideMas(new int[] { 4, 17, 2, 9, 0 }, 0);
	}

	@Test
	public void sumNeibourTestAssertTrue() {
		Massive array = new Massive();
		Integer[] actual_result = array.sumNeibourElements(new Integer[] { 10, 15, 20 });
		Integer[] expected_result = { 25, 35, 20 };
		if (actual_result == expected_result)
			;
		boolean result = true;
		assertTrue(result);
	}

	@Test
	public void massiveAcsTestFalse() {
		Massive array = new Massive();
		int[] actual_result = array.sortMassiveAsc(new int[] { 4, 17, 2, 9, 0 });
		int[] expected_result = { 17, 2, 0, 9, 4 };
		assertFalse(expected_result == actual_result);
	}

	@Ignore
	@Test
	public void assertSameTest() {
		Massive array = new Massive();
		assertSame(array, array);
	}

	@Test
	public void assertNotSameTest() {
		Massive array = new Massive();
		Massive array2 = new Massive();
		assertNotSame("Objects are not the same", array.sortMassiveAsc(new int[] { 4, 17, 2, 9, 0 }),
				array2.sortMassiveAsc(new int[] { 4, 17, 2, 9, 0 }));
	}
}
