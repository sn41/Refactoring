//10. **Replace Conditional with Polymorphism (Замена условных конструкций полиморфизмом)**


class ReplaceConditionalWithPolymorphismDemoBefore {
    public double calculateDiscount(CustomerBefore customer) {
        if (customer.getType().equals("Regular")) {
            return 0.05;
        } else if (customer.getType().equals("VIP")) {
            return 0.1;
        }
        return 0.0;
    }
}

abstract class CustomerBefore {
    abstract String getType();
}

//**Описание:** Устранение сложных условных операторов путём переноса логики в иерархию классов.
//**Ситуация применения:** Частые проверки типа или состояния объекта.

class ReplaceConditionalWithPolymorphismDemoAfter {
    public double calculateDiscount(CustomerGeneral customer) {
        return customer.getDiscount();
    }
}

abstract class CustomerGeneral {
    public abstract double getDiscount();
}

class RegularCustomer extends Customer {
    public double getDiscount() {
        return 0.05;
    }
}

class VIPCustomer extends Customer {
    public double getDiscount() {
        return 0.1;
    }
}

//** * Преимущество:** Упрощение логики и лёгкость добавления новых типов