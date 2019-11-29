package ex2;

public interface Stack<T> {
    void clear();
    boolean isEmpty();
    void push(T t);
    T pop();
    int size();
}
