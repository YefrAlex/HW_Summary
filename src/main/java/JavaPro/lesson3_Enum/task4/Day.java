package JavaPro.lesson3_Enum.task4;

public enum Day {
    MONDAY ("Понедельник", "Пн") {
        @Override
        public void printOrderOfDay() {
            System.out.println("Это первый день недели");

        }
    },
    TUESDAY ("Вторник","Вт") {
        @Override
        public void printOrderOfDay() {
            System.out.println("Это второй день недели");
        }
    },
    WEDNESDAY ("Среда","Ср") {
        @Override
        public void printOrderOfDay() {
            System.out.println("Это трейтий день недели");
        }
    },
    THURSDAY ("Четверг","Чт") {
        @Override
        public void printOrderOfDay() {
            System.out.println("Это четвертый день недели");
        }
    },
    FRIDAY ("Пятница","Пт") {
        @Override
        public void printOrderOfDay() {
            System.out.println("Это пятый день недели");
        }
    },
    SATURDAY ("Суббота", "Сб") {
        @Override
        public void printOrderOfDay() {
            System.out.println("Это шестой день недели");
        }
    },
    SUNDAY ("Воскресенье", "Вс") {
        @Override
        public void printOrderOfDay() {
            System.out.println("Это седьмой день недели");
        }
    };

    private String russianName;
    private String shortName;

    Day(){
        System.out.println("Вызван конструктор Day");
    }
    Day (String russianName, String shortName) {
        System.out.println("Вызван конструктор Day с параметрами " + russianName + " " + shortName);
        this.russianName = russianName;
        this.shortName = shortName;
    }

    public String getRussianName() {
        return russianName;
    }

    public String getShortName() {
        return shortName;
    }
    public void printInfo (){
        System.out.println("Today is  "+this.toString().toLowerCase());
    }
    public abstract void printOrderOfDay();
}
