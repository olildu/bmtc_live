package app.chalo.premiumbus.ui.faredetails.contract;

import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import defpackage.q7;
import defpackage.r30;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsSharedContext;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusFareDetailsSharedContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7607a;
    public final List b;
    public final FareDetailsData c;
    public final PremiumBusFareDetailsEntryContext d;
    public final String e;

    public PremiumBusFareDetailsSharedContext(String tripId, List selectedSeats, FareDetailsData fareDetailsData, PremiumBusFareDetailsEntryContext entryContext, String str) {
        Intrinsics.i(tripId, "tripId");
        Intrinsics.i(selectedSeats, "selectedSeats");
        Intrinsics.i(fareDetailsData, "fareDetailsData");
        Intrinsics.i(entryContext, "entryContext");
        this.f7607a = tripId;
        this.b = selectedSeats;
        this.c = fareDetailsData;
        this.d = entryContext;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusFareDetailsSharedContext)) {
            return false;
        }
        PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext = (PremiumBusFareDetailsSharedContext) obj;
        return Intrinsics.d(this.f7607a, premiumBusFareDetailsSharedContext.f7607a) && Intrinsics.d(this.b, premiumBusFareDetailsSharedContext.b) && Intrinsics.d(this.c, premiumBusFareDetailsSharedContext.c) && this.d == premiumBusFareDetailsSharedContext.d && Intrinsics.d(this.e, premiumBusFareDetailsSharedContext.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + r30.b(this.f7607a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbH = q7.h("PremiumBusFareDetailsSharedContext(tripId=", this.f7607a, ", selectedSeats=", ", fareDetailsData=", this.b);
        sbH.append(this.c);
        sbH.append(", entryContext=");
        sbH.append(this.d);
        sbH.append(", deeplinkAttribution=");
        return vo1.p(sbH, this.e, ")");
    }
}
