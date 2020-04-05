package com.rbgt.mb.domain;

import java.io.Serializable;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 * todo 生成文件后请将子类的5大属性手动删除 id，createTime，createdBy，lastModifiedBy，updateTime
 * @author chenxiaoqing
 * @since 2020-04-04
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@TableName("ms_test")
public class Test extends Model<Test> {

    @TableId(value = "id", type = IdType.UUID)
    private String id;
    @TableField("create_time")
    private Date createTime;
    @TableField("created_by")
    private String createdBy;
    @TableField("last_modified_by")
    private String lastModifiedBy;
    @TableField("update_time")
    private Date updateTime;
    private String name;
    private Integer sex;
    @TableField("chat_flag")
    private Integer chatFlag;
    private Integer status;

    @Override
    protected Serializable pkVal() {return id;}

    @Override
    public String toString() {
        return "Test{" +
                "id='" + id + '\'' +
                ", createTime=" + createTime +
                ", createdBy='" + createdBy + '\'' +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", updateTime=" + updateTime +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", chatFlag=" + chatFlag +
                ", status=" + status +
                '}';
    }
}