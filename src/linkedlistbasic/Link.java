package linkedlistbasic;

public class Link
{
    public int key; // The public key of the link
    public double num; // Entity/Information store in this link
    public Link next; // Reference to the next key
    
    public Link()
    {
        // Null constructor
    }
    
    // Constructor
    public Link(int inKey, double inNum)
    {
        key = inKey;
        num = inNum;
    }
    
    public int getKey()
    {
        return key;
    }
    
    public double getNum()
    {
        return num;
    }
       
}
