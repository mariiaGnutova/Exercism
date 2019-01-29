class RaindropConverter {

    String convert(int number) {
        String message = "";
            for (int divide = 3; divide < 8; divide = divide+2){
                int factor;
                switch (divide){
                    case 3:
                        factor = number % divide;
                        if (factor == 0){
                            message = message + "Pling";}
                            break;
                    case 5:
                        factor = number % divide;
                        if (factor == 0){
                            message = message + "Plang";}
                            break;
                    case 7:
                        factor = number % divide;
                        if (factor == 0){
                            message = message + "Plong";}
                            break;
                }
        }
         if (message.length() > 0) {
             return message;
         }
         else {
             return Integer.toString(number);
         }
    }

}
