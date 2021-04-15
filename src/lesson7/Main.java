package lesson7;

public class Main {

    public static void main(String[] args){

                Cat[] catArr = new Cat[4];
                catArr[0] = new Cat("игорь", 20);
                catArr[1] = new Cat("вася", 80);
                catArr[2] = new Cat("олег", 31);
                catArr[3] = new Cat("женя", 30);
                Plate plate = new Plate(90);
                plate.info();
                    for (Cat i : catArr) {
                        if (!plate.infoFood(i.getAppetite())){
                            plate.addFood();
                        }
                            i.eat(plate);
                            plate.info();
                            i.setSatiety(i.isSatiety());
                            System.out.println(i.getName() + " " + i.isSatiety());
                    }
    }

}

