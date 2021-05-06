package MarsRover;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MarsRoverTest {

    @Test
    void When_RoverIsIn_0_0_N_And_CommandIs_F_Then_0_1_N() {

        MarsRover.X =0;
        MarsRover.Y =0;
        MarsRover.Orientation = 'N';

        MarsRover.move("F");

        assertThat(MarsRover.X).isEqualTo(0);
        assertThat(MarsRover.Y).isEqualTo(1);
        assertThat(MarsRover.Orientation).isEqualTo('N');
    }

    @Test
    void When_RoverIsIn_0_1_N_And_CommandIs_F_Then_0_2_N() {

        MarsRover.X =0;
        MarsRover.Y =1;
        MarsRover.Orientation = 'N';

        MarsRover.move("F");

        assertThat(MarsRover.X).isEqualTo(0);
        assertThat(MarsRover.Y).isEqualTo(2);
        assertThat(MarsRover.Orientation).isEqualTo('N');
    }

    @Test
    void When_RoverIsIn_0_10_N_And_CommandIsF_Then_0_minus9_N() {

        MarsRover.X =0;
        MarsRover.Y =10;
        MarsRover.Orientation = 'N';

        MarsRover.move("F");

        assertThat(MarsRover.X).isEqualTo(0);
        assertThat(MarsRover.Y).isEqualTo(-9);
        assertThat(MarsRover.Orientation).isEqualTo('N');
    }

    @Test
    void When_RoverIsIn_0_0_N_And_CommandIs_B_Then_0_minus1_N() {

        MarsRover.X =0;
        MarsRover.Y =0;
        MarsRover.Orientation = 'N';

        MarsRover.move("B");

        assertThat(MarsRover.X).isEqualTo(0);
        assertThat(MarsRover.Y).isEqualTo(-1);
        assertThat(MarsRover.Orientation).isEqualTo('N');
    }

    @Test
    void When_RoverIsIn_0_minus10_N_And_CommandIs_B_Then_0_9_N() {

        MarsRover.X =0;
        MarsRover.Y =-10;
        MarsRover.Orientation = 'N';

        MarsRover.move("B");

        assertThat(MarsRover.X).isEqualTo(0);
        assertThat(MarsRover.Y).isEqualTo(9);
        assertThat(MarsRover.Orientation).isEqualTo('N');
    }

    @Test
    void When_RoverIsIn_0_0_S_And_CommandIs_F_Then_0_minus1_S() {

        MarsRover.X =0;
        MarsRover.Y =0;
        MarsRover.Orientation = 'S';

        MarsRover.move("F");

        assertThat(MarsRover.X).isEqualTo(0);
        assertThat(MarsRover.Y).isEqualTo(-1);
        assertThat(MarsRover.Orientation).isEqualTo('S');
    }

    @Test
    void When_RoverIsIn_0_0_S_And_CommandIs_B_Then_0_1_S() {

        MarsRover.X =0;
        MarsRover.Y =0;
        MarsRover.Orientation = 'S';

        MarsRover.move("B");

        assertThat(MarsRover.X).isEqualTo(0);
        assertThat(MarsRover.Y).isEqualTo(1);
        assertThat(MarsRover.Orientation).isEqualTo('S');
    }

    @Test
    void When_RoverIsIn_0_10_S_And_CommandIs_B_Then_0_minus9_S() {

        MarsRover.X =0;
        MarsRover.Y =10;
        MarsRover.Orientation = 'S';

        MarsRover.move("B");

        assertThat(MarsRover.X).isEqualTo(0);
        assertThat(MarsRover.Y).isEqualTo(-9);
        assertThat(MarsRover.Orientation).isEqualTo('S');
    }

    @Test
    void When_RoverIsIn_0_minus10_S_And_CommandIs_F_Then_0_9_S() {

        MarsRover.X =0;
        MarsRover.Y =-10;
        MarsRover.Orientation = 'S';

        MarsRover.move("F");

        assertThat(MarsRover.X).isEqualTo(0);
        assertThat(MarsRover.Y).isEqualTo(9);
        assertThat(MarsRover.Orientation).isEqualTo('S');
    }

    @Test
    void When_RoverIsIn_0_0_E_And_CommandIs_F_Then_1_0_E() {

        MarsRover.X =0;
        MarsRover.Y =0;
        MarsRover.Orientation = 'E';

        MarsRover.move("F");

        assertThat(MarsRover.X).isEqualTo(1);
        assertThat(MarsRover.Y).isEqualTo(0);
        assertThat(MarsRover.Orientation).isEqualTo('E');
    }

    @Test
    void When_RoverIsIn_10_0_E_And_CommandIs_F_Then_minus9_0_E() {

        MarsRover.X =10;
        MarsRover.Y =0;
        MarsRover.Orientation = 'E';

        MarsRover.move("F");

        assertThat(MarsRover.X).isEqualTo(-9);
        assertThat(MarsRover.Y).isEqualTo(0);
        assertThat(MarsRover.Orientation).isEqualTo('E');
    }

    @Test
    void When_RoverIsIn_1_0_E_And_CommandIs_B_Then_0_0_E() {

        MarsRover.X =1;
        MarsRover.Y =0;
        MarsRover.Orientation = 'E';

        MarsRover.move("B");

        assertThat(MarsRover.X).isEqualTo(0);
        assertThat(MarsRover.Y).isEqualTo(0);
        assertThat(MarsRover.Orientation).isEqualTo('E');
    }

    @Test
    void When_RoverIsIn_minus10_0_E_And_CommandIs_B_Then_9_0_E() {

        MarsRover.X =-10;
        MarsRover.Y =0;
        MarsRover.Orientation = 'E';

        MarsRover.move("B");

        assertThat(MarsRover.X).isEqualTo(9);
        assertThat(MarsRover.Y).isEqualTo(0);
        assertThat(MarsRover.Orientation).isEqualTo('E');
    }

    @Test
    void When_RoverIsIn_0_0_W_And_CommandIs_F_Then_minus1_0_W() {

        MarsRover.X =0;
        MarsRover.Y =0;
        MarsRover.Orientation = 'W';

        MarsRover.move("F");

        assertThat(MarsRover.X).isEqualTo(-1);
        assertThat(MarsRover.Y).isEqualTo(0);
        assertThat(MarsRover.Orientation).isEqualTo('W');
    }

    @Test
    void When_RoverIsIn_0_0_W_And_CommandIs_B_Then_1_0_W() {

        MarsRover.X =0;
        MarsRover.Y =0;
        MarsRover.Orientation = 'W';

        MarsRover.move("B");

        assertThat(MarsRover.X).isEqualTo(1);
        assertThat(MarsRover.Y).isEqualTo(0);
        assertThat(MarsRover.Orientation).isEqualTo('W');
    }

    @Test
    void When_RoverIsIn_minus10_0_W_And_CommandIs_F_Then_9_0_W() {

        MarsRover.X =-10;
        MarsRover.Y =0;
        MarsRover.Orientation = 'W';

        MarsRover.move("F");

        assertThat(MarsRover.X).isEqualTo(9);
        assertThat(MarsRover.Y).isEqualTo(0);
        assertThat(MarsRover.Orientation).isEqualTo('W');
    }

    @Test
    void When_RoverIsIn_10_0_W_And_CommandIs_B_Then_minus9_0_W() {

        MarsRover.X =10;
        MarsRover.Y =0;
        MarsRover.Orientation = 'W';

        MarsRover.move("B");

        assertThat(MarsRover.X).isEqualTo(-9);
        assertThat(MarsRover.Y).isEqualTo(0);
        assertThat(MarsRover.Orientation).isEqualTo('W');
    }
}