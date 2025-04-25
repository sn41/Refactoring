// 3. **Extract Variable (Выделение переменной)**

class ExtractVariableDemoBefore {
    public void printCircleInfo(double radius) {
        System.out.println("Circle area: " + (3.14159 * radius * radius));
    }
}

//**Описание:** Замена сложного выражения на переменную с понятным именем, чтобы облегчить чтение кода.
//**Ситуация применения:** Сложные выражения в параметрах методов или длинные строки вычислений.

class ExtractVariableDemoAfter {
    public void printCircleInfo(double radius) {
        double area = 3.14159 * radius * radius;
        System.out.println("Circle area: " + area);
    }
}

//**Преимущество:** Читаемость улучшается благодаря введению промежуточных переменных.
