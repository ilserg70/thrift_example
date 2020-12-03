#!/usr/bin/env python
from thrift.transport import TSocket
from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol
from thrift.server import TServer

import time

from gen_py.example import *
from gen_py.example.ttypes import *
from gen_py.utils.ttypes import *

host = "localhost"
port = 9090

# Server implementation
class ExampleHandler:
    # return current time stamp
    def showCurrentTimestamp(self):
        timeStamp = time.time()
        return str(timeStamp)

    # print something to string, wait 10 secs, than print something again
    def asynchronousJob(self):
        print('Assume that this work takes 10 seconds')
        time.sleep(10)
        print('Job finished, but client didn\'t wait for 10 seconds')

    def doCalc(self, a: Number, b: Number):
        print(f"Enter: a = {a.val}, b = {b.val}")
        if b.val == 0:
            raise ServiceException(errorCode = ServiceErrorCode.ZeroDiv, errorMsg = 'Error: division by zero')

        return MathCalc(
            sum = a.val + b.val,
            dif = a.val - b.val,
            mul = a.val * b.val,
            div = a.val / b.val
        )

# set handler to our implementation
handler = ExampleHandler()

processor = Example.Processor(handler)
transport = TSocket.TServerSocket(host, port)
tfactory = TTransport.TBufferedTransportFactory()
pfactory = TBinaryProtocol.TBinaryProtocolFactory()

# set server
server = TServer.TThreadedServer(processor, transport, tfactory, pfactory)

print(f'Starting server on {host}:{port} ...')
server.serve()