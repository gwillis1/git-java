
    import java.util.Scanner;

public class Group_6project {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int sectionChoice = 0;

        while (sectionChoice != 4) {
            System.out.println("Safe online chatting and messaging: ");
            System.out.println("\nThis section will cover the potential risks associated with online chatting ");
            System.out.println("and messaging and how to stay safe while communicating online.");
            System.out.println("\n---------------------------------------------------------------");
            System.out.println("1.Introduction");
            System.out.println("2.List of risk factors associated with the topic");
            System.out.println("3.List of techniques that can be used to prevent each topic");
            System.out.println("4.A Quiz related to the topic ");
            System.out.println("5.A list of online resources that access to learn about each topic ");

            System.out.print("\nEnter the section number you wish to explore: ");
            sectionChoice = scanner.nextInt();
            System.out.println();

            switch (sectionChoice) {
                case 1:
                    System.out.println("Introduction:");
                    System.out.println("-Safe online chatting and messaging.");
                    System.out.println("\nTheres no denying that our childrens lives are impacted by the online world.");
                    System.out.println("With everything from education to entertainment to socializing having an online component,");
                    System.out.println("its difficult to escape an onslaught of digital");
                    System.out.println("platforms that might cause danger to children nowadays.");
                    break;
            }

            switch (sectionChoice) {
                case 2:
                    System.out.println("Risk factors:");
                    System.out.println("Multiple risk factors can cause danger to children while chatting and messaging online.");
                    System.out.println("\nCertainly, First theres General privacy was a primary issue ");
                    System.out.println("that fail consideration of what information ");
                    System.out.println("that handing over online to questionable websites and individuals.");
                    System.out.println("Even the contents of private communications arent safe.");
                    System.out.println("The largest tech companies have admitted to scamming emails and messages.");
                    System.out.println("platforms that might cause danger to children nowadays.");

                    System.out.println("\nSecondly, there isn't just offline bullying their cyberbullying. ");
                    System.out.println("Meaning a young teenage man could anonymously cyberbully ");
                    System.out.println("a teenage girl in another continent without anyone else knowing.");

                    System.out.println("\nThirdly On the other hand, The immediate risk was online predators that can easily take advantage of children online.");
                    System.out.println("easily take advantage of children online.");
                    System.out.println("Most predators monitor online chat forums gathering data ");
                    System.out.println("that could be used in online and offline attacks on anyone and their children. ");
                    break;
            }
        }
    }
}
        



    
    

