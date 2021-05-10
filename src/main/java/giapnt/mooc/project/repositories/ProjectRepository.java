package giapnt.mooc.project.repositories;

import giapnt.mooc.project.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    @Override
    List<Project> findAllById(Iterable<Long> longs);
}
