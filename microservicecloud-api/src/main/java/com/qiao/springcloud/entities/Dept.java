package com.qiao.springcloud.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Data
@Accessors(chain = true)//支持链式调用 @Data @Accessors(chain = true) 配合使用
public class Dept implements Serializable {

	//必须序列化
	private static final long serialVersionUID = 1L;
	
	private Long deptno; // 主键
	private String dname; // 部门名称
	private String db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

	public Dept(String dname) {
		this.dname = dname;
	}
	
	/**
	 * 链式调用示例：
		Dept dept = new Dept();
		dept.setDeptno(1L).setDname("研发部").setDb_source("xxx");
	 */
}
