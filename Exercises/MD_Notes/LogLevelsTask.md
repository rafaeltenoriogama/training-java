Implement the (static) LogLevels.message() method to return a log line's message:

LogLevels.message("[ERROR]: Invalid operation")
// => "Invalid operation"
Any leading or trailing white space should be removed:

LogLevels.message("[WARNING]:  Disk almost full\r\n")
// => "Disk almost full"

Stuck? Reveal Hints
Opens in a modal
Implement the (static) LogLevels.logLevel() method to return a log line's log level, which should be returned in lowercase:

LogLevels.logLevel("[ERROR]: Invalid operation")
// => "error"

Stuck? Reveal Hints
Opens in a modal
Implement the (static) LogLevels.reformat() method that reformats the log line, putting the message first and the log level after it in parentheses:

LogLevels.reformat("[INFO]: Operation completed")
// => "Operation completed (info)"

Stuck? Reveal Hints
