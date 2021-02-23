/*
 * Element class
 * component element of a collection
 * this is done at pseudocode level, but
 * it's good for testing and practice
 * 
 */


public class Element
{
	private String data; // can also be a number, object, array, etc.
	private Element next;
	
	public Element() { }
	
	public Element(String data)
	{	this.data = data;
		this.next = null;
	}
	
	public boolean hasNext()
	{	return this.next != null;
	}
	
	public Element getNext()
	{	return this.next;
	}
	
	public String getData()
	{	return this.data;
	}
	
	public void setNext(Element e)
	{	this.next = e;
	}
	
	public void setData(String data)
	{	this.data = data;
	}
	
	public String toString()
	{	return this.data;
	}
	
}

