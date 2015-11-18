package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/


public class Solution {

    public Solution(){}

    public Solution(int pub2){}

    public Solution(String pub3){}

    private Solution(double priv1){}

    private Solution(Double priv2){}

    private Solution(Integer priv3){}

    protected Solution(Character prot1){}

    protected Solution(short prot2){}

    protected Solution(char prot3){}

    Solution(float pack1){}

    Solution(Float pack2){}

    Solution(Short pack3){}
}

