package fun.whitea.patterns.interpreter;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable d = new Variable("d");
        Variable c = new Variable("c");

        context.assign(a, 1);
        context.assign(b, 2);
        context.assign(d, 3);
        context.assign(c, 4);

        AbstractExpression expression = new Minus(a, new Plus(b, new Minus(c, d)));
        System.out.println(expression);
        System.out.println(expression.interpret(context));
    }
}
