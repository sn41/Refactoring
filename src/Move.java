// 4. **Rename Method/Variable (Переименование методов и переменных)**

class RenameDemoBefore {
    public int calc(int a, int b) {
        return a * b;
    }
}

// **Описание:** Изменение имён переменных, методов или классов на более осмысленные и соответствующие их назначению.
// **Ситуация применения:** Запутанные или неопределённые имена, затрудняющие понимание кода.

class RenameDemoAfter {
    public int calculateArea(int width, int height) {
        return width * height;
    }
}

//**Преимущество:** Упрощение понимания назначения переменных или методов.
