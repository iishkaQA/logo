package org.example;

import com.github.javafaker.Faker;

import java.util.Random;

public class CompanyGenerator {

    private static final String[] LAST_NAMES = {
            "Leto",
            "Cobain",
            "Kirkorov",
            "Soprano"
    };

    private final Random random = new Random();
    private final Faker faker = new Faker();

    public String getFirstPart() {
        return LAST_NAMES[random.nextInt(LAST_NAMES.length)];
    }

    public String getSecondPart() {
        return "and";
    }

    public String getThirdPart() {
        return faker.name().lastName();
    }
}
