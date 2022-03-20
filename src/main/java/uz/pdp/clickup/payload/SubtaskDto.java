package uz.pdp.clickup.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.clickup.entity.template.AbsUUIDEntity;

import java.sql.Timestamp;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SubtaskDto extends AbsUUIDEntity {
    private String name;

    private Long priorityId;

    private UUID parentId;

    private Timestamp startedDate;

    private boolean startTimeHas = false;

    private boolean dueTimeHas = false;

    private Timestamp dueDate;

    private Long estimateTime;

    private Timestamp activateDate;
}
