package org.triangle;

public class Triangle {
    public static String checkTriangleType(int side1, int side2, int side3) {

        if (side1 <= 0 || side2 <= 0 || side3 <= 0)
            return "Not Triangle";
        else if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1)
            return "Not Triangle";
        else if (side1 == side2 && side2 == side3)
            return "Equilateral";
        else if (side1 == side2 || side1 == side3 || side2 == side3)
                return "Isosceles";
        else if (side1 * side1 + side2 * side2 == side3 * side3 || side1 * side1 + side3 * side3 == side2 * side2 || side2 * side2 + side3 * side3 == side1 * side1)
            return "Right Triangle";
        else
            return "Triangle";
    }
}
