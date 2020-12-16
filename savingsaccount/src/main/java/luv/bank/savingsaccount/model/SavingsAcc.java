package luv.bank.savingsaccount.model;

import javax.persistence.*;


@Entity
@Table(name = "savingsacc")
public class SavingsAcc {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountno;

    @Column(name= "age")
    private Long age;

    @Column(name= "name")
    private String name;

    @Column(name= "address")
    private String address;

    @Column(name= "accounttype")
    private String accounttype;

    @Column(name= "balance")
    private Long balance;

    public SavingsAcc() {

    }



    public SavingsAcc(Long age,String name, String address,String accounttype,Long balance){
        super();
        this.age = age;
        this.name = name;
        this.address = address;
        this.accounttype = accounttype;
        this.balance = balance;
    }


    public long getAccountno() {
        return accountno;
    }
    public void setAccountno(long accountno){
        this.accountno = accountno;
    }


    public Long getAge() {
        return age;
    }
    public void setAge(Long age){
        this.age = age;
    }


    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }


    public String getAccounttype() {
        return accounttype;
    }
    public void setAccounttype(String accounttype){
        this.accounttype = accounttype;
    }

    public Long getBalance() {
        return balance;
    }
    public void setBalance(Long balance) {
        this.balance = balance;

    }


}

