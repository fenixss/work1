package com.qf.manage.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "dispensary")
public class Dispensary {
    /**
     * 主键
     */
    @TableId(value = "dispensary_id", type = IdType.INPUT)
    private Long dispensaryId;

    /**
     * 1输液药 2口服药 3注射药
     */
    @TableField(value = "drug_type")
    private Integer drugType;

    /**
     * 药名
     */
    @TableField(value = "drug_name")
    private String drugName;

    /**
     * 剂量
     */
    @TableField(value = "dosage")
    private String dosage;

    /**
     * 频次
     */
    @TableField(value = "frequency")
    private String frequency;

    /**
     * 护士ID外键
     */
    @TableField(value = "nurse_id")
    private Integer nurseId;

    /**
     * 床位ID外键
     */
    @TableField(value = "beds_id")
    private Integer bedsId;

    /**
     * 1通过2异常3缺失
     */
    @TableField(value = "`status`")
    private Integer status;

    /**
     * 1正常0删除
     */
    @TableField(value = "delstatus")
    private Integer delstatus;

    /**
     * 修改时间
     */
    @TableField(value = "up_date")
    private Date upDate;

    /**
     * 记录时间
     */
    @TableField(value = "create_date")
    private Date createDate;

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


    public static final String COL_DISPENSARY_ID = "dispensary_id";

    public static final String COL_DRUG_TYPE = "drug_type";

    public static final String COL_DRUG_NAME = "drug_name";

    public static final String COL_DOSAGE = "dosage";

    public static final String COL_FREQUENCY = "frequency";

    public static final String COL_NURSE_ID = "nurse_id";

    public static final String COL_BEDS_ID = "beds_id";

    public static final String COL_STATUS = "status";

    public static final String COL_DELSTATUS = "delstatus";

    public static final String COL_UP_DATE = "up_date";

    public static final String COL_CREATE_DATE = "create_date";
}