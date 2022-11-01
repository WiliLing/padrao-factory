package org.padrao_factory_wrs;

public class transporteTerrestre implements ITransporteTipo {
    public String criarTransporte(String tipo, String regiaoA, String regiaoB ){
        return tipo + "= Destino Saída=" + regiaoA + "|  Destino Entrada=" + regiaoB;
    }
}