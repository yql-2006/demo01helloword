# 接口清单

## REST API 接口

| 接口 | 方法 | 描述 | 请求参数 | 返回 |
| --- | --- | --- | --- | --- |
| `/test01name` | GET | 测试接口，返回文本字符串 | 无 | "Hello Word" |
| `/account/search` | GET / POST | 按关键字检索账户信息 | `key`：查询关键字 | `List<Account>` |

## 服务层接口

| 类 | 方法 | 描述 |
| --- | --- | --- |
| `AccountService` | `List<Account> search(String key)` | 调用 DAO 查询账户信息 |

## 持久层 / DAO 接口

| 类 | 方法 | 描述 |
| --- | --- | --- |
| `AccountDao` | `List<Account> find(String key)` | 使用 JdbcTemplate 执行模糊查询 |
| `AccountMapper` | `void deleteById(String id)` | 删除账户 |
| `AccountMapper` | `void updateAccount(Account account)` | 更新账户 |
| `AccountMapper` | `void addAccount(Account account)` | 新增账户 |
| `AccountMapper` | `List<Account> findAll()` | 查询所有账户 |
| `AccountMapper` | `Account findById(String id)` | 根据 ID 查询账户 |

## 主要实体

- `Account`
  - `id: String`
  - `name: String`
  - `value: Double`

## 说明
上述接口清单反映了当前项目中的主业务路径与辅助数据访问方法，适合用于系统设计和测试覆盖。