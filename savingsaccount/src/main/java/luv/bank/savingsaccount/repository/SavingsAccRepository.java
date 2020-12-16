package luv.bank.savingsaccount.repository;

import luv.bank.savingsaccount.model.SavingsAcc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface SavingsAccRepository extends JpaRepository<SavingsAcc,Long> {
}