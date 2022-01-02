package com.battleslimes.battleslimes.util;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class VerificationTests {

    @ParameterizedTest(name = "{index} => inputString={0}")
    @MethodSource("isValidInputString_IsValid_Provider")
    void isValidInputString_IsValid(String inputString) {
        assertTrue(Verification.isValidInputString(inputString,2));
    }

    private static Stream<Arguments> isValidInputString_IsValid_Provider() {
        return Stream.of(
                //Parameterized Test 1
                Arguments.of("1"),
                //Parameterized Test 2
                Arguments.of("2"),
                //Parameterized Test 3
                Arguments.of("10"),
                //Parameterized Test 4
                Arguments.of("99")
        );
    }

    @ParameterizedTest(name = "{index} => inputString={0}")
    @MethodSource("isValidInputString_IsInValid_Provider")
    void isValidInputString_IsInValid(String inputString) {
        assertFalse(Verification.isValidInputString(inputString,2));
    }

    private static Stream<Arguments> isValidInputString_IsInValid_Provider() {
        return Stream.of(
                //Parameterized Test 1
                Arguments.of("0000"),
                //Parameterized Test 2
                Arguments.of("123"),
                //Parameterized Test 3
                Arguments.of("1000"),
                //Parameterized Test 4
                Arguments.of("DELETE * FROM DB"),
                //Parameterized Test 5
                Arguments.of("THIS IS A STRING")
        );
    }

}
