package JavaSummary._2023_09_08;

import java.util.Arrays;
import java.util.regex.Pattern;

public class HW {
    //Допустим, у вас есть двумерный массив строк, представляющий
    //таблицу данных, где первый столбец - это имена, а остальные столбцы -
    //это числовые значения. Вам нужно написать программу, которая найдет среднее
    //значение для каждого числового столбца, игнорируя строки, которые не могут быть
    //преобразованы в числа.
    //требуется
    //использовать несколько функций Stream API и регулярных выражений для обработки данных
    //String[][] data = {
    //                {"name1", "10", "20", "30"},
    //                {"name2", "40", "50", "not a number"},
    //                {"name3", "60", "70", "80"}
    //        };
    public static void main(String[] args) {
        String[][] data = {
                {"name1", "10", "20", "30"},
                {"name2", "40", "50", "not a number"},
                {"name3", "60", "70", "80"}
        };

        int columnCount = data[0].length - 1;

        // Обрабатываем каждый числовой столбец
        for (int i = 0; i < columnCount; i++) {
            final int columnIndex = i + 1; // Индекс столбца (игнорируем первый столбец с именами)

            double average = Arrays.stream(data)
                    .filter(row -> isNumeric(row[columnIndex])) // Фильтруем строки, которые можно преобразовать в число
                    .mapToDouble(row -> Double.parseDouble(row[columnIndex])) // Преобразуем строки в числа
                    .average() // Находим среднее значение
                    .orElse(0); // Если нет числовых значений, то среднее будет равно 0

            System.out.println("Average for column " + columnIndex + " = " + average);
        }
    }

    // Метод для проверки, является ли строка числом
    private static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        return pattern.matcher(str).matches();
    }
}
