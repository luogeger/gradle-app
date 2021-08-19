package com.first.gradle;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.*;

import java.util.Scanner;

//@Slf4j
public class Main {

    // 和Lombok有冲突
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("org.slf4j.log ........");
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (++i > 0) {
            System.out.println(i + ". please input todo item name");
            String name = scanner.nextLine();
            System.out.println("    " + name);
        }

    }

}
