class Solution {
    public boolean detectCapitalUse(String word) {
        boolean allUpper=word.equals(word.toUpperCase());
        boolean allLower=word.equals(word.toLowerCase());
        boolean firstUpper=Character.isUpperCase(word.charAt(0));
        boolean remainingLower=true;
        for(int i=1;i<word.length();i++){
            if(!Character.isLowerCase(word.charAt(i))){
                remainingLower=false;
                break;
            }
        }
        return allUpper||allLower||(firstUpper&&remainingLower);

    }
}