SUMMARY = "meta-turbo test image"

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image
# inherit image

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE-append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "", d)}"

IMAGE_INSTALL += " c-example \
                   cpp-example\ 
                   use-key-sample \
                   generate-key-sample-key \ 
                 "


SRC_URI = "file://${FILE_DIRNAME}/turbo-image-minimal1.wks"

IMAGE_FSTYPES = "wic"

WKS_FILE_DEPENDS = "syslinux syslinux-native dosfstools-native mtools-native gptfdisk-native"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"


inherit image