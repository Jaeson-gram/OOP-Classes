package com.OJ;
import JavaRelearn.Car;
import JavaRelearn.BankAccount;
import JavaRelearn.Customer;

import javax.security.auth.login.AccountException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //making it null -> 'Car car = null;' will give us a null pointer exception when we run the code with the use cases we used below
        //not creating a 'new Car();' and not making it null -> 'Car car;' will throw an error the moment we try to use it. Because we can't refer to an instance not instantiated.
        Car car = new Car();

        car.setMake("Maserati");
        car.setModel("Arse");
        car.setColor("Gray");
        car.setDoors(0);
        car.setConvertible(false);

//        System.out.println("make = " + car.getMake());
//        System.out.println("model = " + car.getModel());

        car.describeCar();


        BankAccount bobsAccount = new BankAccount("Bobs B.", "skillfullukok@gmail.com", 8075458454L, 235156445, 500);
        System.out.println();
//        bobsAccount.setCustomerName("Bobs B.");
//        bobsAccount.setEmail("skillfullukok@gmail.com");
//        bobsAccount.setPhoneNumber(8075458354L);
//        bobsAccount.setAccountNumber(235156445);
//        bobsAccount.setAccountBalance(0);

        bobsAccount.depositFunds(300);
        System.out.println();
        bobsAccount.withdrawFunds(220);
        System.out.println();
        bobsAccount.depositFunds(1200);
        System.out.println();

        bobsAccount.withdrawFunds(13_000);


        Customer bobs_again = new Customer("Bobs Again", "bobson@ymail.com");

        bobs_again.getCustomerDetails();

    }
}
