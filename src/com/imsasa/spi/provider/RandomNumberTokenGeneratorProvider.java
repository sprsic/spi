package com.imsasa.spi.provider;

import com.imsasa.spi.service.ITokenGeneratorService;
import com.imsasa.spi.service.RandomNumberTokenGeneratorService;

/**
 * Written with love
 *
 * @author Sasa Prsic 20/05/2017
 */
public class RandomNumberTokenGeneratorProvider implements ITokenGeneratorProvider {
    @Override
    public ITokenGeneratorService createService() {
        return new RandomNumberTokenGeneratorService();
    }
}
