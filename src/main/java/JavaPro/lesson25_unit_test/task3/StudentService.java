package JavaPro.lesson25_unit_test.task3;

import java.util.*;

public class StudentService {
    private Map<Integer,Student> studentMap = new HashMap<>();
    private int count = 1;
    public Student creatStudent (String name, int age, Degree degree ){
        Student student = new Student(count,name,age,degree);
        studentMap.put(count++,student);
        return student;
    }
    public List<Student> allStudentList(){
        return new ArrayList<>(studentMap.values());
    }
    public int getCountStudent(){
        return studentMap.size();
    }
    public int getCountStudentByDegree(Degree degree){
        return getStudentListByDegree(degree).size();
    }
    public double getAvgAgeStudent(){
        return (int)studentMap.values().stream().mapToInt(x->x.getAge()).average().orElse(-1);
    }
    public double getAvgAgeStudentByDegree(Degree degree){
        return (int)studentMap.values().stream().filter(x->x.getDegree().equals(degree)).mapToInt(x->x.getAge()).average().orElse(-1);
    }
    public List<Student> getStudentListByDegree(Degree degree){
        return studentMap.values().stream().filter(x->x.getDegree().equals(degree)).toList();
    }

}
