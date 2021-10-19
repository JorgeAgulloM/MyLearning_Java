/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej02_casas;

import java.util.ArrayList;

/**
 *
 * @author Jorge Agulló Martín
 *
 *
 * Este programa pretende mostrar la posibilidad de listar una serie de objetos,
 * viviendas en este caso, las cuales pueden se listadas de forma segmentada.
 * Para ello se ha preprogramado una serie de 4 viviendas con sus direcciones
 * correspondientes mediante instancias de la clase HouseClass, la cual alberga
 * los atributos para almacenar los datos, y sus métodos para crear las listas.
 * Para instanciar los objetos de la clase HouseClass, se ha optado por crear
 * una ArrayList del tipo HouseClass a la que se le añaden los valores a través
 * de una variable auxiliar, también del tipo HouseClass, que almacena
 * temporalmente los datos y los añade con la sentencia Add a la ArrayList.
 * Después, estos datos son mostrados al usuario de forma genérica y por orden
 * numérico según se han nombrado las viviendas. Después, para segmentar los
 * atributos y mostrarlos, se ha creado un método en HouseClass para concatenar
 * los valores y generar las listas. A este método se le llama desde una
 * sentencia for para usar su índice como puntero del objeto del queremos leer
 * sus atributos. Dentro de este mismo for se encuentra anidado otro bucle del
 * mismo tipo el cual, mediante su índice, apunta a los atributos del objeto al
 * que apunta el for superior. Ambos son limitados a los objetos que contenga el
 * ArrayList el for principal y a los atributos el for anidado. A su vez se
 * exponen estos datos al usuario mediante sentencias Print que muestran los
 * datos en consola. Fin.
 *
 *
 */
public class Ej02_Casas {

    /**
     * @param args INICIO
     */
    public static void main(String[] args) {

        //Atributos.
        //Variable auxiliar para almaccenar los datos temporalmente y agregarlos a la Arraylist.
        HouseClass aux;

        //ArrayList que almacena los objetos instanciados de la clase HouseClase.
        ArrayList<HouseClass> houseClass = new ArrayList();

        //Carga de datos predefinidos.
        //Se muestra al usuario la carga de los datos.
        System.out.println("Cargando datos preestablecidos...");
        System.out.println(""); //Separador de lineas en consola.
        System.out.println("Lista completa de viviendas;");

        //Se almacenan los datos preestablecidos en la variable aux que se obtienen del constructor
        aux = new HouseClass(1, "Calle", "Albert Einstein", 93, "03203", "Elche", "España", 4, 95.36F);
        houseClass.add(aux); //Se almacenan los datos de la varaible aux a una nueva instancia de HouseClass

        aux = new HouseClass(2, "Plaza", "Nikkola Tesla", 4, "28031", "Madrid", "España", 6, 121.30F);
        houseClass.add(aux);

        aux = new HouseClass(3, "Ronda", "Galileo Galilei", 8, "12023", "Valencia", "España", 3, 87.55F);
        houseClass.add(aux);

        aux = new HouseClass(4, "Avenida", "Marie Curie", 12, "31008", "Barcelona", "España", 5, 108.94F);
        houseClass.add(aux);

        //Bucle for que muestra al usuario las viviendas disponibles listadas por orden numérico de sus nombres.
        for (int x = 0; x < houseClass.size(); x++) {

            //Para evitar mostrar una posible posición sin datos, se crea una sentencia if que evalua el nombre de 
            //la casa, si esta está a 0 significa que no hay datos en dicha posición.
            if (houseClass.get(x).getNameHouse() != 0) {
                houseClass.get(x).getAllDataHouse();
            }
        }

        //Array que almacena de forma predeterminada cadenas String para crear los encabezados de lista de las listas segmentadas.
        String[] auxDefaultText = new String[]{"Direcciones", "CP", "Numero de habitaciones", "Metros cuadrados"};

        /* Bucle for que prepara la cabecera de la lista segmentada, pasa su indice al for anindado en su interior para
        * seleccionar el caso que se pedirá en el método de la clase HouseClass. 
        * Este for anidado seleciona el objeto del cual se solicita la información, y junto al indice del for superior 
        * se selcciona el dato necesario. Desta manera que se crea la cabecera de la lista, se precisa el atributo a seleccionar y
        * el objeto del que queremos adquirirlo, y en cada cico del cuble anidado se cambia solo de objeto hasta recorrerlos todos,
        * se sale de este bucle y volvemos al superior, cambia el encabezado, el atributo que queremos y en el bucle anidado se vuelve
        * a consultar todos los objetos, así hasata completar las 4 listas segmentadas con todos los objetos que haya.
         */
        System.out.println("");
        System.out.println("A continuación se muestran las viviendas segmentadas por listas de atributos en 4 grupos:");

        //El for se inicia desde el índice 0 y termina en la longitud máxima del objeto alojado en auxDefalutText
        for (int x = 0; x < auxDefaultText.length; x++) {

            //Se muestra al usuario la cabecera de cada lista con las cadenas almacenadas en auxDefaultText.
            System.out.println(""); //Separador de lineas en consola.
            System.out.println("Lista de " + auxDefaultText[x] + ";");

            /* Este bucle realiza sus ciclos como el anterior pero con un final marcado por el indice máximo de los objetos 
            * de la array houseClass.
            * Utiliza el indice del bucle superior para buscar el atributo necesario mientras recorre todos los objetos de esta clase.
             */
            for (int y = 0; y < houseClass.size(); y++) {

                //Se muestra al usuario el atributo de foma segmentada obtenido con los indices de ambos bucles y con el método de 
                //la clase HouseClass para generar las listas segmentadas.
                System.out.println(houseClass.get(y).getAllDataSegment(x + 1));
            }
        }

    }
    //FIN
}
