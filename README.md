<p style="text-align: center;">&nbsp;</p>
<p style="text-align: center;">&nbsp;</p>
<p align="center"><strong><img src="https://media.dhakatribune.com/uploads/2016/11/nsulogo.jpg" alt="" width="307" height="172" /></strong></p>
<p align="center"><strong>North South University</strong></p>
<p align="center">Department of Electrical &amp; Computer Engineering</p>
<p align="center"><strong>Project Report</strong></p>
<p align="center"><strong>Fall 2020</strong></p>
<p align="center"><strong>Project Name</strong>: The Food Tong App</p>
<p align="center"><strong>Course No</strong>: CSE 486 <strong>Sec</strong><strong>:</strong> 1</p>
<p align="center"><strong>Faculty</strong>: Shaikh Shawon Arefin Shimon (SAS3)</p>
<p align="center"><strong><u>Member Detail</u></strong></p>
<p align="center"><strong>Name</strong><strong>:</strong> Abdullah Al Mahfuj Shaan</p>
<p align="center"><strong>ID</strong><strong>:&nbsp; </strong>1721275042</p>
<p align="center"><strong>Email</strong><strong>:</strong> <a href="mailto:abdullah.mahfuj@northsouth.edu">abdullah.mahfuj@northsouth.edu</a></p>
<p align="center"><strong>Git Repository</strong><strong>: </strong><a href="https://github.com/NSU-FA20-CSE486-1/1721275_FA2020_CSE486.1">https://github.com/NSU-FA20-CSE486-1/1721275_FA2020_CSE486.1</a></p>
<p align="center"><strong>Figma Repository</strong><strong>: </strong><a href="https://www.figma.com/files/project/17380331/1721275_FA2020_CSE486.1">https://www.figma.com/files/project/17380331/1721275_FA2020_CSE486.1</a></p>
<p align="center"><strong>Date Prepared</strong><strong>: </strong>16/01/2021</p>
<p><strong>&nbsp;</strong></p>
<p><strong>&nbsp;</strong></p>
<p><strong>INTRODUCTION</strong></p>
<p>Get your favorite food at your doorstep without any hassle. Introducing the FoodTong App, where there is no hassle of signing up or logging in. Just select your favorite food and order it using your name and phone number.</p>
<p><strong>FEATURES</strong></p>
<li>Landing Page</li>
In this feature, the user gets direct access to food without signing up. The user can just select and order food from here.
<li>Order Page</li>
After the user selects the preferred food, the app takes it to another screen, where the user writes his name and phone number.
<li>Update Order</li>
The user can also update his order according to his choice after ordering a food. 
<li>Delete Order</li>
If the user makes the choice to delete his order, he can long press a order to delete it.

<p><strong>DATA MANAGEMENT</strong></p>
<p>In this project, I have used SQLite Database as the primary storage to store Username, Phone Number, Food Name, Quantity and Food Description.</p>
<p><strong>DESIGN PATTERN</strong></p>
<p>There is no design pattern, that is, MVC or MVVM, associated with the project. I have used normal approach that is design, implement and fixed bugs if found any. </p>
<p><strong>ROAD BLOCKS</strong></p>
<p>There were a few hiccups that I had to fix while doing the project. First problem that I encountered was in Android Manifest. The app crashed multiple times because of not adding an activity in the manifest file, which later on I fixed seeing the logcat. In the OrderActivity, the Username and FoodName XML id was same which caused another issue. The food name used to come in the Username section. There is still one bug left in the project, which I could not fix. That is whenever I update the order, it updates in the database, but it does not come up in the updated order section. </p>

## Featured Photos

#### Landing Page
![login screen](https://github.com/NSU-FA20-CSE486-1/1721275_FA2020_CSE486.1/blob/main/AndroidProject/Project%20Screenshots/landing_page.jpg)

#### My Orders
![login screen](https://github.com/NSU-FA20-CSE486-1/1721275_FA2020_CSE486.1/blob/main/AndroidProject/Project%20Screenshots/my_orders.jpg)

#### Order Activity
![login screen](https://github.com/NSU-FA20-CSE486-1/1721275_FA2020_CSE486.1/blob/main/AndroidProject/Project%20Screenshots/order_activity.jpg)

#### Update Order Activity
![login screen](https://github.com/NSU-FA20-CSE486-1/1721275_FA2020_CSE486.1/blob/main/AndroidProject/Project%20Screenshots/update_order.JPG)
