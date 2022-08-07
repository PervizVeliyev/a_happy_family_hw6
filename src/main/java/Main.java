public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 101; i++){                                                //for the usage of loop in the main class of human object
            Human human1 = new Human("Esmira", "Veliyeva", 2000);
            Human human2 = new Human("Ferid", "Veliyev", 1997);
            Human human3 = new Human("Perviz", "Veliyev", 1999);
            Human human4 = new Human("Semed", "Teymurov", 2000);
            Human human5 = new Human("Elsen", "Quliyev", 2000);
            Human human6 = new Human("Nigar", "Suleymanova", 2002);
        }                                                                             //garbage collector will sweep them after some time

        Pet dog = new Pet(Species.DOG,"Danny",6,55,new String[]{"eat","run","bite"});
        Human mother = new Human("Arzu","Ismayilova",1975);
        Human father = new Human("Senan","Ismayilov",1975);
        Human child = new Human("Elnur","Ismayilov",2000,94, null);
        Human child1 = new Human("Emil","Ismayilov",1996,92, null);
        Human child2 = new Human("Elvin","Ismayilov",1996,92, null);
        Family family = new Family(mother, father);

        family.addChild(child);
        family.addChild(child1);
        family.addChild(child2);

        System.out.println(family.deleteChild(2));
        family.deleteChild(child1);
        System.out.println(family.countFamily());


        child.setSchedule(new String[][]{{DayOfWeek.MONDAY.name(),DayOfWeek.TUESDAY.name(),DayOfWeek.WEDNESDAY.name(),
                DayOfWeek.THURSDAY.name(),DayOfWeek.FRIDAY.name(),DayOfWeek.SATURDAY.name(),
                DayOfWeek.SUNDAY.name()},{"go","run","fall","stand","go","run","fall"}});
        System.out.println(child.getSchedule());
        family.setPet(dog);
        System.out.println(family);
        System.out.println(child);
        System.out.println(dog);
    }
}
