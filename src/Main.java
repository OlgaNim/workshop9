import org.w3c.dom.ls.LSOutput;

public class Main {
    public static String nameAcc = "MyAcc";
    public static int amountInBankAccount = 1000000;

    public static void main(String[] args) throws InsufficientAmountException {
//        try {
//            System.out.println(deduct("MyAcc", 2000000));
//        } catch (InsufficientAmountException e) {
//            System.out.println("ошибка");
//        }

        System.out.println(deduct("MyAcc", 10000));
        System.out.println(deduct("MyAcc", 2000000));
        System.out.println(deduct("NotMyAcc", 500));

    }
        public static int deduct (String accountToProcess,int amtToCacheOut) throws InsufficientAmountException {
            if (!nameAcc.equals(accountToProcess)) {
                System.out.println("Название аккаунта не соответствует");
            }
            if (amountInBankAccount < amtToCacheOut) {
                System.out.println("Недостаточно денег на счету, введите меньше " + amtToCacheOut);
            }

            amountInBankAccount = amountInBankAccount - amtToCacheOut;
            return amountInBankAccount;
        }

    }





