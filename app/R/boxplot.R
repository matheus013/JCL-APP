library(ggplot2)

log <- read.csv("~/JCL-APP/app/csv/log.csv")
mqtt.post <- subset(log,device == 'mqtt-p') 
levels(mqtt.post$device)[levels(mqtt.post$device)=="mqtt-p"] <- 'mqtt'
levels(log$device)[levels(log$device)=="mqtt-p"] <- 'mqtt'
mqtt <- subset(log,device == 'mqtt')
mqtt.get <- subset(mqtt,op == 'get') 
jcl <- subset(log,device == 'jcl') 
jcl.get <- subset(jcl,op == 'get') 
jcl.post <- subset(jcl,op == 'post') 

post.aux <- jcl.post[sample(nrow(jcl.post), nrow(mqtt.post)), ]
post <- rbind(mqtt.post, post.aux)

get.aux <- mqtt.get[sample(nrow(mqtt.get), nrow(jcl.get)), ]
get <- rbind(get.aux, jcl.get)

ggplot(get, aes(x = device, y = log(t))) + geom_boxplot() + ggtitle("Get time") + labs(y = "log(tempo)", x = "Middleware") + theme(axis.text=element_text(size=12), axis.title=element_text(size=14,face="bold"))
ggplot(post, aes(x = device, y = log(t))) + geom_boxplot() + ggtitle("Post time") + labs(y = "log(tempo)", x = "Middleware") + theme(axis.text=element_text(size=12), axis.title=element_text(size=14,face="bold"))

boxplot(log(get$t) ~ get$device, main="Get time", xlab="Middleware", ylab="log(time)", cex.lab=2, cex.axis = 1.5) 
boxplot(log(post$t) ~ post$device, main="Publishing time", xlab="Middleware", ylab="log(time)",cex.lab=2, cex.axis = 1.5) 


gj <- subset(get, device=='jcl')
gm <- subset(get, device=='mqtt')

pj <- subset(post, device=='jcl')
pm <- subset(post, device=='mqtt')


x <- seq(0, 50, length=2602)
y <- dnorm(x, mean=9, sd=8.07)
plot(x, y, type="l", lwd=1)


#hist(gj$t,breaks=seq(0,360,l=36))
#hist(gm$t, breaks=seq(0,70,l=7))
#hist(pj$t,breaks=seq(0,1500,l=50))
#hist(pm$t,breaks=seq(0,600,l=150))

print("means")

print(summary(gj$t))
print(summary(gm$t))
print(summary(pj$t))
print(summary(pm$t))

print("sd")

print(sd(gj$t))
print(sd(gm$t))
print(sd(pj$t))
print(sd(pm$t))
