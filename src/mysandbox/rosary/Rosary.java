package mysandbox.rosary;

import mysandbox.rosary.parts.Part;
import mysandbox.rosary.parts.Parts;

public class Rosary implements Prayer {
    private final Introduction introduction = new Introduction();
    private final Part part;
    private final Conclusion conclusion = new Conclusion();

    public Rosary(Parts partName) {
        this.part = Part.create(partName);
    }

    public String getPrayer() {
        return  this.getIntroduction().getPrayer() +
                this.getPart().getPrayer() +
                this.getConclusion().getPrayer();
    }

    public Introduction getIntroduction() {
        return this.introduction;
    }

    public Part getPart() {
        return this.part;
    }

    public Conclusion getConclusion() {
        return this.conclusion;
    }

    public void pray() {
        System.out.println(this.getPrayer());
    }
}
