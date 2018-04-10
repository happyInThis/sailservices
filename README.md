# sailServices
仅仅进行接口的定义，作为boss和dest-clerk的桥梁，本身不实现任何业务逻辑
由于我们没有maven的私服，这个需要先打包安装到本地资源库后才能被boss和dest-clerk引用到，所以这个需要先执行 mvn clean install 命令 然后另外的项目才能build
