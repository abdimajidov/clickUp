package uz.pdp.clickup.payload;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TagRespDto {
    private String name;

    private String color;

    private Long workspaceId;
}
