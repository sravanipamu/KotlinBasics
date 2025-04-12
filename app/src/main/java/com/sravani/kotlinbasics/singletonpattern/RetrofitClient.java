package com.sravani.kotlinbasics.singletonpattern;

// first way
public class RetrofitClient {
    private static final RetrofitClient instance = new RetrofitClient();

    // Private constructor to prevent instantiation
    private RetrofitClient() { }

    public static RetrofitClient getInstance() {
        return instance;
    }
}

//second way
// lazy intialization
class RetrofitClientLazy {

    private static RetrofitClientLazy instance;

    private RetrofitClientLazy() { }

    public static RetrofitClientLazy getInstance() {
        if (instance == null) {
            instance = new RetrofitClientLazy(); // Not thread-safe!
        }
        return instance;
    }
}

//3rd way

class RetrofitClientSyncronized {

    private static RetrofitClientSyncronized instance;

    private RetrofitClientSyncronized() { }

    public static synchronized RetrofitClientSyncronized getInstance() {
        if (instance == null) {
            instance = new RetrofitClientSyncronized();
        }
        return instance;
    }
}

//4th way
 class RetrofitClientDoubleSyncronized {

    private static volatile RetrofitClientDoubleSyncronized instance;

    private RetrofitClientDoubleSyncronized() { }

    public static synchronized RetrofitClientDoubleSyncronized getInstance() {
        if (instance == null) {
            synchronized(RetrofitClientDoubleSyncronized.class) {
                if (instance == null) {
                    instance = new RetrofitClientDoubleSyncronized();
                }
            }
        }
        return instance;
    }
}

