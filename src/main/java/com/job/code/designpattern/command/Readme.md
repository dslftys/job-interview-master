# 动机

在软件设计中，我们经常需要向某些对象发送请求，但是并不知道请求的接收者是谁，也不知道被请求的操作是哪个，我们只需在程序运行时指定具体的请求接收者即可，此时，可以使用命令模式来进行设计，使得请求发送者与请求接收者消除彼此之间的耦合，让对象之间的调用关系更加灵活。

# 定义

将一个请求封装为一个对象，从而使我们可用不同的请求对客户进行参数化；对请求排队或者记录请求日志，以及支持可撤销的操作。命令模式是一种对象行为型模式，其别名为动作(Action)模式或事务(Transaction)模式。

# 作用

命令模式可以对发送者和接收者完全解耦，发送者与接收者之间没有直接引用关系，发送请求的对象只需要知道如何发送请求，而不必知道如何完成请求。

调用者（请求者/Invoker）   ===绑定命令对象，需要执行命令时，执行统一方法===>   命令对象（封装接收者）进行执行，完成请求 ====> 接收者(Receiver)：真正的执行人

比如：可以兼容各种功能的遥控器。
遥控器（Invoker）拥有多个卡槽（Command），每个卡槽用来放一种命令（ConcreteCommand），命令中含有具体的接收者（Receiver）用来真正执行任务。
用户只需要把命令请求对象（ConcreteCommand）传入遥控器（Invoker），需要执行时，调用统一运行方法（比如按下按钮），即可运行该命令的内容。而具体的命令执行过程由 命令对象所持有的接收者（Receiver）执行，发送者并不知道。

# 实现

命令模式将“请求”封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。命令模式也支持可撤销的操作。

../_images/Command.jpg
../_images/seq_Command.jpg
- Command: 抽象命令类
- ConcreteCommand: 具体命令类
- Invoker: 调用者（请求者）
- Receiver: 接收者
- Client:客户类

# 应用

Tomcat中Connector 也是通过命令模式调用 Container 
图 4. Tomcat 命令模式的结构图
Connector 作为抽象请求者，HttpConnector 作为具体请求者。HttpProcessor 作为命令。
Container 作为命令的抽象接受者，ContainerBase 作为具体的接受者。客户端就是应用服务器 Server 组件了。
Server 首先创建命令请求者 HttpConnector 对象，然后创建命令 HttpProcessor 命令对象。
再把命令对象交给命令接受者 ContainerBase 容器来处理命令。
命令的最终是被 Tomcat 的 Container 执行的。命令可以以队列的方式进来，Container 也可以以不同的方式来处理请求
如 HTTP1.0 协议和 HTTP1.1 的处理方式就会不同。