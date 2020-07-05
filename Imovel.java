
package prova;


public class Imovel {

    enum Categorias{Comercial, Residencial};
    enum Tipos {Apartamento, Casa, Chácara, Sala, Salão, Sítio};
    private String Dono;
    private String Descricao;
    private Categorias categoria;
    private Tipos tipo;
    private double Valor;

    public Imovel(String Dono, String Descricao, Categorias categoria, Tipos tipo, double Valor) {
        this.Dono = Dono;
        this.Descricao = Descricao;
        this.categoria = categoria;
        this.tipo = tipo;
        this.Valor = Valor;
    }

    public String getDono() {
        return Dono;
    }


    public String getDescricao() {
        return Descricao;
    }
   

    public Categorias getCategoria() {
        return categoria;
    }
   

    public Tipos getTipo() {
        return tipo;
    }


    public double getValor() {
        return Valor;
    }
    
    public String getValorString(){
        return String.valueOf(Valor);
    }
}
