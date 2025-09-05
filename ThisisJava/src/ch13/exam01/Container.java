package ch13.exam01;

public class Container<T> {
    private T t;

    public T get() { return t; }

    public T set(T t) { this.t = t; return t;}
}
