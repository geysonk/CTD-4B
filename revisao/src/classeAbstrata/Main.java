package classeAbstrata;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Main {
    public static void main(String[] args) {

        Doberman cachorro1 = new Doberman();
        Poodle cachorro2 = new Poodle();

        System.out.println(cachorro1.latir());
        System.out.println(cachorro2.latir());
    }
}