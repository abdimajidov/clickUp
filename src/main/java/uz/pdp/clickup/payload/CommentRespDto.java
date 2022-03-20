package uz.pdp.clickup.payload;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
public class CommentRespDto {
    private String text;

    private UUID taskId;

    private UUID createdBy;
}
