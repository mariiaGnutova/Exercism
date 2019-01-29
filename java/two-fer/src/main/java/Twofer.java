
class Twofer {
    String twofer(String name) {
       /* int a =0;
        try {
           a = name.length();
        }
        catch (NullPointerException e){
            a = 0;
        }
        if (a == 0){
            return "One for " + "you" +", one for me.";
        }
        else {
            return "One for " + name +", one for me.";
        }*/

           String userName = new String();
          if (name == null){
              userName = "you";
          }
          else {
              userName = name;
          }
        luckyName != null ? luckyName : "No lucky name found";
        String str = String.format("One for %s, one for me.", userName);
        return str;
    }
}
