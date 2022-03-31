public class lb41 
{
    public static void ex1() {
        try {
            System.out.println("0");     //   1)виведення в консоль число 0
            throw new RuntimeException("Неперевірена помилка");// 2)Викидається помилка

        } catch (RuntimeException e) {    //3) помилка перехоплена
            System.out.println("1 " + e); // 4)помилку обробили
        }
        System.out.println("2");//5)виведення в консоль числа 2
    }


    public static void ex2() {
        try {
            System.out.println("0");//1)виведення в консоль число 0
            throw new RuntimeException("Неперевірена помилка");//2)викид помилки
            System.out.println("1");//Не буде оброблено
        } catch (Exception e) {//3)перехоплення помилки
            System.out.println("2 " + e);//4)обробка помилки
        }
        System.out.println("3");//5)виведення числа 3 у консоль
    }

    public static void ex3() {

        try {
            System.out.println("0");//1)виведення в консоль число 0
            throw new RuntimeException("помилка");//2)викид помилки
        } catch (NullPointerException e) {//3)перехоплення помилки
            System.out.println("1");//4)виведення в консоль число 1
        } catch (RuntimeException e) {//Не буде оброблено
            System.out.println("2");//Не буде оброблено
        } catch (Exception e) {//Не буде оброблено
            System.out.println("3");//Не буде оброблено
        }
        System.out.println("4");//5)Виведення числа 4 у консоль
    }

    public static void ex4() {
        try {
            System.out.println("0");//1)виведення в консоль число 0
            throw new RuntimeException("помилка");//2)викид помилки
        } catch (NullPointerException e) {//Не буде оброблено
            System.out.println("1");//Не буде оброблено
        } catch (Exception e) {//3)перехоплення помилки
            System.out.println("2");//4)виведення в консоль число 2
        } catch (Error e) {//Не буде оброблено
            System.out.println("3");//Не буде оброблено
        }
        System.out.println("4");//5)Виведення числа 4 у консоль
    }

    public static void ex5() {
        try {
            System.out.println("0");//1)виведення в консоль число 0
            throw new RuntimeException("помилка");//2)викид помилки
        } catch (NullPointerException e) {//Не буде оброблено
            System.out.println("1");//Не буде оброблено
        }
        System.out.println("2");//Не буде оброблено
    }

    public static void ex6() {
        try {
            System.out.println("0");
            throw new NullPointerException("помилка");
        } catch (ArithmeticException e) {
            System.out.println("1");
        } catch (RuntimeException e) {//Ця помилка повинна ловиться раніше ніж Exception тому що вона успадковує її
            System.out.println("2");
        } catch (Exception e) {// Щоб код працював корректно, ми повинні поміняти місцями RunTimeException і Exception
            System.out.println("3");
        }
        System.out.println("4");
    }

    public static void ex7() {
        try {
            System.out.println("0");//
            throw new NullPointerException("помилка");//
        } catch (NullPointerException e) {//
        }
        System.out.println("1");//для коректної роботи коду ми маємо прибрати код між двома catch блоками
        throw new ArithmeticException();//або додати try блок
        catch(ArithmeticException e){//Ми не можемо писати Catch блок без try блоку
            System.out.println("2");
        }
        System.out.println("3");
    }


    public static void ex8() {
        try {
            System.out.println("0");//1)виведення в консоль число 0
            throw new RuntimeException();//2)викид помилки
        } finally {
            System.out.println("1");//3)виведення в консоль числа 1
        }
    }

    public static int ex9() {
        try {
            System.out.println("0");//1)виведення в консоль число 0
            return 55;    // 2)Повертає число 55
        } finally {
            System.out.println("1");//3)виведення в консоль числа 1
        }


    }

    public static int ex10() {
        try {
            System.out.println("0");//1)виведення в консоль число 0
            return 15;//2)Повертає число 15
        } finally {
            System.out.println("1");//3)виведення в консоль числа 1
            return 20;//4)Перехоплює минуле число(15) яке ми повернули та замінює його на це число(20)
        }


    }

    public static void ex11() {
        try {
            System.out.println("0");//1)виведення в консоль число 0
            throw new NullPointerException("помилка");//2)викид помилки
        } catch (NullPointerException e) {//3)перехоплення помилки
            System.out.println("1" );//4)виведення в консоль число 1
        }finally {
            System.out.println("2" );//5)виведення в консоль число 2
        }
        System.out.println("3");//6)виведення в консоль числа 3
    }


    public static void ex12(String str,double chislo) {
        if (str==null) {//1)перевірка,якщо наш стрінг дорівнює null то Викидається помилка і наступний if не спрацьовує
            throw new IllegalArgumentException("рядок введено неправильно");//2)викид помилки
        }
        if (chislo>0.001) {//1)якщо перший if не спрацював то відбувається перевірка та якщо true то викидається наш exception
            throw new IllegalArgumentException("Неправильне число");//2)викид помилки
        }	}


    public static void ex13(String[]args) {
        try {
            int l = args.length; //1)привласнюється нашому інт значення довжини нашого масиву
            System.out.println("розмір масиву= " + l);//2)Виводити на екран розмір нашого масиву
            int h=10/l;//3)якщо довжина масиву дорівнює нулю то Викидається помилка і ловиться першим catchem
            args[l + 1] = "10";//3)якщо в попередньому прикладі не викинулася помилка, то цей рядок ЗАВЖДИ викидає помилку
            //Помилку тому що довжина масиву + 1 завжди викинути indexOut...
        } catch (ArithmeticException e) { //4) тут ловиться помилка, яка могла викинутися в першому прикладі
            System.out.println("Ділення на нуль");//5)виводитися наш рядок у консоль
        }catch (ArrayIndexOutOfBoundsException e) {//4) тут ловиться помилка яка могла викинутися у другому прикладі
            System.out.println("Індекса не існує");//5)виводитися наш рядок у консоль
        }	}


    public static void ex14(int x) throws ArithmeticException{//показує, що цей метод може викинути помилку
        int h=10/x;//Потенційний рядок, який може викинути помилку поділу на нуль
    }

    public static void main(String[]args){
        try {
    int l = args.length;//1)прирівнюємо зміною довжину масиву
    System.out.println("розмір масиву= " + l);//2)виводимо розмір у консоль
    ex14(l);//3)викликаємо наш метод (припустимо він викидає помилку поділу на 0)
            }   
    catch (ArithmeticException e) {//4)обробляємо цю помилку
    System.out.println("помилка: Ділення на нуль");//5)Виводимо в консоль наше повідомлення
        }
    }
}

