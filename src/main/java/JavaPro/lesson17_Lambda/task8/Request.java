package JavaPro.lesson17_Lambda.task8;

public class Request {
    private String string;
    private int index;

    public Request(String string, int index) {
        this.string=string;
        this.index=index;
    }

    public String getString() {
        return string;
    }

    public int getIndex() {
        return index;
    }
}
