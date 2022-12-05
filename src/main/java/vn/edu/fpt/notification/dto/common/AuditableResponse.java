package vn.edu.fpt.notification.dto.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import vn.edu.fpt.notification.dto.cache.UserInfo;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author : Hoang Lam
 * @product : Charity Management System
 * @project : Authentication Service
 * @created : 30/08/2022 - 16:53
 * @contact : 0834481768 - hoang.harley.work@gmail.com
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public abstract class AuditableResponse implements Serializable {

    private static final long serialVersionUID = -8406677523279755332L;
    protected UserInfo createdBy;
    protected LocalDateTime createdDate;
    protected UserInfo lastModifiedBy;
    protected LocalDateTime lastModifiedDate;
}
