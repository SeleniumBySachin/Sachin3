package Collection;

import java.util.ArrayList;
import java.util.Iterator;

class Book{
	String tittle;
	String author;
	double price;
	Book(){}
	public Book(String tittle, String author, double price) {
		super();
		this.tittle = tittle;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [tittle=" + tittle + ", author=" + author + ", price=" + price + "]";
	}

}
public class Driver2 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(new Book("MT","Chetan",500));
		ls.add(new Book("SQL","Bharath",450));
		ls.add(new Book("Java","Rajesh",1000));
		System.out.println(ls);
	   Iterator i=ls.iterator();
	   while(i.hasNext()) {
		   Book b1=(Book)i.next();
		   if(b1.tittle.equalsIgnoreCase("java")) {
			   i.remove();
			  
		   }
	      }
	   System.out.println(ls);
		}
		
	}


