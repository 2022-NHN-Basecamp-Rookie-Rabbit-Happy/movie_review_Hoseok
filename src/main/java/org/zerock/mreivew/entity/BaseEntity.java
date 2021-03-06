package org.zerock.mreivew.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass //-> 이 어노테이션을 사용시, 해당 클래스는 테이블로 생성되지 않음.
@EntityListeners(value = {AuditingEntityListener.class})
@Getter
abstract class BaseEntity {
    @CreatedDate
    @Column(name = "regdate",updatable = false)
    private LocalDateTime regDate;

    @LastModifiedDate
    @Column(name = "moddate")
    private LocalDateTime modDate;
}
