
# Echo Server Application

## Description

This project is a simple Echo Server application implemented in Java. It consists of a client and a server program where the client sends a string to the server, and the server responds by echoing back the same string prefixed with "Server says:". This project is designed for educational purposes to demonstrate basic client-server communication using sockets in Java.

## Features

- **Client Program**: Reads a string from the user and sends it to the server.
- **Server Program**: Listens for client connections, reads the string sent by the client, and sends back an echoed response.



## How to Use

### Prerequisites

- Java Development Kit (JDK) installed.
- Basic understanding of Java programming.

### Running the Server

1. Compile the `server.java` file:
   ```sh
   javac server.java
   ```

2. Run the server program:
   ```sh
   java server
   ```

   The server will start and wait for client connections on port 8081.

### Running the Client

1. Compile the `client.java` file:
   ```sh
   javac client.java
   ```

2. Run the client program:
   ```sh
   java client
   ```

   The client will prompt you to enter a string. After entering a string, it will send the string to the server and print the server's response.

## Project Structure

```
/path/to/your/project
│
├── client.java    # Client program source code
└── server.java    # Server program source code
```

## Example

### Server Output
```
Waiting for clients...
Connection established!
Received from client: Hello, server!
Sent to client: Hello, server!
```

### Client Output
```
CLIENT started!
Enter a String:
Hello, server!
Sent to server: Hello, server!
Received from server: Server says: Hello, server!
```

## Contributing

Contributions are welcome! Please open an issue or submit a pull request with improvements or bug fixes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
```


