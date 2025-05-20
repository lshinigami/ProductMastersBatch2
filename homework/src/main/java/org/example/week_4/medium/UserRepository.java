package org.example.week_4.medium;

public class UserRepository<T> implements DataSource<T> {
    private final Savable<T> cachedDataSource;
    private final DataSource<T> cloudDataSource;

    public UserRepository(Savable<T> cachedDataSource, DataSource<T> cloudDataSource) {
        this.cachedDataSource = cachedDataSource;
        this.cloudDataSource = cloudDataSource;
    }

    @Override
    public T getUserData() {
        T result = cachedDataSource.getUserData();
        if (result == null) {
            System.out.println("Cache is empty");
            result = cloudDataSource.getUserData();
            cachedDataSource.saveData(result);
        }
        else {
            System.out.println("Data has been taken from cache");
        }
        return result;
    }
}
