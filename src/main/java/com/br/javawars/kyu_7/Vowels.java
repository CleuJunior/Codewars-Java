package com.br.javawars.kyu_7;

public class Vowels {
    private static char[] stringToArray(String string){
        char[] charArray = new char[string.length()];
        for(int index=0; index < string.length(); index++){ charArray[index] = string.charAt(index);  }

        return charArray;
    }

    private static int charCountVowels(char[] vowls, String string){
        int vowelsCount = 0;
        for(int index=0; index < string.length(); index++){
            switch (vowls[index]){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelsCount += 1;
                    break;

                default:
                    break;

            }
        }

        return vowelsCount;
    }


    public static int getCount(String str) {
        char[] arrayOfChars = stringToArray(str);

        return charCountVowels(arrayOfChars, str);
    }

}
