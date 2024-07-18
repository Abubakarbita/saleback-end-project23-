package sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sales.model.SalesReport;

public interface SalesReportRepository extends JpaRepository<SalesReport, Long> {

}
