package app.chalo.metro.data.app;

import defpackage.xs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/data/app/MetroFinalFareAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MetroFinalFareAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5428a;
    public final int b;
    public final List c;

    public MetroFinalFareAppModel(ArrayList arrayList, List termsAndConditions, int i) {
        Intrinsics.i(termsAndConditions, "termsAndConditions");
        this.f5428a = arrayList;
        this.b = i;
        this.c = termsAndConditions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroFinalFareAppModel)) {
            return false;
        }
        MetroFinalFareAppModel metroFinalFareAppModel = (MetroFinalFareAppModel) obj;
        return Intrinsics.d(this.f5428a, metroFinalFareAppModel.f5428a) && this.b == metroFinalFareAppModel.b && Intrinsics.d(this.c, metroFinalFareAppModel.c);
    }

    public final int hashCode() {
        List list = this.f5428a;
        return this.c.hashCode() + ((((list == null ? 0 : list.hashCode()) * 31) + this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetroFinalFareAppModel(fareBreakup=");
        sb.append(this.f5428a);
        sb.append(", finalFare=");
        sb.append(this.b);
        sb.append(", termsAndConditions=");
        return xs.l(sb, this.c, ")");
    }
}
