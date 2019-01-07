package de;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Before
    public void initData() {
        Note note = new Note();
        note.setTitle("testTitle");
        note.setDesc("testDesc");
        note.setDone(false);
        NoteController.addNote(note);
        NoteController.saveNotes();
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testLoadNotes() {
        NoteController.loadNotes();
        assertEquals("check if title is correct from loaded note", "testTitle", NoteController.notes.getNotes().get(0).getTitle());
    }

    @Test
    public void testAddNote() {
        addTestNote();
        assertEquals("check if added Note exists in List", "titleToAdd", NoteController.notes.getNoteByTitle("titleToAdd").getTitle());
        removeTestNote();
    }

    @Test
    public void testSaveNote() {
        addTestNote();
        NoteController.saveNotes();
        NoteController.loadNotes();
        assertEquals("check if added Note exists in List", "titleToAdd", NoteController.notes.getNoteByTitle("titleToAdd").getTitle());
    }

    public void addTestNote() {
        Note noteAdd = new Note();
        noteAdd.setDesc("descToAdd");
        noteAdd.setDone(false);
        noteAdd.setTitle("titleToAdd");
        NoteController.addNote(noteAdd);
    }

    public void removeTestNote() {
        NoteController.deleteNote(NoteController.notes.getNoteByTitle("titleToAdd"));
    }
}
