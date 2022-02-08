public class App {
    public static void main(String[] args) throws Exception {

//testeveiculo
        Veiculo v = new Veiculo("Fiat", "Uno", "GHT6H75", "Preto", "1800", true, 30, 100, 50000.00);

        v.dados();
       v.abastecer(30);
       v.frear();

       v.dados();



      //teste inverter numero
      InverterNumero a = new InverterNumero();
      a.inverterNumero(1654891);
      
    }
}
