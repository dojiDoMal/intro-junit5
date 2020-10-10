package guru.springframework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforClass(){
        System.out.println("Before everything else...");
    }

    @BeforeEach
    void setUp(){
        System.out.println("In before each");
        greeting = new Greeting();
    }

    @Test
    void helloWorld(){
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1(){
        System.out.println(greeting.helloWorld("John"));
    }

    @AfterEach
    void tearDown(){
        System.out.println("After each");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("End of testing...");
    }
}
