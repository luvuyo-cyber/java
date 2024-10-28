package book_2.chapter_7;

public class RandomNumberReturn {

    public static void main(String[] args) {

        int z = getRandomNumber();
        System.out.println(z);
    }

//    public static int getRandomNumber()
//    {
//        int num = (int)(Math.random() * 20) + 1;
//        if (num != 12) {
//            return num;
//        }
//    }

//    public static int getRandomNumber()
//    {
//        int num = (int)(Math.random() * 20) + 1;
//        if (num != 12)
//            return num;
//        else
//            return 11;
//    }

//    public static int getRandomNumber() {
//        int num;
//        do
//        {
//            num = (int)(Math.random() * 20) + 1;
//            if (num != 12)
//                return num;
//        } while (num == 12);
//    }

    public static int getRandomNumber()
    {
        int num;
        while (true)
        {
            num = (int)(Math.random() * 20) + 1;
            if (num != 12)
                return num;
        }
    }

}
