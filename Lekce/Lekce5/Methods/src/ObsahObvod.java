public class ObsahObvod {
    //Naprogramujte metody na vypočet obsahu a obvodu
        //Kruhu
    //Zvolte správné datové typy a minimalně jednou implementujte přetíženou metodu.
        //Area = PI*radius*radius
        static double obsahKruhu(double r) {
            return Math.PI * (r * r);
        }
        static int obsahKruhu(int r) {
            return (int) Math.PI *(r * r);
        }

        //Circumference = 2*PI*radius
        static double obvodKruhu(double r) {
            return Math.PI * 2 * r;
        }
        static int obvodKruhu(int r) {
            return (int) Math.PI * 2 * r; //nutno pretypovat na int
        }
        

        public static void main(String[] args) {
            //*POZOR velky ROZDIL u pretizene metody */
            //double obsah = obsahKruhu(1); //3.0
            //parametr je int a vraci int
            //pouziva metodu s int navratovou hodnotou --> spatne
            //ale 
            //double obsah = obsahKruhu(1.0); //3.141592653589793
            //parametr je double a vraci double
            //pouziva metodu s double navratovou hodnotou --> lepsi
            double obsah = obsahKruhu(1.0);
            System.out.println("Obsah kruhu je " + obsah);//3.141592653589793
            System.out.printf("Obsah kruhu je %.3f",obsah);//3.142 //zaokrouhleni na 3 desetinna mista

            double obvod1 = obvodKruhu(5); //5cm
            System.out.println("\nObvod kruhu je " + obvod1);//30.0

            double obvod = obvodKruhu(5.0); //5.0cm 
            System.out.println("Obvod kruhu je " + obvod);//31.41592653589793
        }
}
