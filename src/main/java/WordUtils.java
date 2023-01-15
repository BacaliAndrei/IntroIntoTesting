public class WordUtils {
    public static String getWordInCapitalLetters(String word) {
        if (word != null) {
            return word.toUpperCase();
        }
        return null;
    }

    public static Double convertToDouble(String birthDayYear) {
        if (birthDayYear != null) {
            return Double.valueOf(birthDayYear);
        }
        return null;
    }

    public static String getDefaultIfNull(String name, String defaultName) {
        if (name == null) {
            return defaultName;
        } else return name;
//        return name == null ? defaultName : name;
    }

    //checks for blank ,null ,empty
    public static boolean isNullOrBlankOrEmpty(String name) {
        return name == null || name.trim().length() == 0;
    }

    public static String concat(String[] words) {
        String returnedString = null;
        if (words != null && words.length > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < words.length; i++) {
                String myStringFromArray = words[i];
                if (myStringFromArray != null){
                    stringBuilder.append(myStringFromArray);
                }
            }
            returnedString=stringBuilder.toString();
        }
        return returnedString;
    }

}
