package semana4.questao4;
public class Main{
void main(){
        Pagamento[] pagamentos = {new CartaoCredito(),new Boleto(),new Pix()};

        double valor = 1000.00;

        for (Pagamento pagamento : pagamentos) {pagamento.processar(valor);
        }
    }
}
