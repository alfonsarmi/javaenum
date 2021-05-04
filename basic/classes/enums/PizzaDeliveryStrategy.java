package basic.classes.enums;

public enum PizzaDeliveryStrategy {	
	
	EXPRESS {
        @Override
        public void deliver(Pizza2 pz) {
            System.out.println("Pizza will be delivered in express mode");
        }
    },
    NORMAL {
        @Override
        public void deliver(Pizza2 pz) {
            System.out.println("Pizza will be delivered in normal mode");
        }
    };

    public abstract void deliver(Pizza2 pizza2);

}
