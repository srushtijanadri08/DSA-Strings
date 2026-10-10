class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] arr1=s1.toCharArray();
        Arrays.sort(arr1);
        String sortedS1=new String(arr1);
        for(int i=0;i<=s2.length()-s1.length();i++){
            String part=s2.substring(i,i+s1.length());
            char[] arr=part.toCharArray();
            Arrays.sort(arr);
            String sortedPart=new String(arr);
            if(sortedS1.equals(sortedPart)){
                return true;
            }
        }
        return false;
    }
}