package Mafiya;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Mafiya {

    public static void main(String[] args) {

        String [] str = {"mafia", "mafia", "doctor", "sheriff", "citizen", "citizen","citizen","citizen","citizen","mafia","sheriff", "citizen", "citizen", "mafia","doctor"};
        System.out.println("If you want to play in Mafia game, you need at least 8 people (maximum 15)");
        ArrayList<String>actualRoles = new ArrayList<String>();
        System.out.println("Please Enter number of Players");
        Scanner scanner = new Scanner(System.in);
        int numOfPlayers = scanner.nextInt();
        if(numOfPlayers<8){
            System.out.println("Find more players. For game need at least 8 people");
        }else if(numOfPlayers>15){
            System.out.println("Maximum 15 players");
        }else{
            for (int i = 0; i < numOfPlayers; i++) {
                actualRoles.add(str[i]);
            }
        }
        Collections.shuffle(actualRoles);
        ArrayList<String>namesOfPlayers = new ArrayList<String>();
        ArrayList<String>emails = new ArrayList<String>();
        scanner.nextLine();

        for (int i = 1; i < numOfPlayers+1; i++) {
            System.out.println("Player "+i+ " Enter your name");
            namesOfPlayers.add(scanner.nextLine());
            System.out.println("Player "+i+ " Enter your email address");
            emails.add(scanner.nextLine());
        }

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://translate.google.com/");

//        driver.findElement(By.xpath("//textarea[@id='source']")).sendKeys("The night is coming. Please close your eyes to begin the night cycle");
//        driver.findElement(By.xpath("//*[@id='sugg-item-en']")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[5]/div[3]/div[2]")).click();
//


//        driver.findElement(By.xpath("//textarea[@id='source']")).sendKeys("Mafia wakes up, and chose the target");
//        driver.findElement(By.xpath("//*[@id='sugg-item-en']")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[5]/div[3]/div[2]")).click();

        System.out.println("Mafiya enter name: ");
        String name1 = scanner.nextLine();


//        driver.findElement(By.xpath("//textarea[@id='source']")).sendKeys("Mafia decided who will be killed and Mafia went to sleep");
//        driver.findElement(By.xpath("//*[@id='sugg-item-en']")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[5]/div[3]/div[2]")).click();

//        driver.findElement(By.xpath("//textarea[@id='source']")).sendKeys("Doctor wake up and chose someone");
//        driver.findElement(By.xpath("//*[@id='sugg-item-en']")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[5]/div[3]/div[2]")).click();

        System.out.println("Doctor enter name:");
        String name2 = scanner.nextLine();


//        driver.findElement(By.xpath("//textarea[@id='source']")).sendKeys("Sheriff wake up and chose person to check");
//        driver.findElement(By.xpath("//*[@id='sugg-item-en']")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[5]/div[3]/div[2]")).click();

        System.out.println("Sheriff enter name");
        String sheriffName = scanner.nextLine();

//        for(int i = 0; i < namesOfPlayers.size(); i++){
//            if(namesOfPlayers.get(i).equals(sheriffName)){
//              if(actualRoles.get(i).equals("mafia")){
//                  driver.findElement(By.xpath("//textarea[@id='source']")).sendKeys("Sheriff found one of mafia player");
//                  driver.findElement(By.xpath("//*[@id='sugg-item-en']")).click();
//                  driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[5]/div[3]/div[2]")).click();
//              }else{
//                  driver.findElement(By.xpath("//textarea[@id='source']")).sendKeys("Sheriff could not find the mafia player");
//                  driver.findElement(By.xpath("//*[@id='sugg-item-en']")).click();
//                  driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[5]/div[3]/div[2]")).click();
//              }
//            }
//        }


//        driver.findElement(By.xpath("//textarea[@id='source']")).sendKeys("");
//        driver.findElement(By.xpath("//*[@id='sugg-item-en']")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[5]/div[3]/div[2]")).click();


        if(!name1.equals(name2)){
            for(int i = 0; i < namesOfPlayers.size(); i++){
                if(namesOfPlayers.get(i).equals(name1)){
                    System.out.println(emails.get(i));
                    emails.remove(i);
                    namesOfPlayers.remove(i);
                    actualRoles.remove(i);
                }
            }
        }
        System.out.println(actualRoles);
        System.out.println(namesOfPlayers);
        System.out.println(emails);

//
//        System.out.println("Enter how many players:");
//        int number = 0;
//
//        while (number < 8 || number > 15){
//            number = scanner.nextInt();
//            if(number < 5){
//                System.out.println("Players must be at least 5");
//            }else if(number > 15){
//                System.out.println("Players must be less than 15");
//            }
//        }



    }
}
