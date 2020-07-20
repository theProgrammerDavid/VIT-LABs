#regression
x=c(100,200,300,400,500,600,700)
y=c(30,50,60,80,100,110,130)

ft1=lm(y~x)
ft2=lm(x~y)

plot(x,y)
abline(ft1)

plot(y,x)
abline(ft2)

ft1
ft2