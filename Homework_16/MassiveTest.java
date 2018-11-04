package massive;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.TestException;
import org.testng.annotations.Test;

public class MassiveTest {
	
	@Test
	public void concatStringsTest() {
		Massive massive = new Massive();
		String actual_result = massive.concatStrings("Hello ", "world");
		String expected_result = "Hello world";
		Assert.assertEquals(actual_result, expected_result, "Assertaion of string conctenation failed");
	}

	@Test
	public void concatNotEqualStringsTest() {
		Massive massive = new Massive();
		String actual_result = massive.concatStrings("Hello", "world");
		String expected_result = "Hello world";
		Assert.assertNotEquals(actual_result, expected_result, "Assertaion of string conctenation failed");
	}

	@Test
	public void toUpperCaseNotEqualsTest() {
		Massive massive = new Massive();
		String actual_result = massive.toUpperCase("make it upper case");
		String expected_result = "MAKE IT UPPER case";
		Assert.assertNotEquals(actual_result, expected_result, "Assertaion of sum failed");
	}

	@Test
	public void toUpperCaseNotNullTest() {
		Massive massive = new Massive();
		String actual_result = massive.toUpperCase("make it upper case");
		if (actual_result != null) {
			System.out.println("actual_result");
		}
		Assert.assertNotNull(actual_result, "Assertaion is NULL");
	}

	@Test(expectedExceptions = NullPointerException.class)
	public void toUpperCaseIsNullTest() {
		Massive massive = new Massive();
		String actual_result = massive.toUpperCase(null);
		Assert.assertNull(actual_result, "Assertaion is NULL");
	}

	@Test
	public void factorEachElementTest() {
		Massive massive = new Massive();
		Double[] actual_result = massive.factorEachElement(new Double[] { 5.01, 3.14, 1.18, 4.78, 2.56 }, 3);
		Double[] expected_result = { 9.42, 7.68, 15.03, 3.54, 14.34 };
		Assert.assertEqualsNoOrder(actual_result, expected_result);
	}

	@Test
	public void compareTrueStringsTest() {
		Massive massive = new Massive();
		boolean actual_result = massive.compareStrings("I am learning TestNG", "I am learning TestNG");
		Assert.assertTrue(actual_result);
	}

	@Test
	public void compareFalseStringsTest() {
		Massive massive = new Massive();
		boolean actual_result = massive.compareStrings("I am learning TestNG", "I am learning JUnit");
		Assert.assertFalse(actual_result);
	}

	@Test
	public void compareLinksNotSameTest() {
		Massive massive = new Massive();
		String actual_result = massive.concatStrings("I am learning", " TestNG");
		String expected_result = "I am learning TestNG";
		Assert.assertNotSame(actual_result, expected_result);
	}

	@Test
	public void compareObjectsSameTest() {
		Massive massive = new Massive();
		Massive massive2 = new Massive();
		String result1 = massive.createHardcodedString();
		String result2 = massive2.createHardcodedString();
		Assert.assertSame(result1, result2);
	}

	@Test
	public void stringNotNullTest() {
		Massive massive = new Massive();
		String actual_result = massive.scanUserString();
		Assert.assertNotNull(actual_result);
	}

	@Test(enabled = false)
	public void stringNullTest() {
		Massive massive = new Massive();
		String actual_result = massive.scanUserString();
		Assert.assertNull(actual_result);
	}

	@Test(enabled = false, expectedExceptions = TestException.class)
	public void divideWithExceptionsTest() {
		Massive massive = new Massive();
		Double[] result = massive.divideMas(new Double[] { 5.01, 3.14, 1.18, 4.78, 2.56 }, 0);
	}

	@Test
	public void sortMassiveAscEqualsTest() {
		Massive massive = new Massive();
		Double[] actual_result = massive.sortMassiveAsc(new Double[] { 7.97, -0.96, -11.23, 4.00, 31.20 });
		Double[] expected_result = { -11.23, -0.96, 4.00, 7.97, 31.20 };
		Assert.assertEquals(actual_result, expected_result);
	}

	@Test
	public void sortMassiveAscNotEqualsTest() {
		Massive massive = new Massive();
		Double[] actual_result = massive.sortMassiveAsc(new Double[] { 7.97, -0.96, -11.23, 4.00, 31.20 });
		Double[] expected_result = { -0.96, 4.00, 7.97, -11.23, 31.20 };
		Assert.assertNotEquals(actual_result, expected_result);
	}

	@Test
	public void sortMassiveDescEqualsTest() {
		Massive massive = new Massive();
		Double[] actual_result = massive.sortMassiveDesc(new Double[] { 7.97, -0.96, -11.23, 4.00, 31.20 });
		Double[] expected_result = { 31.20, 7.97, 4.00, -0.96, -11.23 };
		Assert.assertEquals(actual_result, expected_result);
	}

	@Test
	public void sortMassiveDescNotEqualsTest() {
		Massive massive = new Massive();
		Double[] actual_result = massive.sortMassiveDesc(new Double[] { 7.97, -0.96, -11.23, 4.00, 31.20 });
		Double[] expected_result = { 31.20, -11.23, 7.97, 4.00, -0.96, };
		Assert.assertNotEquals(actual_result, expected_result);
	}

	@Test
	public void compareSortedMAssiveTest() {
		Massive massive = new Massive();
		Double[] result1 = massive.sortMassiveDesc(new Double[] { 7.97, -0.96, -11.23, 4.00, 31.20 });
		Double[] result2 = massive.sortMassiveAsc(new Double[] { 7.97, -0.96, -11.23, 4.00, 31.20 });
		Assert.assertEqualsNoOrder(result1, result2);
	}
	@Test
	public void replaceSymbolTest() {
		Massive massive = new Massive();
		String actual_result = massive.replaceSybmbol("My name is Alla");
		String expected_result = "My n%me is All%";
		Assert.assertEquals(actual_result, expected_result);
}
	@Test
	public void failTest() {
		Massive massive = new Massive();
		fail();	
	}
	@Test (expectedExceptions = StringIndexOutOfBoundsException.class)
	public void returnCharOuOfBoundTest() {
		Massive massive = new Massive();
		char ch_actual = massive.returnCharAt("The best day ever", 25);	
	}
	@Test 
	public void returnCharAtTest() {
		Massive massive = new Massive();
		char ch_actual = massive.returnCharAt("The best day ever", 0);	
		String ch_expected = "T";
		Assert.assertEquals(ch_actual, ch_expected);	
	}	
}
