/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej02_casas;

import java.util.Scanner;

/**
 * Class for menu control
 *
 * @author Jorge
 */
public class Control {

    //Attibutes
    String frstString;
    String rstString;

    //Empty constructor
    Control() {
    }

    public String DataVerify(String result) {
        //Declarate variables
        Scanner inText = new Scanner(System.in);
        String userData = result;

        //Switch to correctly method select
        switch (result) {

            //To reed text for new house menu
            case "New":
                result = BuildString(inText.next()); //Call method BuildString
                break;

            //To reed long text for new house menu
            case "NewLong":
                result = BuildString(inText.nextLine()); //Call method BuildString
                break;

            //For other menus, and for answers to questions posed to the user
            default:

                //Swuitch to detect the answers to Yes or No, and 'Fin' to end the program.
                switch (userData) {
                    case "Fin":
                        result = userData;
                        break;

                    case "Y":
                        result = userData;
                        break;

                    case "N":
                        System.out.println("Cancelado");
                        result = userData;
                        break;

                    default:

                        //It is tested if the data written is a number to use the text to call a menu
                        //The transformed number is not used. Control error.
                        try {
                            userData = BuildString(inText.next()); 
                            result = userData;
                            
                            //In case of error, the user is told to repeat the action
                        } catch (NumberFormatException e) {
                            System.out.println("No entiendo lo que has escrito o puede que el comando no exista.");
                            System.out.println("Cancelado");
                        }
                        break;
                }
                break;
        }
        //Return de result of method
        return result;
    }

    //Constructor to transform words informat correctly, first char in upperCase and the rest in lowerCase
    public String BuildString(String result) {
        String auxResult = result;
        
        //First char tu upperCase
        this.frstString = auxResult.substring(0, 1).toUpperCase(); 
        //Rest in lowerCase
        this.rstString = auxResult.substring(1).toLowerCase();  
        //Combined
        result = this.frstString + this.rstString; 
        
        return result;
    }

    //Transform data string to integer.
    public int BuildInteger(int result) {
        //Atributes
        Scanner inNumb = new Scanner(System.in); //Instance of Method Scanner.
        boolean okWrite = false;

        //loop to ensure correct data entry.
        while (okWrite == false) {

            //Transforms the data that the string user supplies to Integer. Control error.
            try {
                result = Integer.parseInt(inNumb.next());
                okWrite = true;
                
                //In case of error, the user is told to repeat the action
            } catch (NumberFormatException e) {
                System.out.println("Debes escribir un número, por favor intentalo de nuevo.");
            }
        }

        return result;
    }

    //Transform data string to float
    public float BuildFloat() {
        //Attributes
        Scanner inFloat = new Scanner(System.in);
        Boolean okWrite = false;
        float result = 0.0F;

        //Loop to ensure correct data entry
        while (okWrite == false) {
            
            //Transforms the data that the string user supplies to Float. Control error.
            try {
                result = Float.parseFloat(inFloat.next());
                okWrite = true;
              
              //In case of error, the user is told to repeat the action
            } catch (NumberFormatException e) {
                System.out.println("Debes escribir un número, por favor intentalo de nuevo.");
            }
        }

        return result;
    }

}
