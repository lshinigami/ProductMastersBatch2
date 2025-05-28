package medium;

public class CachedDataSource<T> implements Savable<T> {
    T userData;

    @Override
    public T getUserData() {
        return userData;
    }

    @Override
    public void saveData(T data) {
        this.userData = data;
    }
}
