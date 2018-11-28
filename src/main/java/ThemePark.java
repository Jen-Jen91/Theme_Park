//In java package add a ThemePark package, then have Attractions, Stalls, Interfaces, Visitors packages in there

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<IReviewed> reviewed;

    public ThemePark(String name) {
        this.name = name;
        this.reviewed = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    //Should check if visitor is allowed in Attraction, then check if they have enough money,
    //then remove their money by Attraction price, then return string:
    public String visit(Visitor visitor, Attraction attraction) {
//        if (getAllAllowedFor(visitor).contains(attraction)) {
//            return visitor.getName() + " is visiting " + attraction.getName();
//        }
//        return "Visitor not allowed";

        return visitor.getName() + " is visiting " + attraction.getName();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return this.reviewed;
    }

    public void addReviewed(IReviewed reviewed) {
        this.reviewed.add(reviewed);
    }


    public String reportReviewed(){
        String report = "";
        for (IReviewed reviewedItem : reviewed) {
            report += reviewedItem.getName() + " : " + reviewedItem.getRating() + ", ";
        }
        return report;
    }


    //Below method uses casting - makes reviewedItem implement ISecurity so can use isAllowed method:

    public ArrayList<IReviewed> getAllAllowedFor(Visitor visitor) {
        ArrayList<IReviewed> result = new ArrayList<>();
        for (IReviewed reviewedItem : this.reviewed) {
            if (reviewedItem instanceof ISecurity && (((ISecurity) reviewedItem).isAllowed(visitor))) {
                result.add(reviewedItem);
            }
        }
        return result;
    }

//    public ArrayList<IReviewed> getAllAllowedFor(Visitor visitor) {
//        ArrayList<IReviewed> result = new ArrayList<>();
//        for (IReviewed reviewedItem : this.reviewed) {
//            if (reviewedItem instanceof ISecurity) {
//                ISecurity securityReviewed = (ISecurity) reviewedItem;
//                if (securityReviewed.isAllowed(visitor)) {
//                    result.add(reviewedItem);
//                }
//            }
//        }
//        return result;
//    }


}
