package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthTest {

    public static void main(String[] args) {
        // Chemin vers le pilote WebDriver Chrome
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Utilisateur\\chromedriver_win32\\chromedriver.exe");

        // Initialisez le pilote Chrome
        WebDriver driver = new ChromeDriver();

        // Ouvrez la page de connexion
        driver.get("https://frontend.staging.saytutension.baamtuservices.com/login");

        // Entrez les informations d'identification
        driver.findElement(By.id("email")).sendKeys("rasajel434@notedns.com");
        driver.findElement(By.id("password")).sendKeys("fyc2ELY&07z1Q7");

        // Cliquez sur le bouton de connexion
        //driver.findElement(By.id("button")).click();
        driver.findElement(By.xpath("//button[@class='w-full p-2 text-white bg-primary-saytu rounded-lg my-6\']")).click();



        // Vérifiez si vous êtes connecté en vérifiant un élément sur la page suivante
        //boolean isLoggedIn = driver.findElement(By.id("welcomeMessage")).isDisplayed();
        //if(isLoggedIn) {
         //   System.out.println("Connexion réussie !");
        //} else {
          //  System.out.println("Échec de la connexion !");
        //}

        // Fermez le navigateur
       // driver.quit();
    }
}
