import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import task03.MainHW;

public class MainHWTest {

    // Задание 1 - Напишите тесты, покрывающие на 100% метод evenOddNumber, который
    // проверяет,
    // является ли переданное число четным или нечетным.

    @Test
    void testEvenNumber() {
        assertThat(MainHW.evenOddNumber(4)).isTrue();
    }

    @Test
    void testOddNumber() {
        assertThat(MainHW.evenOddNumber(5)).isFalse();
    }

    // Задание 2 - Разработайте и протестируйте метод numberInInterval, который
    // проверяет,
    // попадает ли переданное число в интервал (25;100).

    @ParameterizedTest
    @ValueSource(ints = { 25, 100 })
    void testIntervalTrue(int n) {
        assertThat(MainHW.numberInInterval(n)).isEqualTo(true);
    }

    @ParameterizedTest
    @ValueSource(ints = { 24, 101 })
    void testIntervalFalse(int n) {
        assertThat(MainHW.numberInInterval(n)).isEqualTo(false);
    }
}
