#!/bin/sh

read dummy
echo $dummy

#-p is used to prompt message while taking input from user
read -p "user name" user
echo "$user"

#-sp is used as a silent mode used in passwords
read -sp "password" pass
echo "$pass"