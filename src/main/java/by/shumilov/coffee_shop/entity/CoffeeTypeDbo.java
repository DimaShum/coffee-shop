package by.shumilov.coffee_shop.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "COFFEE_TYPE")
public class CoffeeTypeDbo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name = "TYPE_NAME")
    private String name;
    @Column(name = "PRICE")
    private double price;
    @Column(name = "DISABLED")
    private boolean disabled;
    @ManyToMany
    @JoinTable(name = "COFFEE_ORDER_ITEM", joinColumns = {@JoinColumn(name = "TYPE_ID")}, inverseJoinColumns = {@JoinColumn(name = "ORDER_ID")})
    @EqualsAndHashCode.Exclude
    private List<CoffeeOrderDbo> coffeeOrders;
}
