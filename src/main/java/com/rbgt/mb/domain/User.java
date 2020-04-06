package com.rbgt.mb.domain;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * InnoDB free: 4096 kB
 * </p>
 * todo 生成文件后请将子类的5大属性手动删除 id，createTime，createdBy，lastModifiedBy，updateTime
 * @author chenxiaoqing
 * @since 2020-04-06
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@TableName("ms_user")
public class User extends Model<User> {

    /**
     * 唯一标识
     */
    @TableId(value = "id", type = IdType.UUID)
    private String id;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 创建人
     */
    @TableField("created_by")
    private String createdBy;
    /**
     * 修改人
     */
    @TableField("last_modified_by")
    private String lastModifiedBy;
    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 是否启用
     */
    @TableField("chat_flag")
    private Integer chatFlag;

    @Override
    protected Serializable pkVal() {return id;}

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", createTime=" + createTime +
                ", createdBy='" + createdBy + '\'' +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", updateTime=" + updateTime +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", status=" + status +
                ", chatFlag=" + chatFlag +
                '}';
    }
}