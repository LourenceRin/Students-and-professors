import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

public class TestSP {

    private static String NAME = "Greg";

    private Student student = new Student("Peter", "Parker", "Ben", 14);
    private Student student1 = new Student("Greg", "Walkman", "John", 13);
    private Professor professor = new Professor("Bruce", "Wayne", "Thomas", 123,123,123, 4);

    @Test
    public void toStringTest(){
        assertNotNull(student.getClass());
    }
}