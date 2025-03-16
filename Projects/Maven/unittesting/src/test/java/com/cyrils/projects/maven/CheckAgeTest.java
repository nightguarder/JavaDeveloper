package com.cyrils.projects.maven;

import com.cyrils.java.lekce14.CheckAge;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CheckAgeTest {

    @Test
    @DisplayName("Age validation should pass for valid age (18+)")
    void ageValidationShouldPassForValidAge() throws Exception {
        // No exception should be thrown for age >= 18
        assertTrue(CheckAge.ageValidation(18));
        assertTrue(CheckAge.ageValidation(25));
        assertTrue(CheckAge.ageValidation(100));
    }

    @Test
    @DisplayName("Age validation should throw exception for under 18")
    void ageValidationShouldThrowExceptionForInvalidAge() {
        // Exception should be thrown for age < 18
        Exception exception = assertThrows(Exception.class, () -> CheckAge.ageValidation(17));
        assertTrue(exception.getMessage().contains("not valid"));
        
        assertThrows(Exception.class, () -> CheckAge.ageValidation(0));
        assertThrows(Exception.class, () -> CheckAge.ageValidation(-1));
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 20, 65, 100})
    @DisplayName("Age validation should pass for various valid ages")
    void ageValidationShouldPassForVariousValidAges(int age) throws Exception {
        assertTrue(CheckAge.ageValidation(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 5, 10, 17})
    @DisplayName("Age validation should throw exception for various invalid ages")
    void ageValidationShouldThrowExceptionForVariousInvalidAges(int age) {
        assertThrows(Exception.class, () -> CheckAge.ageValidation(age));
    }
    
    @Test
    @DisplayName("Age validation with AssertJ for valid age")
    void ageValidationWithAssertJForValidAge() throws Exception {
        assertThat(CheckAge.ageValidation(20))
            .as("Age validation should return true for age 20")
            .isTrue();
    }

    @Test
    @DisplayName("Age validation with AssertJ for invalid age")
    void ageValidationWithAssertJForInvalidAge() {
        assertThatThrownBy(() -> CheckAge.ageValidation(15))
            .isInstanceOf(Exception.class)
            .hasMessageContaining("not valid");
    }
    
    @Test
    @DisplayName("Age validation for edge cases")
    void ageValidationForEdgeCases() {
        // Test for exactly 18 years
        assertDoesNotThrow(() -> CheckAge.ageValidation(18));
        
        // Test for exactly under 18
        assertThrows(Exception.class, () -> CheckAge.ageValidation(17));
        
        // Test for extreme values
        assertThrows(Exception.class, () -> CheckAge.ageValidation(Integer.MIN_VALUE));
        assertDoesNotThrow(() -> CheckAge.ageValidation(Integer.MAX_VALUE));
    }
}
