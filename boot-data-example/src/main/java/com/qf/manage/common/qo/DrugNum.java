package com.qf.manage.common.qo;
import lombok.*;

@Getter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DrugNum {
    /**
     * 药物类型
     */
    private Integer drug_type;

    /**
     * 总任务数
     */
    private Integer sum;

    /**
     * 异常任务数
     */
    private Integer abnormal;
    /**
     * 缺失任务数
     */
    private Integer lack;

}
