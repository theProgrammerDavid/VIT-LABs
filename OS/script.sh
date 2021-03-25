rows=0
echo "Enter lines"
read rows

for((i=1; i<=rows; i++))
    do
    odd=1
    even=2
    for((j=1; j<=(2*i-1); j++))
        do
        if [ $(($i % 2)) -eq 0 ]
        then
        
            echo -n "$odd "
            odd=$((odd + 2))

        else
            
            echo -n "$even "
            even=$((even + 2))
        fi
        done
    echo
done