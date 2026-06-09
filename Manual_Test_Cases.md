ScotiaTech QA Automation Engineer Test
Manual Test Cases

TC_LOGIN_001

Title: Successful Login with Valid Credentials

Preconditions:

User is on SauceDemo login page.
Application is available.

Test Data:

Username: standard_user
Password: secret_sauce

Steps:

Open https://www.saucedemo.com
Enter username "standard_user"
Enter password "secret_sauce"
Click Login button

Expected Result:

User is authenticated successfully.
Products page is displayed.
Product catalog is visible.



TC_LOGIN_002

Title: Login with Locked Out User

Preconditions:

User is on SauceDemo login page.
Application is available.

Test Data:

Username: locked_out_user
Password: secret_sauce

Steps:

Open https://www.saucedemo.com
Enter username "locked_out_user"
Enter password "secret_sauce"
Click Login button

Expected Result:

Login is rejected.
Error message is displayed:
"Epic sadface: Sorry, this user has been locked out."
User remains on login page.



TC_PRODUCT_001

Title: Verify Product Catalog Display

Preconditions:

User is logged in successfully.

Test Data:

Username: standard_user
Password: secret_sauce

Steps:

Login with valid credentials.
Navigate to Products page.
Review displayed products.

Expected Result:

Six products are displayed.
Product name is displayed.
Product image is displayed.
Product description is displayed.
Product price is displayed.
Add to Cart button is available.



TC_FILTER_001

Title: Verify Product Sorting Functionality

Preconditions:

User is logged in successfully.
Products page is displayed.

Steps:

Open sorting dropdown.
Select "Name (Z to A)".
Verify products are sorted in descending alphabetical order.
Select "Price (Low to High)".
Verify products are sorted by ascending price.
Select "Price (High to Low)".
Verify products are sorted by descending price.

Expected Result:

Products are reordered according to selected option.
No errors are displayed.
Product information remains visible.



TC_CART_001

Title: Add Product to Shopping Cart

Preconditions:

User is logged in successfully.

Steps:

Login with valid credentials.
Select a product.
Click "Add to Cart".
Open shopping cart.

Expected Result:

Product is added successfully.
Cart badge displays quantity "1".
Product appears inside shopping cart.



TC_CHECKOUT_001

Title: Complete Checkout Successfully

Preconditions:

User is logged in successfully.
At least one product exists in cart.

Test Data:

First Name: Karina
Last Name: Saavedra
Postal Code: 111111

Steps:

Open shopping cart.
Click Checkout.
Enter First Name.
Enter Last Name.
Enter Postal Code.
Click Continue.
Review order information.
Click Finish.

Expected Result:

Order is completed successfully.
Confirmation page is displayed.
Message "Thank you for your order!" is shown.



TC_PRODUCT_002

Title: Verify Product Images Consistency (Problem User)

Preconditions:

User is on SauceDemo login page.

Test Data:

Username: problem_user
Password: secret_sauce

Steps:

Login with problem_user.
Navigate to Products page.
Compare product names and images.

Expected Result:

Each product should display its corresponding image.
Product image should match product name and description.

Actual Observation During Testing:

Multiple products display the same image.
Images do not correspond to the expected product.



TC_PERFORMANCE_001

Title: Verify Product Page Response Time

Preconditions:

User is on SauceDemo login page.

Test Data:

Username: performance_glitch_user
Password: secret_sauce

Steps:

Login with performance_glitch_user.
Measure the time required to display the Products page.

Expected Result:

Products page should load within acceptable response time.
User should access the catalog without noticeable delay.

Actual Observation During Testing:

Products page required approximately 7 seconds to load after login.






