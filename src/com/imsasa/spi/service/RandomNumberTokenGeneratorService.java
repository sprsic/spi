package com.imsasa.spi.service;

import java.util.Random;

/**
 * Written with love
 * Simple token generator service that uses random number for generating a random token string
 *
 * @author Sasa Prsic 20/05/2017
 */
public class RandomNumberTokenGeneratorService implements ITokenGeneratorService {
    private static int LOW = 0;
    private static int HIGH = 10000;

    @Override
    public String generateToken() {
        Random r = new Random();
        int result = r.nextInt(HIGH - LOW) + LOW;
        return String.valueOf(result);
    }
}
