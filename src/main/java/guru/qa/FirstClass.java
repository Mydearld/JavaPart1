package guru.qa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FirstClass {
    public static void main(String[] args) {

        // 0) применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        int arg1 = 25;
        int arg2 = 5;

        System.out.println("Sum of int args: " + arg1 + arg2);
        System.out.println("Subtraction of int args: " + (arg1 - arg2));
        System.out.println("Division of int args: " + arg1 / arg2);
        System.out.println("Multiplication of int args: " + arg1 * arg2);

        // 1) применить несколько арифметических операций над int и double в одном выражении
        int intAgr1 = 5;
        double doubleArg2 = 5.5;

        System.out.println("Int - double args: " + (intAgr1 - doubleArg2));
        System.out.println("Int / double args: " + (intAgr1 / doubleArg2));

        // 2) применить несколько логических операций ( < , >, >=, <= )
        if (intAgr1 > doubleArg2) {
            System.out.println("intAgr1 > doubleArg2");
        } else {
            System.out.println("intAgr1 < doubleArg2");
        }

        // 3) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой
        // (какие максимальные и минимальные значения есть, как их получить) и переполнение
        System.out.println("Float min value: " + Float.MIN_VALUE);
        System.out.println("Float max value: " + Float.MAX_VALUE);
        System.out.println("Double min value: " + Double.MIN_VALUE);
        System.out.println("Double max value: " + Double.MAX_VALUE);

        // 4) получить переполнение при арифметической операции
        System.out.println("Overflow for Double: " + Double.MAX_VALUE * 2);
        System.out.println("Overflow for Integer: " + (Integer.MAX_VALUE + 1));

        // ниже попытки уже для себя получить underflow и NaN
        float min = Float.MIN_VALUE;
        float result = min / 2.0f;
        System.out.println("Undeflow: " + result);

        System.out.println(0.0/0.0);

    }
}