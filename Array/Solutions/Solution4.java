class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<HashMap<Character,Integer>, List<String>> map=new HashMap<>();		//Tracks the unique mapping of elements and the list of the srings that has the same frequency
         
		 
		 //Itrate through all the elements in the given list
        for(int i=0;i<strs.length;i++){
            String currString=strs[i];

            //Tracks the frequencyMap in each string
            HashMap<Character,Integer> freqMap=new HashMap<>();
            for(char ch: currString.toCharArray()){
                freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
            }

            //If the frequency map is not in our map then add the freqMap and the string to a new list;
            if(!map.containsKey(freqMap)){
                List<String> strList=new ArrayList<>();
                strList.add(currString);
                map.putIfAbsent(freqMap, strList);
            }else{
				//If the frequencyMap is present in our map then no need to update the map only add the string to the list that has the same frequency table
                map.get(freqMap).add(currString);
            }

        }
		//Rerturn teh values by creating a new List by using list in our map.
        return new ArrayList<>(map.values());
    }
}
