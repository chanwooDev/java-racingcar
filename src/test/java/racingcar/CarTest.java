package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.number_generator.SpecificNumberGenerator;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    @DisplayName("각 자동차에 이름을 부여할 수 있다.")
    public void 각_자동차에_이름을_부여할_수_있다() throws Exception {
        String name = "chanu";

        Car car = new Car(name);

        assertThat(car.getName()).isEqualTo(name);
    }

    @Test
    @DisplayName("차가 전진한다")
    public void 차가_전진한다() throws Exception {
        Car car = new Car("hello");

        car.forward();

        assertThat(car.getDistance()).isEqualTo(1);
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6, 7, 8, 9})
    @DisplayName("값이 4 이상일 경우 전진한다")
    public void 값이_4_이상일_경우_전진한다(int number) throws Exception {
        Car car = new Car("chan", new SpecificNumberGenerator(number));

        car.progress();

        assertThat(car.getDistance()).isEqualTo(1);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    @DisplayName("값이 3 이하일 경우 멈춘다.")
    public void 값이_3_이하일_경우_멈춘다(int number) throws Exception {
        Car car = new Car("chan", new SpecificNumberGenerator(number));

        car.progress();

        assertThat(car.getDistance()).isEqualTo(0);
    }
}
