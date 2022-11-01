package org.padrao_factory_wrs;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class TransporteFactoryTest extends TestCase{
    @Test
    void deveRetornarTipoInexistente() {
        try {
            ITransporteTipo tipo =TransporteFactory.obterTipo("transporteAéreo");
            Assertions.fail();
        } catch (IllegalArgumentException erro) {
            Assertions.assertEquals("Tipo de transporte inexistente", erro.getMessage());
        }
    }

    @Test
    void deveRetornarTipoInvalido() {
        try {
            ITransporteTipo tipo =TransporteFactory.obterTipo("transporteAquatico");
            Assertions.fail();
        } catch (IllegalArgumentException erro) {
            Assertions.assertEquals("Tipo de transporte inválido", erro.getMessage());
        }
    }
}