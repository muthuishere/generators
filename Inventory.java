package graphql.tutorial.eshop.inventory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class Inventory {
    public Long getDealerId() {
        return dealerId;
    }

    public void setDealerId(Long dealerId) {
        this.dealerId = dealerId;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getTotalVehicles() {
        return totalVehicles;
    }

    public void setTotalVehicles(int totalVehicles) {
        this.totalVehicles = totalVehicles;
    }

    public Inventory() {
    }

    public Inventory(Long dealerId, Long vehicleId, int totalVehicles) {
        this.dealerId = dealerId;
        this.vehicleId = vehicleId;
        this.totalVehicles = totalVehicles;
    }

    Long dealerId;
    Long vehicleId;
    int totalVehicles;
}
