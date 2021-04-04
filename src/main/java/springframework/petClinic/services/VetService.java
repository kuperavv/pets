package springframework.petClinic.services;

import java.util.Set;

import springframework.petClinic.model.Vet;

public interface VetService {
  Vet findByLastName(String lastName);

  Vet findById(Long id);

  Vet save(Vet owner);

  Set<Vet> findAll();
}
