package adapter;

public interface Print {
    // interface的にはabstractは書かなくていい（省略しても暗黙的に補完される）
    public abstract void printWeak();
    public abstract void printStrong();
}
