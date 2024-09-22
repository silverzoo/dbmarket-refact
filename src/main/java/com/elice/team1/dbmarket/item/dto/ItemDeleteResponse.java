package com.elice.team1.dbmarket.item.dto;

import lombok.*;
// REFACTOR: 삭제 예정(현재 컨트롤러에서 잘 삭제되었지 로깅역할 뿐)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Builder
public class ItemDeleteResponse {
    private Long id;
}
