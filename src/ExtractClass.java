//7. **Extract Class (Выделение класса)**

class EmployeeBefore {
    private String name;
    private String street;
    private String city;
}

//**Описание:** Создание нового класса для отделения обязанностей.
//**Ситуация применения:** Класс содержит слишком много несвязанных данных или логики.

class EmployeeAfter {
    private String name;
    private AddressAfter address;
}

class AddressAfter {
    private String street;
    private String city;
}

//**Преимущество:** Обособление логики и данных делает код более структурированным.
