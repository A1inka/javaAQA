package homework5.task3;

import java.math.BigDecimal;

public class Park {

    public class Attraction {
        private String name;
        private String workingHours;
        private BigDecimal price;

        public Attraction(String name, String workingHours, BigDecimal price) {
            setName(name);
            setWorkingHours(workingHours);
            setPrice(price);
        }

        public String getName() {
            return name;
        }

        public String getWorkingHours() {
            return workingHours;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setWorkingHours(String workingHours) {
            if (workingHours.matches("^(?:[01]\\d|2[0-3]):[0-5]\\d\\s*-\\s*(?:[01]\\d|2[0-3]):[0-5]\\d$")) {
                this.workingHours = workingHours;
            }
            else {
                throw new IllegalArgumentException("Некорректный формат времени");
            }
        }

        public void setPrice(BigDecimal price) {
            if (price.compareTo(BigDecimal.ZERO) > 0) {
                this.price = price;
            }
            else {
                throw new IllegalArgumentException("Некорректно введена стоимость");
            }
        }
    }
}