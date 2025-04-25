//### 12. **Replace Magic Numbers with Named Constants (Замена магических чисел на именованные константы)**


class MagicNumbersDemoBefore {

    public double calculateCircleArea(double radius) {
        return 3.14159 * radius * radius;
    }

}

//**Описание:** Замена числовых литералов на константы с понятным именем.
//        **Ситуация применения:** Непонятные числа, спрятанные в коде.

class MagicNumbersDemoAfter {
    private static final double PI = 3.14159;

    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }
}

//**Преимущество:** Улучшение понимания и облегчение управления значениями.
