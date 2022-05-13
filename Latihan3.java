/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author asus
 */
class AgeInvalid extends Exception {

    AgeInvalid(String s) {
        super(s);
    }
}

public class Latihan3 {

    static void validate(int age) throws AgeInvalid {
        if (age < 18) {
            throw new AgeInvalid("not valid");
        } else {
            System.out.println("welcome to vote");
        }
    }

    public static void main(String args[]) {
        try {
            validate(13);
        } catch (Exception i) {
            System.out.println("Exception aktif" + i);
        }
        System.out.println("rest ");
    }
}
