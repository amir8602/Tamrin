package ir.digipay;

public class HaveId {
    private Long id;

    public HaveId(Long id) {
        this.id = id;
    }

    public HaveId() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Base{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        HaveId b1 = this;
        HaveId b2 = (HaveId) obj;
        if (b1.getId()==b2.getId())
            return true;
        return false;
    }
}
