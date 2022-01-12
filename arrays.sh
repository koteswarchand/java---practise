#!/bin/sh

#arrays
echo "Arrays"

a[0]=1;
a[1]=2;
a[2]=3;
a[3]=4;
a[4]=5;

echo ${a[0]}
echo ${a[1]}
echo ${a[2]}
echo ${a[3]}
echo ${a[4]}

#arithemetic operators
x=8
y=9

echo $(($x + $y)) #addition

echo $(($y - $x)) #subtracion

echo $(($x * $y)) #multipplication4

echo $(($x / $y)) #division

echo $(($x % $y)) #modulous

echo $(($x ** $y)) #to the power

#assignment operators 

let "x += 10"
echo $x

let "y += 10"
echo $y

let "x -= 2"
echo $x

let "y -= 3"
echo $y

let "y *= 4"
echo $y

let "sum = x + y" #assiging result to another variable
echo $sum

num1=10;
num2=20;
((result = num1 + num2)) #assigining result to another variable
echo $result

num3=4
num4=6
((op = num3 + num4))
echo $op

num5=3
num6=2
((res = num5 + num6))
echo $res


if [ $num1 != $num2 ]
then
   echo "num1 is not equal to num2"
fi

if [ $num1 -gt $num2 ]
then
  echo "num1 is greater"
fi

if [ "hello" == "hello" ];
then
echo "true"
fi
#if else in bash
if [ $num1 -eq $num2 ];
then
echo "equal"
else
echo "not equal"
fi

if [ $num1 -lt $num2 ];
then
echo "not equal"
else
echo "equal"
fi

#using -eq instead of ==
if [ 10 -eq 10 ] ;
then 
echo "equal"
else
echo "not equal"
fi

#using && and ||
if [ $num1 -lt 10 ] || [ $num1 -gt 10 ];
then
echo "Condition passed"
else
echo "condition failed"
fi

if [ $num1 -gt 5 ] && [ $num1 -eq 10 ];
then
echo "Condition success"
else
echo "condition failed"
fi

#if elif else

if [ $num1 -gt 5 ];
then
echo "condition success"
elif [ $num1 -lt 10 ];
then
echo "condition 2 success"
else
echo "condition failed"
fi

if [ $num2 -gt 5 ];
then
echo "condition 1 success"
elif [ $num2 -lt 20 ];
then
echo "condition 2 success"
else
echo "conditions failed"
fi