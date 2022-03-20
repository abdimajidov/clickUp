package uz.pdp.clickup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.clickup.entity.ClickApps;

@Repository
public interface ClickAppsRepo extends JpaRepository<ClickApps, Long> {
    ClickApps getByName(String name);
}
