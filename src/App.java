import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        Condominio ambience = new Condominio("Ambience residence 1", "Av. Teotonio Segurado");

        Apto ap1 = new Apto("ap1", 1, 2, false);
        ambience.addApto(ap1);
        Apto ap2 = new Apto("ap2", 2, 2, false);
        ambience.addApto(ap2);
        Apto ap3 = new Apto("ap3", 3, 3, false);
        ambience.addApto(ap3);
        Apto ap4 = new Apto("ap4", 4, 3, false);
        ambience.addApto(ap4);
        Apto ap5 = new Apto("ap5", 5, 4, true);
        ambience.addApto(ap5);
        Apto ap6 = new Apto("ap6", 6, 4, false);
        ambience.addApto(ap6);
        Apto ap7 = new Apto("ap7", 7, 5, false);
        ambience.addApto(ap7);
        Apto ap8 = new Apto("ap8", 8, 5, true);
        ambience.addApto(ap8);
        Apto ap9 = new Apto("ap9", 9, 6, false);
        ambience.addApto(ap9);
        Apto ap10 = new Apto("ap10", 10, 6, true);
        ambience.addApto(ap10);
        Apto ap11 = new Apto("ap11", 11, 7, true);
        ambience.addApto(ap11);
        Apto ap12 = new Apto("ap12", 12, 8, false);
        ambience.addApto(ap12);
        Apto ap13 = new Apto("ap13", 13, 8, true);
        ambience.addApto(ap13);
        Apto ap14 = new Apto("ap14", 14, 8, true);
        ambience.addApto(ap14);
        Apto ap15 = new Apto("ap15", 15, 9, true);
        ambience.addApto(ap15);

        Prop propietario = new Prop("Albérico", 21, 99999, "m");

        while (true){
            List<Integer> aptosAvailabeNumbers = new ArrayList<>();

            System.out.println("Seja bem vindo ao hotel Ambience Residence 1!");
            System.out.println("Aqui estão todos os nossos comandos: ");
            System.out.println("1 - Reservar unidade");
            System.out.println("2 - Ver todas as unidades");
            System.out.println("3 - Ver unidades disponiveis");
            System.out.println("4 - ver unidades ocupadas");
            System.out.println("0 - Sair do sistema");

            Integer response = scan.nextInt();

            if (response == 1){
                ambience.availabeAptos();
                System.out.println("Se deseja reservar um AP, selecione o seu número: ");
                
                for (Apto i : ambience.apartamentos){
                    if (i.availabe == true){
                        aptosAvailabeNumbers.add(i.number);
                    } else {
                        continue;
                    }
                }
                
                Integer aptoResponse = scan.nextInt();   
                Boolean aptoFound = false;
                Apto aptoChosen;
                for (Integer j : aptosAvailabeNumbers) {
                    if (aptoResponse == j){
                        System.out.println("Você selecionou o AP: "+ aptoResponse);
                        aptoFound = true;
                        aptoChosen = aptoResponse;
                        break;
                    }
                }if (!aptoFound) {
                    System.out.println("Selecione um apartamento disponivel");
                    break;
                }

                if (aptoFound) {
                    propietario.addMorador(aptoChosen);
                }
                    

            } else if (response == 2) {
                ambience.aptos();
                break;
            } else if (response == 3) {
                ambience.availabeAptos();
                break;
            } else if (response == 4) {
                ambience.occupiedAptos();
                break;
            } else if (response == 0){
                System.out.println("Muito obrigado e volte sempre");
                break;
            }

        }
        
    }
}
