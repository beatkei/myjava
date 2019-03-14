package designpattern.builder;

public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItem(String[] itemes);
    public abstract void close();
}
