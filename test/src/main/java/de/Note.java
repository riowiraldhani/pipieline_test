package de;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Note
 */
@XmlRootElement(name="note")
public class Note {

    private String title;
 
    private String desc;
  
    private boolean done;

    public Note () {}

    @XmlAttribute(name="title")
	public String getTitle()
	{
		return this.title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

    @XmlElement(name="desc")
	public String getDesc()
	{
		return this.desc;
	}

	public void setDesc(String desc)
	{
		this.desc = desc;
	}

    @XmlElement(name="done")
	public boolean getDone()
	{
		return this.done;
	}

	public void setDone(boolean done)
	{
		this.done = done;
	}
}