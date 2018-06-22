package com.gerbugy.support.secure;

public interface SecureTimerListener {

    void onSecureCounting(int seconds);

    void onSecureWarning(int seconds);

    void onSecureFinished();
}