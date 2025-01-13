#!/bin/bash

mvn compile
if [ $? -ne 0 ];
then
    exit 1
fi

mvn package
