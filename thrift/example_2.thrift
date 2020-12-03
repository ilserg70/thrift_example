include "utils_2.thrift"

namespace py gen_py.example
namespace java gen_java.example

struct Number {
  1: double val
}

struct MathCalc {
  1: double sum,
  2: double dif,
  3: double mul,
  4: double div
}

exception ServiceException {
    1: utils_2.ServiceErrorCode errorCode,
    2: optional string errorMsg
}

service Example{
    MathCalc doCalc(1: Number a, 2: Number b) throws (1: ServiceException ex);

    // return current time stamp
    string showCurrentTimestamp();
     
    // wait for 10 seconds, but work asynchronously
    oneway void asynchronousJob();
}