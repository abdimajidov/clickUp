package uz.pdp.clickup.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.clickup.entity.template.AbsUUIDEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CheckListItem extends AbsUUIDEntity {
    @Column(nullable = false)
    private String name;

    @ManyToOne
    private CheckList checkList;

    @Column
    private boolean resolved = false;
}


