class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
char a[]=new char[s.length()];
char b[]=new char[t.length()];
a=s.toCharArray();
b=t.toCharArray();
Arrays.sort(a);
Arrays.sort(b);
return Arrays.equals(a,b);
    }
}
