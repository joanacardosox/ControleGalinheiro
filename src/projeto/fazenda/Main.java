package projeto.fazenda;

public class Main {
    static void main() {
       Galinheiro galinheiroZe = new Galinheiro("Galinheiro do Zé", 2, 4);

       Galinheiro continenteOvos = new Galinheiro("Granja Continente", 10, 15);


       galinheiroZe.mostrarInfo();
       continenteOvos.mostrarInfo();
    }
}
