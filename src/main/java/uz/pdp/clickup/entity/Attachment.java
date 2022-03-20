package uz.pdp.clickup.entity;


import lombok.*;
import uz.pdp.clickup.entity.template.AbsUUIDEntity;

import javax.persistence.Entity;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Attachment extends AbsUUIDEntity {

    private String name;

    private String originalName;

    private Long size;

    private String contentType;

    private String path;
}
