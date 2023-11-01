Generate Antlr Java files

```shell
java -jar ./lib/antlr-4.13.1-complete.jar ./src/IPT.g4 -o ./src/cc/glaciyan/ipt -encoding UTF-8 -package cc.glaciyan.ipt -visitor
```

# Example

```
person = {
  name = "John",
  age = 30,
  address = {
    street = "123 Main St",
    city = "Example City",
    postalCode = "12345"
  },
  emails = {"john@example.com", "johndoe@example.org"},
  hobbies = {
    "Reading",
    "Gardening",
    "Cooking"
  }
}

```

![Tree](assets/tree_dark.svg#gh-dark-mode-only)![Tree](assets/tree_light.svg#gh-light-mode-only)