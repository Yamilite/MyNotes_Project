package com.Kuranov.MyNotes.Repository;

import androidx.annotation.Nullable;
import com.Kuranov.MyNotes.ItemData;
import java.util.List;

public interface NoteRepository {

    @Nullable
    ItemData getNoteById(int id);

    List<ItemData> getNotes();

    void saveNote(String title, String note, String deadline);

    void deleteById(int id);

    void update(int id, String title, String note, String deadline);


}

