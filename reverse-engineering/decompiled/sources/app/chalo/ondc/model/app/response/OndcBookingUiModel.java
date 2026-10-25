package app.chalo.ondc.model.app.response;

import defpackage.uf0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/model/app/response/OndcBookingUiModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OndcBookingUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6780a;
    public final OndcFareBreakupUiModel b;
    public final String c;
    public final List d;

    public OndcBookingUiModel(ArrayList arrayList, OndcFareBreakupUiModel ondcFareBreakupUiModel, String str, List termsAndConditions) {
        Intrinsics.i(termsAndConditions, "termsAndConditions");
        this.f6780a = arrayList;
        this.b = ondcFareBreakupUiModel;
        this.c = str;
        this.d = termsAndConditions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OndcBookingUiModel)) {
            return false;
        }
        OndcBookingUiModel ondcBookingUiModel = (OndcBookingUiModel) obj;
        return Intrinsics.d(this.f6780a, ondcBookingUiModel.f6780a) && Intrinsics.d(this.b, ondcBookingUiModel.b) && Intrinsics.d(this.c, ondcBookingUiModel.c) && Intrinsics.d(this.d, ondcBookingUiModel.d);
    }

    public final int hashCode() {
        List list = this.f6780a;
        int iHashCode = (this.b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31)) * 31;
        String str = this.c;
        return this.d.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OndcBookingUiModel(fareBreakup=");
        sb.append(this.f6780a);
        sb.append(", finalFare=");
        sb.append(this.b);
        sb.append(", totalDiscountedAmount=");
        return uf0.p(this.c, ", termsAndConditions=", ")", sb, this.d);
    }
}
