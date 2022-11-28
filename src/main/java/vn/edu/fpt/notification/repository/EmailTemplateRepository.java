package vn.edu.fpt.notification.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import vn.edu.fpt.notification.entity.EmailTemplate;

import java.util.Optional;

/**
 * @author : Hoang Lam
 * @product : Charity Management System
 * @project : Charity System
 * @created : 04/09/2022 - 15:36
 * @contact : 0834481768 - hoang.harley.work@gmail.com
 **/
@Repository
public interface EmailTemplateRepository extends MongoRepository<EmailTemplate, String> {

    Optional<EmailTemplate> findByTemplateName(String templateName);

}
