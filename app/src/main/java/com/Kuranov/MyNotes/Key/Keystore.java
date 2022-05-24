package com.Kuranov.MyNotes.Key;

public interface Keystore {

    boolean hasPin();

    boolean checkPin(String pin);

    void saveNew(String pin);

}