/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class TestUserprofile {
    
    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your Username:");
        String userName = scan.nextLine();
        
        Scanner scan1 = new Scanner(System.in);
        System.out.println("please choose from the following genres:");
        System.out.println("Comedy, Drama, Action, Mystery");
        String userGenre = scan.nextLine();
        
        UserProfile profile = new UserProfile(userName, userGenre);
        
        System.out.println("Your profile has been created");
        
        
        
                
        
    }
}
