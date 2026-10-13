public class MyClass {
    public static void main(String args[]) {

        // AUTOMOVEIS
        Automovel opala = new Automovel();
        Automovel fusca = new Automovel();
        Automovel brasilia = new Automovel();

        opala.setMassa(2000);
        opala.setCor("Azul");
        opala.setPorta(4);
        System.out.println("Opala");
        System.out.println("Massa=" + opala.getMassa());
        System.out.println("Cor=" + opala.getCor());
        System.out.println("Porta=" + opala.getPorta());

        fusca.setMassa(3000);
        fusca.setCor("Vermelho");
        fusca.setPorta(4);
        System.out.println("Fusca");
        System.out.println("Massa=" + fusca.getMassa());
        System.out.println("Cor=" + fusca.getCor());
        System.out.println("Porta=" + fusca.getPorta());

        brasilia.setMassa(2500);
        brasilia.setCor("Amarelo");
        brasilia.setPorta(2);
        System.out.println("Brasilia");
        System.out.println("Massa=" + brasilia.getMassa());
        System.out.println("Cor=" + brasilia.getCor());
        System.out.println("Porta=" + brasilia.getPorta());

        // MOTOCICLETAS
        Motocicleta royalEnfield = new Motocicleta();
        Motocicleta kawasaki = new Motocicleta();
        Motocicleta yamaha = new Motocicleta();

        royalEnfield.setMassa(200);
        royalEnfield.setCor("Preta");
        royalEnfield.setRodas(2);
        System.out.println("Royal Enfield");
        System.out.println("Massa=" + royalEnfield.getMassa());
        System.out.println("Cor=" + royalEnfield.getCor());
        System.out.println("Rodas=" + royalEnfield.getRodas());

        kawasaki.setMassa(180);
        kawasaki.setCor("Verde");
        kawasaki.setRodas(2);
        System.out.println("Kawasaki");
        System.out.println("Massa=" + kawasaki.getMassa());
        System.out.println("Cor=" + kawasaki.getCor());
        System.out.println("Rodas=" + kawasaki.getRodas());

        yamaha.setMassa(220);
        yamaha.setCor("Azul");
        yamaha.setRodas(2);
        System.out.println("Yamaha");
        System.out.println("Massa=" + yamaha.getMassa());
        System.out.println("Cor=" + yamaha.getCor());
        System.out.println("Rodas=" + yamaha.getRodas());
    }
}
