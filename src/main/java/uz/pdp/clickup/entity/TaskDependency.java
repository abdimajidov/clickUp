package uz.pdp.clickup.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.clickup.entity.template.AbsUUIDEntity;
import uz.pdp.clickup.enums.DependencyType;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TaskDependency extends AbsUUIDEntity {
    @ManyToOne
    private Task task;

    @ManyToOne
    private Task dependencyTask;

    @Enumerated(EnumType.STRING)
    private DependencyType dependencyType;
}
