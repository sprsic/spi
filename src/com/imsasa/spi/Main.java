package com.imsasa.spi;

import com.imsasa.spi.exception.TokenGeneratorNotFound;
import com.imsasa.spi.service.ITokenGeneratorService;
import com.imsasa.spi.service.TokenGeneratorService;

public class Main {

    public static void main(String[] args) {

        System.out.println("Simple UUID token generator");
        ITokenGeneratorService simpleTokengeneratorService = null;
        try {
            simpleTokengeneratorService = TokenGeneratorService.newInstance("simpleTokenGenerator");
        } catch (TokenGeneratorNotFound tokenGeneratorNotFound) {
            tokenGeneratorNotFound.printStackTrace();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(simpleTokengeneratorService.generateToken());
        }

        System.out.println("Random number token generator");
        ITokenGeneratorService randomNumberTokenGeneratorService = null;
        try {
            randomNumberTokenGeneratorService = TokenGeneratorService.newInstance("randomNumberTokenGenerator");
        } catch (TokenGeneratorNotFound tokenGeneratorNotFound) {
            tokenGeneratorNotFound.printStackTrace();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(randomNumberTokenGeneratorService.generateToken());
        }
    }
}
