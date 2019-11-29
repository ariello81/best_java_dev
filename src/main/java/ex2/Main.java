package ex2;

public class Main {
    public static void main(String[] args) {
        Stack<String> names = new StackImpl();
        names.push("Pablo");
        names.push("Tuturu");
        System.out.println("size:" + names.size());
        System.out.println("Powinien zwrócić obiekt Tuturu: " + names.pop());
        System.out.println("Size powinien zwrocić size = 1 " + names.size());
        names.clear();
        System.out.println("Powinien zwrócić true: " + names.isEmpty());
    }
}

