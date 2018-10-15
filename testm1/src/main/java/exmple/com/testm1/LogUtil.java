package exmple.com.testm1;

import android.util.Log;

public class LogUtil {
    private static final String TAG = "LogUtil";

    public static void debug(String message) {
        Log.d(TAG, message);
    }
}
