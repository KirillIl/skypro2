public class Main {
    public static void main(String[] args) {
        //Домашнее задание 3
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен "+ age + " , то ему нужно ходить в садик");

        }else if (age >= 7 && age <= 18){
            System.out.println("Если возраст человека равен "+ age + " , то ему нужно ходить в школу");
        }else if (age > 18 && age < 24){
            System.out.println("Если возраст человека равен "+ age + " , то ему нужно ходить в универ");
        }else if (age > 24){
            System.out.println("Если возраст человека равен "+ age + " , то ему нужно ходить на работу");
        }
        System.out.println("Задача 2");
        if ( age < 5){
            System.out.println("Не может кататься на аттракционе");
        } else if (age > 5 && age < 14){
            System.out.println("Может кататься в сопровождении взрослого, если взрослого нет, то кататься нельзя!");
        } else if (age > 14){
            System.out.println("Можно кататься на аттракционах без сопровождения взрослого");
        }
        System.out.println("Задача 3");
        int one = 0;
        int two = -1;
        int fhree = -2;
        if( one > two){
            if(one >= fhree){
                System.out.println("Большим числом является " + one);
            }else{
                System.out.println("Большим числом является " + fhree);
            }
        }else if (two > one) {
            if (two >= fhree) {
                System.out.println("Большим числом является " + two);
            }else{
                System.out.println("Большим числом является " + fhree);
            }
        }else{
            if (one > fhree){
                System.out.println(" Большим числом является " + one);
            }else if (fhree > one){
                System.out.println(" Боьшим числом является " + fhree);
            }else{
                System.out.println("Все 3 числа равны");
            }
        }

    }
}