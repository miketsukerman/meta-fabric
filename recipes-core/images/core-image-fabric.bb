SUMMARY = "A very basic fabric image with a terminal"

IMAGE_FEATURES += "splash package-management ssh-server-dropbear hwcodecs"

LICENSE = "MIT"

inherit core-image distro_features_check

REQUIRED_DISTRO_FEATURES = "wayland"

CORE_IMAGE_BASE_INSTALL += "\ 
    weston \ 
    weston-init \
    weston-examples \ 
    "

IMAGE_INSTALL += "\ 
    wayland-examples \
    "