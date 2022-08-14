package reikkei.academy.view;
import reikkei.academy.controller.SingerController;
import reikkei.academy.model.Singer;

import java.util.List;
import java.util.Scanner;

public class SingerView  {
    Scanner sc = new Scanner(System.in);
    private final SingerController singerController = new SingerController();

    public void showListSinger() {
        for (Singer singer : singerController.getSingers()) {
            System.out.println(singer.getId() + " - " + singer.getName() + " - " + singer.getAge());
        }
    }

    public void createSinger() {
        System.out.print("Import singer id : ");
        int id =  Integer.parseInt(sc.nextLine());
        if (check(id)){
            System.out.println("Id already available");
            return;
        }
        System.out.print("Import singer name : ");
        String name = sc.nextLine();
        System.out.print("Import singer age : ");
        int age = Integer.parseInt(sc.nextLine());
        singerController.addSinger(new Singer(id, name, age));
    }

    public void deleteSinger() {
        System.out.println("Enter singer id delete: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Are you sure want to delete (y / n) : ");
        String check = sc.nextLine();
        if (check.equalsIgnoreCase("y")) {
            singerController.deleteSinger(id);
            System.out.println("Successful delete");
        } else if (check.equalsIgnoreCase("n")) {
            System.out.println("Not delete");
        } else {
            System.out.println("Invalid choice");
        }
    }

    public void showDetailSinger() {
        System.out.println("Enter singer id to show:");
        int id = Integer.parseInt(sc.nextLine());
        Singer singer = singerController.findSingerById(id);
        System.out.println("Id: " + singer.getId() + ", name: " + singer.getName() + ", age: " + singer.getAge());
    }

    public void updateSinger() {
        System.out.println("EDIT SINGER");
        System.out.println("Enter singer id :");
        int id = Integer.parseInt(sc.nextLine());
        Singer singer = singerController.findSingerById(id);
        System.out.println("Enter new singer name:");
        String name = sc.nextLine();
        System.out.println("Enter new singer age:");
        int age = Integer.parseInt(sc.nextLine());
        singer.setName(name);
        singer.setAge(age);
    }

    public void sortSingerList() {
        singerController.sortSingerList();
        System.out.println("Singer list sorted");
    }

    private boolean check(int id) {
        List<Singer> checker = singerController.getSingers();
        for (Singer singer: checker) {
            if (singer.getId()==id){
                return true;
            }
        }return false;
    }

}
