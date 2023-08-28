public class ClassWork03062023 {
        public static void main(String[] args){
    
            String str1 = "JSU";
            String str2 = "JSU";
            String str3 = new String("JSU");
            
            
    
    
            // == : not comparing values; comparing memory locations
            System.out.println(str1 == str2); // string interning
            System.out.println(str2 == str3);
    
    
            //character class
            char myChar = 'c';
            //Wrapper class: character
            if(Character.isUpperCase(myChar)){ //isLowerCase
                System.out.println(myChar + "is uppercase!");
            }
            myChar = Character.toLowerCase(myChar);
    
            System.out.println(myChar);
    
            // To explore all the Character functions,
            //type Character and then put a dot (.)
            
            // Mutable string 
            //StringBuffer 
            //StringBulider
    
            StringBuffer sBuffer1 = new StringBuffer("Hello");
            sBuffer1.append(" JSU!!");
            System.out.println(sBuffer1);
    
            //StringBuffer is thread safe
            //STringBuilder is not thread safe
    
            StringBuilder sBuilder1 = new StringBuilder("Hello");
            sBuilder1.append(" JSU!!");
            System.out.println(sBuilder1);
    
    
            //String comparsion
            //equals()
            String str4 = "Goku";
            String str5 = new String("Luffy");
    
            System.out.println(str4 == str5);
            System.out.println(str4.equals(str5));
            System.out.println(str4.equalsIgnoreCase(str5));
            System.out.println(str4.compareTo(str5));


    
    }

}
