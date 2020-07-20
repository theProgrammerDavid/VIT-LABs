p1=0.2
p2=0.15
n1=900
n2=1600
alpha1=0.01
alpha2=0.05



a=1/n1
b=1/n2

P = (n1*p1+n2*p2)/(n1+n2)
z=abs((p1-p2))/sqrt(P*(1-P)*(a+b))

zalpha1=qnorm(1-alpha1/2)
zalpha2=qnorm(1-alpha2/2)