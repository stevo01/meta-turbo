#!/bin/bash

set -x

SOURCE_MIRROW_PATH="/var/data/yocto/downloads"
rm -rf $SOURCE_MIRROW_PATH/*
du -sh $SOURCE_MIRROW_PATH
