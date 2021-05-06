package CartesianCoordinate;

import CartesianCoordinate.CartesianCoordinate;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CartesianCoordinateTest {

    @Test
    void distance_between_0_0_and_0_0_is_0() {
        //Arrange = Given
        CartesianCoordinate cartesianCoordinate = new CartesianCoordinate();
        PointCartesian pointA = new PointCartesian(0,0);

        //Act = When
        var distance = cartesianCoordinate.calculate(pointA, pointA);

        //Assert= Then
        assertThat(distance).isEqualTo(0);
    }

    @Test
    void distance_between_1_1_and_1_1_is_0() {
        //Arrange = Given
        CartesianCoordinate cartesianCoordinate = new CartesianCoordinate();
        PointCartesian pointA = new PointCartesian(1,1);
        PointCartesian pointB = new PointCartesian(1,1);

        //Act = When
        var distance = cartesianCoordinate.calculate(pointA, pointB);

        //Assert= Then
        assertThat(distance).isEqualTo(0);
    }

    @Test
    void distance_between_0_0_and_0_2_is_2() {
        //Arrange = Given
        CartesianCoordinate cartesianCoordinate = new CartesianCoordinate();
        PointCartesian pointA = new PointCartesian(0,0);
        PointCartesian pointB = new PointCartesian(0,2);

        //Act = When
        var distance = cartesianCoordinate.calculate(pointA, pointB);

        //Assert= Then
        assertThat(distance).isEqualTo(2);
    }

    @Test
    void distance_between_2_0_and_0_0_is_2() {
        //Arrange = Given
        CartesianCoordinate cartesianCoordinate = new CartesianCoordinate();
        PointCartesian pointA = new PointCartesian(2,0);
        PointCartesian pointB = new PointCartesian(0,0);

        //Act = When
        var distance = cartesianCoordinate.calculate(pointA, pointB);

        //Assert= Then
        assertThat(distance).isEqualTo(2);
    }

    @Test
    void distance_between_0_minus2_and_0_0_is_2() {
        //Arrange = Given
        CartesianCoordinate cartesianCoordinate = new CartesianCoordinate();
        PointCartesian pointA = new PointCartesian(0,-2);
        PointCartesian pointB = new PointCartesian(0,0);

        //Act = When
        var distance = cartesianCoordinate.calculate(pointA, pointB);

        //Assert= Then
        assertThat(distance).isEqualTo(2);
    }

    @Test
    void distance_between_minus2_0_and_0_0_is_2() {
        //Arrange = Given
        CartesianCoordinate cartesianCoordinate = new CartesianCoordinate();
        PointCartesian pointA = new PointCartesian(-2,0);
        PointCartesian pointB = new PointCartesian(0,0);

        //Act = When
        var distance = cartesianCoordinate.calculate(pointA, pointB);

        //Assert= Then
        assertThat(distance).isEqualTo(2);
    }

    @Test
    void distance_between_1_2_and_3_4_is_2_8284() {
        //Arrange = Given
        CartesianCoordinate cartesianCoordinate = new CartesianCoordinate();
        PointCartesian pointA = new PointCartesian(1,2);
        PointCartesian pointB = new PointCartesian(3,4);

        //Act = When
        var distance = cartesianCoordinate.calculate(pointA, pointB);

        //Assert= Then
        assertThat(distance).isEqualTo(2.8284);
    }
}