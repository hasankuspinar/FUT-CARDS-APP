package com.example.futcards;

import android.app.Application;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FutCardApplication extends Application {
    ExecutorService srv = Executors.newCachedThreadPool();
}
