class Solution {
    public String longestCommonPrefix(String[] strs) {
        String firstString = strs[0];
        for(int i=1; i<strs.length; i++){ //O(n)
            String nextString = strs[i];
            StringBuilder lcp = new StringBuilder();
            for(int j=0; j<firstString.length(); j++){ //O(m)
                if(j >= nextString.length()){
                    break;
                }
                if(firstString.charAt(j) == nextString.charAt(j)){
                    lcp.append(firstString.charAt(j));
                }else break;
            }
            if(firstString.length() == 0 ) break;
            firstString = String.valueOf(lcp);
            System.out.println(firstString);
        }
        return firstString;
        
    }
}