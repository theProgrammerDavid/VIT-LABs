x=seq(7.45,32.45,5)
a=c(2,9,29,54,11,5)
b=c(9,11,18,32,27,13)
 
na=sum(a)
nb=sum(b)

mean_a=sum(x*a)/sum(a)
mean_a
   
mean_b=sum(x*b)/sum(b)
mean_b

A=22.45

d=x-A
fd=a*d
  
fdd=a*d*d
var_a= (sum(fdd)/na) - (sum(fd)/na)^2
sd_a=sqrt(var_a)
sd_a

#now for b

fdb=b*d
fddb=fdb*d

var_b = sum(fddb)/nb - (sum(fdb)/nb)^2
sd_b=sqrt(var_b)
sd_b