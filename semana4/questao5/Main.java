package semana4.questao5;
public class Main {
void main(){

        Personagem[] personagens = {
                new Guerreiro(),
                new Mago(),
                new Arqueiro()
        };
        for (Personagem personagem : personagens) {
            personagem.atacar();
        }
    }
}