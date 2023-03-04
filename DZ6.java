
// ДЗ:
// while (true) -> while (!plate.isEmpty())
// 1. Создать массив котов. Пусть все коты из массива по очереди едят из одной тарелки.
// В конце каждого цикла мы досыпаем в тарелку еду.
// Для досыпания еды сделать метод increaseFood в классе Plate.
// 2. Поменять поле satiety у кота с boolean на int.
// Допустим у кота апптит 10, сытность 3. Значит кот захочет поесть 7 единиц.
// 3. * Доработать поток thread в классе Cat, чтобы он каждую секунду уменьшал сытость кота на 1.

public class DZ6 {
    public static void main(String[] args) throws InterruptedException {
        Cat[] cats = {
            new Cat("Pushok", 10), 
            new Cat("Snezok", 11), 
            new Cat("Murzik", 12), 
            new Cat("Kisa", 13), 
            new Cat("Barsik", 14)
        };
    
        Plate plate = new Plate(100);

        while (!plate.isEmpty()) {

            for (Cat catsCat : cats) {
                catsCat.eat(plate);
                System.out.println(catsCat);
                System.out.println(plate);
            }
            plate.increaseFood();
            System.out.println(plate);
            System.out.println("В миску добавили еду");
            
            Thread.sleep(1000);
        }
        System.out.println("Игра окончена");
    }

}