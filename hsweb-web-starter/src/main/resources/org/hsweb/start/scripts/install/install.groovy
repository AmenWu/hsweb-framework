
import java.sql.JDBCType;

database.createOrAlter("s_user_role")
        .addColumn().name("u_id").jdbcType(JDBCType.VARCHAR).length(32).notNull().primaryKey().comment("ID").commit()
        .addColumn().name("user_id").jdbcType(JDBCType.VARCHAR).length(256).notNull().comment("用户id").commit()
        .addColumn().name("role_id").jdbcType(JDBCType.VARCHAR).length(256).notNull().comment("角色id").commit()
        .comment("用户角色关联表").commit()

database.createOrAlter("s_history")
        .addColumn().name("u_id").jdbcType(JDBCType.VARCHAR).length(32).notNull().primaryKey().comment("ID").commit()
        .addColumn().name("type").jdbcType(JDBCType.VARCHAR).length(64).notNull().comment("历史记录类型").commit()
        .addColumn().name("describe").jdbcType(JDBCType.VARCHAR).length(512).comment("记录描述").commit()
        .addColumn().name("primary_key_name").jdbcType(JDBCType.VARCHAR).length(32).comment("主键名").commit()
        .addColumn().name("primary_key_value").jdbcType(JDBCType.VARCHAR).length(64).comment("主键值").commit()
        .addColumn().name("change_before").jdbcType(JDBCType.CLOB).comment("修改前数据").commit()
        .addColumn().name("change_after").jdbcType(JDBCType.CLOB).comment("修改后数据").commit()
        .addColumn().name("create_date").jdbcType(JDBCType.TIMESTAMP).notNull().comment("修改时间").commit()
        .addColumn().name("creator_id").jdbcType(JDBCType.VARCHAR).length(32).comment("修改人ID").commit()
        .comment("历史记录表").commit()

database.createOrAlter("s_user_profile")
        .addColumn().name("u_id").jdbcType(JDBCType.VARCHAR).length(32).notNull().primaryKey().comment("uid").commit()
        .addColumn().name("content").jdbcType(JDBCType.CLOB).notNull().comment("配置内容").commit()
        .addColumn().name("type").jdbcType(JDBCType.VARCHAR).length(512).comment("类型").commit()
        .addColumn().name("user_id").jdbcType(JDBCType.VARCHAR).length(32).comment("用户id").commit()
        .comment("用户配置表").commit()

database.createOrAlter("s_form")
        .addColumn().name("u_id").jdbcType(JDBCType.VARCHAR).length(32).notNull().primaryKey().comment("uid").commit()
        .addColumn().name("classified_id").jdbcType(JDBCType.VARCHAR).length(32).comment("分类id").commit()
        .addColumn().name("name").jdbcType(JDBCType.VARCHAR).length(256).notNull().comment("名称").commit()
        .addColumn().name("html").jdbcType(JDBCType.CLOB).comment("html内容").commit()
        .addColumn().name("meta").jdbcType(JDBCType.CLOB).comment("结构定义").commit()
        .addColumn().name("config").jdbcType(JDBCType.CLOB).comment("配置").commit()
        .addColumn().name("version").jdbcType(JDBCType.DECIMAL).length(32, 0).comment("版本").commit()
        .addColumn().name("revision").jdbcType(JDBCType.DECIMAL).length(32, 0).comment("修订版").commit()
        .addColumn().name("release").jdbcType(JDBCType.DECIMAL).length(32, 0).comment("当前发布版本").commit()
        .addColumn().name("using").jdbcType(JDBCType.DECIMAL).length(4, 0).comment("是否使用中").commit()
        .addColumn().name("create_date").jdbcType(JDBCType.TIMESTAMP).notNull().comment("创建日期").commit()
        .addColumn().name("update_date").jdbcType(JDBCType.TIMESTAMP).comment("修改日期").commit()
        .addColumn().name("remark").jdbcType(JDBCType.VARCHAR).length(200).comment("").commit()
        .comment("动态表单").commit()

database.createOrAlter("s_modules")
        .addColumn().name("u_id").jdbcType(JDBCType.VARCHAR).length(32).notNull().primaryKey().comment("uid").commit()
        .addColumn().name("name").jdbcType(JDBCType.VARCHAR).length(256).notNull().comment("模块名称").commit()
        .addColumn().name("uri").jdbcType(JDBCType.VARCHAR).length(1024).comment("uri").commit()
        .addColumn().name("icon").jdbcType(JDBCType.VARCHAR).length(256).comment("图标").commit()
        .addColumn().name("parent_id").jdbcType(JDBCType.VARCHAR).length(256).notNull().comment("上级菜单").commit()
        .addColumn().name("remark").jdbcType(JDBCType.VARCHAR).length(512).comment("备注").commit()
        .addColumn().name("status").jdbcType(JDBCType.DECIMAL).length(4, 0).comment("状态").commit()
        .addColumn().name("optional").jdbcType(JDBCType.CLOB).notNull().comment("可选权限").commit()
        .addColumn().name("sort_index").jdbcType(JDBCType.DECIMAL).length(32, 0).notNull().comment("排序").commit()
        .comment("系统模块").commit()

database.createOrAlter("s_module_meta")
        .addColumn().name("u_id").jdbcType(JDBCType.VARCHAR).length(32).notNull().primaryKey().comment("uid").commit()
        .addColumn().name("key").jdbcType(JDBCType.VARCHAR).length(256).notNull().comment("名称").commit()
        .addColumn().name("module_id").jdbcType(JDBCType.VARCHAR).length(32).notNull().comment("模块id").commit()
        .addColumn().name("role_id").jdbcType(JDBCType.VARCHAR).length(32).comment("角色id").commit()
        .addColumn().name("remark").jdbcType(JDBCType.VARCHAR).length(1024).comment("备注").commit()
        .addColumn().name("meta").jdbcType(JDBCType.CLOB).comment("内容").commit()
        .addColumn().name("status").jdbcType(JDBCType.DECIMAL).length(4, 0).comment("状态").commit()
        .comment("系统模块配置").commit()

database.createOrAlter("s_role_modules")
        .addColumn().name("u_id").jdbcType(JDBCType.VARCHAR).length(32).notNull().primaryKey().comment("uid").commit()
        .addColumn().name("module_id").jdbcType(JDBCType.VARCHAR).length(256).notNull().comment("模块id").commit()
        .addColumn().name("role_id").jdbcType(JDBCType.VARCHAR).length(256).notNull().comment("角色id").commit()
        .addColumn().name("actions").jdbcType(JDBCType.CLOB).comment("可操作权限").commit()
        .comment("角色模块绑定表").commit()

database.createOrAlter("s_query_plan")
        .addColumn().name("u_id").jdbcType(JDBCType.VARCHAR).length(32).notNull().primaryKey().comment("主键").commit()
        .addColumn().name("name").jdbcType(JDBCType.VARCHAR).length(256).notNull().comment("方案名称").commit()
        .addColumn().name("type").jdbcType(JDBCType.VARCHAR).length(256).notNull().comment("方案分类").commit()
        .addColumn().name("config").jdbcType(JDBCType.CLOB).comment("方案配置").commit()
        .addColumn().name("sharing").jdbcType(JDBCType.DECIMAL).length(4, 0).comment("是否共享方案").commit()
        .addColumn().name("creator_id").jdbcType(JDBCType.VARCHAR).length(32).notNull().comment("创建人id").commit()
        .addColumn().name("create_date").jdbcType(JDBCType.TIMESTAMP).notNull().comment("创建日期").commit()
        .comment("查询方案表").commit()

database.createOrAlter("s_resources")
        .addColumn().name("u_id").jdbcType(JDBCType.VARCHAR).length(32).notNull().primaryKey().comment("uid").commit()
        .addColumn().name("name").jdbcType(JDBCType.VARCHAR).length(256).notNull().comment("资源名称").commit()
        .addColumn().name("path").jdbcType(JDBCType.VARCHAR).length(1024).notNull().comment("路径").commit()
        .addColumn().name("type").jdbcType(JDBCType.VARCHAR).length(256).notNull().comment("类型").commit()
        .addColumn().name("md5").jdbcType(JDBCType.VARCHAR).length(256).notNull().comment("md5校验值").commit()
        .addColumn().name("size").jdbcType(JDBCType.DECIMAL).length(32, 0).comment("资源大小").commit()
        .addColumn().name("status").jdbcType(JDBCType.DECIMAL).length(4, 0).comment("状态").commit()
        .addColumn().name("classified").jdbcType(JDBCType.VARCHAR).length(32).comment("分类").commit()
        .addColumn().name("create_date").jdbcType(JDBCType.TIMESTAMP).notNull().comment("创建时间").commit()
        .addColumn().name("creator_id").jdbcType(JDBCType.VARCHAR).length(256).notNull().comment("创建人").commit()
        .comment("资源表").commit()

database.createOrAlter("s_script")
        .addColumn().name("u_id").jdbcType(JDBCType.VARCHAR).length(32).notNull().primaryKey().comment("uid").commit()
        .addColumn().name("name").jdbcType(JDBCType.VARCHAR).length(256).notNull().comment("脚本名称").commit()
        .addColumn().name("classified_id").jdbcType(JDBCType.VARCHAR).length(1024).notNull().comment("路径").commit()
        .addColumn().name("type").jdbcType(JDBCType.VARCHAR).length(256).notNull().comment("类型").commit()
        .addColumn().name("content").jdbcType(JDBCType.CLOB).notNull().comment("内容").commit()
        .addColumn().name("remark").jdbcType(JDBCType.VARCHAR).length(512).comment("备注").commit()
        .addColumn().name("status").jdbcType(JDBCType.DECIMAL).length(4, 0).comment("状态").commit()
        .comment("脚本").commit()

database.createOrAlter("s_role")
        .addColumn().name("u_id").jdbcType(JDBCType.VARCHAR).length(32).notNull().primaryKey().comment("uid").commit()
        .addColumn().name("name").jdbcType(JDBCType.VARCHAR).length(256).notNull().comment("角色名称").commit()
        .addColumn().name("type").jdbcType(JDBCType.VARCHAR).length(50).comment("类型").commit()
        .addColumn().name("remark").jdbcType(JDBCType.VARCHAR).length(512).comment("备注").commit()
        .comment("角色表").commit()

database.createOrAlter("s_data_source")
        .addColumn().name("u_id").jdbcType(JDBCType.VARCHAR).length(32).notNull().primaryKey().comment("id").commit()
        .addColumn().name("name").jdbcType(JDBCType.VARCHAR).length(64).notNull().comment("数据源名称").commit()
        .addColumn().name("url").jdbcType(JDBCType.VARCHAR).length(512).notNull().comment("url").commit()
        .addColumn().name("username").jdbcType(JDBCType.VARCHAR).length(128).notNull().comment("用户名").commit()
        .addColumn().name("password").jdbcType(JDBCType.VARCHAR).length(128).notNull().comment("密码").commit()
        .addColumn().name("enabled").jdbcType(JDBCType.DECIMAL).length(4, 0).notNull().comment("是否启用").commit()
        .addColumn().name("create_date").jdbcType(JDBCType.DATE).length(8, 0).notNull().comment("创建日期").commit()
        .addColumn().name("properties").jdbcType(JDBCType.CLOB).comment("其他配置").commit()
        .addColumn().name("comment").jdbcType(JDBCType.VARCHAR).length(512).comment("备注").commit()
        .addColumn().name("test_sql").jdbcType(JDBCType.VARCHAR).length(512).comment("测试链接时使用的sql").commit()
        .comment("数据源").commit()

database.createOrAlter("s_classified")
        .addColumn().name("u_id").jdbcType(JDBCType.VARCHAR).length(32).notNull().primaryKey().comment("uid").commit()
        .addColumn().name("name").jdbcType(JDBCType.VARCHAR).length(256).notNull().comment("分类名称").commit()
        .addColumn().name("remark").jdbcType(JDBCType.VARCHAR).length(1024).comment("备注").commit()
        .addColumn().name("type").jdbcType(JDBCType.VARCHAR).length(256).comment("类型").commit()
        .addColumn().name("parent_id").jdbcType(JDBCType.VARCHAR).length(32).notNull().comment("父级分类").commit()
        .addColumn().name("icon").jdbcType(JDBCType.VARCHAR).length(256).comment("图标").commit()
        .addColumn().name("config").jdbcType(JDBCType.CLOB).comment("分类配置").commit()
        .addColumn().name("sort_index").jdbcType(JDBCType.DECIMAL).length(32, 0).comment("排序").commit()
        .comment("数据分类表").commit()

database.createOrAlter("s_config")
        .addColumn().name("u_id").jdbcType(JDBCType.VARCHAR).length(32).notNull().primaryKey().comment("uid").commit()
        .addColumn().name("content").jdbcType(JDBCType.CLOB).notNull().comment("配置内容").commit()
        .addColumn().name("remark").jdbcType(JDBCType.VARCHAR).length(512).comment("备注").commit()
        .addColumn().name("create_date").jdbcType(JDBCType.TIMESTAMP).notNull().comment("创建日期").commit()
        .addColumn().name("classified_id").jdbcType(JDBCType.VARCHAR).length(32).comment("分类id").commit()
        .addColumn().name("update_date").jdbcType(JDBCType.TIMESTAMP).comment("修改日期").commit()
        .comment("系统配置文件表").commit()

database.createOrAlter("s_quartz_job")
        .addColumn().name("u_id").jdbcType(JDBCType.VARCHAR).length(32).notNull().primaryKey().comment("主键").commit()
        .addColumn().name("name").jdbcType(JDBCType.VARCHAR).length(128).notNull().comment("任务名称").commit()
        .addColumn().name("remark").jdbcType(JDBCType.VARCHAR).length(512).comment("备注").commit()
        .addColumn().name("cron").jdbcType(JDBCType.VARCHAR).length(512).notNull().comment("cron表达式").commit()
        .addColumn().name("script").jdbcType(JDBCType.CLOB).notNull().comment("执行脚本").commit()
        .addColumn().name("language").jdbcType(JDBCType.VARCHAR).length(32).notNull().comment("脚本语言").commit()
        .addColumn().name("enabled").jdbcType(JDBCType.DECIMAL).length(4, 0).comment("是否启用").commit()
        .addColumn().name("parameters").jdbcType(JDBCType.CLOB).comment("启动参数").commit()
        .addColumn().name("type").jdbcType(JDBCType.DECIMAL).length(4, 0).comment("任务类型").commit()
        .comment("定时任务").commit()

database.createOrAlter("s_template")
        .addColumn().name("u_id").jdbcType(JDBCType.VARCHAR).length(32).notNull().primaryKey().comment("uid").commit()
        .addColumn().name("name").jdbcType(JDBCType.VARCHAR).length(256).notNull().comment("名称").commit()
        .addColumn().name("template").jdbcType(JDBCType.CLOB).comment("模板").commit()
        .addColumn().name("classified_id").jdbcType(JDBCType.VARCHAR).length(32).comment("分类").commit()
        .addColumn().name("type").jdbcType(JDBCType.VARCHAR).length(64).comment("类型").commit()
        .addColumn().name("script").jdbcType(JDBCType.CLOB).comment("脚本").commit()
        .addColumn().name("css").jdbcType(JDBCType.CLOB).comment("样式").commit()
        .addColumn().name("css_links").jdbcType(JDBCType.CLOB).comment("样式链接").commit()
        .addColumn().name("script_links").jdbcType(JDBCType.CLOB).comment("脚本链接").commit()
        .addColumn().name("version").jdbcType(JDBCType.DECIMAL).length(32, 0).comment("版本").commit()
        .addColumn().name("revision").jdbcType(JDBCType.DECIMAL).length(32, 0).comment("修订版").commit()
        .addColumn().name("release").jdbcType(JDBCType.DECIMAL).length(32, 0).comment("当前发布版本").commit()
        .addColumn().name("using").jdbcType(JDBCType.DECIMAL).length(4, 0).comment("是否使用中").commit()
        .addColumn().name("remark").jdbcType(JDBCType.VARCHAR).length(200).comment("").commit()
        .comment("模板").commit()

database.createOrAlter("s_user")
        .addColumn().name("u_id").jdbcType(JDBCType.VARCHAR).length(32).notNull().primaryKey().comment("id").commit()
        .addColumn().name("username").jdbcType(JDBCType.VARCHAR).length(64).notNull().comment("用户名").commit()
        .addColumn().name("password").jdbcType(JDBCType.VARCHAR).length(64).notNull().comment("密码").commit()
        .addColumn().name("name").jdbcType(JDBCType.VARCHAR).length(64).comment("姓名").commit()
        .addColumn().name("email").jdbcType(JDBCType.VARCHAR).length(512).comment("邮箱").commit()
        .addColumn().name("phone").jdbcType(JDBCType.VARCHAR).length(64).comment("联系电话").commit()
        .addColumn().name("status").jdbcType(JDBCType.DECIMAL).length(4, 0).comment("状态").commit()
        .addColumn().name("create_date").jdbcType(JDBCType.TIMESTAMP).notNull().comment("创建日期").commit()
        .addColumn().name("update_date").jdbcType(JDBCType.TIMESTAMP).comment("修改日期").commit()
        .comment("用户表").commit()

database.createOrAlter("s_quartz_job_his")
        .addColumn().name("u_id").jdbcType(JDBCType.VARCHAR).length(32).notNull().primaryKey().comment("主键").commit()
        .addColumn().name("job_id").jdbcType(JDBCType.VARCHAR).length(32).notNull().comment("任务id").commit()
        .addColumn().name("start_time").jdbcType(JDBCType.TIMESTAMP).notNull().comment("开始时间").commit()
        .addColumn().name("end_time").jdbcType(JDBCType.TIMESTAMP).comment("结束时间").commit()
        .addColumn().name("result").jdbcType(JDBCType.CLOB).comment("执行结果").commit()
        .addColumn().name("status").jdbcType(JDBCType.DECIMAL).length(4, 0).comment("状态").commit()
        .comment("定时任务执行记录").commit()