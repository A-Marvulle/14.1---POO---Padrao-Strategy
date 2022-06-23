class Main {
  public static void main(String[] args) {
    AgenteSecreto agente = new AgenteSecreto(new EstrategiaLinhaDeFrente()); //criação do agente
    //se cria varias formas de estratégias e dessa forma uma não interfere na outra, por um lado acaba criando mais clasesses

    agente.mudarEstrategia(new EstrategiaEngenharia()); //agente vai lutar como um engenheiro
    agente.combater();

    System.out.println("\n");
    
    agente.mudarEstrategia(new EstrategiaLinhaDeFrente()); //agente vai lutar na linha de frente
    agente.combater();

    System.out.println("\n");

    agente.mudarEstrategia(new EstrategiaSuporte()); //agente vai lutar como suporte
    agente.combater();

   System.out.println("\n");
    
    agente.mudarEstrategia(new EstrategiaFinal()); //Doom
    agente.combater();
  }
}