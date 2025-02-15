package animal;

class Cachorro {

    // ATRIBUTOS

    private String cor;
    private String nome;
    private String raca;
    private int idade;
    private double peso;

   // CONSTRUTOR
   public Cachorro (String cor,String nome,String raca, int idade,double peso){

       this.cor = cor;
       this.nome = nome;
       this.raca = raca;
       this.idade = idade;
       this.peso = peso;

   }

   // GETTERS E SETTES

   public String getCor(){
       return cor;
   }

   public void setCor (String cor){
     this.cor = cor;
  }

  public String getNome (){
       return nome;
  }

  public void setNome(String nome){
       this.nome = nome;

  }

  public String getRaca(){
       return raca;
  }

  public void setRaca(String raca){
       this.raca = raca;
  }

  public int getIdade (){
       return idade;

  }

  public void setIdade (int idade){
       this.idade = idade;

  }

  public double getPeso (){
       return peso;
  }

  public void setPeso(double peso){
       this.peso = peso;
  }

  void info (){
       System.out.println("FICHA CADASTRAL");
       System.out.println("NOME DO CACHORRO : " + nome);
       System.out.println("COR DO CACHORRO : " + raca);
       System.out.println("PESO DO CACHORRO : "+ peso);
       System.out.println("IDADE DO CACHORRO : "+ idade);

  }

}

