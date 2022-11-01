package org.padrao_factory_wrs;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class transporteTerrestreTest extends TestCase{
    @Test
    void deveExecutarTransporteTerreste() {
        ITransporteTipo tipo = TransporteFactory.obterTipo("transporteTerrestre");
        String resultado = tipo.criarTransporte("Carro", "Juiz de Fora", "Belo Horizonte");
        Assertions.assertEquals("Carro= Destino Saída=Juiz de Fora|  Destino Entrada=Belo Horizonte", resultado);
    }

}