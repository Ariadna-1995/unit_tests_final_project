Данное приложение представлено 2-мя классами: AverageValue и CompareList. 
В классе AverageValue содержится метод getAverageValue. Данный метод возвращает среднеарифметическое значение списка.
Класс CompareList представлен методом compareOurLists, который принимает на вход 2 списка и сравнивает их среднеарифметические значения. 
В рамках тестового класса AverageValueTest рассматриваются 3 основных тестовых сценария. 
1) Первый тестовый сценарий проверяет корректность работы метода getAverageValue, рассчитывающего среднеарифметическое значение списка, и представлен параметризированным тестовым методом testAverageValue. Метод проверяет корректность вычисления среднеарифметического значения. В метод передаются в качестве аргументов целые положительные числа, целые отрицательные числа, дробные числа, нули и пустой список. 
2) Второй тестовый сценарий проверяет корректность вычисления среднеарифмитических значений в 2-х списках. Сценарий представлен 3-мя позитивными методами: positiveTestList1AverageValueGreaterList2AverageValue, positiveTestList1AverageValueSmallerList2AverageValue, positiveTestList1AverageValueEqualList2AverageValue. 1-й метод проверяет, что среднеарифметическое 1-го списка больше 2-го. Второй метод проверяет, что среднеарифметическое значение 1-го списка меньше среднеарифметического значения 2-го списка. 3-й метод должен подтвердить, что среднеарифмитические значени 2-х списков равны. Каждый из этих методов имеет парный негативный тестовый метод: negativeTestList1AverageValueGreaterList2AverageValue, negativeTestList1AverageValueSmallerList2AverageValue, negativeTestList1AverageValueEqualList2AverageValue. В негативных методах проверяются те же тестовые случаи, но с неправильными значениями для того, чтобы проверить, что программа выдает ошибку. 
3) Третий тестовый сценарий проверяет корректность работы метода compareOurLists. Данный сценарий включает 6 методов, 3 из которых являются позитивными и 3 из которых являются негативными. 3 позитивных метода positiveTestList1AverageValueGreaterList2AverageValueCompareList, positiveTestList1AverageValueSmallerList2AverageValueCompareList, positiveTestList1AverageValueEqualList2AverageValueCompareList сравнивают так же 2 списка по среднеарифметическому значению, как позитивные тестовые методы из предыдущего тестового сценария, но в рамках этих тестовых методов проверяется работа метода compareOurLists. Каждый из этих методов также имеет парный негативный тестовый метод, подобный негативным методам из предыдущего тестового сценария.
Таким образом, выше приведены 3 основых тестовых сценария. Данные сценарии были выбраны, поскольку они покрывают основную функциональность данного приложения. 