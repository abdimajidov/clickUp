package uz.pdp.clickup.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.clickup.entity.Attachment;

import java.util.UUID;
@Repository
public interface AttachmentRepository extends JpaRepository<Attachment, UUID> {
    Attachment findByName(String fileName);
}
