class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(String str:strs){
            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            String c=new String(ch);
            if(!map.containsKey(c)){
                map.put(c,new ArrayList<>());
            }
            map.get(c).add(str);
        }
    
      return new ArrayList<>(map.values());
}
}
