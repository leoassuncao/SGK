package sgk.com.br.sgk.Provider;

import java.util.ArrayList;
import java.util.List;


import sgk.com.br.sgk.List.WhereTrainList;
import sgk.com.br.sgk.R;

/**
 * Created by f764542 on 30/05/2016.
 */
public class LocationProvider {

    public static List<WhereTrainList> provideLocationList() {
        List<WhereTrainList> location = new ArrayList();

        location.add(LocationProvider.setAJA());
        location.add(LocationProvider.setCia());
        location.add(LocationProvider.setIppon());
        location.add(LocationProvider.setUnb());
        location.add(LocationProvider.setTemploAdulto());
        location.add(LocationProvider.setTemploInfantil());

        return location;
    }

    private static WhereTrainList setAJA() {
        WhereTrainList aja = new WhereTrainList();

        aja.setLocation_image(R.drawable.ic_hombu_dojo);
        aja.setLocation_gym("Academia Julio Adnet");
        aja.setLocation_public("Público Geral");
        aja.setLocation_dojo("Dojo Central (Hombu Dojo)");
        aja.setLocation_address("SHC - Sul 110/111 Bloco A, Loja 30 - Entrada pelo \"Eixinho\" (Eixo W) após a quadra 110.\n" + "Asa Sul, Brasilia-DF");
        aja.setLocation_time("Seg, Qua e Sex - 20h30 às 22h");

        return aja;
    }

    private static WhereTrainList setUnb() {
        WhereTrainList unb = new WhereTrainList();

        unb.setLocation_image(R.drawable.ic_dojo);
        unb.setLocation_gym("UnB ");
        unb.setLocation_public("Público Adulto");
        unb.setLocation_dojo("Dojo");
        unb.setLocation_address("Campus UnB - Asa Norte, Brasilia-DF");
        unb.setLocation_time("Ter e Qui - 16h às 17h");

        return unb;
    }

    private static WhereTrainList setCia() {
        WhereTrainList cia = new WhereTrainList();

        cia.setLocation_image(R.drawable.ic_dojo);
        cia.setLocation_gym("Cia Athletica (Shopping Pier 21)");
        cia.setLocation_public("Público Geral");
        cia.setLocation_dojo("Dojo");
        cia.setLocation_address("Piso Lago Paranoá - SCES Trecho 02\n" +
                "Lago Sul, Brasilia-DF");
        cia.setLocation_time("Seg e Qua - 19h às 20h");

        return cia;
    }

    private static WhereTrainList setIppon() {
        WhereTrainList ippon = new WhereTrainList();

        ippon.setLocation_image(R.drawable.ic_dojo);
        ippon.setLocation_gym("Ippon ");
        ippon.setLocation_public("Público Geral");
        ippon.setLocation_dojo("Dojo");
        ippon.setLocation_address(" Rua Travessa 04 Bl.04 Lt.15 \n" +
                "Vicente Pires, Brasilia-DF.");
        ippon.setLocation_time("Seg, Qua e Sex - 19h às 20h");

        return ippon;
    }

    private static WhereTrainList setTemploAdulto() {
        WhereTrainList temploadulto = new WhereTrainList();

        temploadulto.setLocation_image(R.drawable.ic_dojo);
        temploadulto.setLocation_gym("Templo Budista (Terra Pura)");
        temploadulto.setLocation_public("Público Adulto");
        temploadulto.setLocation_dojo("Dojo");
        temploadulto.setLocation_address("Área Especial 315/316, Lote 5 \n" +
                "Asa Sul, Brasilia-DF");
        temploadulto.setLocation_time("Turma 1: Ter e Qui - 17h30 às 18h30\n" +
                "Turma 2: Ter e Qui - 18h30 às 19h30");

        return temploadulto;
    }

    private static WhereTrainList setTemploInfantil() {
        WhereTrainList temploinfantil = new WhereTrainList();

        temploinfantil.setLocation_image(R.drawable.ic_dojo);
        temploinfantil.setLocation_gym("Templo Budista (Terra Pura)");
        temploinfantil.setLocation_public("Público Infantil");
        temploinfantil.setLocation_dojo("Dojo");
        temploinfantil.setLocation_address("Área Especial 315/316, Lote 5 \n" +
                "Asa Sul, Brasilia-DF");
        temploinfantil.setLocation_time("Ter e Qui - 18h30 às 19h30\n" +
                "Sáb - 8h30 às 10h");

        return temploinfantil;
    }
}
