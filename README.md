# DubboProviderDemo
本Demo为Dubbo的服务端程序
通过src/main/java/com/wenjie/deubboserver包中的DubboProvider类启动

先启动服务端程序，再启动客户端程序。

注意：如果服务端程序无法自动在maven仓库生成可执行jar包，需要自行手动将服务端程序打jar包，然后放到maven仓库的
    相应位置，让客户端的pom.xml能够找到
