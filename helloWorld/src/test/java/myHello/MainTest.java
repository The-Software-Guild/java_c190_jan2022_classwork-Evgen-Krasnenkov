package myHello;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

    @BeforeEach
    void setUp() {
        Main myMain = new Main();
    }

    @Test
    void getStr() {
        Assertions.assertEquals("Hello World", Main.getStr());
    }

    @Test
    void setStr() {
    }
}