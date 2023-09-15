public class Loja {

    public static void main(String[] args) {

        Produto detergente = new Produto("detergente", 3.0, 10);
        Produto amaciante = new Produto("amaciante", 5.5, 10);
        Produto fiodental = new Produto("fio dental", 2.5, 10);
        
        System.out.println("\n\nBem vindos à loja.");
        System.out.println("\nTemos os seguintes produtos hoje: \n");
        detergente.Consultar();
        amaciante.Consultar();
        fiodental.Consultar();

    }

}
