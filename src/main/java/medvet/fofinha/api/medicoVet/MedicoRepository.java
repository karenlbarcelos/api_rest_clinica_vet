package medvet.fofinha.api.medicoVet;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Range;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<MedicoVet, Long> {

    Page<MedicoVet> findAllByAtivoTrue(Pageable paginaca4o);
}
