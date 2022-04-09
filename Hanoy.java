public class Hanoy{

    private void hanoy(int n, int origem, int destino)
    {
        //Padrão
        if(n == 1) {
            System.out.println(origem +" -> "+ destino);
        } else {
            //3 torres, torre 1, torre 2, torre 3
            //Se n > 1, transportaremos n-1 para o auxiliar a fim de que transportemos o último disco para o destino
            int aux = 6 - origem - destino;
            hanoy(n-1, origem, aux);
            //Assim que conseguimos transportar n-1 da origem pro auxiliar, transportamos o ultimo para o destino
            System.out.println(origem +" -> "+ destino);
            //Sobra n-1 discos, localizados no auxiliar que queremos passar pro destino
            hanoy(n-1, aux, destino);
        }
    }


    public static void main(String[] args) {
        Hanoy h = new Hanoy();
        h.hanoy(3, 1, 3);
    }
}