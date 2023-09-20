package az.mybank.ms.account.controller;

import az.mybank.ms.account.client.model.Customer;
import az.mybank.ms.account.dto.AccountDto;
import az.mybank.ms.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @GetMapping("/customer/{id}")
    public Customer getCustomerWithId(@PathVariable Long id) {
        return accountService.getCustomerById(id);
    }

    @GetMapping("/{id}")
    public AccountDto getAccountWithId(@PathVariable Long id) {
        return accountService.getAccountWithId(id);
    }

}
