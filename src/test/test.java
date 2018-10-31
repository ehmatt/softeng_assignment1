package ie.nuigalway.matthew;

import org.junit.Before;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class Test {

	@Before
	public void setup() {
		Student student = new Student("Matt Moran", "22", new DateTime("02/09/1996"), "15445226");
	}

	@Test
	public void usernameShouldEqualNameAndAge(){
		assertEquals(student.getUsername, "Matt Moran22");
	}
}