package org.example;

import Lesson4.Triangle;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;

public class SqrtTest {




    @Test
    @DisplayName("Проверка работы метода TriangleSqr c положительными числами")


    public void TestTriangleSqr(){
        Triangle first = new Triangle(3,4,5);
        int expected = 6;
        Assertions.assertEquals(expected,first.TriangleSqr());

    }

    
}
