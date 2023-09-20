package az.mybank.ms.account.model;

import lombok.Data;

@Data
public class Account {

    private Long id;
    private String fullName;
    private String accountNumber;
    private String customerId;
    private String iban;
    private Integer currency;
    private Integer status;
    private Integer balance;

}
