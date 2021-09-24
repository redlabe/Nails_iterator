package aclyric_nails_iterator;

class NailCollection implements Collection
{
 static final int MAX_ITEMS = 6;
 int numberOfItems = 0;
 Nails[] nailList;

 public NailCollection()
 {
	 nailList = new Nails[MAX_ITEMS];

     addItem("Nail type 1 - Oval");
     addItem("Nail type 2 - Square");
     addItem("Nail type 3 - Coffin");
 }

 public void addItem(String str)
 {
     Nails nail = new Nails(str);
     if (numberOfItems >= MAX_ITEMS)
         System.err.println("Full");
     else
     {
    	 nailList[numberOfItems] = nail;
         numberOfItems = numberOfItems + 1;
     }
 }
 
 public Iterator createIterator()
 {
     return new NailsIterator(nailList);
 }

}