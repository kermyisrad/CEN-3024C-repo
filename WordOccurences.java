
import java.net.*;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Comparator;

import java.util.HashMap;

import java.util.List;

import java.util.Map;

import java.util.Set;

import java.io.*;
/**
 * 
 * @author Kermith Rosa
 * @version 4/7/23
 */

public class WordOccurences {
/**
 * @param args creates command line arguments as an array of string objects
 * @throws java.lang.Exception repeats conditions
 */
	
public static void main(String[] args) throws Exception {

String Word;

URL poem = new URL("https://www.gutenberg.org/files/1065/1065-h/1065-h.htm");

BufferedReader in = new BufferedReader(

new InputStreamReader(poem.openStream()));

Map<String,Integer> map = new HashMap<String, Integer>();

while ((Word = in.readLine()) != null)

{

String[] words = Word.split("[\\s.;,?:!()\"]+");

for (String word : words) {

word = word.trim();

if (word.length() > 0) {

if (map.containsKey(word)) {

map.put(word, map.get(word) + 1);

} else {

map.put(word, (int) 1L);

}

}

}

}

// retrieving the map contents

Set<Map.Entry<String, Integer>> set = map.entrySet();

// make an array list

List<Map.Entry<String, Integer>> sortedList = new ArrayList<Map.Entry<String, Integer>>(set);

// sorting the array list

Collections.sort( sortedList, new Comparator<Map.Entry<String, Integer>>()

{

public int compare( Map.Entry<String, Integer> a, Map.Entry<String, Integer> b)

{

// order

return (b.getValue()).compareTo( a.getValue() );

}

} );

// printing the list

for(int i = 0; i < 10 && i < sortedList.size(); i++){

System.out.println(sortedList.get(i));

}

in.close();

}

}

