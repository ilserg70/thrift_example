#!/usr/bin/env python
from thrift import Thrift
from thrift.transport import TSocket
from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol

import sys

from gen_py.example import *
from gen_py.example.ttypes import *
from gen_py.utils.ttypes import *

host = "localhost"
port = 9090

try:

    # Init thrift connection and protocol handlers
    transport = TSocket.TSocket( host , port)
    transport = TTransport.TBufferedTransport(transport)
    protocol = TBinaryProtocol.TBinaryProtocol(transport)

    # Set client to our Example
    client = Example.Client(protocol)

    # Connect to server
    transport.open()

    # Run showCurrentTimestamp() method on server
    currentTime = client.showCurrentTimestamp()
    print(f"Current time: {currentTime}")

    # Assume that you have a job which takes some time
    # but client sholdn't have to wait for job to finish
    # ie. Creating 10 thumbnails and putting these files to separate folders
    #client.asynchronousJob()

    def calc_res(a, b):
        try:
            r = client.doCalc(Number(val = a), Number(val = b))
            print("\t{} + {} = {}".format(a, b, r.sum))
            print("\t{} - {} = {}".format(a, b, r.dif))
            print("\t{} * {} = {}".format(a, b, r.mul))
            print("\t{} / {} = {}".format(a, b, r.div))
        except Exception:
            print("Unexpected error:", sys.exc_info())

    calc_res(a = 5, b = 2)
    calc_res(a = 4, b = 0)



    # Close connection
    transport.close()

except Thrift.TException as tx:
    print('Something went wrong : %s' % (tx.message))