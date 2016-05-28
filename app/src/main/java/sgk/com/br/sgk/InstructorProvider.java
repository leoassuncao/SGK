package sgk.com.br.sgk;

import java.util.ArrayList;
import java.util.List;

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
        tiago.setInstructor_name("Sensei Tiago França (SGK/JKA)\n");
        tiago.setInstructor_graduation("Graduação: 4º Dan (JKA)\n");
        tiago.setInstructor_train("Onde Treina: Julio Adnet (AJA)\n");
        tiago.setInstructor_classes("Onde dá Aulas: AJA e Cia Athletica\n");
        tiago.setInstructor_contact("tiago.franca@sgkdojo.com.br");

        return tiago;
        }

    private static InstructorsList setRafael() {
        InstructorsList rafael = new InstructorsList();

        rafael.setInstructor_photo(R.drawable.rafael_zardo);
        rafael.setInstructor_name("Sensei Rafael Zardo (SGK)\n");
        rafael.setInstructor_graduation("Graduação: 2º Dan (JKA)\n");
        rafael.setInstructor_train("Onde Treina: Julio Adnet (AJA)\n");
        rafael.setInstructor_classes("Onde dá Aulas: Julio Adnet (AJA)\n");
        rafael.setInstructor_contact("rafael.zardo@sgkdojo.com.br");

        return rafael;
    }

    private static InstructorsList setGabriel() {
        InstructorsList gabriel = new InstructorsList();

        gabriel.setInstructor_photo(R.drawable.gabriel_alonzo);
        gabriel.setInstructor_name("Sensei Gabriel Alonzo (SGK)\n");
        gabriel.setInstructor_graduation("Graduação: 2º Dan (JKA)\n");
        gabriel.setInstructor_train("Onde Treina: Julio Adnet (AJA)\n");
        gabriel.setInstructor_classes("Onde dá Aulas:UnB\n");
        gabriel.setInstructor_contact("gabriel.alonzo@sgkdojo.com.br");

        return gabriel;
    }

    private static InstructorsList setEverton() {
        InstructorsList everton = new InstructorsList();

        everton.setInstructor_photo(R.drawable.everton_rodrigues);
        everton.setInstructor_name("Sensei Everton Rodrigues (SGK)\n");
        everton.setInstructor_graduation("Graduação: 2º Dan (JKA)\n");
        everton.setInstructor_train("Onde Treina: Natal-RN\n");
        everton.setInstructor_classes("");
        everton.setInstructor_contact("everton.rodrigues@sgkdojo.com.br\n");

        return everton;
    }

    private static InstructorsList setCristiano() {
        InstructorsList cristiano = new InstructorsList();

        cristiano.setInstructor_photo(R.drawable.cristiano_morais);
        cristiano.setInstructor_name("Sensei Cristiano Morais (SGK)");
        cristiano.setInstructor_graduation("Graduação: 2º Dan (JKA)\n");
        cristiano.setInstructor_train("Onde Treina: Julio Adnet (AJA)\n");
        cristiano.setInstructor_classes("Onde dá Aulas: Templo-(Infantil)\n");
        cristiano.setInstructor_contact("cristiano.morais@sgkdojo.com.br");

        return cristiano;
    }

    private static InstructorsList setZuza() {
        InstructorsList zuza = new InstructorsList();

        zuza.setInstructor_photo(R.drawable.guilherme_zuza);
        zuza.setInstructor_name("Sensei Guilherme Zuza (SGK)\n");
        zuza.setInstructor_graduation("Graduação: 2º Dan (JKA)\n");
        zuza.setInstructor_train("Onde Treina: Julio Adnet (AJA)\n");
        zuza.setInstructor_classes("Onde dá Aulas: Templo-(Adulto)\n");
        zuza.setInstructor_contact("guilherme.zuza@sgkdojo.com.br");

        return zuza;
    }

    private static InstructorsList setMartins() {
        InstructorsList martins = new InstructorsList();

        martins.setInstructor_photo(R.drawable.rafael_martins);
        martins.setInstructor_name("Sensei Rafael Martins (SGK)\n");
        martins.setInstructor_graduation("Graduação: 1º Dan (JKA)\n");
        martins.setInstructor_train("\n");
        martins.setInstructor_classes("Onde dá Aulas: Ippon\n");
        martins.setInstructor_contact("rafael.martins@sgkdojo.com.br");

        return martins;
    }

    private static InstructorsList setAmanda() {
        InstructorsList amanda = new InstructorsList();

        amanda.setInstructor_photo(R.drawable.amanda_gontijo);
        amanda.setInstructor_name("Sensei Amanda Gontijo (SGK)\n");
        amanda.setInstructor_graduation("Graduação: 1º Dan (JKA)\n");
        amanda.setInstructor_train("Onde Treina: Julio Adnet (AJA)\n");
        amanda.setInstructor_classes("\n");
        amanda.setInstructor_contact("amanda.gontijo@sgkdojo.com.br");

        return amanda;
    }
}