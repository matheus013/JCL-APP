s310 <- read.csv(file = "jcl-apps/sensor/s310.csv", stringsAsFactors = FALSE)
s7 <- read.csv(file = "jcl-apps/sensor/s7.csv", stringsAsFactors = FALSE)
dt <- merge(s310, s7, all = TRUE)
library(lubridate)
dt$date <- ymd_hms(dt$date)

dt$time <- format(as.POSIXct(dt$date) ,format = "%H:%M:%S") 
dt$year <- format(as.POSIXct(dt$date) ,format = "%y") 

dt$year <- as.integer(dt$year)
dt <- subset(dt, dt$year == 18)
library(chron)
dt$time <- chron(time=dt$time)

dt <- subset(dt, dt$intersema_temp > 8)
dt <- subset(dt, dt$intersema_press > 500)

# plot(dt$sensirion_temp ~ dt$time)

