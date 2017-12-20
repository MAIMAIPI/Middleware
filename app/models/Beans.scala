package models

case class Person(id: Int, name: String)

//批次类
case class Batch(bid: Int, //自身逐渐
                 year: Int, //年份
                 level: Int, //年级
                 name: String //批次名字
                )


//组类
case class Group(gid: Int, //主键
                 user: User, //用户
                 project: Project, //项目
                 degree: Int //身份
                )


case class User(uid: Int, //主键
                username: String, //用户名
                password: String, //密码
                realname: String, //真实姓名
                phone: String, //电话
                level: Int, //年级
                degree: Int //身份
               )

case class Project(pid: Int,
                   name: String, //项目名称
                   groups: Seq[Group],
                   summary: String, //项目描序
                   link: String, //git链接  暂时保存不用
                   startTime: String, //创建时间
                   endTime: String, //截至时间
                   member: String, //项目创建人
                   batch: Batch //所属批次
                  )

case class ProjectItem(piid: Int,
                       project: Project, //所属项目
                       picture: String, //存放图片路径
                       link: String, //git链接
                       funPath: String, //存放功能点文件路径
                       needPath: String, //存放需求文件路径
                       time: String, //更新时间
                       submitPerson: String //提交人
                      )

case class Relation(rid: Int,
                    master: User, //师傅
                    apprentice: User //徒弟
                   )