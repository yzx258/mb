package com.rbgt.mb.enums;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @project_name: mb
 * @package_name: com.rbgt.mb.enums
 * @name: RbgtEnumUtis
 * @author: 俞春旺
 * @date: 2020/4/4 22:30
 * @day_name_full: 星期六
 * @remark: 自定义枚举转换错误
 **/
public class RbgtEnumUtis<E extends Enum<E>> extends BaseTypeHandler<E> {

    private final Class<E> type;
    private final E[] enums;

    public RbgtEnumUtis(Class<E> type) {
        if (type == null) {
            throw new IllegalArgumentException("Type argument cannot be null");
        } else {
            this.type = type;
            this.enums = type.getEnumConstants();
            if (this.enums == null) {
                throw new IllegalArgumentException(type.getSimpleName() + " does not represent an enum type.");
            }
        }
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, E parameter, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, parameter.ordinal());
    }

    @Override
    public E getNullableResult(ResultSet rs, String columnName) throws SQLException {
        int i = rs.getInt(columnName);
        if (rs.wasNull()) {
            return null;
        } else {
            try {
                return this.enums[i];
            } catch (Exception var5) {
                List<String> list = new ArrayList<>();
                Arrays.stream(this.enums).forEach(e -> {
                    list.add(e.toString());
                });
                System.out.println("无法匹配枚举【"+i+"】,枚举值范围只能在："+list.toString());
                throw new IllegalArgumentException("Cannot convert " + i + " to " + this.type.getSimpleName() + " by ordinal value.", var5);
            }
        }
    }

    @Override
    public E getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        int i = rs.getInt(columnIndex);
        if (rs.wasNull()) {
            return null;
        } else {
            try {
                return this.enums[i];
            } catch (Exception var5) {
                throw new IllegalArgumentException("Cannot convert " + i + " to " + this.type.getSimpleName() + " by ordinal value.", var5);
            }
        }
    }

    @Override
    public E getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        int i = cs.getInt(columnIndex);
        if (cs.wasNull()) {
            return null;
        } else {
            try {
                return this.enums[i];
            } catch (Exception var5) {
                throw new IllegalArgumentException("Cannot convert " + i + " to " + this.type.getSimpleName() + " by ordinal value.", var5);
            }
        }
    }

}
