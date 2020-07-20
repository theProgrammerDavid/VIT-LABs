lambda = 2.7

max_4_calls_in_minute = sum(dpois(0:4,lambda))
min_2_calls_in_minute = sum(ppois(1,lambda));

min_10_calls_in_5_min = 1-(ppois(10,lambda*5))

x=seq(0,10,1)

pdf=exp(-lambda)*(lambda^(x))/(factorial(x))

plot(x,pdf,type="h", lwd=3, col="blue", main="PLOT")
max_4_calls_in_minute
min_2_calls_in_minute