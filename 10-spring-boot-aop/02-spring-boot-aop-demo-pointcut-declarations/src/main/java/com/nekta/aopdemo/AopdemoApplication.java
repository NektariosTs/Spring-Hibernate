package com.nekta.aopdemo;

import com.nekta.aopdemo.dao.AccountDAO;
import com.nekta.aopdemo.dao.MembershipDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AopdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopdemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AccountDAO theAccountDAO, MembershipDAO theMembershipDAO) {

        return runner -> {

//
//            demeTheAfterReturnigAdvice(theAccountDAO);
            demoTheAfterThrowingAdvice(theAccountDAO);

        };
    }

    private void demoTheAfterThrowingAdvice(AccountDAO theAccountDAO) {
        //call method to find the accounts
        List<Account> theAccounts = null;

        try {
            //add a boolean flag to simulate the exceptions
            boolean tripWire = true;
           theAccounts = theAccountDAO.findAccounts(tripWire);

        }
        catch (Exception e) {
            System.out.println("\n\n Main Program:... caught exception: " + e);
        }


        //display the accounts
        System.out.println("\n\n Main Program demoTheAfterThrowingAdvice:");
        System.out.println("----");

        System.out.println(theAccounts);

        System.out.println("\n");
    }

    private void demeTheAfterReturnigAdvice(AccountDAO theAccountDAO) {

        //call method to find the accounts
        List<Account> theAccounts = theAccountDAO.findAccounts();

        //display the accounts
        System.out.println("\n\n Main Program demeTheAfterReturnigAdvice:");
        System.out.println("----");

        System.out.println(theAccounts);

        System.out.println("\n");
    }

    private void demoTheBeforeAdvice(AccountDAO theAccountDAO, MembershipDAO theMembershipDAO) {

        //call the business method
        Account myAccount = new Account();
        myAccount.setName("Madhu");
        myAccount.setLevel("Platinum");


        theAccountDAO.addAccount(myAccount, true);
        theAccountDAO.doWork();

        //call the accountdao getter/setter methods
        theAccountDAO.setName("foobar");
        theAccountDAO.setServiceCode("silver");

        String name = theAccountDAO.getName();
        String code = theAccountDAO.getServiceCode();

        //call the membership business method
        theMembershipDAO.addSillyMember();
        theMembershipDAO.goToSleep();
    }

}













