import sanita.*;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws ErrMedicoInesistente, ErrPersonaInesistente {
        Paziente p= new Paziente("christian","mastropietro","mstcrs96b04h501e",new Medico("Marco","Ghirardi","cbebjejajsn","0001"));
        Paziente t= new Paziente("Simone","Faiella","cnsnxnaj",new Medico("Marco","Ghirardi","cbebjejajsn","0001"));
        Medico m= new Medico("Marco","Ghirardi","cbebjejajsn","0001",new HashSet<>());
        Sanità s= new Sanità();



    }
}