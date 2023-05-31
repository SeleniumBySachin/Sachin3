package Wrapper;

import java.util.ArrayList;

public class P9 {
	public static void main(String[] args) {
       ArrayList southemenu=new ArrayList();
       southemenu.add("Dosa");
       southemenu.add("Idly");
       southemenu.add("Ragiball");
       System.out.println("Souhemenu"+southemenu);
       
       ArrayList northemenu=new ArrayList();
       northemenu.add("Pav baji");
       northemenu.add("Vada pav");
       northemenu.add("Cholebature");
       System.out.println("Northemenu"+northemenu);
       
       southemenu.addAll(northemenu);
       System.out.println("Souhemenu"+southemenu);
       System.out.println(southemenu.size());
       southemenu.add(northemenu);
       System.out.println(northemenu.size());
       
	}
}
