package az.mybank.ms.account.service;

import az.mybank.ms.account.client.CustomerClient;
import az.mybank.ms.account.client.model.Customer;
import az.mybank.ms.account.dto.AccountDto;
import az.mybank.ms.account.mapper.AccountMapper;
import az.mybank.ms.account.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AccountService {

    private final AccountMapper accountMapper;
    private final AccountRepository accountRepository;
    private final CustomerClient client;

    public Customer getCustomerById(Long id) {
        return client.getCustomerWithId(id);
    }

    public AccountDto getAccountWithId(Long id) {
        return accountMapper.toAccountDto(accountRepository.findAccountWithId(id)
                .orElseThrow(
                        () -> new IllegalArgumentException("Account not defined, id: " + id)));
    }

}
