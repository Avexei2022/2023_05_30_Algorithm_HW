package Algorithm_HashMap;

public class MyHashMap {
    public static void main(String[] args) {

        Mapa<Integer, Integer> mapa = new Mapa<>();
        printPutObject(mapa.put(1, 10));
        printPutObject(mapa.put(1, 100));
        printPutObject(mapa.put(2, 20));
        printPutObject(mapa.put(3, 30));
        printPutObject(mapa.put(4, 40));
        printPutObject(mapa.put(5, 50));
        printPutObject(mapa.put(17, 170));
        printPutObject(mapa.put(33, 330));
        printPutObject(mapa.put(49, 490));
        printPutObject(mapa.put(49, 4900));

        System.out.println();

        printGetObject(mapa.get(1));
        printGetObject(mapa.get(2));
        printGetObject(mapa.get(17));
        printGetObject(mapa.get(33));
        printGetObject(mapa.get(49));
        printGetObject(mapa.get(120));
        System.out.println();

        printRemoveObject(mapa.remove(106));
        printRemoveObject(mapa.remove(17));
        printRemoveObject(mapa.remove(8));
        printRemoveObject(mapa.remove(49));
        System.out.println();

        printReplaysObject(mapa.replays(33, 3300));
        printReplaysObject(mapa.replays(33, 33000));
        System.out.println();

        System.out.println("Количество элементов: " + mapa.size());
        System.out.println();

        printIsKey(mapa.containsKey(2));
        printIsKey(mapa.containsKey(17));
        System.out.println();

        printIsValue(mapa.containsValue(20));
        printIsValue(mapa.containsValue(170));
        System.out.println();


    }


    public static void printPutObject(Object node2Print) {
        if (node2Print == null) {
            System.out.println("Элемент с таким ключом уже существует. " +
                    "Для замены элемента используй метод replace");
        } else {
            System.out.println("HashMap дополнен значением: " + node2Print);
        }
    }

    public static void printGetObject(Object node2Print) {
        if (node2Print == null) {
            System.out.println("Значения с таким ключом нет ");
        } else {
            System.out.println("Найдено значение: " + node2Print);
        }
    }
    
    public static void printRemoveObject(Object node2Print) {
        if (node2Print == null) {
            System.out.println("Такой Ноды нет, удалять нечего ");
        } else {
            System.out.println("Удалена нода со значением: " + node2Print);
        }
    }

    public static void printReplaysObject(Object node2Print) {
        if (node2Print == null) {
            System.out.println("Такой Ноды нет, менять нечего ");
        } else {
            System.out.println("Значение ноды заменено на: " + node2Print);
        }
    }

    public static void printIsKey(Boolean isKey) {
        if (isKey) {
            System.out.println("Ключ найден.");
        } else {
            System.out.println("Ключ не найден");
        }
    }

    public static void printIsValue(Boolean isValue) {
        if (isValue) {
            System.out.println("Значение найдено.");
        } else {
            System.out.println("Значение не найдено");
        }
    }
}