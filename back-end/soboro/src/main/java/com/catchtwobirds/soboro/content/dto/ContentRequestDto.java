package com.catchtwobirds.soboro.content.dto;

import com.catchtwobirds.soboro.content.entity.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.bson.types.ObjectId;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Schema(description = "상담 텍스트 요청 DTO")
public class ContentRequestDto {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
    @Schema(description = "상담 텍스트 식별번호")
    private ObjectId contentNo;
=======
//    @Schema(description = "상담 텍스트 식별번호")
//    private ObjectId contentNo;
>>>>>>> ba39b7f (chore : 상담내역 DTO 스키마 수정)
=======
//    @Schema(description = "상담 텍스트 식별번호")
//    private ObjectId contentNo;
>>>>>>> a6a0cde (Merge branch 'BE' of https://lab.ssafy.com/s08-ai-speech-sub2/S08P22B202 into jaeyoon)
    @Schema(description = "상담 식별번호")
>>>>>>> bf67778 (fix : Dto schema 어노테이션 정의)
=======
    @Schema(description = "상담 텍스트 식별번호")
    private ObjectId contentNo;
=======
//    @Schema(description = "상담 텍스트 식별번호")
//    private ObjectId contentNo;
>>>>>>> 678bb58 (Merge branch 'doyeong' into 'BE')
    @Schema(description = "상담 식별번호")
>>>>>>> c72068f (Merge branch 'jaeyoon' into 'BE')
    private Integer consultingNo;
    @Schema(description = "상담 텍스트 내용")
    private String contentText;
    @Schema(description = "상담 텍스트 발화자")
    private Boolean contentSpeaker;

    @Builder
    public Content toEntity() {
        return Content.builder()
                .consultingNo(consultingNo)
                .contentText(contentText)
                .contentSpeaker(contentSpeaker)
                .build();
    }
}
