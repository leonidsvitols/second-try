
public class StarWorks {
    public static void main(String[] args) {
        System.out.println("String is 'My works becomes more difficult' ");
        System.out.println("Word Count- " + countWords(" My works becomes more difficult "));

        System.out.println("Count using split logic " + countWordsUsingSplit("  My works becomes more difficult "));
    }
// copy paste is a good thing, still I want to understand later what's wrong with array declaration here

    private static int countWords(String str){
        int c = 0;
        char cz[]= new char[str.length()];
        for(int i = 0; i < str.length(); i++){
            cz[i] = str.charAt(i);
            /*
             * logic here is if the character read is not a space or tab and the character read before the
             * current char was either space or tab character that means one whole word is read so
             * increment the count.
             */
            if(((i > 0) && (cz[i] != ' ' && cz[i] != '\t')
                    && (cz[i-1] == ' ' || cz[i-1] == '\t'))
                    || ((cz[0] != ' ' && cz[0] != '\t') && (i == 0)))
                c++;
        }
        return c;
    }

    /*
     * This method counts using String split method
     * @param str
     * @return
     */
    private static int countWordsUsingSplit(String str){
        // here split method is used with regex pattern of any number of spaces
        // so it will return a string array with the words
        String[] test = str.trim().split("\\s+");
        return test.length;
    }
}

