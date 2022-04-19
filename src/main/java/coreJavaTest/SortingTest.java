package coreJavaTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingTest {
public static void main(String[] args) {
	List<Hosting> list = new ArrayList<>();
    list.add(new Hosting(1, "liquidweb.com", 80000));
    list.add(new Hosting(2, "linode.com", 90000));
    list.add(new Hosting(3, "digitalocean.com", 120000));
    list.add(new Hosting(4, "aws.amazon.com", 200000));
    list.add(new Hosting(5, "mkyong.com", 1));
    list.add(new Hosting(6, "linode.com", 100000));

    //example 1
    Map result1 = list.stream()
            .sorted(Comparator.comparingLong(Hosting::getWebsites).reversed())
            .collect(
                    Collectors.toMap(
                            Hosting::getName, Hosting::getWebsites, // key = name, value = websites
                            (oldValue, newValue) -> oldValue,       // if same key, take the old key
                            LinkedHashMap::new                      // returns a LinkedHashMap, keep order
                    ));

    System.out.println("Result 1 : " + result1);
}
}

class Hosting{
	 private int Id;
	 private String name;
	 private long websites;

	    public Hosting(int id, String name, long websites) {
	        Id = id;
	        this.name = name;
	        this.websites = websites;
	    }

		/**
		 * @return the id
		 */
		public int getId() {
			return Id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			Id = id;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the websites
		 */
		public long getWebsites() {
			return websites;
		}

		/**
		 * @param websites the websites to set
		 */
		public void setWebsites(long websites) {
			this.websites = websites;
		}

		@Override
		public String toString() {
			return "Hosting [Id=" + Id + ", name=" + name + ", websites=" + websites + "]";
		}
}