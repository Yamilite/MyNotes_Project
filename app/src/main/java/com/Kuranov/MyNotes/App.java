package com.Kuranov.MyNotes;

import android.app.Application;
import android.content.Context;
import com.Kuranov.MyNotes.Key.Keystore;
import com.Kuranov.MyNotes.Key.SimpleKeystore;
import com.Kuranov.MyNotes.Repository.FileNoteRepository;
import com.Kuranov.MyNotes.Repository.NoteRepository;

import java.io.File;

public class App extends Application {

    private static Keystore keystore;
    private static NoteRepository noteRepository;

    @Override
    public void onCreate() {
        super.onCreate();
        keystore = new SimpleKeystore(getSharedPreferences("password_text", Context.MODE_PRIVATE));
        final File notesRoot = new File(getFilesDir(), "notes");
        //noinspection ResultOfMethodCallIgnored
        notesRoot.mkdir();
        noteRepository = new FileNoteRepository(notesRoot);

    }

    public static Keystore getKeystore() {
        return keystore;
    }

    public static NoteRepository getNoteRepository() {
        return noteRepository;
    }

}
