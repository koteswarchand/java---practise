#!/bin/sh
#for loop

#for loop for files
echo $0

for file in $HOME/.#!/usr/bin/env bash
do
echo $file
done

#for loop for iterating
for((i = 0 ; i < 10 ; i++));
do
echo "elelemt : $i"
done

#for loop using user iput

read -p "enter a number" n
for((i = 0 ; i <= 20 ; i++));
do
echo "$n * $i : `expr $n \* $i`"
done

#looping through a strin
<<comments
#while looping through strings, the strings
#are separated by spaces 
comments

greet="hello, good morning" #string 1

for str in $greet;
do
echo $str
done

#string 2
<<comments
#in this string there are no spaces between strings
#which is a single string it wil be printed as it is
comments


name="koteswarchand"
for i in $name;
do
echo $i
done

#for in loop
for var in {1..10};
do
echo $var
done

for i in {1..10..2};
do
echo "$i"
done

#nested loops

for num in {1..10};
do
if [ `expr $num % 2` == 0 ];
then
echo "$num"
fi
done

echo " "
#while loop

a=0
while [ $a -lt 10 ];
do
echo "$a"
a=`expr $a + 1`
done

#nested while loop

i=0
while [ $i -lt 5 ];
do
echo ""
for var in {1..5};
do
echo "$var"
done
i=`expr $i + 1`
done