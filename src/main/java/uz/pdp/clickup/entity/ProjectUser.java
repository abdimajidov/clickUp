package uz.pdp.clickup.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.clickup.entity.template.AbsUUIDEntity;
import uz.pdp.clickup.enums.WorkspacePermissionName;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProjectUser extends AbsUUIDEntity {
    @ManyToOne
    private User member;

    @ManyToOne
    private Project project;

    @Enumerated(EnumType.STRING)
    private WorkspacePermissionName permission;
}
