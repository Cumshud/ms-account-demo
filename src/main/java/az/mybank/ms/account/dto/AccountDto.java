package az.mybank.ms.account.dto;

import lombok.Data;

@Data
public class AccountDto {

    private Long id;
    private String fullName;
    private String accountNumber;
    private String customerId;
    private String iban;
    private Integer currency;
    private Integer status;
    private Integer balance;

}
