import java.util.Arrays;

class PigLatinTranslator{
    public String [] vowel = {"a","o","u","i","e","xr","yt"};

    String translate (String toTranslate){
        String toSeparateWords[] = toTranslate.split("(\\s+)");
        StringBuilder create = new StringBuilder();
        for (String toPig:toSeparateWords){
            create.append(converter(toPig));
            create.append(" ");
        }
        String result = create.toString().trim();
    return result;
    }

    public String converter (String toTranslate){
        String translateResult = new String();
        for (String check: vowel){
            if (toTranslate.startsWith(check)){
                translateResult = toAy(toTranslate);
                return translateResult;
            }}

        if (translateResult.length() == 0) {
            int i = 0;
            int count [] = new int[i];
            for (int y = 0; y < 5; y++){
                if (toTranslate.indexOf(vowel[y]) > 0){
                    count = Arrays.copyOf(count, count.length + 1);
                    count[i] = toTranslate.indexOf(vowel[y]);
                    i++;
                }
            }
            if (toTranslate.indexOf('y')>0){
                count = Arrays.copyOf(count, count.length + 1);
                count[i] = toTranslate.indexOf('y');
            }
            Arrays.sort(count);
            int k;
            try {
                k = count[0];
            }
            catch (IndexOutOfBoundsException e){
                k = 1;
            }
            if (toTranslate.charAt(k) == 'u' && toTranslate.charAt(k - 1) == 'q'){
                k++;
            }
            String buffer = toTranslate.substring(0, k);
            translateResult = toTranslate.substring(k).concat(buffer);
            translateResult = toAy(translateResult);
            return translateResult;
        }
        return translateResult;
    }

    public static String toAy (String toConvert){
        toConvert = toConvert.concat("ay");
        return toConvert;
    }
}