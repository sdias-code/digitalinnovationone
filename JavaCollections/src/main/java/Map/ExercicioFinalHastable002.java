package Map;

import java.util.Hashtable;

public class ExercicioFinalHastable002 {
    public static void main(String[] args) {
        Hashtable<String, String> estadosBrasileiros = new Hashtable<>();

        //Add estados brasileiros
        estadosBrasileiros.put("Acre", "AC");
        estadosBrasileiros.put("Alagoas", "Al");
        estadosBrasileiros.put("Amapá", "AP");
        estadosBrasileiros.put("Amazonas", "AM");
        estadosBrasileiros.put("Bahia", "BA");
        estadosBrasileiros.put("Ceará", "CE");
        estadosBrasileiros.put("Espírito Santo", "ES");
        estadosBrasileiros.put("Goiás", "GO");
        estadosBrasileiros.put("Maranhão", "MA");
        estadosBrasileiros.put("Mato Grosso", "MT");
        estadosBrasileiros.put("Mato Grosso do Sul", "MS");
        estadosBrasileiros.put("Minas Gerais", "MG");
        estadosBrasileiros.put("Pará", "PA");
        estadosBrasileiros.put("Paraíba", "PB");
        estadosBrasileiros.put("Paraná", "PR");
        estadosBrasileiros.put("Pernambuco", "PE");
        estadosBrasileiros.put("Piauí", "PI");
        estadosBrasileiros.put("Rio de Janeiro", "RJ");
        estadosBrasileiros.put("Rio Grande do Norte", "RN");
        estadosBrasileiros.put("Rio Grande do Sul", "RS");
        estadosBrasileiros.put("Rondônia", "RO");
        estadosBrasileiros.put("Roraima", "RR");
        estadosBrasileiros.put("Santa Catarina", "SC");
        estadosBrasileiros.put("São Paulo", "SP");
        estadosBrasileiros.put("Sergipe", "SE");
        estadosBrasileiros.put("Tocantins", "TO");

        //Remova o estado de Minas Gerais
        estadosBrasileiros.remove("Minas Gerais");

        //Adicione o Distrito Federal
        estadosBrasileiros.put("Distrito Federal", "DF");

        //Verifique o tamanho do map
        System.out.println("Tamanho do map: "+estadosBrasileiros.size());

        //Remova o estado do Mato Grosso do Sul usando o nome
        estadosBrasileiros.remove("Mato Grosso do Sul");

        //Navegue em todos os registros do map, mostrando no console no seguinte formato: NOME (SIGLA)
        for(String estados: estadosBrasileiros.keySet()){
            System.out.println(estados+" ("+estadosBrasileiros.get(estados)+")");
        }

        //Verifique se o estado de Santa Catarina existe no map buscando por sua sigla (SC)
        System.out.println("Existe o estado de Santa Catarina? "+
                (estadosBrasileiros.containsValue("SC")?"Sim.": "Não."));

        //Verifica se o estado de Maranhão existe no map buscanco por seu nome
        System.out.println("Existe o estado do Maranhão? "+
                (estadosBrasileiros.containsKey("Maranhão")? "Sim.": "Não."));

    }
}
