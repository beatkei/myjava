package other;

public class EnumTest {
    public static void main(String[] args) {

        Direction dir = Direction.NORTH;
        switch (dir) {
            case NORTH:
                System.out.println(dir);
                break;
            case EAST:
                System.out.println(dir);
                break;
            case SOUTH:
                System.out.println(dir);
                break;
            case WEST:
                System.out.println(dir);
                break;
        }
    }
}
