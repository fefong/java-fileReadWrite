# Java Reader and Write Files

Example Application: Reader_(FileReader)_ and Write_(FileWriter)_ files.

## Read File

Imports

```java
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
```

Check file exists

:warning: Creates a new File instance by converting the given pathname string into an abstract pathname. If the given string is the empty string, then the result is the empty abstract pathname.

```java
File file = new File(FILE);

if (file.exists()) {
	//TODO
} else {
	//TODO
}
```

### Read file

:warning: _Need add **throws declaration** or surround with **try/catch**;_

```java
String FILE = "YOUR_LOG.log";

FileReader reader = new FileReader(FILE);
BufferedReader buffer = new BufferedReader(reader);

String line = null;

while ((line = buffer.readLine()) != null) {
	//TODO
	System.out.printf("%s\n", line);
}

```

:warning: Closes the stream and releases any system resources associated withit.

```java
buffer.close();
```


## Write File

Imports

```java
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
```

Check file exists

:warning: Creates a new File instance by converting the given pathname string into an abstract pathname. If the given string is the empty string, then the result is the empty abstract pathname.

```java
String FILE = "YOUR_LOG.log";

File file = new File(FILE);

if (file.exists()) {
	//TODO
} else {
	//TODO
}
```

### Write File

:warning: _Need add **throws declaration** or surround with **try/catch**;_

```java
String content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

String FILE = "YOUR_LOG.log";
FileWriter writer = new FileWriter(FILE);
BufferedWriter buffer = new BufferedWriter(writer);

buffer.write(content);

System.out.println("Success! You file is saved!");
```

:warning: Closes the stream and releases any system resources associated withit.

```java
buffer.close();
```

## Exceptions

* _IOException_


## Some links for more in depth learning

* [JAVA](https://github.com/search?q=fefong%2Fjava)
* [JAVA PRINT](https://github.com/fefong/java_print);
* [JAVA SWITCH CASE](https://github.com/fefong/java_switch);
* [JAVA IF/ELSE](https://github.com/fefong/java_ifElse);
* [JAVA ARITHMETIC](https://github.com/fefong/java_calculator);
