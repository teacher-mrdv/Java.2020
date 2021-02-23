/*
 * Collection class
 * 
 * Collection of elements - implementation of
 * chapter 4 collections [pseudocode level]
 * for practice and testing
 * 
 * note that a counter may be added as a member/attribute
 * to keep track of the size of the collection
 * 
 */
 
public class Collection
{
	Element start;
	Element current;
	
	public Collection()
	{	this.start = null;
		this.current = null;
	}
	
	public boolean isEmpty()
	{	return start == null;
	}

	public boolean hasNext()
	{	return current != null;
	}

	public void addItem(String data)
	// can also be a number, object, array, etc. instead of String
	{
		Element newElement = new Element(data);
		if( isEmpty() ) // add first element
		{	start = newElement;
			current = start;
		} else {
			current.setNext(newElement);
			current = current.getNext();
		}
	}
	
	public String getNext()
	{
		String data = current.getData();
		current = current.getNext();
		return data;
	}
	
	public void resetNext()
	{	this.current = this.start;
	}
	
	public String toString()
	{	String output = "[ ";
		resetNext();
		while( this.current != null )
		{	String e = this.getNext();
			output = output + e + "  ";
		}
		return output + "]";
	}
	
	public void print()
	{	this.resetNext();
		while( this.current.hasNext() )
		{	System.out.println(this.getNext());
		}
	}
}

