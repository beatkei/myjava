public class Kamoku {
    String name;
    int tensu;

    public Kamoku(String name, int tensu) {
        this.name = name;
        this.tensu = tensu;
    }

    @Override
    public String toString() {
        return name + "は" + tensu + "点";
    }
}
