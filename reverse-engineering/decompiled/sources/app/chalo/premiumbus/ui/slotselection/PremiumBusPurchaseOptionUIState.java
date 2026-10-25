package app.chalo.premiumbus.ui.slotselection;

import app.chalo.uistate.text.TextUIState;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusPurchaseOptionUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusPurchaseOptionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusPurchaseOptionUISpecs f7850a;
    public final TextUIState.ChaloTextUIState b;
    public final List c;

    public PremiumBusPurchaseOptionUIState(TextUIState.ChaloTextUIState chaloTextUIState, List availableOptions) {
        PremiumBusPurchaseOptionUISpecs premiumBusPurchaseOptionUISpecs = new PremiumBusPurchaseOptionUISpecs();
        Intrinsics.i(availableOptions, "availableOptions");
        this.f7850a = premiumBusPurchaseOptionUISpecs;
        this.b = chaloTextUIState;
        this.c = availableOptions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusPurchaseOptionUIState)) {
            return false;
        }
        PremiumBusPurchaseOptionUIState premiumBusPurchaseOptionUIState = (PremiumBusPurchaseOptionUIState) obj;
        return Intrinsics.d(this.f7850a, premiumBusPurchaseOptionUIState.f7850a) && Intrinsics.d(this.b, premiumBusPurchaseOptionUIState.b) && Intrinsics.d(this.c, premiumBusPurchaseOptionUIState.c);
    }

    public final int hashCode() {
        int iHashCode = this.f7850a.hashCode() * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.b;
        return this.c.hashCode() + ((iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumBusPurchaseOptionUIState(specs=");
        sb.append(this.f7850a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", availableOptions=");
        return xs.l(sb, this.c, ")");
    }
}
