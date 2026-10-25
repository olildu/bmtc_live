package app.chalo.ondc.model.app.response;

import defpackage.q7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/model/app/response/OndcBookingAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OndcBookingAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6779a;
    public final List b;
    public final int c;
    public final List d;

    public OndcBookingAppModel(String bookingId, ArrayList arrayList, int i, List termsAndConditions) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(termsAndConditions, "termsAndConditions");
        this.f6779a = bookingId;
        this.b = arrayList;
        this.c = i;
        this.d = termsAndConditions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OndcBookingAppModel)) {
            return false;
        }
        OndcBookingAppModel ondcBookingAppModel = (OndcBookingAppModel) obj;
        return Intrinsics.d(this.f6779a, ondcBookingAppModel.f6779a) && Intrinsics.d(this.b, ondcBookingAppModel.b) && this.c == ondcBookingAppModel.c && Intrinsics.d(this.d, ondcBookingAppModel.d);
    }

    public final int hashCode() {
        int iHashCode = this.f6779a.hashCode() * 31;
        List list = this.b;
        return this.d.hashCode() + ((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.c) * 31);
    }

    public final String toString() {
        StringBuilder sbH = q7.h("OndcBookingAppModel(bookingId=", this.f6779a, ", fareBreakup=", ", finalFare=", this.b);
        sbH.append(this.c);
        sbH.append(", termsAndConditions=");
        sbH.append(this.d);
        sbH.append(")");
        return sbH.toString();
    }
}
