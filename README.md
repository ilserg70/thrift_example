# How to create an Apache Thrift Service – Tutorial

- Link (https://cloudxlab.com/blog/creating-thrift-service/)

### Generate the server and client side code

`./gen.sh`

At this point, you will observe folders `gen_*` in `app_*` directories.

### Experiment

`cd app_1/` or `cd app_1/`

Start service

`python3 server.py`

Run client

`python3 client.py`

It should print:

```
Current time: 1607038375.511294
 	5 + 2 = 7.0
	5 - 2 = 3.0
	5 * 2 = 10.0
	5 / 2 = 2.5
Unexpected error: (<class 'gen_py.example.ttypes.ServiceException'>, ServiceException(errorCode=1, errorMsg='Error: division by zero'), <traceback object at 0x10a74d6e0>)
```
