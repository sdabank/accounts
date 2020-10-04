package pl.rsfot.accounts.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.rsfot.accounts.dto.AccountDto;
import pl.rsfot.accounts.mapper.*;
import pl.rsfot.accounts.repository.AccountRepository;
import pl.rsfot.accounts.domain.*;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    public List<AccountDto> getCustomerAccounts(Long customerId) {
        List<Account> accounts = accountRepository.findByCustomerId(customerId);
        return accountMapper.mapToDtoList(accounts);
    }
}
