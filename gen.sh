for i in {1..2}
do
    thrift --gen py thrift/example_$i.thrift
    thrift --gen py thrift/utils_$i.thrift
    if [ -d app_$i/gen_py ]; then rm -Rf app_$i/gen_py; fi
    mv gen-py/gen_py app_$i/
    rm -Rf gen-py

    thrift --gen java thrift/example_$i.thrift
    thrift --gen java thrift/utils_$i.thrift
    if [ -d app_$i/gen_java ]; then rm -Rf app_$i/gen_java; fi
    mv gen-java/gen_java app_$i/
    rm -Rf gen-java
done
