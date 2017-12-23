package datastructure;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<Object> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.remove(1);

		//connection to my database
		ConnectDB connectDB = new ConnectDB();
		connectDB.InsertDataFromArrayListToMySql(list, "user", "Name");
		connectDB.readDataBase("user" , "Name");
		//using Iterator to retrive data
		Iterator it = list.listIterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
		for(Object ob : list);
		System.out.println(list);

	}

}
