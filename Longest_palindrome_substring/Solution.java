class Solution {
    public String longestPalindrome(String s) {
        //using strings
       String longest="";
       for(int start=0;start<s.length();start++){
        for(int end=start+1;end<=s.length();end++){
            String Part=s.substring(start,end);
        
            StringBuilder sb=new StringBuilder(Part);
            sb.reverse();
            if(Part.equals(sb.toString())){
                if(Part.length()>longest.length()){
                    longest=Part;
       }
        }
       }
       }
       return longest;


    }
}