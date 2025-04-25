//8. **Introduce Parameter Object (Введение объекта параметров)**

class IntroduceParameterObjectDemoBefore {
    public void createAccount(String firstName, String lastName, String email, String phoneNumber) {
        System.out.println("Account created for: " + firstName + " " + lastName);
    }
}

//**Описание:** Когда метод принимает слишком много параметров, связанные параметры объединяются в один объект, упрощая вызов и сопровождение.
// **Ситуация применения:** Использование методов с длинными списками параметров.

class IntroduceParameterObjectAfter {
    public void createAccount(UserInfo userInfo) {
        System.out.println("Account created for: " + userInfo.getFirstName() + " " + userInfo.getLastName());
    }
}

class UserInfo {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public UserInfo(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Геттеры и сеттеры
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}


//**Преимущество:** Уменьшение сложности сигнатур методов и повышение читаемости.

