package de;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Notes
 */
@XmlRootElement(name="notes")
public class Notes {

    private ArrayList<Note> notes;

    public Notes() {
        this.notes = new ArrayList<Note>();
    }

    @XmlElement(name="note")
	public ArrayList<Note> getNotes()
	{
		return this.notes;
	}

	public void setNotes(ArrayList<Note> notes)
	{
		this.notes = notes;
    }
    
    public void addNote(Note note) {
        this.notes.add(note);
    }

    public void deleteNote(Note note) {
        this.notes.remove(note);
    }

    public Note getNoteByTitle(String title) {
        for(Note n: this.notes) {
            if(n.getTitle().equals(title)) {
                return n;
            }
        }
        return null;
    }



}