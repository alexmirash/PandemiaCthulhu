package com.alex.mirash.pandemiacthulhu.roll;

import android.util.Log;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author Mirash
 */

public class DiceRoll<T> {
    public static final String TAG = "DiceRoll";

    private List<T> values;
    private Random random = new Random();

    public DiceRoll(List<T> values) {
        this.values = values;
    }

    public T getRanadomValue() {
        logState();
        int size = values.size();
        if (size == 0) {
            return null;
        }
        int randomIndex = random.nextInt(size);
        T rolledValue = values.get(randomIndex);
        Log.d(TAG, "getRandomValue rolled: randomIndex + " + randomIndex + "; value = " + String.valueOf(rolledValue));
        return rolledValue;
    }

    public void logState() {
        Log.d(TAG, Arrays.toString(values.toArray()));
    }
}
