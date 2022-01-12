#arrays

a[0]=1
a[1]=2
a[2]=3
a[3]=4
a[4]=5

echo ${a[0]}
echo ${a[4]}

x=1
y=2

echo $(($x + $y))

echo "addition: `expr $x + $y`"

let "x += 5"
echo $x

let "y += 5"
echo $y

let "sum = $x + $y"
echo $sum

((sum = x + y))
echo $sum
# ==  -eq  <=  -lt  >= -gt
if [ $x -gt $y ];
then
echo "condition success"
else
echo "conditioned failed"
fi

num1=2
num2=3

echo "addition : `expr $num1 + $num2` "

echo "subtraction : `expr $num2 - $num2` "

echo "multiplicaton : `expr $num1 \* $num2` "

echo "division : `expr $num2 / $num1` "

echo "modulous : `expr $num2 % $num1` "

echo "`expr $num1 + $num2`"

echo "`expr $num2 - $num1`"

echo "`expr $num1 \* $num2`"


# assigning the summation of num1 and num2 to another variable

result=`expr $num1 + $num2`
echo "$result"

#assignment  operators
let "num1 += 4"
echo "$num1"







