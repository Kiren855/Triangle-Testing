package org.triangle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    @Test
    public void testIsTriangle(){
        assertEquals("Triangle", Triangle.checkTriangleType(2,3,4));
    }

    @Test
    public void testIsNotTriangle(){
        assertEquals("Not Triangle", Triangle.checkTriangleType(-3,3,4));
        assertEquals("Not Triangle", Triangle.checkTriangleType(3,1,99));
         
    }

    @Test
    public void testIsEquiateral(){
        assertEquals("Equilateral", Triangle.checkTriangleType(3,3,3));
    }

    @Test
    public void testIsIsosceles(){
        assertEquals("Isosceles", Triangle.checkTriangleType(3,3,4));
    }

    @Test
    public void testIsRightTriangle(){
        assertEquals("Right Triangle", Triangle.checkTriangleType(3,4,5));
    }

}
