package JavaPro.lesson10_Comparator.task3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int compareRate = Double.compare(o2.getAvgRate(), o1.getAvgRate()); // если нужна сортировка по убыванию то вначале ставим второй объект
        if (compareRate != 0){
       return compareRate; }
        compareRate = o1.getAge() - o2.getAge();
        if (compareRate !=0){
            return compareRate;}
        compareRate = o2.getCourse()- o1.getCourse();
        if (compareRate !=0){
            return compareRate;}
        return o1.getName().compareTo(o2.getName());
    }
}
