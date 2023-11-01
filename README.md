# Generate IPT Java files

```shell
java -jar ./lib/antlr-4.13.1-complete.jar ./src/IPT.g4 -o ./src/cc/glaciyan/ipt -encoding UTF-8 -package cc.glaciyan.ipt -visitor
```