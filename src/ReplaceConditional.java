

//5. **Move Method/Field (Перемещение метода или поля)**

class MoveDemoBefore {
    public int calc(int a, int b) {
        return a * b;
    }
}

class Customer {
    public double calculateTotalOrderAmount(OrderBefore order) {
        return order.getAmount() - order.getDiscount();
    }
}

class OrderBefore {
    private double amount;
    private double discount;

    public double getAmount() { return amount; }
    public double getDiscount() { return discount; }
}

//**Описание:** Перенос методов или полей в классы, которым они логически принадлежат.
//**Ситуация применения:** Метод использует данные другого класса больше, чем данные своего класса.

class OrderAfter {
    private double amount;
    private double discount;

    public double getAmount() { return amount; }
    public double getDiscount() { return discount; }

    //добавлено из класса Customer, класс Customer устранён
    public double calculateTotalAmount() {
        return amount - discount;
    }
}

//**Преимущество:** Повышение когезии кода и снижение связности между классами.
