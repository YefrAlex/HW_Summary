package JavaPro.lesson16_Lambda.task1;

public enum Degree {
    BACHELOR("бакалавр"),
    MASTER("магистр");

    private String description;

    Degree(String description) {
        this.description=description;
    }

    public String getDescription() {
        return description;
    }
}
