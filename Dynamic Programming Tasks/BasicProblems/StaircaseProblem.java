package BasicProblems;

public class StaircaseProblem {

    /*
        by @heiphin7

        Вы стоите у подножия лестницы, и вам нужно подняться на вершину,
        которая представлена n-ой ступенькой. Вы можете подняться
        на каждую следующую ступеньку, сделав шаг в 1 ли 2 ступеньки.
        Задача состоит в том, чтобы вычислить,
        сколькими различными способами можно достичь ступеньки n.

        Решение за O(N)
    */

    public static int findStaircase(int n) {
        if (n == 1) return 1; // Если у лестницы только 1 ступенька, тогда у нас только 1 способ забраться на нее

        int[] st = new int[n - 1]; // st - ступеньки

        st[1] = 1; // на первую ступеньку только 1 способ забраться: 1 шаг
        st[2] = 2; // на вторую уже 2 способа, так как: 1 + 1, 2

        for (int i = 3; i < n; i++) {
            st[i] = st[i-1] + st[i-2]; // используем формулу фибоначчи

            /* Это выглядит примерно так:
            *  Например, возьмём n = 5
            *  Тогда, чтобы забрать на 5 ступеньку мы можем начать с 4 или 3 (то есть st[n-1] + st[n-2])
            *  Таким образом считаем пока у нас не будет 0
            *  Это соответсвует формуле фибоначчи
            */
        }

        return st[n]; // возвращаем n-ую ступеньку
    }
}
