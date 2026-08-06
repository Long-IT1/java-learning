public class Day04
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount("张三");
        System.out.println("开户成功，当前余额：" + account.getBalance());

        account.deposit(1000);
        account.withdraw(300);
        account.withdraw(800);   // 余额700，取800应该失败
        System.out.println("最终余额：" + account.getBalance());
    }
}

class BankAccount
{
    private String Owner;
    private double Balance;

    BankAccount(String O)
    {
        Owner = O;
        Balance = 0;
    }

    public double getBalance()
    {
        return Balance;
    }

    public void deposit(double money)
    {
        if (money > 0)
        {
            Balance = Balance + money;
            System.out.println("存入" + money + "元，当前余额：" + Balance);
        }
        else
        {
            System.out.println("金额不合法！");
        }
    }

    public void withdraw(double money)
    {
        if (money <= Balance && money > 0)
        {
            Balance = Balance - money;
            System.out.println("取出" + money + "元，当前余额：" + Balance);
        }
        else
        {
            System.out.println("金额不合法！");
        }
    }
}
