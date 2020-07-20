x=seq(150,850,100)
f=c(45,88,146,206,79,52,30,14)
n=length(f)
A=450

mean= sum(f*x)/sum(f)

#non central moments
d=x-A

fd=f*d

u1=sum(fd-A)/n
u2=sum((fd-A)^2)/n
u3=sum((fd-A)^3)/n
u4=sum((fd-A)^4)/n

b1= (u3^2)/u2^3
b2= (u4)/(u2^2)

g1=sqrt(b1)
g2=b2-3

b1
b2
g1
g2