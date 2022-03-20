package uz.pdp.clickup.entity;

import lombok.*;
import uz.pdp.clickup.entity.template.AbsUUIDEntity;
import uz.pdp.clickup.enums.WorkspacePermissionName;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WorkspacePermission extends AbsUUIDEntity {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private WorkspaceRole workspaceRole;

    @Enumerated(EnumType.STRING)
    private WorkspacePermissionName permission;
}
