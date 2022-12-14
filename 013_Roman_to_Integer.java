class Solution_13 {
    public int romanToInt(String s){
        char[] romanSymbols =  {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] romanIntValues = {1,    5,   10,  50, 100, 500, 1000};
        int sum = 0;
        int[] outputValues = new int[s.length()];

        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            for(int j=0; j<romanSymbols.length; j++){
                if(romanSymbols[j]==c){
                    int intV = romanIntValues[j];
                    outputValues[i] = intV;
                    break;
                }
            }
        }
        for(int i=0; i<outputValues.length-1; i++){
            if(outputValues[i] >= outputValues[i+1]){
                sum += outputValues[i];
            } else if (outputValues[i] < outputValues[i+1]) {
                sum -= outputValues[i];
            }
        }
        sum += outputValues[outputValues.length-1];
        return sum;
    }
}