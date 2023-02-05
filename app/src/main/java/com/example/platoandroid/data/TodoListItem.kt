package com.example.platoandroid.data

/**
 * This class will be used to represent todo list items in our app.
 * This is a data class meant to represent pieces of complex data &
 * package all the values relating to a specific concept in our app
 * in one data type.
 * Data classes are denoted by the keyword `data` prefix before `class`
 */

/**
 * Data classes can be used as data types throughout your app much
 * the same way as we use simple data types like String, Int, or Boolean.
 *
 * For example, if you a variable representing a todo list item, you
 * could write something like:
 *
 * var todoListItem: TodoListItem = TodoListItem(itemName = "thing to do")
 *
 * Then we could access the values of our custom data type like:
 *
 * todoListItem.itemName // would return "thing to do"
 */

/**
 * Our TodoListItem data class is started below, but we need some more
 * values to represent everything about a TodoListItem.
 * In the constructor below `itemName` (in between the comments), add
 * some more values to represent the following:
 *  isCompleted of type Boolean
 *  completedAt of type Date?
 *  dueDate of type Date? // remember, adding a ? to the end of data type means it can be null, see more below
 *
 *  We will also default dueDate & completedAt to null. You can default a value by assigning
 *  it with the equals operator in the constructor. This will look something like:
 *  (
 *    ...
 *    val dueDate: Date? = null // this defaults dueDate to null
 *  )
 *
 *  Defaulting means when we create a new TodoListItem, if we don't explictly provide
 *  a value for dueDate, dueDate will default to null. If a value is explicitly
 *  provided, it will override the default null value and be used instead.
 */

/**
 * If you want a value to be OPTIONAl, you can make it nullable by adding a ? to the end.
 * For example if we were creating a TodoListItem with a nullable dueDate, we
 * could write something like:
 * val todoListItemWithNoDueDate = TodoListItem(itemName = "thing to do", dueDate = null)
 *
 * OR you could write a todo list item with a date like:
 * val todoListItemWithDueDate = TodoListItem(itemName = "thing to do", dueDate = Date())
 *
 * Note: When you access a nullable value, you will need to be aware of the fact the value
 * could be null. If you are sure its not null, you can "force unwrap it" to treat it as a
 * non-null data type by using a "bang bang" operator like this:
 * val dueData: Date = todoListItemWithDueDate.dueDate!!
 *
 * If you don't use the bang bang, the data type will need to be handled as one that could
 * be null. You may need to use if statements to check it its null or not.
 */

data class TodoListItem(
  // the constructor arguments go here
  val itemName: String,
  // add the additional values a todo list item will need below vvv

  // add todo list item values above ^^^
) {
  // This is the body of the data class.
  // Data classes do not NEED to have a body.
}