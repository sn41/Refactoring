

//6. **Replace Conditional with Polymorphism (Замена условных конструкций полиморфизмом)**

class ReplaceConditionalDemoBefore {
    public double calculateShippingCost(Order order) {
        if (order.isInternational()) {
            return order.getWeight() * 15;
        } else {
            return order.getWeight() * 5;
        }
    }
}


//**Описание:** Замена условных конструкций (`if/else` или `switch`) на полиморфизм путём использования иерархий классов.
//**Ситуация применения:** Частые проверки на типы или состояния объектов.

class ReplaceConditionalDemoAfter {
    public double calculateShippingCost(Order order) {
        if (order.isInternational()) {
            return order.getWeight() * 15;
        } else {
            return order.getWeight() * 5;
        }
    }
}

//**Преимущество:** Уменьшение дублирования кода и упрощение расширяемости.
