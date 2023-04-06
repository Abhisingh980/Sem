import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class acccreation {
    public static void main(String[] args) {
        List<Bank> bank = readBanksFromCSV("bank.csv");
        for (Bank b : bank) {
            System.out.println(b);
        }
    }

    private static List<Bank> readBanksFromCSV(String fileName) {
        List<Bank> bank = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                Bank bank2 = createBank(attributes);
                bank.add(bank2);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bank;
    }

    private static Bank createBank(String[] metadata) {
        String ahname = metadata[0];
        int anumber = Integer.parseInt(metadata[1]);
        int pnumber = Integer.parseInt(metadata[2]);
        String aAddress = metadata[3];
        String proof = metadata[4];
        return new Bank(ahname, anumber, pnumber, aAddress, proof);
    }
}

class Bank {
    private String HolderName;
    private int accountNumber;
    private int phone;
    private String address;
    private String Addressproff;// any idantification id

    public Bank(String ahname, int anumber, int pnumber, String aAddress, String proof) {
        this.HolderName = ahname;
        this.accountNumber = anumber;
        this.phone = pnumber;
        this.address = aAddress;
        this.Addressproff = proof;
    }

    public String getName() {
        return HolderName;
    }

    public void setName(String name) {
        this.HolderName = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressproff() {
        return Addressproff;
    }

    public void setAddressproff(String addressproff) {
        Addressproff = addressproff;
    }
public static void Set() {
        Scanner sc = new Scanner(System.in);
        String str, str3, str4;
        System.out.println("Enter the name");
        str = sc.nextLine();
        System.out.println("Enter the account number");
        int str1 = sc.nextInt();
        System.out.println("Enter the phone number");
        int str2 = sc.nextInt();
        System.out.println("Enter the address");
        str3 = sc.nextLine();
        System.out.println("Enter the address proff");
        str4 = sc.nextLine();
}
    @Override
    public String toString() {
        return "Book [name=" + HolderName + ", account number=" + accountNumber
                + ", phone=" + phone + ", address=" + address + "" + ", Addressproff=" + Addressproff + "]";
    }
}
