package com.imsasa.spi.provider;

import com.imsasa.spi.service.ITokenGeneratorService;

/**
 * Written with love
 *
 * @author Sasa Prsic 20/05/2017
 */
public interface ITokenGeneratorProvider {
    ITokenGeneratorService createService();
}
