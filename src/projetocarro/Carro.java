package projetocarro;

class Carro {

    // ATRIBUTOS
    private String fabricante;
    private String modelo;
    private String cor;
    private int ano;
    private boolean statusMotor;
    private int velocidade;

    // CONSTRUTOR
    public Carro(String fabricante, String modelo, String cor, int ano) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.statusMotor = false; // Motor inicia desligado
        this.velocidade = 0;      // Velocidade inicial é 0
    }

    // GETTERS E SETTERS
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isMotorLigado() {
        return statusMotor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    // METODO PARA LIGAR O CARRO

    public void ligarCarro() {
        if (!statusMotor) {
            statusMotor = true;
            System.out.println("O carro foi ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    // METODO PARA DESLIGAR O CARRO
    public void desligarCarro() {
        if (statusMotor && velocidade == 0) {
            statusMotor = false;
            System.out.println("O carro foi desligado.");
        } else if (velocidade > 0) {
            System.out.println("Não é possível desligar o carro em movimento! Reduza a velocidade primeiro.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    // METODO PARA ACELERAR O CARRO
    public void acelerar(int incremento) {
        if (!statusMotor) {
            System.out.println("O carro estava desligado. Ligando automaticamente...");
            ligarCarro();
        }
        velocidade += incremento;
        System.out.println("O carro acelerou para " + velocidade + " km/h.");
    }

    // METODO PARA FREAR O CARRO
    public void frear(int decremento) {
        if (!statusMotor) {
            System.out.println("O carro estava desligado. Ligando automaticamente...");
            ligarCarro();
        }

        if (velocidade > 0) {
            velocidade -= decremento;
            if (velocidade < 0) {
                velocidade = 0;
            }
            System.out.println("O carro reduziu a velocidade para " + velocidade + " km/h.");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    // METODO PARA EXIBIR INFORMAÇÕES DO CARRO
    public void info() {
        System.out.println("======= INFORMAÇÕES DO CARRO =======");
        System.out.println("FABRICANTE: " + fabricante);
        System.out.println("MODELO: " + modelo);
        System.out.println("COR: " + cor);
        System.out.println("ANO: " + ano);
        System.out.println("MOTOR LIGADO? " + (statusMotor ? "Sim" : "Não"));
        System.out.println("VELOCIDADE ATUAL: " + velocidade + " km/h");
        System.out.println("====================================");
    }
}