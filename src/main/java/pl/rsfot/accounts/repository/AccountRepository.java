package pl.rsfot.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.rsfot.accounts.domain.Account;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Repository
@Transactional
public interface AccountRepository extends JpaRepository<Account, UUID> {
    List<Account> findByCustomerId(Long customerId);
}
