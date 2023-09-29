package JavaPro.lesson19_stream2.task6;

import JavaSummary.Tasks.Emploey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    //        0. Создать класс Employee
//        1. Вывести всех сотрудников без высшего руководителя
//        2. Сгруппировать сотрудников по должности
//        3. Вычислить среднюю зарплату всех сотрудников (двумя способами)
//        4. Получить список сотрудников с зп > 1000
//        5. Получить список сотрудников из отдела маркетинг и увеличить зп на 15%
//        6. Получить сотрудника с самой низкой зп
//        7. Получите сотрудников из всех отделов с максимальной зп

    // Aleks Developer 1500
    // Thomas Manager 680.50
    // Thea CEO 2000
    // Mary Manager 700
    // Ken Developer 900

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        Employee emploey1 = new Employee ("Aleks", "Developer", 1500);
        Employee emploey2 = new Employee ("Thomas", "Manager", 680.50);
        Employee emploey3 = new Employee ("Thea", "CEO", 2000);
        Employee emploey4 = new Employee ("Mary", "Manager", 700);
        Employee emploey5 = new Employee ("Ken", "Developer", 900);

        employeeList.add(emploey1);
        employeeList.add(emploey2);
        employeeList.add(emploey3);
        employeeList.add(emploey4);
        employeeList.add(emploey5);

        System.out.println("Сотрудники");
        employeeList.forEach(System.out::println);

        List<Employee> employeeList1 = employeeList.stream().filter(x->!x.getState().equals("CEO")).toList();

        System.out.println("Сотрудники 2");
        employeeList1.forEach(System.out::println);

        Map <String,List<Employee>> map = employeeList.stream().collect(Collectors.groupingBy(x->x.getState()));
        System.out.println("по должностям");
        System.out.println(map);
       /* for (Employee employee:employeeList)    {
            if (map.containsKey(employee.getState())){
                map.get(employee.getState()).add(employee);
        }
        else {
            List<Employee> list = new ArrayList<>();
            list.add(employee);
            map.put(employee.getState(),list);
        }
        }
        System.out.println(map);

        */

        double avgsalary = employeeList.stream().mapToDouble(x->x.getSalary()).average().orElse(-1);
        System.out.println(avgsalary);
        // 4. Получить список сотрудников с зп > 1000
        List<Employee> list1000 = employeeList.stream().filter(x->x.getSalary()>1000).toList();
        System.out.println("Сотрудники с зп больше 1000");
        list1000.forEach(System.out::println);

        //        5. Получить список сотрудников из отдела маркетинг и увеличить зп на 15%

        employeeList.stream().filter(x->x.getState().equals("Manager")).forEach(x->x.setSalary(x.getSalary()*1.15));
        employeeList.forEach(System.out::println);


    }
}
