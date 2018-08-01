package com.jda.ObjectOrientedPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.impl.DefaultPrettyPrinter;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

import com.jda.utility.Inventory;
import com.jda.utility.Utility;

public class InventoryManagementProgram {
	public static Boolean compare(String str1, String str2) {
		if (str1.compareTo(str2) == 0)
			return true;
		return false;
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException ,ConcurrentModificationException{
		Object obj = new JSONParser().parse(new FileReader("C:/Users/1022279/Downloads/JSON2.json"));
		JSONObject jo = (JSONObject) obj;
		String[] str = { "Rice", "Pulses", "Wheat" };

		Utility utility = new Utility();
		int value;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the pro value,true-continue,false-stop");
		boolean pro;
		pro = utility.getBoolean();

	//	HashMap<String, ArrayList<Inventory>> map = new HashMap();
		/*
		 * for (String inventory : str) { map.put(inventory, readJsonArray(jo,
		 * inventory)); }
		 */
		while (pro == true) {
			
			// Write into the file
			// Iterator<Map.Entry> iterator1;
			// Iterator iterator2 = variable.iterator();
			System.out.println("Enter the value,1-add,2-delete,3-print");
			value = utility.getValue();
			if (value == 1) {
				System.out.println("Enter the grocery type you want to edit-0-Rice,1-Pulses,2-Wheat");
				int i = utility.getValue();
				JSONArray variable = (JSONArray) jo.get(str[i]);
				System.out.println(variable);
				
				int weight, price;
				String type;
				System.out.println("Enter the values of weight,price and type");
				weight = utility.getDay();
				price = utility.getGoal();
				type = utility.getStringValue();
				ObjectMapper mapper = new ObjectMapper();
				Inventory inventory = new Inventory(type, weight, price);
				HashMap<String, ArrayList<Inventory>> inventoryMap = null;
				// inventoryMap.get(inventory).add(inventory);

				String json = mapper.writeValueAsString(inventory);
				System.out.println("Json is "+ json);

				variable.add(1, inventory);
				JSONObject jo2 = (JSONObject) obj;
				jo2.put(str[i], variable);
				System.out.println("Variable is "+variable);

				System.out.println();
				System.out.println();
				System.out.println();

				System.out.println(jo2);
				ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
				writer.writeValue(new File("C:/Users/1022279/Downloads/JSONoutput.json"), jo2);

			}
			// Delete from the file
			if (value == 2) {
				System.out.println("Enter the grocery type you want to edit-0-Rice,1-Pulses,2-Wheat");
				int m = utility.getValue();
				JSONArray remove = (JSONArray) jo.get(str[m]);
				System.out.println("Enter the type you want to remove");
				//System.out.println(remove);
				String x = scan.nextLine();
				Iterator<Map.Entry> iterator1;
				Iterator iterator2 = remove.iterator();
				while (iterator2.hasNext()) {
					iterator1 = ((Map) iterator2.next()).entrySet().iterator();

					int count = 0;
					// int priceLocal =0;
					// int wt =0;//wt=p*wpk
					// int p=0;
					// int wpk=0;//weight per kg
					boolean flag = false;
					while (iterator1.hasNext()) {
						Map.Entry pair = iterator1.next();
						
						String key = (String) pair.getKey();
						String value1 = (String) pair.getValue();
						if (compare(value1, x) == true) {
							remove.remove(count);
							flag = true;
							break;
						}
					}
					if(flag == true)break ;
						count++;
					}
					
				
					
					JSONObject jo3 = (JSONObject) obj;
					jo3.put(str[m], remove);
					//System.out.println(remove);

					System.out.println();
					System.out.println();
					System.out.println();

					System.out.println(jo3);
					ObjectMapper mapper = new ObjectMapper();
					ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
					writer.writeValue(new File("C:/Users/1022279/Downloads/JSONoutput.json"), jo3);
					

				
			}
			System.out.println("Enter pro");
			pro = utility.getBoolean();
		}
		System.out.println("Done all the operations and sent result to JSONOutput file");
		scan.close();
	}


	/*
	 * private static void outputToJSONFile(String[] str,HashMap<String,
	 * ArrayList<Inventory>> inventoryMap) { for (String inventory : str) {
	 * map.put(inventory, readJsonArray(jo, inventory)); } String json =
	 * mapper.writeValueAsString(inventory); System.out.println(json); ObjectMapper
	 * mapper = new ObjectMapper(); ObjectWriter writer = mapper.writer(new
	 * DefaultPrettyPrinter()); writer.writeValue(new
	 * File("C:/Users/1022279/Downloads/JSONoutput.json"), inventory); }
	 */

}
