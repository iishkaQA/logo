package org.example;

import com.github.javafaker.Faker;
import com.github.lalyos.jfiglet.FigletFont;

public class Main {

    public static void main(String[] args) throws Exception {

        CompanyGenerator generator = new CompanyGenerator();

        String part1 = generator.getFirstPart();
        String part2 = generator.getSecondPart();
        String part3 = generator.getThirdPart();

        // Логотип компании
        System.out.println(FigletFont.convertOneLine(part1));
        System.out.println(FigletFont.convertOneLine(part2));
        System.out.println(FigletFont.convertOneLine(part3));

        // Юридические данные
        Faker faker = new Faker();

        System.out.println("ФИО: " + faker.name().fullName());
        System.out.println("Телефон: " + faker.phoneNumber().phoneNumber());
        System.out.println("Адрес: " + faker.address().fullAddress());
    }
}
