import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

import java.io.FileWriter;
import java.io.IOException;
import java.security.CodeSigner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Map;

class csvreader {
    public void readcsv() {
        try {
            String csvFile = "bank.csv";
            BufferedReader br = null;
            String line = "";
            String cvsSplitBy = ",";
            br = new BufferedReader(new FileReader(csvFile));
            System.out.println("|Accountno|    Name   | Balance | Days |");
            while ((line = br.readLine()) != null) {
                String[] bank = line.split(cvsSplitBy);
                System.out.println("|" + bank[0] + "|" + bank[1] + "|" + bank[2] + "|" + bank[3] + "|");
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    public void readcryptocsv() {
        try {
            String csvFile = "crypto.csv";
            BufferedReader br = null;
            String line = "";
            String cvsSplitBy = ",";
            br = new BufferedReader(new FileReader(csvFile));
            System.out.println("|cryptoAccountno |   Name  |  Balance | Days |");
            while ((line = br.readLine()) != null) {
                String[] cbank = line.split(cvsSplitBy);
                System.out
                        .println("|" + cbank[0] + "|" + cbank[1] + "|" + cbank[2] + "|" + cbank[3] + "|");
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    public void readloan() {
        try {
            String csvFile = "loan.csv";
            BufferedReader br = null;
            String line = "";
            String cvsSplitBy = ",";
            br = new BufferedReader(new FileReader(csvFile));
            System.out.println("|LoanAccountno |    Name  |  Balance | Days |");
            while ((line = br.readLine()) != null) {
                String[] lbank = line.split(cvsSplitBy);
                System.out
                        .println("|" + lbank[0] + "|" + lbank[1] + "|" + lbank[2] + "|" + lbank[3] + "|");
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}

class Account {// mentain with bank account
    public ArrayList<String> list = new ArrayList<String>();

    public void createaccount() {
        try {
            int accno;
            String name;
            float balance;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Account number : ");
            accno = sc.nextInt();
            System.out.print("Enter the Name : ");
            name = sc.next();
            System.out.print("Enter the Balance : ");
            balance = sc.nextFloat();
            System.out.print("Days : ");
            int days = sc.nextInt();
            // add ArrayList to csv file
            list.add(accno + "," + name + "," + balance + "," + days);
            FileWriter writer = new FileWriter("bank.csv", true);
            for (String str : list) {
                writer.write(str + System.lineSeparator());
            }
            writer.close();
            System.out.println("Account created successfully");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    public void deleteaccount() {
        try {
            int accno;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Account number : ");
            accno = sc.nextInt();
            String csvFile = "bank.csv";
            BufferedReader br = null;
            String line = "";
            String cvsSplitBy = ",";
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] bank = line.split(cvsSplitBy);
                if (Integer.valueOf(bank[0]) == accno) {
                    bank[0] = "0";
                    bank[1] = "0";
                    bank[2] = "0";
                    bank[3] = "0";
                }
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    public void updateaccount() {
        try {
            int accno;
            float balance;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Account number : ");
            accno = sc.nextInt();
            System.out.print("Enter the Balance : ");
            balance = sc.nextFloat();
            String csvFile = "bank.csv";
            BufferedReader br = null;
            String line = "";
            String cvsSplitBy = ",";
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] bank = line.split(cvsSplitBy);
                if (Integer.valueOf(bank[0]) == accno) {
                    bank[3] = String.valueOf(Integer.valueOf(bank[3]) + balance);
                }else{}
            }

        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

}

class Loan extends Account {
    // calculate loan after 794 days//can take lone,creadit card etc
    // mentain more than 3.5 years eligbel for 10 crore loan

    void calculateLoan() {
        try {
            String csvFile = "bank.csv";
            BufferedReader br = null;
            String line = "";
            String cvsSplitBy = ",";
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] cbank = line.split(cvsSplitBy);
                if (Integer.valueOf(cbank[3]) > 794 && Integer.valueOf(cbank[3]) < 1000) {
                    ArrayList<String> list1 = new ArrayList<String>();
                    list1.add(
                            "loanaccount" + cbank[0] + "," + cbank[1] + "," + cbank[2] + " eligbeal for loan /" + ","
                                    + cbank[3]);
                    FileWriter writer = new FileWriter("loan.csv", true);
                    for (String str : list1) {
                        writer.write(str + System.lineSeparator());
                    }
                    writer.close();
                }
            }
            while ((line = br.readLine()) != null) {
                String[] cbank = line.split(cvsSplitBy);
                if (Integer.valueOf(cbank[3]) > 1000) {
                    ArrayList<String> list1 = new ArrayList<String>();
                    list1.add("loanaccount" + cbank[0] + "," + cbank[1] + "," + "loan eligblity 10cr /" + cbank[2]
                            + ","
                            + cbank[3]);
                    FileWriter writer = new FileWriter("loan.csv", true);
                    for (String str : list1) {
                        writer.write(str + System.lineSeparator());
                    }
                    writer.close();
                }
            }
            csvreader csvreader = new csvreader();
            csvreader.readloan();
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}

class cryptoaccount extends Account {
    // how May people eligeble for crypto account
    void calculateCrypto() {
        try {
            String csvFile = "bank.csv";
            BufferedReader br = null;
            String line = "";
            String cvsSplitBy = ",";
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] cbank = line.split(cvsSplitBy);
                if (Integer.valueOf(cbank[3]) > 794) {
                    ArrayList<String> list1 = new ArrayList<String>();
                    list1.add("cryptoaccount" + cbank[0] + "," + cbank[1] + "," + cbank[2] + "," + cbank[3]);
                    FileWriter writer = new FileWriter("crypto.csv", true);
                    for (String str : list1) {
                        writer.write(str + System.lineSeparator());
                    }
                    writer.close();
                }
            }
            csvreader csv = new csvreader();
            csv.readcryptocsv();
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}

public class CreateAcc extends Account {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        csvreader csv = new csvreader();
        do {
            System.out.println("1.Read the csv file");
            System.out.println("2.Create Account");
            System.out.println("3.Delete Account");
            System.out.println("4.Deposite money in");
            System.out.println("5.check loan eligibity");
            System.out.println("6.check crypto eligibity");
            System.out.println("7.Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    csv.readcsv();
                    break;
                case 2:
                    Account a = new Account();
                    a.createaccount();
                    break;
                case 3:
                    Account b = new Account();
                    b.deleteaccount();
                    break;
                case 4:
                    Account c = new Account();
                    c.updateaccount();
                    break;
                case 5:
                    Loan l = new Loan();
                    l.calculateLoan();
                    break;
                case 6:
                    cryptoaccount ca = new cryptoaccount();
                    ca.calculateCrypto();
                    break;
                case 7:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
}
