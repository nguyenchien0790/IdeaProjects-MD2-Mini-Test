package reikkei.academy.view;

import java.util.Scanner;

public class Main {

    private final Scanner sc = new Scanner(System.in);
    private final SingerView singerView = new SingerView();

    public Main() {

        System.out.println("_____MENU_____");
        System.out.println("1 : Show List Singer\n"
        +"2 : Create Singer\n"
        +"3 : Update Singer\n"
        +"4 : Detail Singer\n"
        +"5 : Delete Singer\n"
        +"6 : Sort Singer \n"
        +"7 : Exit\n");
        System.out.print("Please choose : ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                singerView.showListSinger();
                break;
            case 2:
                singerView.createSinger();
                break;
            case 3:
                singerView.updateSinger();
                break;
            case 4:
                singerView.showDetailSinger();
                break;
            case 5:
                singerView.deleteSinger();
                break;
            case 6:
                singerView.sortSingerList();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        }
        new Main();
    }

    public static void main(String[] args) {
        new Main();
    }
}
