import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Regle {

    public static HashMap<Symbole,ArrayList<Symbole>> grammaire = new HashMap<Symbole,ArrayList<Symbole>>();
    public static ArrayList<String>Vn = new ArrayList<String>(
            Arrays.asList("<Programme>","<liste_declarations>","<liste_instructions>","<une_declaration>","<type>","<une_instruction>","<affectation>","<test>","<condition>","<operateur>")
    );
    public static ArrayList<String>Vt = new ArrayList<String>(
            Arrays.asList("main","(",")","{","}","vide","id","int","float","=","nombre","if","else","<",">")
    );

    public Regle(Symbole s,ArrayList<Symbole> droite)
    {
        this.grammaire.put(s,droite);
    }

    // check if symbole treminal ou non
    public boolean checkT(String s)
    {
        if(Vn.contains(s))
        {
            return false;
        }
        else if(Vt.contains(s))
        {
            return true;
        }else if(s.charAt(0)>='a' && s.charAt(0)<='z')
        {
            return true;
        }else if(s.charAt(0)>='A' && s.charAt(0)<='Z'){
            return false;

        }else if(s.charAt(0)>='!' && s.charAt(0)<='/'){
            return true;

        }else if (s!=null){
            try {
                double d = Double.parseDouble(s);
                return true;
            } catch (NumberFormatException nfe) {
                return false;
            }

        }else{
            System.out.println(s+" - caractere non defini");
            //tttfzaedsfd

        }
        return false;
    }




}
