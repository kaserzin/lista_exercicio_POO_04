
import semana4.questao4.Boleto;
import semana4.questao4.CartaoCredito;
import semana4.questao4.Pagamento;
import semana4.questao4.Pix;

void main(){
        Pagamento[] pagamentos = {new CartaoCredito(),new Boleto(),new Pix()};

        double valor = 1000.00;

        for (Pagamento pagamento : pagamentos) {pagamento.processar(valor);
        }
    }