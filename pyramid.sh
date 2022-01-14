#!/bin/sh
read -p "enter a string: " name
for((j = 0 ; j < ${#name} ; j++));
do
for((k = 0 ; k <= j ; k++));
do
echo  -n "${name:$k:1}"

done
echo ""
done

for((j = 0 ; j < ${#name} ; j++));
do
for((k = 0 ; k < ${#name} - j ; k++));
do
echo  -n "${name:$k:1}"

done
echo ""
done