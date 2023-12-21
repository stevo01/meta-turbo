#!/bin/bash

set -x

SOURCE_MIRROW_PATH="/var/data/yocto/downloads/"
SSCACHE_MIRROW_PATH="/var/data/yocto/sstate-cache/"

mkdir -p $SOURCE_MIRROW_PATH
mkdir -p $SSCACHE_MIRROW_PATH

# https://low-level.wiki/mirrors/yocto_sources.html

find ./downloads -name "*bad-checksum*" -exec rm -f {} \;
rm -rf ./downloads/git2
rm -rf ./downloads/svn
find ./downloads -name "*.done" -exec rm -f {} \;

cp -r ./downloads/* $SOURCE_MIRROW_PATH
# cp -r ./sstate-cache/* $SSCACHE_MIRROW_PATH 

chmod a+r $SOURCE_MIRROW_PATH -R
chmod a+r $SSCACHE_MIRROW_PATH -R
