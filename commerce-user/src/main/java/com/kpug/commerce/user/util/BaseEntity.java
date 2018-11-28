package com.kpug.commerce.user.util;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    @CreatedDate
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdDateTime;

    @LastModifiedDate
    @Column(name = "last_modified_at", updatable = true)
    private LocalDateTime lastModifiedDateTime;
}
