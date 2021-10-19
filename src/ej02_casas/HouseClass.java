/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej02_casas;

/**
 *
 * @author Jorge Agulló Martín En esta clase, se almacenan los atributos de un
 * objeto vivienda, correspondientes a la localización de esta. Para ello se ha
 * generado un constructor, el cual contiene tantos atributos como la propia
 * clase, y en su interior, se pasan los valores obtenidos desde la clase Main a
 * los atributos generales de esta clase. También dispone un método para
 * facilitar el listado de atributos del objeto donde se necesite y con una
 * concatenación predefinida para generar frases con sentido. Además incluye
 * otro método para generar listas segmentadas de los atributos del objeto.
 */
public class HouseClass {

    //Atributos de la clase.
    private int nameHouse = 0; //Este atributo es privado, pues el usuario no tiene opción de modificarlo. Se genera el nombre de forma automática.
    String typeRoadHouse = "";
    String roadHouse = "";
    int numbRoadHouse = 0;
    String zipCodeHouse = "";
    String cityHouse = "";
    String countryHouse = "";
    int numbRoomHouse = 0;
    float squareMeterHouse = 0.0f;

    //Constructor. Asimila los datos que se le asignan en llamada de la clase Main y los traslada a las variables de esta clase
    HouseClass(int nameHouse, String typeRoadHouse, String roadHouse, int numbRoadHouse, String zipCodeHouse, String cityHouse,
            String countryHouse, int numbRoomHouse, float squareMeterHouse) {

        //Paso de datos del constructor a las variables globales de la clase
        this.nameHouse = nameHouse;
        this.typeRoadHouse = typeRoadHouse;
        this.roadHouse = roadHouse;
        this.numbRoadHouse = numbRoadHouse;
        this.zipCodeHouse = zipCodeHouse;
        this.cityHouse = cityHouse;
        this.countryHouse = countryHouse;
        this.numbRoomHouse = numbRoomHouse;
        this.squareMeterHouse = squareMeterHouse;

    }

    //Método para devolver los datos del objeto junto a cadenas String predefinidas para generar frases con sentido
    public void getAllDataHouse() {
        //Se muestra al usuario en consola la construción de las frases con los datos almacenados
        System.out.println("Casa " + this.nameHouse + ". Dirección: " + this.typeRoadHouse + " " + this.roadHouse
                + " Nº" + this.numbRoadHouse + ", CP" + this.zipCodeHouse + ", " + this.cityHouse + ", " + this.countryHouse
                + ". Esta casa dispone de " + this.numbRoomHouse + " habitaciones en un total de " + this.squareMeterHouse
                + " metros cuadrados.");

    }

    //Método para generar listas segmentadas. Desde la clase Main, se seleciona el case: necesario para fomrar la lista deseada.
    //Cada case: devuelve un valor distinto y lo concatena con cadenas String para dar sentido a lo que se va amostrar al usuario.
    public String getAllDataSegment(int selectAttribute) {

        //Variable para almacenar los datos a devolver.
        String retValue;

        //Este Switch seleciona el atributo que se le solicita desde Main al llamar al método, y devuelve ese valor para crear 
        //listas segmentadas. Estas listas se complementan con la implementación de este método en la Clase Main.
        switch (selectAttribute) {
            case 0://En este caso se devuelve el nombre de la casa.
                retValue = String.valueOf(this.nameHouse);
                break;

            case 1://Este caso devuelve la direción de la casa correspondiente a los valores nombre, dipo de calle, nombre de la calle,
                //número de la calle, ciudad y pais.
                retValue = ("Casa " + this.nameHouse + ". " + this.typeRoadHouse + " " + this.roadHouse + " " + this.numbRoadHouse
                        + ", " + this.cityHouse + ", " + this.countryHouse);
                break;

            case 2://Este caso devuelve el nombre y el código postal.
                retValue = ("Casa " + this.nameHouse + ". " + this.zipCodeHouse);
                break;

            case 3://Aquí se devuelve el nombre de la casa junto al número de habitaciones.
                retValue = ("Casa " + this.nameHouse + ". " + "Tiene un total de : " + this.numbRoomHouse + " habitaciones");
                break;

            case 4://y por último, en este caso, se devuelve el nombre y los metros cuadrados de la casa.
                retValue = ("Casa " + this.nameHouse + ". " + "Tiene un total de : " + this.squareMeterHouse + " metros cuadrados");
                break;

            default:
                retValue = ("Error, el indice solicitado no pertenece a ninguna opción");

        }
        //Se devuelve la opción elegida.
        return retValue;
    }

    //Método get individual para recuperar el valor que maneja del objeto
    public int getNameHouse() {
        return nameHouse;
    }

    //Método set para introducir  el valor que maneja de forma individual del objeto
    public void setNameHouse(int nameHouse) {
        this.nameHouse = nameHouse;
    }
    //Método get individual para recuperar el valor que maneja del objeto

    public String getTypeRoadHouse() {
        return typeRoadHouse;
    }
    //Método set para introducir  el valor que maneja de forma individual del objeto

    public void setTypeRoadHouse(String typeRoadHouse) {
        this.typeRoadHouse = typeRoadHouse;
    }
    //Método get individual para recuperar el valor que maneja del objeto

    public String getRoadHouse() {
        return roadHouse;
    }
    //Método set para introducir  el valor que maneja de forma individual del objeto

    public void setRoadHouse(String roadHouse) {
        this.roadHouse = roadHouse;
    }
    //Método get individual para recuperar el valor que maneja del objeto

    public int getNumbRoadHouse() {
        return numbRoadHouse;
    }
    //Método set para introducir  el valor que maneja de forma individual del objeto

    public void setNumbRoadHouse(int numbRoadHouse) {
        this.numbRoadHouse = numbRoadHouse;
    }
    //Método get individual para recuperar el valor que maneja del objeto

    public String getZipCodeHouse() {
        return zipCodeHouse;
    }
    //Método set para introducir  el valor que maneja de forma individual del objeto

    public void setZipCodeHouse(String zipCodeHouse) {
        this.zipCodeHouse = zipCodeHouse;
    }
    //Método get individual para recuperar el valor que maneja del objeto

    public String getCityHouse() {
        return cityHouse;
    }
    //Método set para introducir  el valor que maneja de forma individual del objeto

    public void setCityHouse(String cityHouse) {
        this.cityHouse = cityHouse;
    }
    //Método get individual para recuperar el valor que maneja del objeto

    public String getCountryHouse() {
        return countryHouse;
    }
    //Método set para introducir  el valor que maneja de forma individual del objeto

    public void setCountryHouse(String countryHouse) {
        this.countryHouse = countryHouse;
    }
    //Método get individual para recuperar el valor que maneja del objeto

    public int getNumbRoomHouse() {
        return numbRoomHouse;
    }
    //Método set para introducir  el valor que maneja de forma individual del objeto

    public void setNumbRoomHouse(int numbRoomHouse) {
        this.numbRoomHouse = numbRoomHouse;
    }
    //Método get individual para recuperar el valor que maneja del objeto

    public float getSquareMeterHouse() {
        return squareMeterHouse;
    }
    //Método set para introducir  el valor que maneja de forma individual del objeto

    public void setSquareMeterHouse(float squareMeterHouse) {
        this.squareMeterHouse = squareMeterHouse;
    }

}
