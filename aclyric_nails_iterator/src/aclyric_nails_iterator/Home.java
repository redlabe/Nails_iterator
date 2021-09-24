package aclyric_nails_iterator;

class Home
{
 public static void main(String args[])
 {
	 NailCollection nc = new NailCollection();
	 Shop sh = new Shop(nc);
     sh.printNails();
 }
}
