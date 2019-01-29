class IsogramChecker {

    boolean isIsogram(String phrase) {
       return ifIsigram(phrase);
    }
    public static boolean ifIsigram (String stringForCheack){
        boolean isogram = true;
        try {
            String stringToCheack = stringForCheack.toLowerCase();
            for (int i = 0; i< stringToCheack.length()-1; i++){
                    for (int k = i+1 ; k < stringToCheack.length(); k++) {
                      if ((stringToCheack.charAt(i) == stringToCheack.charAt(k)) && !((stringToCheack.charAt(i) == '-') || (stringToCheack.charAt(i) == ' '))){
                            isogram = false;
                          return isogram;
                        }
                    }
            }
            return isogram;
        }
        catch (Exception e){
            return isogram;
        }
    }

}
