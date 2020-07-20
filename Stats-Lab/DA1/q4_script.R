
 x=c(249,251,248,252,258,269,271,272,280,275)
 y=c(237,238,236,240,245,255,254,252,258,251)
 
n=length(x)
mx=sum(x)/n
my=sum(y)/n
   
u=x-269
v=y-255
 
u2=u^2
v2=v^2
uv=u*v
   
num = (sum(uv)/n) - mx*my
mu=sum(u)/n
mv=sum(v)/n
   
     
d1= (sum(u2)/n)-mu^2
d2= (sum(v2)/n)-mv^2
   
     
den=sqrt(d1*d2)
num = (sum(uv)/n) - mu*mv
num/den


plot(x,y,main="Per Capita National Income vs Per Capita Comsumer Expenditure", xlab="Per Capita National Income", ylab="Per Capita Consumer Expenditure", col="red")
  
  