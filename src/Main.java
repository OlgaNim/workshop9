public class Main {
    public static String nameAcc = "MyAcc";
    public static int amountInBankAccount = 1000000;
    public static void main(String[] args) throws InsufficientAmountException {
        deduct("MyAcc", 10000);
        deduct("MyAcc", 2000000);
        deduct("NotMyAcc", 500);
    }


        {
            try {
                System.out.println(deduct("MyAcc", 9000));
            } catch (InsufficientAmountException e) {
                throw new RuntimeException(e);
            }
        }


        public static int deduct (String accountToProcess,int amtToCacheOut) throws InsufficientAmountException {
            if (!nameAcc.equals(accountToProcess)) {
                throw new NameDontMatchException("Название аккаунта не соответствует");
            }
            if (amountInBankAccount < amtToCacheOut) {
                throw new InsufficientAmountException("Недостаточно денег на счету, введите меньше " + amtToCacheOut);
            }

            amountInBankAccount = amountInBankAccount - amtToCacheOut;
            return amountInBankAccount;
        }

    }


