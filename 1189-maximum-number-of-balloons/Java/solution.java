class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> count = new HashMap<>();

        for(char s : text.toCharArray()){
            count.put(s,count.getOrDefault(s,0)+1);
        }

        return Math.min(Math.min(count.getOrDefault('b',0),count.getOrDefault('a',0)),
        Math.min(Math.min(count.getOrDefault('l',0) / 2,count.getOrDefault('o',0) / 2),count.getOrDefault('n',0)));
        
    }
}