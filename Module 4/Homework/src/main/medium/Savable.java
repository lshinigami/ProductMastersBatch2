package medium;

public interface Savable<T> extends DataSource<T> {
    void saveData(T data);
}
