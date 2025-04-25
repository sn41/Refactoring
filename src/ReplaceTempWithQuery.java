//### 9. **Replace Temp with Query (Замена временной переменной запросом)**


class ReplaceTempWithQueryDemoBefore {
    public double calculateFinalPrice(Order order) {
        double discount = order.isVIP() ? 0.1 : 0.0;
        return order.getAmount() * (1 - discount);
    }

}

//**Описание:** Устранение временной переменной путём замены её на вызов метода, который возвращает необходимое значение.
//**Ситуация применения:** Избыточное использование переменных с неизменяемым значением.

class ReplaceTempWithQueryDemoAfter {
    public double calculateFinalPrice(Order order) {
        return order.getAmount() * (1 - getDiscount(order));
    }

    private double getDiscount(Order order) {
        return order.isVIP() ? 0.1 : 0.0;
    }
}

//**Преимущество:** Уменьшение количества переменных, повышение структурированности кода..
