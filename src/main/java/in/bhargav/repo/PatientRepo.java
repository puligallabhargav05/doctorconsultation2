package in.bhargav.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.bhargav.entities.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer> {

}
