package GettersSetters;

public class Conta {
    public double saldo;

    public void depositar(double valor){
        if(valor < 0){
            System.out.println("Não pode depositar número negativo");
        } else {
            this.saldo = this.saldo + saldo;
        }    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}