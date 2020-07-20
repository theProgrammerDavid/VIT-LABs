x=seq(17,62,5)
freq=c(31,47,59,78,104,113,81,60,52,25)

data.frame(x,freq)
mean=sum(x*freq)/sum(freq)



cl=cumsum(freq)
n=sum(freq)

ml=min(which(cl>=n/2))

h=5
l=x[ml]-h/2
f=freq[ml]
c=cl[ml-1]

median=l+(((n/2)-c)/f)*h


m=which(freq==max(freq))
fm=freq[m]

f1=freq[m-1]
f2=freq[m+1]

l=x[m] -h/2

mode= l + ((fm-f1)/(2*fm-f1-f2))*h

mean
median
mode