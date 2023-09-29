package JavaSummary._2023_08_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        String str = "La prisión del condado de Fulton, en Georgia, " +
                "ha hecho historia este jueves. En esta " +
                "cárcel, cuyas condiciones@gmail.com para los " +
                "presos@yahoo.com son tan peligrosas que se encuentra bajo " +
                "una investigación oficial, ha comparecido el " +
                "expresidente de Estados Unidos Donald Trump para " +
                "quedar fichado como imputado por, entre otras cosas, " +
                "liderar una asociación de tipo mafioso para alterar " +
                "los resultados de las elecciones de 2020@yahoo.ru " +
                "en ese Estado";
        System.out.println(getEmail(str));

    }
    public static List<String> getEmail (String str){
        List <String> list = new ArrayList<>();
        list =Arrays.asList(str.split(" "));
        List <String> list1 = new ArrayList<>();
        for (int i=0; i < list.size(); i++) {

            if (list.get(i).contains("@") && list.get(i).contains(".")){
                list1.add(list.get(i));
            }

        }
        return list1;
    }
}
