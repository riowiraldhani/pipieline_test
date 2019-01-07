package de;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * NoteController
 */
public class NoteController {

    static Notes notes = new Notes();

    public static void addNote(Note note) {
        NoteController.notes.addNote(note);
    }

    public static void deleteNote(Note note) {
        NoteController.notes.deleteNote(note);
    }

    public static void loadNotes() {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Notes.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            NoteController.notes = (Notes) jaxbUnmarshaller.unmarshal(new File("notes.xml"));
        } catch (Exception e) {
            System.out.println("There was an error with loading Notes: " + e);
        }

    }

    public static void saveNotes() {
        try {
            JAXBContext context = JAXBContext.newInstance(notes.getClass());
            Marshaller marshaller = context.createMarshaller();
            // I want to save the output file to item.xml
            marshaller.marshal(notes, new FileWriter("notes.xml"));
        } catch (Exception e) {
            System.out.println("There was the following Exception: " + e);
        }
    }

    public static void checkNote(Note note) {
        note.setDone(true);
    }
}