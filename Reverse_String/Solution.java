class Solution {
public void reverseString(char[] s) {
     
  String str=new String(s);
    StringBuilder sb=new StringBuilder(str);
    sb.reverse();
    String reversed=sb.toString();
    for(int i=0;i<s.length;i++){
        s[i]=reversed.charAt(i);
    }
    System.out.println(reversed);
    
    }
}