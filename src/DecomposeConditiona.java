// 11. **Decompose Conditional (Разбиение сложных условных конструкций)**


abstract class Customer2{

    public abstract int getAge();

    public abstract int getPurchaseAmount();
}
class DecomposeConditionaDemoBefore {

    public String getPromotion(Customer2 customer) {
        if (customer.getAge() > 18 && customer.getPurchaseAmount() > 100) {
            return "Gold";
        } else if (customer.getAge() <= 18 && customer.getPurchaseAmount() > 50) {
            return "Silver";
        }
        return "Bronze";
    }

}

//**Описание:** Разделение сложного условия на несколько логически понятных частей.
//        **Ситуация применения:** Использование длинных и запутанных `if` или `else if`.

class DecomposeConditionaDemoAfter {
    public String getPromotion(Customer2 customer) {
        if (isGoldPromotion(customer)) {
            return "Gold";
        } else if (isSilverPromotion(customer)) {
            return "Silver";
        }
        return "Bronze";
    }

    private boolean isGoldPromotion(Customer2 customer) {
        return customer.getAge() > 18 && customer.getPurchaseAmount() > 100;
    }

    private boolean isSilverPromotion(Customer2 customer) {
        return customer.getAge() <= 18 && customer.getPurchaseAmount() > 50;
    }
}

//**Преимущество:** Улучшение читаемости и сопровождения кода.
