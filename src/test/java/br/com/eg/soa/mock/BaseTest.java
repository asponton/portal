package br.com.eg.soa.mock;

import org.junit.BeforeClass;

import br.com.bfmapper.MappingRulesLoader;

public abstract class BaseTest {

    private static boolean mappingRulesLoaded = false;
    
    @BeforeClass
    public static void loadMappings() {
        if (!mappingRulesLoaded) {
            MappingRulesLoader.loader("br.com.eg.soa");
            mappingRulesLoaded = true;
        }
    }
    
}
