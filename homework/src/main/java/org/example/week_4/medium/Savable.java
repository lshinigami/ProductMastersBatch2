package org.example.week_4.medium;

public interface Savable<T> extends DataSource<T> {
    void saveData(T data);
}
