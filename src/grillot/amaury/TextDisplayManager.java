package grillot.amaury;

public class TextDisplayManager {

    private void print(String s)
    {
        System.out.println(s);
    }
    public void displayFirstMessage()
    {
        this.print("Entrez le nom de votre fichier puis l'opération voulue");
    }

    public void displaySubtotal(String operation, int subtotal) {
        this.print("Resultat de l'opération " + operation + " : " + subtotal);
    }
}
