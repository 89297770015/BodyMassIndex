package diceRolling;

import java.util.Scanner;

public class DiceRolling {

    public static void main(String[] args) { 
        String test = "6\n" + "0.59558786964\n";
        Scanner sc = new Scanner(test);
        int length = sc.nextInt();
        double d = sc.nextDouble();
        System.out.print(d+" ");
    
    }
}
/*
//        dice[0] = 0.59558786964;
//        dice[1] = 0.861037873663;
//        dice[2] = 0.385597702116;
//        dice[3] = 0.246237673331;
//        dice[4] = 0.808033385314;
//        dice[5] = 0.0544673665427;
*/


/*
Программируя настольные или ролевые игры, новички часто испытывают затруднения с превращением случайных чисел в значения очков игральных костей. Цель этой задачи - попрактиковаться в программном выбрасывании костей используя значения от генератора случайных чисел.

Пусть наш генератор выдаёт случайные вещественные числа в диапазоне от 0 (включительно) до 1 (не включая) - вы можете встретить такой в языках вроде Basic, Java, Matlab и т.п.

Нам нужно преобразовать эти дробные значения в целые, в диапазоне от 1 до 6. Это можно сделать например так:

Умножим случайное число на N - число различных значений которые нам нужны - т.е. в данном случае умножим на 6, так что результат будет вещественным числом от 0 (включая) до 6 (не включая)
Теперь возьмём целую часть от результата (т.е. округлим вниз вызвав функцию floor или преобразовав в int) - значение станет одним из 0, 1, 2, 3, 4, 5 с равной вероятностью.
Поскольку нас интересуют числа от 1 до 6 просто добавим 1 к полученному результату.
Итак, даны несколько вещественных значений в диапазоне [0 .. 1) (полученные как раз от генератора случайных чисел) - их нужно преобразовать в значения очков игрального кубика с помощью вышеописанного алгоритма.

Входные данные содержат в первой строке число значений, которые нужно преобразовать.
Остальные строки содержат по одному вещественному случайному числу каждая (в виде 0.142857 и т.п.)
Ответ должен содержать числа от 1 до 6 для каждого из входных тестов, через пробел.

Пример:

входные данные:
6
0.59558786964
0.861037873663
0.385597702116
0.246237673331
0.808033385314
0.0544673665427

ответ:
4 6 3 2 5 1
*/

/*
When programming board or role-playing games, many novice programmers experience troubles in converting random values to specific dice points. The goal of this task is to give a practice in simulation of dice rolling by the values coming from a random numbers generator.

Suppose, we have generator which gives random values in range from 0 (inclusive) to 1 (not inclusive) - this could be encountered in languages like Basic, Java, Matlab etc.

We want to convert these values with floating point to one of six integer numbers: from 1 to 6. This could be achieved by the following steps:

Multiply random value by N which is the number of distinct values we want to get - in our case we multiply by 6 and so result would be floating point value in range from 0 (inclusive) to 6 (not inclusive)
Now let us take the integer part of this result (calling function like floor or converting to int) - the value will become one of 0, 1, 2, 3, 4, 5 with equal probability.
Since we need values from 1 to 6 let us simply add 1 to the result.
Now you'll be given several numbers in the range [0 .. 1) (be sure, they are provided by random number generator) - and you are to convert them to dice points by applying the algorithm above.

Input data will contain the amount of values to convert in the first line.
Other lines will contain one value each, in form like 0.142857.
Answer should contain numbers from 1 to 6 for each of input values, produced by the discussed algorithm.

Example:

6
0.59558786964
0.861037873663
0.385597702116
0.246237673331
0.808033385314
0.0544673665427

answer:
4 6 3 2 5 1
*/