package com.imsasa.spi.service;

import java.util.UUID;

/**
 * Written with love
 * Simple token generator service that uses random uuid for generating a random token string
 *
 * @author Sasa Prsic 20/05/2017
 */
public class SimpleTokenGeneratorService implements ITokenGeneratorService {

    @Override
    public String generateToken() {
        return UUID.randomUUID().toString();
    }
}
