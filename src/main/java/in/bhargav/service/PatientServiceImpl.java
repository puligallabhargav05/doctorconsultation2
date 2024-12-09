package in.bhargav.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.bhargav.entities.Patient;
import in.bhargav.repo.PatientRepo;

@Service
public class PatientServiceImpl implements PatientService {
	
	     @Autowired 
   	     private PatientRepo patientRepo;

	@Override
	public Patient savePatient(Patient patient) {
		
	return patientRepo.save(patient);		
		
	}

	@Override
	public Patient updatePatient(Patient patient) {
		
	 return	patientRepo.save(patient);
		
	}

	@Override
	public void deletePatient(Patient patient) {
		
		patientRepo.delete(patient);

	}

	@Override
	public Patient findById(int id) {
		    
	return patientRepo.findById(id).get();
		
	}

	@Override
	public List<Patient> findAll() {
	
		return patientRepo.findAll();
	}

}
