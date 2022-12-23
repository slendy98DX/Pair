public class Esame {

    private String name;
    private int mark;

    public Esame(String type, int mark) {
        this.name = type;
        this.mark = mark;
    }

    public String getType() {
        return name;
    }

    public void setType(String type) {
        this.name = type;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Esame{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
