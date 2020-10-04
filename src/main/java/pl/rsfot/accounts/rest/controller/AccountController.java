package pl.rsfot.accounts.rest.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rsfot.accounts.dto.AccountDto;
import pl.rsfot.accounts.rest.response.GetCustomerAccountsResponse;
import pl.rsfot.accounts.service.AccountService;

import java.util.List;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/v1/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @GetMapping("/{id}")
    public GetCustomerAccountsResponse getCustomerAccounts(@PathVariable("id") Long customerId) {
        log.info("Get customer accounts for customerId: {}", customerId);
        List<AccountDto> accounts = accountService.getCustomerAccounts(customerId);

        return GetCustomerAccountsResponse.of(accounts);
    }
}
