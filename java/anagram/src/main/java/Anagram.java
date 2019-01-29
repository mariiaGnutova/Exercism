import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Anagram {
    String wordForCheck;
    String wordAnagramOrigin = new String();
    public Anagram (String wordAnagram){
        wordAnagramOrigin = wordAnagram;
       wordAnagram = sortLetter(wordAnagram);
        this.wordForCheck = wordAnagram;
    }

   public List<String> match (List <String> ifHierAnnargam){
        int i = 0;
       List<String> listOfAnnagram = new LinkedList<>();
        for (String wordToCheck: ifHierAnnargam){
            if (sortLetter(wordToCheck).equals(wordForCheck) && (!wordToCheck.toLowerCase().equals(wordAnagramOrigin.toLowerCase()))){
                listOfAnnagram.add(i, wordToCheck);
                i++;
            }
        }
       return listOfAnnagram;
   }

   public String sortLetter (String toSort){
       char[] sortLetters = toSort.toLowerCase().toCharArray();
       Arrays.sort(sortLetters);
       String sortResult = new String(sortLetters);
       return sortResult;
   }
}


