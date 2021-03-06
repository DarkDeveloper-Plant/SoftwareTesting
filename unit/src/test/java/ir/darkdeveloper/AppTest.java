/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ir.darkdeveloper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void getGreeting() {
        var classUnderTest = new App();
        assert classUnderTest.getGreeting() != null;
        assertEquals("Hello, World!", classUnderTest.getGreeting());
    }

    @Test
    void division() {
        var classUnderTest = new App();
        assertEquals(2, classUnderTest.division(4, 2));
    }

    @Test
    void divisionByZero() {
        var classUnderTest = new App();
        assertThrows(IllegalArgumentException.class, () -> classUnderTest.division(4, 0));
    }

}
