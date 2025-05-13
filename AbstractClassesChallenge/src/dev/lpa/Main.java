package dev.lpa;


/* There are several ways you can implement these methods.  This is one way to do it.

I'll cover a few methods from LinkedList and SearchTree to get you started.



MyLinkedList

addItem(ListItem newItem)

Check if the root of the linked list is null. If it is, that means the list is empty, and newItem becomes the head of the list.

If the list is not empty, you'll need to find the correct position to insert newItem while keeping the list sorted.

Start by initializing a currentItem variable with the root of the list. This variable will be used to traverse the list while looking for the correct position.

Use a while loop to iterate through the list until you find the correct position to insert newItem.

Inside the loop, use compareTo method to compare newItem with the currentItem. This method should return a value indicating whether newItem should be inserted before, after, or if it's equal to the currentItem.

If compareTo returns a negative value, it means newItem should be inserted after the currentItem. Move to the next item in the list if it exists. If it doesn't exist, insert newItem at the end of the list.

If compareTo returns a positive value, it means newItem should be inserted before the currentItem. In this case, you'll need to update the links of newItem, currentItem, and the previous item to correctly insert newItem at the desired position.

If compareTo returns 0, it means newItem is equal to the currentItem, and you should not add duplicates. In this case, return false to indicate that the item was not added.

Continue the loop until you find the right position for newItem or until you reach the end of the list.

Once newItem is successfully inserted, return true to indicate that the item was added.

If the loop completes without adding newItem, return false to indicate that the item was not added.



removeItem(ListItem item)

How would you change the code above to remove an item rather than add it.



SearchTree

performRemoval(ListItem item, ListItem parent)

item, which is the node to be removed from the tree, and parent, which is the parent of the item node. The parent node is required to maintain the structure of the tree after the removal.

Check if item.next() is null. This means the item node has no right subtree.

If item.next() is null, you need to handle the case when item is a left or right child of its parent or if it is the root of the tree.

When item has no right subtree, make parent point to the left subtree of item (which may be null).

If item.previous() is null, this means the item node has no left subtree.

If item.previous() is null, you need to handle the case when item is a left or right child of its parent or if it is the root of the tree.

When item has no left subtree, make parent point to the right subtree of item (which may be null).

If item has both left and right subtrees, the deletion becomes more complicated.

Find the smallest value in the right subtree of item (i.e., the leftmost node in the right subtree). This is because, in a binary search tree, the leftmost node in the right subtree has the smallest value greater than item.

Replace the value of item with the value of the smallest node found in the previous step. This effectively removes item and maintains the order of the tree.

Now, you need to delete the smallest node you found in the right subtree. Update the parent of the smallest node to point to the right child of the smallest node (which may be null).

If the smallest node found has no left subtree (i.e., it is the right child of item), update item.next() to point to the right subtree of the smallest node (which may be null).

If the smallest node found has a left subtree, update the parent of the smallest node to point to the right subtree of the smallest node.



traverse(ListItem root)

Recursion is a programming technique where a method calls itself to solve a smaller instance of the same problem. It's similar to a loop, but instead of iterating through each item in a collection, a recursive method divides the problem into smaller sub-problems and solves them one by one until the base case is reached. The base case is the simplest scenario that doesn't require further recursive calls, allowing the method to stop calling itself and start returning results back to previous recursive calls.



The method should take a ListItem object, root, as a parameter, representing the starting point of the traversal. Typically, the root is the head of the linked list.

The method is recursive, which means it calls itself to traverse through the linked list.

To start the recursion, check if the root is not null.

If the root is not null, perform the following steps: a. Call traverse(root.previous()): This will recursively traverse the previous item before printing the current item. b. Print the value of the current item using System.out.println(root.getValue()). c. Call traverse(root.next()): This will recursively traverse the next item after printing the current item.

When the recursion is initiated, the method will keep calling itself with the previous and next items until it reaches the base case where the root becomes null. At that point, the recursion starts to unwind, and the method prints the values of the items in reverse order.

Since the traverse method is recursive, it doesn't require an explicit loop. The recursive calls take care of traversing the linked list.*/
public class Main {

}
