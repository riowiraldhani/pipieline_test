package de;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Starting App");
        //NoteController.loadNotes();
        Note note = new Note();
        note.setDesc("desc3");
        note.setDone(false);
        note.setTitle("title3");
        NoteController.addNote(note);
        // NoteController.checkNote(NoteController.notes.getNoteByTitle("title2"));
        NoteController.saveNotes();
    }
}
