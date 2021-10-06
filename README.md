
# Test Peergrade Assignment 2

## 1 REFLECTIONS

### 1.1 COMPUTER MOUSE
Identify the types of testing you would perform on a computer mouse, to make sure that it is of the highest quality.
 - Is the mouse a size that is suitable to grip.
- Check if the mouse is wireless or corded.
- Is the mouse wireless, check the range up to which the mouse remains operational.
- In the wireless mouse check the battery requirement.
- Check if there is an on and off switch function.
- Check if the mouse is an optical mouse or not.
- When the computer mouse is plugged in and placed on a surface I would make sure that the pointer on the screen is responsive when the mouse is moved around.
- Responsiveness of the mouse pointer on different surfaces.
- The speed of the mouse pointer.
- Check that the drag and drop functionality works.
- If the mouse isn't optical make sure the ball inside the computer mouse is completely round and even.
- Check if it is easy to scroll on the scroller and that it doens't get stuck at any point.
- Make sure that it is possible to right click and left click on the mouse.
- Checking if it's possible to double click and that it works.
- Making sure the duration of time between two clicks is correct in order to call it a double click.
- Check the pressure that is required for clicking the buttons on the mouse.
- See if it still works after having spashed a bit of water on it.
Working in moist conditions.

### 1.2 CATASTROPHIC FAILURE
Find a story where a software system defect had a bad outcome. Describe what happened. Can you identify a test that would have prevented it?


## 3 INVESTIGATION OF TOOLS

### 3.1 JUNIT 5
Investigate JUnit 5 (Jupiter). Explain the following, and how they are useful.
- @Tag 
	- Is used to declare tags for filtering tests. This can be either at the class level or method level.
	- The tags can later be used to filter test based on the tag.
		
- @Disabled 
	-  Used to disable a test class or test method.
	- Good for when you quickly want to disable one or two methods or a whole class easily.
		
- @RepeatedTest 
	- Says that a method is going to be repeated a specific number of times.
	- When you want to run test multiple times at one time.
		
- @BeforeEach, @AfterEach 
	- BeforeEach: Here the method should be executed before each test method in the current class.
	- AfterEach: Here the method should be executed aftereach test method in the current class.
	- Removes redundant code from each separat test and moves it into this one.
		
- @BeforeAll, @AfterAll
	- BeforeAll: Here the method should be executed before all test methods in the current class.
	-  AfterAll: Here the method should be executed after all test methods in the current class.
	- Removes redundant code from each separat test and moves it into this one.
		
- @DisplayName
	- Declares a custom display name for the test class or test method.
	- Will be shown in test reports and by test runners.
		
- @Nested 
	- Allows you to have an inner class that's which is kind of a test class. This allows you to group several test classes under the same parent (with the same initilization).
	- Groups test classes together

- assumeFalse, assumeTrue 
	- Validates the given assumption to be either true or false.


		
### 3.2  MOCKING FRAMEWORKS
Investigate mocking frameworks for your preferred language. Choose at least two frameworks, and answer the questions. (One could be Mockito, which we saw in class.)
	EasyMock and Mockito. 
- What are their similarities? 
	- Allows the same level verfication.
	- Argument matchers.
		
- What are their differences? 
	- Mockito supports both mocks and spies.
	- EasyMock supports only mocks.
		
- Which one would you prefer, if any, and why? 
	- I would choose Mockito because it sounds like it's easier to understand.
