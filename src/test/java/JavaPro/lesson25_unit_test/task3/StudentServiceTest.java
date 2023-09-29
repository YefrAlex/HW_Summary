package JavaPro.lesson25_unit_test.task3;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentServiceTest {


    private  StudentService studentService;
    private StudentService emptyService = new StudentService();
    @Before
    public void init(){
        studentService = new StudentService();
        studentService.creatStudent("A",22,Degree.BACHELOR);
         studentService.creatStudent("B",32,Degree.MASTER);
         studentService.creatStudent("C",42,Degree.BACHELOR);
    }
    @Test
    public void testCreatStudent() {
        Student student = studentService.allStudentList().get(0);
         assertEquals("A",student.getName());
         assertEquals(22,student.getAge());
         assertEquals(Degree.BACHELOR,student.getDegree());
    }
    @Test
    public void testId(){
        Student student = studentService.allStudentList().get(2);
        assertEquals(3,student.getId());
    }
    @Test
    public void testEmptyMap(){

        assertEquals(0,emptyService.getCountStudent());

    }
    @Test
    public void testAllStudentListEmptySize() {
        assertEquals(0,emptyService.allStudentList().size());
    }

    @Test
    public void testGetCountStudent() {
        assertEquals(3,studentService.getCountStudent());

    }
    @Test
    public void testGetCountStudentEmpty() {
        assertEquals(0,emptyService.getCountStudent());

    }
   @Test
    public void testGetCountStudentByDegree() {
        assertEquals(2,studentService.getCountStudentByDegree(Degree.BACHELOR));
    }
    @Test
    public void testGetCountStudentByDegreeEmpty() {
        assertEquals(0,emptyService.getCountStudentByDegree(Degree.BACHELOR));
    }
    @Test
    public void testGetAvgAgeStudent() {
        assertEquals(0,Double.compare(32.0,studentService.getAvgAgeStudent()));
    }
    @Test
    public void testGetAvgAgeStudentEmpty() {

        assertEquals(0,Double.compare(-1.0,emptyService.getAvgAgeStudent()));
    }
    @Test
    public void testGetAvgAgeStudentByDegree() {


    }

    public void testGetStudentListByDegree() {
    }
}