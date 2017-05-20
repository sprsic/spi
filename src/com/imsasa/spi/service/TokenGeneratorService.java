package com.imsasa.spi.service;

import com.imsasa.spi.exception.TokenGeneratorNotFound;
import com.imsasa.spi.provider.ITokenGeneratorProvider;
import com.imsasa.spi.provider.RandomNumberTokenGeneratorProvider;
import com.imsasa.spi.provider.SimpleTokenGeneratorProvider;

import java.util.HashMap;

/**
 * Written with love
 *
 * @author Sasa Prsic 20/05/2017
 */
public class TokenGeneratorService {
    private static HashMap<String, ITokenGeneratorProvider> tokenGeneratorProvider = new HashMap<>();

    static {
        tokenGeneratorProvider.put("simpleTokenGenerator", new SimpleTokenGeneratorProvider());
        tokenGeneratorProvider.put("randomNumberTokenGenerator", new RandomNumberTokenGeneratorProvider());
    }

    public static ITokenGeneratorService newInstance(String name) throws TokenGeneratorNotFound {
        ITokenGeneratorProvider provider = tokenGeneratorProvider.get(name);
        if (provider == null){
            throw new TokenGeneratorNotFound("Token generator not found");
        }
        return provider.createService();
    }
}
