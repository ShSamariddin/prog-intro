# Домашнее задание 3. Реверс

1. Разработайте класс Reverse, читающий числа из стандартного входа, и выводящий их на стандартный вывод в обратном порядке.
2. В каждой строке входа содержится некоторое количество целых чисел (может быть 0). Числа разделены пробелами. Каждое число помещается в тип int.
3. Порядок строк в выходе должен быть обратным по сравнению с порядком строк во входе. Порядок чисел в каждой строке так же должен быть обратным к порядку чисел во входе.
4. Вход содержит не более 106 чисел.
5. Для чтения чисел используйте класс [Scanner]
6. Примеры работы программы:
   > * Вход:
   > * 1 2
   > * 3
   > * Выход:
   > * 3
   > * 2 1
   > * Вход:
   > * 1
   > * 
   > * 2 -3
   > * Выход:
   > * -3 2
   > * 
   > * 1
7. [Тесты]

[Тесты]: http://www.kgeorgiy.info/git/geo/prog-intro-2019/src/branch/master/artifacts/reverse/ReverseTest.jar
### Модификации
*  Even
    > * Выведите только четные числа (в реверсивном порядке)
    > * Класс должен иметь имя: ReverseEven
    > * [Тесты для ReverseEven]
* Sum
    > * Рассмотрим входные данные как (не полностью определенную) матрицу, вместо каждого числа выведите сумму чисел в его столбце и строке
    > * Класс должен иметь имя: ReverseSum
    > * [Тесты для ReverseSum]


[Scanner]: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Scanner.html
[Откомпилированные тесты]: http://www.kgeorgiy.info/git/geo/prog-intro-2019/src/branch/master/artifacts/reverse/ReverseEvenTest.jar
[Тесты для ReverseSum]: http://www.kgeorgiy.info/git/geo/prog-intro-2019/src/branch/master/artifacts/reverse/ReverseSumTest.jar
[Тесты для ReverseEven]: http://www.kgeorgiy.info/git/geo/prog-intro-2019/src/branch/master/artifacts/reverse/ReverseEvenTest.jar

##### [Слайды курса][]

[Слайды курса]:kgeorgiy.info/courses/prog-intro/slides/arrays.xhtml#(1)
