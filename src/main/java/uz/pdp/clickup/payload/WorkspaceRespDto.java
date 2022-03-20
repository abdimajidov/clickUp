package uz.pdp.clickup.payload;


import lombok.*;
import uz.pdp.clickup.entity.template.AbsLongEntity;

import java.sql.Timestamp;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class WorkspaceRespDto extends AbsLongEntity {
    private Long id;

    private String name;

    private String color;

    private String owner;

    private String initialLetter;

    private Timestamp createdAt;
}
