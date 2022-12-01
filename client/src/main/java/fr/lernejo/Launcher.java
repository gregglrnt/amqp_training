package fr.lernejo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class Launcher {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Launcher.class);
        try {
            var rabbitTemplate = context.getBean(RabbitTemplate.class);
            while(true) {
                System.out.println("Input a message, we will send it for you (q for exit) \n");
                String input = scanner.nextLine();
                if(input.equals("q")) {
                    System.out.println("Bye.");
                    break;
                }
                rabbitTemplate.convertAndSend(input);
                System.out.print("Message sent. ");
            }
        }
        finally {
            context.close();
        }
    }
}
