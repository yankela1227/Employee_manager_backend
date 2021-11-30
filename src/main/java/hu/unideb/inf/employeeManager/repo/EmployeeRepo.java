package hu.unideb.inf.employeeManager.repo;

import hu.unideb.inf.employeeManager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    @Transactional
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
