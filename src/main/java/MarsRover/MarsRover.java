package MarsRover;

public class MarsRover {
    public static  int Y;
    public static int X;
    public static char Orientation;

    public static final int MAXY = 10;
    public static final int MINY = -10;
    public static final int MINX = -10;
    public static final int MAXX = 10;
    public static final String BACKWARD = "B";
    public static final char SOUTH = 'S';
    public static final char EAST = 'E';
    public static final char WEST = 'W';

    public static void move(String command) {
        final boolean goBackward = command.equals(BACKWARD);
        switch(Orientation){
            case EAST:
                moveHorizontally(goBackward);
                break;
            case WEST:
                moveHorizontally(!goBackward);
                break;
            case SOUTH:
                moveVertically(goBackward);
                break;
            default:
                moveVertically(!goBackward);
                break;
        }
    }

    private static void moveHorizontally(boolean goBackward) {
        if(goBackward){
            goWest(MAXX, MINX);
        } else {
            goEast();
        }
    }

    private static void moveVertically(boolean goBackward) {
        if (goBackward) {
            goNorth();
        } else {
            goSouth(MAXY, MINY);
        }
    }

    private static void goWest(int max, int min) {
        int coordinate = X;
        coordinate = newCoordinate(max, min, coordinate);
        X= coordinate;
    }

    private static void goSouth(int max, int min) {
        int coordinate = Y;
        coordinate = newCoordinate(max, min, coordinate);
        Y= coordinate;
    }

    private static int newCoordinate(int max, int min, int coordinate) {
        if (coordinate == min) {
            coordinate = max - 1;
        } else {
            coordinate--;
        }
        return coordinate;
    }

    private static void goEast() {
        if (X == MAXX) {
            X = MINX + 1;
        } else {
            X++;
        }
    }

    private static void goNorth() {
        if (Y == MAXY) {
            Y = MINY + 1;
        } else {
            Y++;
        }
    }

}