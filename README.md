# Apartment Information System

This is a project made by [Shams Al Ahsan](https://github.com/ShamsAl), [Shah Alam Tasin](https://github.com/ShahAlamTasin), [Tashreef Muhammad](https://github.com/TashreefMuhammad) and [Arafat Uddin](https://github.com/Arafat4869) for **Information System Design and Software Engineering Lab (CSE 3224 Course)**. The project was made using Java Swing and for DataBase Microsoft SQL was used.

As per requirement of the course here it is described on how to setup the system for seeing and running the code. The main procedures can be divided into the following parts:


## Install environment for running Java:
For the purpose of setting up environment to run Java and see codes, it will be necessarry to have *`JDK`* and *`JRE`* installed. Also, as for IDE *`NetBeans`* will be explained on how to explain here.
* **Installing *`JDK`* and *`JRE`*:**
Install **`JDK`** and **`JRE`**. First download **`JDK`** and **`JRE`** from [here](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html). If download any of the Development Kit, both JDK and JRE can be installed from the same file. During time of development first installed the **Java SE Development Kit 8u181** which was later updated automatically.
* **Installing *`NetBeans`* as the IDE:**
Install **`NetBean 8.2`** from [here](https://netbeans.org/downloads/old/8.2/). Follow the installer to install the IDE. It is required that the correct *`PATH`* be selected during installation when asked for about the *`JDK`* and *`JRE`*


## Install Microsoft SQL Server:
Microsoft SQL Server can be installed from the internet. During development *`Microsoft SQL Server 2014`* was used. This version can be downloaded from [here](https://www.microsoft.com/en-US/download/details.aspx?id=42299). The `ExpressAdvanced [Size 1.1GB)` can be downloaded to ensure all required components be installed in one go.
* **Installing *`MSSQL`*:**
Install MSSQL following instructions by the installer. For reference [this](https://drive.google.com/file/d/1U-7v1RKhvxQXSvo5KTavMXgIcWbbTgwh/view?usp=sharing) can be used where it is described on how to install `SQL Server 2008 Express(Including Management Studio)`. 

## Setting Up MSSQL to Work with Java Code:
Some setup is required to ensure that the DataBase in MSSQL can be used through Java. The procedure is explained below:
* Right-click on `This PC` and select `Manage`. Go to `Service and Applications` and expand `SQL Server Configuration Manager`. From there Expand `SQL Server Network Configuration` and select `Protocols for SQLEXPRESS`

![image](https://user-images.githubusercontent.com/43475529/93734553-867e2b00-fbfb-11ea-9134-ce858d036628.png)

* Double click the TCP/IP option or Right-click and select `Properties`. Go to `IP Addresses`. Scroll down to the bottom and edit `TCP Port` to `1433` in `IPAll`. Then press `OK`

![image](https://user-images.githubusercontent.com/43475529/93734691-14f2ac80-fbfc-11ea-880e-64a535476786.png)

* Right-click on TCP/IP once again and select `Enable` The ports are henceforth set-up for use.

* Open SQL Server 2014 Management Studio. Choose `Windows Authentication`. Then open the `SetupLogin.sql` given in the project repository. Execute it.

* Right-click on SQL Server. Goto `Properties` and then to `Security` option. Select `SQL Server Windows Authentication Mode`.

![image](https://user-images.githubusercontent.com/43475529/93735248-2c329980-fbfe-11ea-87e5-e5cc55d992f8.png)

* Disconnect the SQL Server and then reconnect. Now choose `SQL Server Authentication`. For `User Name` write `sa` and for `Password` write `ISD_AIS_A1_G1`

* Now open the `Apartment_Information_System.sql` provided in the project repository. Run the file suitably to add data to the required database. A set of random sampled data are inserted there just for setting up DataBase for use. All data are random and are not collected from anywhere or has any authenticity.
