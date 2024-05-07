package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Outgoing;

public interface OutgoingRepo extends JpaRepository<Outgoing, Integer>{

}
