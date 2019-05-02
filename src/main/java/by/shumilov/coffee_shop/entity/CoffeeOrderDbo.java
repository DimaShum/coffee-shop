package by.shumilov.coffee_shop.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "COFFEE_ORDER")
public class CoffeeOrderDbo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name = "ORDER_DATE")
    private long orderDate;
    @NotNull
    @Column(name = "CUSTOMER_NAME")
    private String customerName;
    @Column(name = "ORDER_COST")
    private double cost;
    @ManyToMany(mappedBy = "coffeeOrders")
    @EqualsAndHashCode.Exclude
    private List<CoffeeTypeDbo> coffeeTypes;
}
