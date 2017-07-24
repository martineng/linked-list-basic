package linkedlistbasic;

public class LinkList
{
    private Link first; // Reference to the first link in list
    
    // Null Constructor, No item on list
    public LinkList()
    {
        first = null;
    }
    
    public boolean isEmpty()
    {
       return (first == null);   
    }
    
    // Insert at the beginning of the list
    public void insertFirst(int inKey, double inNum)
    {
        Link newLink = new Link(inKey, inNum);
        newLink.next = first;
        first = newLink;  // Replacing
    }
    
    // Deleting first item
    public Link deleteFirst()
    {
        Link temp = first; // Saving the reference to link
        first = first.next; // Deleting
        return temp; // Return deleted link
    }   
    
    public Link find(int inKey)
    {
        Link current = first;
        
        while (current.getKey() != inKey)
        {
            if (current.next == null)
            {
                return null;
            }
            else
            {
                current = current.next; // Go to the next link
            }
        }
        
        return current;
    } // END find()
    
    public Link delete(int inKey)
    {
        Link current = first;
        Link previous = first;
        
        while (current.getKey() != inKey)
        {
            if (current.next == null)
            {
                return null;
            }
            else
            {
                previous = current; // Go to the next 
                current = current.next;
            }
        } // END WHILE
        
        if (current == first) // if first link
        {
            first = first.next; // swap the first
        }
        else
        {
            previous.next = current.next; // bypassing it
        }
        
        return current;
    }// END delete()
    
    public Link getFirst()
    {
        return first;
    }
}
