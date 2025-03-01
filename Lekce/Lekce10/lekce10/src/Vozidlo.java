public interface Vozidlo {
    //local variables are not allowed in interfaces, only constants
    Integer rychlost = 0;
    Integer x = 0;
    Integer y = 0;
    /* public je automaticky */
    void pohybujSe(int x, int y);
    String lokace(); //returns the location of the vehicle

    void zastav();
}