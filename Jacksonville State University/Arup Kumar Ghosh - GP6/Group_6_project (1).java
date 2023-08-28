import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Group_6_project {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int sectionChoice = 0;

        while (sectionChoice != 5) {
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

                    System.out.println("\nThirdly On the other hand, The immediate risk was online predators that ");
                    System.out.println("can easily take advantage of children online.");
                    System.out.println("easily take advantage of children online.");
                    System.out.println("Most predators monitor online chat forums gathering data ");
                    System.out.println("that could be used in online and offline attacks on anyone and their children. ");
                    break;
                case 3:
                   // topic here;
                    break;
                    case 4:
                    // Implement the quiz related to the topic here.
                    break;
                    case 5:
                    showResources();
                    break;
                    }
                    }
                    }

                    public static void showResources() {
                        Scanner scanner = new Scanner(System.in);

                        System.out.println("Welcome to Online Safety Resources!");
                        System.out.println("Please choose an option to learn more:");
                        System.out.println("1. National Online Safety Guides");
                        System.out.println("2. US Federal Trade Commission Guide");
                        System.out.println("3. Common Sense Media Guide");
                        System.out.println("4. Facebook Safety Page");
                        System.out.println("5. Instagram Safety Page");
                        System.out.println("6. Twitter Safety Page");
                        System.out.println("7. Snapchat Safety Page");

                        int users_input = scanner.nextInt();

                        switch (users_input) {
                            case 1:
                                openUrl("https://www.ecpatusa.org/onlinesafetytips?gclid...");
                                break;
                            case 2:
                                openUrl("https://www.missingkids.org/netsmartz/topics/smartphones?gclid=Cj0KCQjw8qmhBhClARIsANAtboedMwfVX-AsYY_dnMSvM78jE87BZhaLbAU_tUyGuSFxHKDmo7z3GqAaApCWEALw_wcB");
                                break;
                            case 3:
                                openUrl("https://www.ftc.gov/business-guidance");
                                break;
                            case 4:
                                openUrl("https://www.facebook.com/help/122006714548814");
                                break;
                            case 5:
                                openUrl("https://about.instagram.com/community/safety");
                                break;
                            case 6:
                                openUrl("https://help.twitter.com/en/safety-and-security");
                                break;
                            case 7:
                                openUrl("https://www.snap.com/en-US/safety/safety-center/");
                                break;
                        }

                    }

                    public static void openUrl(String url) {
                        if (Desktop.isDesktopSupported()) {
                            Desktop desktop = Desktop.getDesktop();
                            try {
                                desktop.browse(new URI(url));
                            } catch (IOException | URISyntaxException e) {
                                e.printStackTrace();
                            }
                        } else {
                            System.err.println("Desktop is not supported. Please visit the URL manually.");
                        }
                    }
                }
