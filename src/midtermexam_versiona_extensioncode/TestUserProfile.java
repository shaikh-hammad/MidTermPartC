/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author Hammad Shaikh
 */
public class TestUserProfile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your name:");
        String name = input.nextLine();
        System.out.println("Plese pick a genre from the list:\nAction\nComedy\nHorror\nSports");
        String genre = input.nextLine();
        
        UserProfile profile = new UserProfile(name, genre);
        
        System.out.println("Your user profile has been created.");
    }
}
