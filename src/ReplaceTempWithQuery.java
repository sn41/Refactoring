//2. **Inline Method (Встраивание метода)**


class InlineMethodDemoBefore {

    public double getFinalPrice(Product product) {
        return applyDiscount(product.getPrice());
    }

    private double applyDiscount(double price) {
        return price * 0.9;
    }

}

//**Описание:** Замена вызова метода его непосредственным содержимым, если метод слишком прост или избыточен.
//**Ситуация применения:** Метод слишком короткий, его логика очевидна, и он используется только в одном месте

class InlineMethodDemoAfter {
    public double getFinalPrice(Product product) {
        return product.getPrice() * 0.9;
    }
}

//**Преимущество:** Уменьшение уровня абстракции и упрощение понимания кода.
