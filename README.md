## Java Tasks from GeekBrains (Java. Level 2)
### 👨🏽‍💻 Author: Sergey Alekseev

### List of lessons
* [Lesson 1](#lesson-1)
* [Lesson 2](#lesson-2)
* [Lesson 3](#lesson-3)
* [Lesson 5](#lesson-5)

# Lesson 1
>1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти
классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в
консоль).
>
>2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
>
>3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
этот набор препятствий.
>
>4. `*` У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения
на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он
препятствий не идет.

### [[ Open Lesson 1 solution]](https://github.com/s1tt/Gb-Java-02/tree/master/src/main/java/com/geekbrains/lesson1)

# Lesson 2
>1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
>
>2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
>
>3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException, и вывести результат расчета.
## [[ Open Lesson 2 solution ]](https://github.com/s1tt/Gb-Java-02/tree/master/src/main/java/com/geekbrains/lesson2)

# Lesson 3
>1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.
>
>2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
## [[ Open Lesson 3 solution ]](https://github.com/s1tt/Gb-Java-02/tree/master/src/main/java/com/geekbrains/lesson3)
# Lesson 5
>1. Необходимо написать два метода, которые делают следующее:  
>
>a) Создают одномерный длинный массив, например:

```Java
static final int size = 10000000;  
static final int h = size / 2;  
float[] arr = new float[size]; 
```
>
>б) Заполняют этот массив единицами;
>
>в) Засекают время выполнения:
 ```Java 
 long a = System.currentTimeMillis();
 ```
>
>г) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:

```Java
arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
```
>
>д) Проверяется время окончания метода 
```Java 
System.currentTimeMillis();
```
>
>е) В консоль выводится время работы: 
```Java 
System.out.println(System.currentTimeMillis() - a);
```
>
>Отличие первого метода от второго:
>
>Первый просто бежит по массиву и вычисляет значения.
>
>Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает эти массивы обратно в один.
>
>Пример деления одного массива на два:
```Java
System.arraycopy(arr, 0, a1, 0, h);
System.arraycopy(arr, h, a2, 0, h);

```
>
>Пример обратной склейки:

```Java
System.arraycopy(a1, 0, arr, 0, h);
System.arraycopy(a2, 0, arr, h, h);
```
>
>Примечание:
>
>`System.arraycopy()` – копирует данные из одного массива в другой:
>
>`System.arraycopy`(массив-источник, откуда начинаем брать данные из массива-источника, массив-назначение, откуда начинаем записывать данные в массив-назначение, сколько ячеек копируем)
>
>По замерам времени:
>
>Для первого метода надо считать время только на цикл расчета:

```Java
for (int i = 0; i < size; i++) {
arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
}
```
>
>Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и склейки.
>
## [[ Open Lesson 5 solution ]](https://github.com/s1tt/Gb-Java-02/tree/master/src/main/java/com/geekbrains/lesson5)
