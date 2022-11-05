# Trees
OOP

School project for OOP
1. Tree
Create the Tree class, which stores the data of a tree. Let a tree have height (a positive real number,
in meters), type (text) and age (positive integer). Data members cannot be accessed from outside the class
reach, but they should have getter and setter methods.
- LeafFall: does not expect a parameter. The method is written by the standard to output . Also, increase age by one
- avgGrowing: expects no parameters and calculates that the tree how many meters did it grow on average per year? The function should return with this value
2. XmasTree
Special tree. In addition to the properties of the wood, it should have beauty
(whole) property that tells how beautiful the tree is. Its value is an integer between 1 and 10
can be a number, if you get a value less than 1, then set it to 1, if it is greater than 10, then set it to 10.
In addition, let's store it to see if it is durable (logical), this will tell you whether its leaves will last for a long time.
The data members should have private visibility, but create public methods for them, which
can be accessed or modified.
- throwAway: Write the standard in it to the output that "the tree was thrown into the yard", then call the leafFall()
method, and reduce its beauty to 1.
- lapseOfTime: which expects an integer in parameter. If the tree permanent, then the method subtracts the value received in the parameter from its beauty, the opposite in this case, he subtracts twice as much. If beauty drops below 4, call throwAway() method
-valueOfTree: determines its values and returns with it. The value to calculate it, multiply the height of the tree by the square of its beauty. If the tree is not durable, then divide the whole by 3.
- decorate: + beauty
- bestTree: This parameter is an array of trees. The best one is determined using the valueOfTree() method
3. MagicTree
Special tree. Each magic tree stores its size
his magic power (real number), how evil he is (real number between 1 and 5), and what he's like
has a specialization (string). In addition, there should be a data member called magic tree with all the objects
shares. This tells you how many magic trees have been created in total. Data members only in the class
can be accessed from the inside, but create getter and setter methods for them. An exception to this is
magic tree, it should only have a getter.
- Learn(): + n% magic
- badWay: evilness +2, If you reach 5 this way, then double his magic power, otherwise halve it.
- battle expects two parameters, an array of 1-1 magic trees, and
returns true if the magic trees of the first array, false if the magic trees of the second array win the
battle.
