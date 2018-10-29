import org.junit.Before
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class Test {

	@Before
	public void setup() {

		student = new Student("Matt Moran", "22", "02/09/1996", "15445226", course);
		module = new Module("CT414", )
		course = new Course()
	}

	@Test
	public void usernameShouldEqualNameAndAge(){

		assertEquals(student.getUsername, "Matt Moran22");

	}
}