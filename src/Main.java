public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);

        // возникает ошибка, т.к. в знаменателе ноль. Делить на ноль нельзя.
        // возможно при делении на ноль отдавать Integer.MAX_VALUE
        
        calc.println.accept(c);
    }
}