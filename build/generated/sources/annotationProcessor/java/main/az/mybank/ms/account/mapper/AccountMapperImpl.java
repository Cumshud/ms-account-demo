package az.mybank.ms.account.mapper;

import az.mybank.ms.account.dto.AccountDto;
import az.mybank.ms.account.model.Account;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-19T15:21:36+0400",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 11.0.18 (Amazon.com Inc.)"
)
public class AccountMapperImpl implements AccountMapper {

    @Override
    public AccountDto toAccountDto(Account account) {
        if ( account == null ) {
            return null;
        }

        AccountDto accountDto = new AccountDto();

        accountDto.setId( account.getId() );
        accountDto.setFullName( account.getFullName() );
        accountDto.setAccountNumber( account.getAccountNumber() );
        accountDto.setCustomerId( account.getCustomerId() );
        accountDto.setIban( account.getIban() );
        accountDto.setCurrency( account.getCurrency() );
        accountDto.setStatus( account.getStatus() );
        accountDto.setBalance( account.getBalance() );

        return accountDto;
    }

    @Override
    public List<AccountDto> toAccountDtos(List<Account> accountDto) {
        if ( accountDto == null ) {
            return null;
        }

        List<AccountDto> list = new ArrayList<AccountDto>( accountDto.size() );
        for ( Account account : accountDto ) {
            list.add( toAccountDto( account ) );
        }

        return list;
    }
}
