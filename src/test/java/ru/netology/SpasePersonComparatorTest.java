package ru.netology;

import org.junit.jupiter.api.*;

public class SpasePersonComparatorTest {

    private static long suiteStartTime;
    private long testStartTime;

    Person one = new Person("Sonya Popova", 35, 15);
    Person two = new Person("Sasha Sun", 31, 15);

    @BeforeAll
    public static void initSuite() {
        System.out.println("Running All Test");
        suiteStartTime = System.currentTimeMillis();
    }
    @AfterAll
    public static void completeSuite() {
        System.out.println("All Test complete: " + (System.currentTimeMillis() - suiteStartTime));
    }
    @BeforeEach
    public void initTest() {
        System.out.println("Starting new test");
        testStartTime = System.currentTimeMillis();
    }
    @AfterEach
    public void finalizeTest() {
        System.out.println("Test complete:" + (System.currentTimeMillis() - testStartTime));
    }

    @Test
    public void personCharCountTest(){
        String in = "Stack Overflow helps people find the answers they need, when they need them.";
        char ch1 = 'e';
        char ch2 = 'n';
        int expected1 = 14;
        int expected2 = 5;

        int result1 = SpacePersonComparator.charCount(in, ch1);
        int result2 = SpacePersonComparator.charCount(in, ch2);

        Assertions.assertEquals(expected1, result1);
        Assertions.assertEquals(expected2, result2);
    }

    @Test
    public void compareTest(){
        int expected = 1;

        int result = new SpacePersonComparator().compare(one, two);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void get(){
        String name = one.getName();
        int age = one.getAge();
        int exp = one.getExperience();

        String actualName = "Sonya Popova";
        int actualAge = 35;
        int actualExp = 15;

        Assertions.assertEquals(name, actualName);
        Assertions.assertEquals(age, actualAge);
        Assertions.assertEquals(exp, actualExp);
    }
}
