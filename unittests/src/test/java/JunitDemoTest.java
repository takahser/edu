import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitDemoTest {

	String fooString;
	String barString;
	String emptyString;
	static JunitDemo junitDemoObject;
	
	@Test
	public void testIsEmpty() {
		assertTrue(junitDemoObject.isEmpty(emptyString));
	}
	
	@Test
	public void testFooCapitalize() {
		assertEquals(junitDemoObject.capitalize(fooString), "Foo");
	}
	
	@Test
	public void testBarCapitalize() {
		assertEquals(junitDemoObject.capitalize(barString), "Bar");
	}
	
	@Test
	public void testNrCapitalize() {
		assertEquals(junitDemoObject.capitalize("123FOO"), "123foo");
	}
	
	@Test
	public void testReverse() {
		assertEquals(junitDemoObject.reverse(fooString), "oof");
	}
	
	@Test
	public void join() {
		assertEquals(junitDemoObject.join(fooString, barString, "!"), "foo BAR !");
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		junitDemoObject = new JunitDemo();
	} 

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		fooString = "foo";
		barString = "BAR";
		emptyString = "";
	}

	@After
	public void tearDown() throws Exception {
	}

}
