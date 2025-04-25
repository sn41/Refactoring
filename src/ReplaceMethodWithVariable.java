//13. **Replace Method with Variable (Замена метода переменной)**


class ReplaceMethodDemoBefore {

    public void printInvoice(Order order) {
        System.out.println("Tax: " + calculateTax(order));
        System.out.println("Total: " + (order.getAmount() + calculateTax(order)));
    }

    private double calculateTax(Order order) {
        return 42;
    }

}

//**Описание:** Замена многократных вызовов метода с неизменяемым результатом на переменную, хранящую это значение.
//**Ситуация применения:** Избыточные вызовы метода, которые могут снижать производительность.

class ReplaceMethodDemoAfter {
    public void printInvoice(Order order) {
        double tax = calculateTax(order);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + (order.getAmount() + tax));
    }

    private double calculateTax(Order order) {
        return 42;
    }
}

//**Преимущество:** Оптимизация и упрощение кода.
