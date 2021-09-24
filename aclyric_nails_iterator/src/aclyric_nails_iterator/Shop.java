package aclyric_nails_iterator;

class Shop
{
	NailCollection nails;

 public Shop(NailCollection nails)
 {
     this.nails = nails;
 }

 public void printNails()
 {
     Iterator iterator = nails.createIterator();
     System.out.println("-------Acrylic nails shop------------");
     while (iterator.hasNext())
     {
         Nails n = (Nails)iterator.next();
         System.out.println(n.getNails());
     }
 }
}
