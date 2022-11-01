package org.padrao_factory_wrs;

public class TransporteFactory {
    public static ITransporteTipo obterTipo (String tipo) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.padrao_factory_wrs."+tipo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Tipo de transporte inexistente");
        }
        if (!(objeto instanceof ITransporteTipo)) {
            throw new IllegalArgumentException("Tipo de transporte inválido");
        }
        return (ITransporteTipo) objeto;
    }
}
