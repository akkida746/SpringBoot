package com.akash.SpringBootAop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopDemo implements CommandLineRunner{
    public static void main(String... args){

        SpringApplication.run(AopDemo.class,args);
    }

    /*CommandLineRunner cml = (String... args)->{
        Customer Customer = new Customer();
        Customer.setName("Akash");

        System.out.println(Customer.getName());
    };*/

    @Override
    public void run(String... args) throws Exception {
        Customer Customer = new Customer();
        Customer.setName("Akash");

        System.out.println(Customer.getName());
    }
}
