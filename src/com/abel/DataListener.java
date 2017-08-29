package com.abel;

public abstract class DataListener<T> {
    abstract void onNext(T data);
}
