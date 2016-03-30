# forum
Simple Forum implementalion.

### Task

We need to implement following endpoints:

* ```GET /topicts``` Returns all topics in forum.
* ```GET /topics/{topic_id}/posts``` Returns all posts for specific topic.
* ```POST /topics``` Creates new topic.::
        ```
	{
	  "title" : "String",
	  "text" : "String"
	}
	```
* ```POST /topics/{topic_id}/posts``` Creates new post for spesific topic.::
        ```
	{
	  "text" : "String"
	}
	```
