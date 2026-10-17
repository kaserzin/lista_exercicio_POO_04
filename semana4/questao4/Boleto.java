package semana4.questao4;

public class Boleto extends Pagamento {

    @Override
    public void processar(double valor) {
        double total = valor + 2.50;

        System.out.printf(
                "Boleto: R$ %.2f (com taxa fixa de R$ 2,50)%n",
                total
        );
    }
}