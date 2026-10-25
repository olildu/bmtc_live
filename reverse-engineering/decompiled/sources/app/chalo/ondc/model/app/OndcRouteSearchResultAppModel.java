package app.chalo.ondc.model.app;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/model/app/OndcRouteSearchResultAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OndcRouteSearchResultAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6770a;
    public final String b;

    public OndcRouteSearchResultAppModel(List list, String transactionId) {
        Intrinsics.i(transactionId, "transactionId");
        this.f6770a = list;
        this.b = transactionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OndcRouteSearchResultAppModel)) {
            return false;
        }
        OndcRouteSearchResultAppModel ondcRouteSearchResultAppModel = (OndcRouteSearchResultAppModel) obj;
        return Intrinsics.d(this.f6770a, ondcRouteSearchResultAppModel.f6770a) && Intrinsics.d(this.b, ondcRouteSearchResultAppModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6770a.hashCode() * 31);
    }

    public final String toString() {
        return "OndcRouteSearchResultAppModel(routes=" + this.f6770a + ", transactionId=" + this.b + ")";
    }
}
