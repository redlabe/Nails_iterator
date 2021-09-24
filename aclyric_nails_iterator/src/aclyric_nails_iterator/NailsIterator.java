package aclyric_nails_iterator;

class NailsIterator implements Iterator
{
 Nails[] nailList;

 int pos = 0;

 public  NailsIterator (Nails[] nailList)
 {
     this.nailList = nailList;
 }

 public Object next()
 {
     Nails nails =  nailList[pos];
     pos += 1;
     return nails;
 }

 public boolean hasNext()
 {
     if (pos >= nailList.length ||
    		 nailList[pos] == null)
         return false;
     else
         return true;
 }
}