# Java 后端（Spring Boot）12 周学习计划

目标：在 12 周内掌握 Java 后端开发常用技能，并产出一个可部署的博客项目作为实习展示（含 Docker、CI、测试与演示视频）。

总体节奏（每周约 12–15 小时）
- 周 1–2：Java 基础巩固、Git/Linux、SQL、Spring Boot 入门，产出小 Demo
- 周 3–6：实现完整项目骨架（用户/文章/评论），加入认证、缓存、单元测试
- 周 7–9：Docker 化、CI、监控、性能优化、补充功能
- 周 10–12：面试题训练、投递准备、演示视频、项目 polish

详细周计划

第 1 周（环境与 Java 巩固）
- 配置开发环境（JDK17、IDEA、Git、Docker）
- 复习 Java：OOP、集合、常用 API、并发基础
- 学习 Git 与 Linux 常用命令
- 学习 SQL 基础并做 3–5 道练习题

第 2 周（Spring Boot 快速入门）
- 使用 Spring Initializr 建项目，了解依赖与配置
- 实现基础 Controller/Service/Repository 的 CRUD 示例
- 集成 Spring Data JPA，学习实体映射与事务
- 引入 Swagger/OpenAPI 并生成接口文档

第 3 周（项目设计与核心功能）
- 确定项目（博客系统）：设计 ER 图（User/Post/Comment）
- 实现用户注册/登录（初步）、文章的 CRUD、分页查询
- 编写部分单元测试（JUnit）

第 4 周（缓存与性能基础）
- 学习 Redis 并集成缓存（热点缓存、TTL）
- 分页优化（数据库分页 vs 游标分页）
- 引入异步处理（@Async）
- 配置结构化日志（Logback）

第 5 周（安全与事务深挖）
- 学习常见 Web 漏洞（XSS/CSRF/SQL 注入）与防护
- 完善认证/授权设计（准备引入 JWT）
- 事务传播/隔离级别学习与示例
- 做一次简单压力测试（wrk 或 JMeter）

第 6 周（持久化优化与搜索）
- 学习索引设计与 Explain 优化慢查询
- 引入 Flyway/Liquibase 做数据库迁移（可选）
- 简单集成 Elasticsearch（可选）或优化 MySQL LIKE
- 准备 Docker 化（写 Dockerfile）

第 7 周（Docker 与 CI/CD）
- 完成 Dockerfile 与 docker-compose（app + MySQL + Redis）
- 配置 GitHub Actions：mvn test && package
- 本地用 Docker Compose 验证整体联通

第 8 周（监控与配置管理）
- 集成 Spring Actuator，暴露 /health /metrics
- 学习 Prometheus/Grafana（概念）或完善日志输出
- 敏感配置使用环境变量或配置文件分离

第 9 周（测试覆盖与代码质量）
- 增加集成测试（使用 Testcontainers 可选）
- 在 CI 中加入静态代码检查（SpotBugs/Checkstyle）
- 重构并改善异常处理与日志

第 10 周（面试题训练）
- 刷 LeetCode（数组/字符串/哈希/双指针），每天 30–60 分钟
- 练习 SQL（LeetCode Database），掌握窗口函数
- 整理常见 Spring 面试题与回答要点

第 11 周（投递与模拟面试）
- 定向投递实习岗位（校招/企业官网/BOSS/拉勾）
- 准备 3 个 STAR 行为故事
- 进行 2–3 次模拟面试并修正项目演示方式

第 12 周（收尾与复盘）
- 完成项目演示视频（3–5 分钟）并更新 README
- 整理一页项目亮点（便于放简历顶部）
- 总结12周学习收获，制定下一步提升计划（如深入大数据或算法）

项目交付清单
- GitHub 仓库代码（含 README、Dockerfile、docker-compose.yml）
- Swagger/OpenAPI 接口文档
- 单元与集成测试（mvn test 能通过）
- 演示视频 3–5 分钟
- 1 页项目亮点说明供简历使用

面试准备要点（速查）
- 算法：数组/字符串/哈希/双指针/简单链表
- SQL：group by、window function、join 优化、Top-K
- 后端：Spring 生命周期、事务、缓存策略、JWT 原理
- 大数据入门（如需转向）：Spark 基础、Kafka 概念、ETL 思路

注意事项
- 仓库中不要提交明文密码或密钥，使用环境变量或 GitHub Secrets
- CI 在 main 分支触发，若要避免立即运行，请先在分支上合并代码
- 若需要，我可以把密码加密（BCrypt）与 JWT 实现一并加入项目骨架

如果你希望，我现在将这个学习计划文件（LEARNING_PLAN.md）提交到你的仓库并推送（我已经准备好）。
