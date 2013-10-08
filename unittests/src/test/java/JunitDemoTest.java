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
	public void testCapitalize() {
		assertEquals(junitDemoObject.capitalize(fooString), "Foo");
	}
	
	@Test
	public void testReverse() {
		assertEquals(junitDemoObject.reverse(fooString), "oof");
	}
	
	@Test
	public void join() {
//		System.out.println(junitDemoObject.join(fooString, barString));
		assertEquals(junitDemoObject.join(fooString, barString), "foo bar ");
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
		barString = "bar";
		emptyString = "";
	}

	@After
	public void tearDown() throws Exception {
	}

}
