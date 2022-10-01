class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        
        char[] ct = t.toCharArray();
         Arrays.sort(ct);
        
        String b = new String(c);
        String bt = new String(ct);
        return b.equals(bt);
    }
}
