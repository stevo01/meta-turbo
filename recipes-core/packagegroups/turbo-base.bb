DESCRIPTION = "My Custom Package Group"

inherit packagegroup

RDEPENDS-${PN}-apps = "\
    dropbear \
    portmap \
    psplash"
