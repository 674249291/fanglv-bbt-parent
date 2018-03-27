package com.fanglv.bbt.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ivany
 * @since 2017-11-21
 */
@TableName("test")
public class Test extends Model<Test> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private String nametest;
	private String desctest;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNametest() {
		return nametest;
	}

	public void setNametest(String nametest) {
		this.nametest = nametest;
	}

	public String getDesctest() {
		return desctest;
	}

	public void setDesctest(String desctest) {
		this.desctest = desctest;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Test{" +
			", id=" + id +
			", nametest=" + nametest +
			", desctest=" + desctest +
			"}";
	}
}
