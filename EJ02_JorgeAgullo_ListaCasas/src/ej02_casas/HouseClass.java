/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej02_casas;

/**
 *
 * @author Yorch_PC
 * *
 * House Class. It is used to generate instances of the new houses to be
 * introduced
 */
public class HouseClass {

    //Attributes. *Se declaran las variables globales de la clase.
    int nameHouse = 0;
    String typeRoadHouse = "";
    String roadHouse = "";
    int numbRoadHouse = 0;
    String zipCodeHouse = "";
    String cityHouse = "";
    String countryHouse = "";
    int numbRoomHouse = 0;
    float squareMeterHouse = 0.0f;

    //Builder empty. *Se declara un constructor vacío.
    HouseClass() {
    }

    /*uilder. Assimilate the data for the new instances in the global variables. *Constructor para guardar los datos introducidos
     * por el usuario en cada nueva instancia generada.
     */
    HouseClass(int nameHouse, String typeRoadHouse, String roadHouse, int numbRoadHouse, String zipCodeHouse, String cityHouse,
            String countryHouse, int numbRoomHouse, float squareMeterHouse) {

        //*Se pasan los datos de la variables internas del constructor a las variables globales.
        this.nameHouse = nameHouse;
        this.typeRoadHouse = typeRoadHouse;
        this.roadHouse = roadHouse;
        this.numbRoadHouse = numbRoadHouse;
        this.zipCodeHouse = zipCodeHouse;
        this.cityHouse = cityHouse;
        this.countryHouse = countryHouse;
        this.numbRoomHouse = numbRoomHouse;
        this.squareMeterHouse = squareMeterHouse;

        /*It shows the correct acquisition of the data. *Muestra en consola la certeza de que los datos de la nueva casa se han 
        * guardado correctamente en una nueva insatancia.
         */
        System.out.println("La nueva casa (Casa " + this.nameHouse + ") ha sido introducida.");

    }

    //Returns the instance data. *Devuelve los datos completos de la instancia consultada y los muestra en consola.
    public void getAllDataHouse() {

        System.out.println("Casa " + this.nameHouse + ". Dirección: " + this.typeRoadHouse + " " + this.roadHouse
                + " Nº" + this.numbRoadHouse + ", CP" + this.zipCodeHouse + ", " + this.cityHouse + ", " + this.countryHouse
                + ". Esta casa dispone de " + this.numbRoomHouse + " habitaciones en un total de " + this.squareMeterHouse
                + " metros cuadrados.");

    }

    /*Returns a series of variables to form a segmentation of the attributes. Devuelve datos concatenados para mostrar en 
    * consola las listas segmentadas por atributos de la casa que pertenece a la instancia.
     */
    public Object GetAllDataSegment(int selectAttribute, Object retValue) {
        //Se usa un switch el cual devuelve un valor en RETURN segun el valor selecionado en el metodo Main.
        switch (selectAttribute) {
            case 0://Return the name.
                retValue = this.nameHouse;
                break;

            case 1://Returns a part of the address.
                retValue = ("Casa " + this.nameHouse + ". " + this.typeRoadHouse + " " + this.roadHouse + " " + this.numbRoadHouse
                        + ", " + this.cityHouse + ", " + this.countryHouse);
                break;

            case 2://Returns zip code.
                retValue = ("Casa " + this.nameHouse + ". " + this.zipCodeHouse);
                break;

            case 3://Returns the number of rooms in the house.
                retValue = ("Casa " + this.nameHouse + ". " + "Tiene un total de : " + this.numbRoomHouse + " habitaciones");
                break;

            case 4://Retunrs the square metres of house.
                retValue = ("Casa " + this.nameHouse + ". " + "Tiene un total de : " + this.squareMeterHouse + " metros cuadrados");
                break;

            default:

        }
        return retValue;
    }

    //A partir de aquí se crean ¿constructores? GetSet para mostrar y adquirir datos para cada variable global.
    
    //Returns data from a global variable.
    public int getNameHouse() {
        return this.nameHouse;
    }
    
    
/* not used
    
    //Safe data to a global variable.
    public void setNameHouse(int nameHouse) {
        this.nameHouse = nameHouse;
    }

    //Returns data from a global variable.
    public String getTypeRoadHouse() {
        return this.typeRoadHouse;
    }

    //Safe data to a global variable.
    public void setTypeRoadHouse(String typeRoadHouse) {
        this.typeRoadHouse = typeRoadHouse;
    }

    //Returns data from a global variable.
    public String getRoadHouse() {
        return this.roadHouse;
    }

    //Safe data to a global variable.
    public void setRoadHouse(String roadHouse) {
        this.roadHouse = roadHouse;
    }

    //Returns data from a global variable.
    public int getnumRoadHouse() {
        return this.numbRoadHouse;
    }

    //Safe data to a global variable.
    public void setNumRoadHouse(int numRoadHouse) {
        this.numbRoadHouse = numRoadHouse;
    }

    //Returns data from a global variable.
    public String getZipCodeHouse() {
        return this.zipCodeHouse;
    }

    //Safe data to a global variable.
    public void setZipCodeHouse(String zipCodeHouse) {
        this.zipCodeHouse = zipCodeHouse;
    }

    //Returns data from a global variable.
    public String getCityHouse() {
        return this.cityHouse;
    }

    //Safe data to a global variable.
    public void setCityHouse(String cityHouse) {
        this.cityHouse = cityHouse;
    }

    //Returns data from a global variable.
    public String getCountryHouse() {
        return this.countryHouse;
    }

    //Safe data to a global variable.
    public void setCountryHouse(String countryHouse) {
        this.countryHouse = countryHouse;
    }

    //Returns data from a global variable.
    public int getNumbRoomHouse() {
        return this.numbRoomHouse;
    }

    //Safe data to a global variable.
    public void setNumbRoomHouse(int numbRoomHouse) {
        this.numbRoomHouse = numbRoomHouse;
    }

    //Returns data from a global variable.
    public float getSquareMeterHouse(float squareMeterHouse) {
        return this.squareMeterHouse;
    }

    //Safe data to a global variable.
    public void setSquareMeterHouse(float squareMeterHouse) {
        this.squareMeterHouse = squareMeterHouse;
    }
*/
}
