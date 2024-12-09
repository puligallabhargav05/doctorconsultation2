package in.bhargav.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.bhargav.entities.Patient;
import in.bhargav.service.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientController {
	    
	   @Autowired
	   private PatientService patientService;
	   
	  @GetMapping("/{id}")
	 public Patient getPatient(@PathVariable("id") int id)  
	 {
		  Patient patient = patientService.findById(id);
		  
		  return patient;
		  
	 }
	  @GetMapping("/")
	  public List<Patient> findAllPatients(Patient patient)
	  {
		  
		  List<Patient> patients = patientService.findAll();
		  
		     return patients;
		  
		  
	  }
	  
      @PostMapping("/")
	  public Patient savePatientDetails(@RequestBody Patient patient)
	  {
    	  Patient savedPatient = patientService.savePatient(patient);
		     
		  return savedPatient;
	  }
      
      @PutMapping("/")
      public Patient updatePatientDetails(@RequestBody Patient patient)
      
      {
    	  Patient updatedPatient = patientService.updatePatient(patient);
    	  
    	     return updatedPatient;
      }
      
      @DeleteMapping("/{id}")
     public void deletePatient(@PathVariable("id") int id)
     {
    	  Patient patient = patientService.findById(id);
    	  
    	  patientService.deletePatient(patient);
     }
      
}
