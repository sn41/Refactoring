//Давайте рассмотрим основные методы рефакторинга подробнее.
//Эти методы помогут вам сделать код более понятным, упрощённым в поддержке и масштабируемым.


// 1. **Extract Method (Выделение метода)**


class ExtractMethodDemoBefore {
    public void processOrder(Order order) {
        System.out.println("Processing order #" + order.getId());
        double discount = order.getAmount() > 100 ? 0.1 : 0;
        double total = order.getAmount() * (1 - discount);
        System.out.println("Total amount: " + total);
    }
}

//        **Описание:** Вынос части логики из длинного метода в новый вспомогательный метод.
//        **Ситуация применения:** Когда метод становится слишком большим или выполняет несколько задач одновременно.

class ExtractMethodDemoAFter {
    public void processOrder(Order order) {
        System.out.println("Processing order #" + order.getId());
        double total = calculateTotalAmount(order);
        System.out.println("Total amount: " + total);
    }

    private double calculateTotalAmount(Order order) {
        double discount = order.getAmount() > 100 ? 0.1 : 0;
        return order.getAmount() * (1 - discount);
    }
}

//      **Преимущество:** Улучшение читаемости и повторного использования выделенной логики.
