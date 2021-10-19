/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej02_casas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jorge
 *
 *
 * House Class. It is used to generate instances of the new houses to be
 * introduced
 *
 */
public class Ej02_Casas {

    /**
     * @param args
     */
    public static void main(String[] args) {

        //Attributes. 
        Scanner inText = new Scanner(System.in); //Instance of the Scanner method to read the data entered by the user.
        ArrayList<HouseClass> houseClass = new ArrayList(); //ArrayList to store a new data instance. 
        HouseClass aux; //Auxiliar instance for use methods of HouseClass. 
        String posMenu = "0"; //Variable to start the user menu 

        //The user is shown the loading of the initial sample houses. 
        System.out.println("Cargando datos preestablecidos...");

        //Add data for a new instance. 
        aux = new HouseClass(1, "Calle", "Albert Einstein", 93, "03203", "Elche", "España", 4, 95.36F);
        houseClass.add(aux);//Store in ArrayList to the new instance. 

        aux = new HouseClass(2, "Plaza", "Nikkola Tesla", 4, "28031", "Madrid", "España", 6, 121.30F);
        houseClass.add(aux);

        aux = new HouseClass(3, "Ronda", "Galileo Galilei", 8, "12023", "Valencia", "España", 3, 87.55F);
        houseClass.add(aux);

        aux = new HouseClass(4, "Avenida", "Marie Curie", 12, "31008", "Barcelona", "España", 5, 108.94F);
        houseClass.add(aux);

        //Show to user text and number of house. 
        System.out.println("");
        System.out.println("Hola. Binevenido a DbHouse.");
        System.out.println("A continuación, te mostrare las " + houseClass.size() + " casas disponibles.");
        System.out.println("");

        //Loop to show available house data. 
        for (int x = 0; x < houseClass.size(); x++) {
            if (houseClass.get(x).getNameHouse() != 0) {
                houseClass.get(x).getAllDataHouse();
            }
        }

        //*Se muestra texto al usuario.
        System.out.println("");
        System.out.println("Usa el menú para realizar la opcion deseada.");
        System.out.println("");
        System.out.println("¿Que quieres hacer?");

        /*Loop do..while for start the menú. *Se utiliza una metodo do..while para iniciar el menú y quedar a la espera de 
        *la orden que proporcione el usuario.
         */
        do {
            /*Sentence switch for use the command user write. *Con la sentencia switch accedemos al menú que pida el usuario. 
            *Ocasionalmente, el programa tambien lo usa para posicionarse en el menú despues de finalizar alguna acción por 
            *parte del usuario opor un error controlado.
             */

            Control ctrl = new Control();
            Object a = "";

            switch (posMenu) {
                case "0": //Main Menu. *Menú principal. Se le proporciona una serie de comandos al susuario mediante números 
                    // para que pueda desplazarse y realizar acciones en el programa.
                    System.out.println("");
                    System.out.println("Menú inicial. Escribe el número de la opción que deseas realizar");
                    System.out.println("[1]. Segmentar, lista las casas disponibles agrupadas por sus atributos");
                    System.out.println("[2]. Nueva, introduce una nueva casa a la lista");
                    System.out.println("[3]. Borrar, borrará el registro de la casa que elijas");
                    System.out.println("[4]. Visualizar casas disponibles");
                    System.out.println("[Fin]. Finaliza el programa");

                    //Call to class Control
                    posMenu = ctrl.DataVerify(posMenu);

                    break;

                case "1": //Segmenttation Menu. *Se utiliza para que el usuario pueda visualizar en consola los datos de las casas
                    //de forma segmentada.
                    System.out.println("");
                    System.out.println("Menú Segmentar. Se listarán las casas por su orden numérico agrupadas por atributos");

                    Object dataAux = 0; //auxiliary variable to capture data to he method HouseClass.getAllDataSegmente.

                    //Array that stores default values ​​to display. 
                    String[] auxList = new String[]{"Direcciones", "CP", "Numero de habitaciones", "Metros cuadrados"};
                    for (int x = 0; x < auxList.length; x++) {

                        //Generate the list header.
                        System.out.println("");
                        System.out.println("Lista de " + auxList[x] + ";");
                        for (int y = 0; y < houseClass.size(); y++) {

                            //Capure data of instances for segmentation list *Se capturan los datos por cada instancia para la lista de segmentacion.
                            System.out.println(houseClass.get(y).GetAllDataSegment(x + 1, dataAux));
                        }
                    }

                    System.out.println("[0]. Volver a menú principal");
                    System.out.println("[Fin]. Finaliza el programa.");
                    
                    //Call to class Control
                    posMenu = ctrl.DataVerify(posMenu);
                    break; //finish de sentence switch

                case "2": //Add new house Menu. *menú para introducir nuevas casas en el programa.
                    System.out.println("");
                    System.out.println("Menú añadir nueva casa. Se añadirá una nueva casa con los datos que proporciones.");
                    System.out.println("[0]. Volver a menú principal");
                    System.out.println("[1]. Añadir nueva casa");
                    System.out.println("[4]. Visualizar casas disponibles");
                    System.out.println("[Fin]. Finaliza el programa.");

                    //Call to class Control
                    posMenu = ctrl.DataVerify(posMenu);

                    
                    
                    switch (posMenu) {
                        case "1":
                            /*
                            *By means of questions to the user, the new data that the user enters is stored to display them before
                            *creating the new instance and for the user to corroborate the data entered.
                            *
                            *The name of the next house is found. This is extracted from the name of the last house created.
                            *Since the name is made up of an integer that indexes them, one is added to the last value.
                             */
                            
                            //Variable for create the name of de new house
                            int nextHouseAdd = (houseClass.get(houseClass.size() - 1).nameHouse + 1);
                            System.out.println("Bien, comencemos.");
                            System.out.println("Se añadirá la Casa " + (nextHouseAdd));

                            //Wait data string
                            System.out.println("Añade el tipo de vía:");
                            String v2 = ctrl.DataVerify("New");  //Call to class Control

                            //Wait data string
                            System.out.println("Añade el nombre de la " + v2 + ":");
                            String v3 = ctrl.DataVerify("NewLong");  //Call to class Control

                            //Wait data integer
                            System.out.println("Añade el Nº:");
                            int v4 = ctrl.BuildInteger(1);  //Call to class Control

                            //Wait data string
                            System.out.println("Añade el código postal:");
                            String v5 = ctrl.DataVerify("New");  //Call to class Control

                            //Wait data string
                            System.out.println("Añade la ciudad:");
                            String v6 = ctrl.DataVerify("New");  //Call to class Control

                            //Wait data string
                            System.out.println("Añade el pais.");
                            String v7 = ctrl.DataVerify("New");  //Call to class Control

                            //Wait data integer
                            System.out.println("Añade el número de las diferentes habitaciones que componen la casa:");
                            int v8 = ctrl.BuildInteger(1);  //Call to class Control

                            //Wait data float
                            System.out.println("Y por últimno, añade los metros cuadrados de la casa con este formato 00,00:");
                            float v9 = ctrl.BuildFloat();  //Call to class Control

                            //The result of the entered data is displayed and the user is asked.
                            System.out.println("");
                            System.out.println("Así quedaría el nuevo registro. ¿Estas seguro de crearlo?");

                            //Concatenates user-entered values ​​with predefined string strings.
                            System.out.println("Casa " + nextHouseAdd + ". Dirección: " + v2 + " " + v3 + " Nº" + v4
                                    + ", CP" + v5 + ", " + v6 + ", " + v7 + ". Esta casa dispone de " + v8
                                    + " habitaciones en un total de " + v9 + " metros cuadrados.");

                            //Wait confirmation by user
                            System.out.println("¿Estas seguro de crearla?");
                            System.out.println("[Y] o [N]");
                            posMenu = ctrl.DataVerify(posMenu);    //Call to class Control

                            //Charge the data in de aux variable.
                            if (posMenu.equals("Y")) {
                                aux = new HouseClass(nextHouseAdd, v2, v3, v4, v5, v6, v7, v8, v9);

                                //Generate the new instance.
                                houseClass.add(aux);
                                System.out.println("Nuevo registro creado.");
                            }

                            posMenu = "2";  //the menu is repositioned in submenu 2
                            break;

                        case "0":
                            posMenu = "0";  //Return Main menu
                            break;

                        case "4":
                            posMenu = "4"; //Show the house list
                            break;

                        default:

                            break;
                    }
                    break;

                case "3": //Ereaser menu. Delete the house instance selected by the user.
                    System.out.println("");
                    System.out.println("Menú borrar. Borrará la casa que elijas de entre las siguientes.");

                    //Generate houses list.
                    for (int x = 0; x < houseClass.size(); x++) {
                        if (houseClass.get(x).getNameHouse() != 0) {
                            System.out.println("Casa " + houseClass.get(x).getNameHouse());
                        }
                    }

                    System.out.println("[0]. Volver a menú principal");

                    //Stores the integer data provided by the user to select a list object
                    int i = ctrl.BuildInteger(0);

                    //if the value is diferent of 0 and less or equal than houseClase.size, run the next code.
                    if ((i != 0) & (i <= houseClass.size())) {

                        //ask the user for delete or not the house selected
                        System.out.println("¿Estás seguro de borrar la casa " + i + "?");
                        System.out.println("[Y] o [N]");

                        //Waiting for a user data write.
                        posMenu = ctrl.DataVerify(posMenu);
                        System.out.println("");

                        //If user write Y (Yes) delete selected house.
                        if (posMenu.equals("Y")) {
                            houseClass.remove(i - 1);   //Delete house selected.
                            houseClass.iterator();  //Fill in the empty hole in the array
                            System.out.println("Casa " + i + " eliminada");     //Info for user
                        }

                        posMenu = "3";    //the menu is repositioned in submenu 3

                    } else if (i != 0) {
                        System.out.println("El numero que has elegido no esta en la lista, vuelve a intentarlo.");
                    } else if (i == 0) {
                        posMenu = "0";
                    }
                    break;

                case "4": //Show stored house manu.
                    System.out.println("");
                    System.out.println("Aquí tienes las " + houseClass.size() + " casas disponibles."); //Show the number of houses

                    //Houses list
                    for (int x = 0; x < houseClass.size(); x++) {
                        if (houseClass.get(x).getNameHouse() != 0) {
                            houseClass.get(x).getAllDataHouse();
                        }
                    }

                    posMenu = "0"; //the menu is repositioned in main menu
                    break;

                default:    //User-written command does not exist
                    System.out.println("");
                    System.out.println("El número que has escrito no coincide con ningún menú. Vuelve a intentarlo.");
                    posMenu = "0";
            }

            //if user writed "fin" exit the program.
        } while (!(posMenu.equals("Fin")));

        System.out.println("");
        System.out.println("Gracias por usar DbHouse. Hasta otra.");

    }
}
