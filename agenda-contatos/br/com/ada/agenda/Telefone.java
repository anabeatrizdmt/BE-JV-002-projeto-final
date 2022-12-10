package br.com.ada.agenda;


public class Telefone {

    public TipoTelefone tipo;
    public String ddi;
    public String ddd;
    public String numero;

    public Telefone(TipoTelefone tipo, String ddi, String ddd, String numero){
        this.tipo = tipo;
        this.ddi = ddi;
        this.ddd = ddd;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return String.format("""               
                    Tipo: %s
                    DDI %s
                    DDD %s
                    Numero %s
                """, tipo, ddi, ddd, numero)
                ;
    }

    public TipoTelefone getTipo() {
        return tipo;
    }

    public String getDdi() {
        return ddi;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }
}
