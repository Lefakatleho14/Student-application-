package studentapplication;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class applicationTest {
    
    private Student student;

    @Before
    public void setUp() {
        student = new Student("123", "John Doe", 20, "john.doe@gmail.com");
    }
    
    @After
    public void tearDown() {
        student = null;
    }

    @Test
    public void testGetId() {
        assertEquals("123", student.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", student.getName());
    }

    @Test
    public void testGetAge() {
        assertEquals(20, student.getAge());
    }

    @Test
    public void testGetGmail() {
        assertEquals("john.doe@gmail.com", student.getGmail());
    }

    @Test
    public void testGetCourses() {
        List<String> expectedCourses = new ArrayList<>();
        assertEquals(expectedCourses, student.getCourses());
    }

    @Test
    public void testSetName() {
        student.setName("Jane Doe");
        assertEquals("Jane Doe", student.getName());
    }

    @Test
    public void testSetAge() {
        student.setAge(22);
        assertEquals(22, student.getAge());
    }

    @Test
    public void testSetGmail() {
        student.setGmail("jane.doe@gmail.com");
        assertEquals("jane.doe@gmail.com", student.getGmail());
    }

    @Test
    public void testAddCourse() {
        student.addCourse("Mathematics");
        List<String> expectedCourses = new ArrayList<>();
        expectedCourses.add("Mathematics");
        assertEquals(expectedCourses, student.getCourses());
    }

    @Test
    public void testRemoveCourse() {
        student.addCourse("Mathematics");
        student.removeCourse("Mathematics");
        List<String> expectedCourses = new ArrayList<>();
        assertEquals(expectedCourses, student.getCourses());
    }

    @Test
    public void testToString() {
        student.addCourse("Mathematics");
        String expectedString = "ID: 123, Name: John Doe, Age: 20, Gmail: john.doe@gmail.com, Courses: [Mathematics]";
        assertEquals(expectedString, student.toString());
    }
}
