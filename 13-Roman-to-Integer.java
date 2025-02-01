class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5); 
        map.put('X', 10); 
        map.put('L',50);
        map.put('C', 100); 
        map.put('D', 500); 
        map.put('M', 1000); 
        int num =0; 
        int prev=0;
        for(int i=0;i<s.length(); i++){ 
            if(map.containsKey(s.charAt(i))){
                int curr =map.get(s.charAt(i));
                if(curr>prev && prev!=0){
                    int diff = curr - prev; 
                    int subtractVal = num - prev; 
                    num = subtractVal + diff;
                }
            else{
                num = num + map.get(s.charAt(i));
            }
                prev = map.get(s.charAt(i));
            }
        }
        return num;
    }
}