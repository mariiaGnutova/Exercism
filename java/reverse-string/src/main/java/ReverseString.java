class ReverseString {

    String reverse(String inputString) {
        StringBuilder revertString = new StringBuilder();
        if (!(inputString==null)){
            for (int i = inputString.length()-1; i >= 0; i--){
                revertString.append(String.valueOf(inputString.charAt(i)));
            }
        }
        return revertString.toString();
    }
  
}