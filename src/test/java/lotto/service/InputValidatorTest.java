package lotto.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InputValidatorTest {

    private InputValidator inputValidator;

    @BeforeEach
    void setUp() {
        inputValidator = new InputValidator();
    }

    @DisplayName("입력값에 숫자가 아닌 다른 값이 들어왔을 때 예외를 발생시킨다.")
    @Test
    void validateIsNotNumber() {
        Assertions.assertAll(
                () -> Assertions.assertThrows(IllegalArgumentException.class,
                        () -> inputValidator.validateInputDataIsNumber("하이")),
                () -> Assertions.assertDoesNotThrow(() -> inputValidator.validateInputDataIsNumber("12"))
        );
    }
}
