# FileHandlingUtility

**Company Name** CodeTech It Solutions

**Name:** Rohit Waikar

**Project** :File Handling

**Intern Id** CTIS4163

**Domain Name** Java Programming

**Mentor Name** Neela Santosh

# Description :

File handling is an essential concept in Java programming that allows applications to store data permanently in external files instead of relying only on temporary memory. In this task, a File Handling Utility is developed using Java in the Eclipse IDE to demonstrate three fundamental file operations: reading, writing, and modifying text files. This utility helps users interact with text files through a simple menu-driven interface.

The primary objective of this program is to understand how Java manages file input and output (I/O) operations using built-in classes from the java.io package. Files provide long-term storage, which is important for maintaining records, logs, reports, and other persistent data even after the program execution ends.

The program begins by asking the user to enter the file name (with .txt extension). If the file does not exist, Java automatically creates it during the write operation. The user is then presented with a menu containing options to write data, read data, modify data, or exit the application.

For the write operation, the program uses the FileWriter class. This class enables the program to write character data into the specified text file. When the user selects the write option, they are prompted to enter the text content. The program writes this data into the file, overwriting any existing content. This demonstrates how new files are created and how existing files can be updated.

For the read operation, the program uses FileReader along with BufferedReader. FileReader reads raw character data from the file, while BufferedReader improves efficiency by reading the file line by line. This makes the reading process faster and more structured. The file content is displayed on the console so the user can verify stored data.

The modify operation is implemented using FileWriter in append mode. By passing true as a parameter to the FileWriter constructor, the program ensures that new data is added at the end of the file instead of replacing the existing content. This operation is useful for updating logs, adding new records, or extending stored information without losing previous data.

Exception handling plays a crucial role in file handling. The program uses IOException to handle errors such as missing files, permission issues, or read/write failures. This prevents the program from crashing and ensures smooth execution.

# Output:

<img width="1038" height="730" alt="Image" src="https://github.com/user-attachments/assets/de793a20-01d3-4c76-8043-eee5a7686f25" />
