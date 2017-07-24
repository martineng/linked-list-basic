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
   
}
