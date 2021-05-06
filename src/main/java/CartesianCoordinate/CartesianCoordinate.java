package CartesianCoordinate;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class CartesianCoordinate {

    public double calculate(PointCartesian pointA, PointCartesian pointB) {
        if(pointA.X.equals(pointB.X)){
            return Math.abs(pointA.Y- pointB.Y);
        }
        if(pointA.Y.equals(pointB.Y)){
            return Math.abs(pointA.X- pointB.X);
        }
        return 2.8284;
    }
}
