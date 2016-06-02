package sgk.com.br.sgk.Provider;

import java.util.ArrayList;
import java.util.List;

import sgk.com.br.sgk.List.InstructorsList;
import sgk.com.br.sgk.R;

/**
 * Created by Leonardo Assunção on 28/05/2016.
 */
public class InstructorProvider {

    public static List<InstructorsList> provideInstructorsList() {
    List<InstructorsList> instructor = new ArrayList();

        instructor.add(InstructorProvider.setTiago());
        instructor.add(InstructorProvider.setRafael());
        instructor.add(InstructorProvider.setGabriel());
        instructor.add(InstructorProvider.setEverton());
        instructor.add(InstructorProvider.setCristiano());
        instructor.add(InstructorProvider.setZuza());
        instructor.add(InstructorProvider.setMartins());
        instructor.add(InstructorProvider.setAmanda());

    return instructor;
}

    private static InstructorsList setTiago() {
        InstructorsList tiago = new InstructorsList();

        tiago.setInstructor_photo(R.drawable.tiago_porto);
        tiago.setInstructor_name("Sensei Tiago França (SGK/JKA)");
        tiago.setInstructor_graduation("4º Dan (JKA)");
        tiago.setInstructor_train("Onde Treina: Julio Adnet (AJA)");
        tiago.setInstructor_classes("Onde dá Aulas: AJA e Cia Athletica");
        tiago.setInstructor_contact("tiago.franca@sgkdojo.com.br");

        return tiago;
        }

    private static InstructorsList setRafael() {
        InstructorsList rafael = new InstructorsList();

        rafael.setInstructor_photo(R.drawable.rafael_zardo);
        rafael.setInstructor_name("Sensei Rafael Zardo (SGK)");
        rafael.setInstructor_graduation("2º Dan (JKA)");
        rafael.setInstructor_train("Onde Treina: Julio Adnet (AJA)");
        rafael.setInstructor_classes("Onde dá Aulas: Julio Adnet (AJA)");
        rafael.setInstructor_contact("rafael.zardo@sgkdojo.com.br");

        return rafael;
    }

    private static InstructorsList setGabriel() {
        InstructorsList gabriel = new InstructorsList();

        gabriel.setInstructor_photo(R.drawable.gabriel_alonzo);
        gabriel.setInstructor_name("Sensei Gabriel Alonzo (SGK)");
        gabriel.setInstructor_graduation("2º Dan (JKA)");
        gabriel.setInstructor_train("Onde Treina: Julio Adnet (AJA)");
        gabriel.setInstructor_classes("Onde dá Aulas:UnB");
        gabriel.setInstructor_contact("gabriel.alonzo@sgkdojo.com.br");

        return gabriel;
    }

    private static InstructorsList setEverton() {
        InstructorsList everton = new InstructorsList();

        everton.setInstructor_photo(R.drawable.everton_rodrigues);
        everton.setInstructor_name("Sensei Everton Rodrigues (SGK)");
        everton.setInstructor_graduation("2º Dan (JKA)");
        everton.setInstructor_train("Onde Treina: Natal-RN");
        everton.setInstructor_classes("everton.rodrigues@sgkdojo.com.br");

        return everton;
    }

    private static InstructorsList setCristiano() {
        InstructorsList cristiano = new InstructorsList();

        cristiano.setInstructor_photo(R.drawable.cristiano_morais);
        cristiano.setInstructor_name("Sensei Cristiano Morais (SGK)");
        cristiano.setInstructor_graduation("2º Dan (JKA)");
        cristiano.setInstructor_train("Onde Treina: Julio Adnet (AJA)");
        cristiano.setInstructor_classes("Onde dá Aulas: Templo-(Infantil)");
        cristiano.setInstructor_contact("cristiano.morais@sgkdojo.com.br");

        return cristiano;
    }

    private static InstructorsList setZuza() {
        InstructorsList zuza = new InstructorsList();

        zuza.setInstructor_photo(R.drawable.guilherme_zuza);
        zuza.setInstructor_name("Sensei Guilherme Zuza (SGK)");
        zuza.setInstructor_graduation("2º Dan (JKA)");
        zuza.setInstructor_train("Onde Treina: Julio Adnet (AJA)");
        zuza.setInstructor_classes("Onde dá Aulas: Templo-(Adulto)");
        zuza.setInstructor_contact("guilherme.zuza@sgkdojo.com.br");

        return zuza;
    }

    private static InstructorsList setMartins() {
        InstructorsList martins = new InstructorsList();

        martins.setInstructor_photo(R.drawable.rafael_martins);
        martins.setInstructor_name("Sensei Rafael Martins (SGK)");
        martins.setInstructor_graduation("1º Dan (JKA)");
        martins.setInstructor_train("Onde dá Aulas: Ippon");
        martins.setInstructor_classes("rafael.martins@sgkdojo.com.br");

        return martins;
    }

    private static InstructorsList setAmanda() {
        InstructorsList amanda = new InstructorsList();

        amanda.setInstructor_photo(R.drawable.amanda_gontijo);
        amanda.setInstructor_name("Sensei Amanda Gontijo (SGK)");
        amanda.setInstructor_graduation("1º Dan (JKA)");
        amanda.setInstructor_train("Onde Treina: Julio Adnet (AJA)");
        amanda.setInstructor_classes("amanda.gontijo@sgkdojo.com.br");

        return amanda;
    }
}