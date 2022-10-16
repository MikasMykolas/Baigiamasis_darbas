# *Baigiamasis darbas by Mykolas Brazauskas*

### Link to test page [LaptopKing](https://laptopking.lt/)

#### 1.TEST Create new account  `account page` 
  * Enter Name in *"Vardas"* field
  * Enter Lastname in *"Pavardė"* field
  * Enter Email in *"El.paštas"* field
  * Enter Password in *"Slaptažodis"* field
  * Click button *"Išsaugoti"*
   
Expected results: Name should be present below login icon 

#### 2. TEST Login and add additional information `Home page`
  * Click on Login icon *"Prisijungti"*
  * Enter valid Email in *"El.paštas"* field
  * Enter valid Password in *"Slaptažodis"* field
  * Click button *"Prisijungti"*
  * Click icon with *"Informacija"* text
  * Enter Company Name in *"Įmonė"* field
  * Enter Company Code in *"Įmonės kodas"* field
  * Enter valid Password in *"Slaptažodis"* field
  * Click button *"Išsaugoti"*

Expected results: Should appear text that Information successfully updated and saved

#### 3. TEST Try to log in with invalid password `Home page`

   * Click on Login icon *"Prisijungti"*
   * Enter valid Email in *"El.paštas"* field
   * Enter invalid Password in *"Slaptažodis"* field
   * Click button *"Prisijungti"*

Expected result: Should appear alert message "Identification failed" 

#### 4. TEST Search functionality with correct keyword `Home page`
   * Click on Search icon *"Paieška"*
   * Enter correct keyword in search bar
   * Click on Submit search 

Expected result: Should appear text how many items showing

#### 5. TEST Search functionality with incorrect keyword `Home page`
   * Click on Search icon *"Paieška"*
   * Enter incorrect keyword in search bar
   * Click on Submit search 

Expected result: Should appear text "There are no products in this category"

#### 6. TEST Add item to the cart `Used HddSdd page` 
  * Click on Item to Add to the cart
  * Click button to continue shopping on pop up window
  * Check if Item is Added to the cart

Expected condition: Value of 1 should appear on Cart icon







