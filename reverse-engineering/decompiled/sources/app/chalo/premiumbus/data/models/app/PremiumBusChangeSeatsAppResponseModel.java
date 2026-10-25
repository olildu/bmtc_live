package app.chalo.premiumbus.data.models.app;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PremiumBusChangeSeatsAppResponseModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusChangeSeatsAppResponseModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7100a;

    public PremiumBusChangeSeatsAppResponseModel(String status) {
        Intrinsics.i(status, "status");
        this.f7100a = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PremiumBusChangeSeatsAppResponseModel) && Intrinsics.d(this.f7100a, ((PremiumBusChangeSeatsAppResponseModel) obj).f7100a);
    }

    public final int hashCode() {
        return this.f7100a.hashCode();
    }

    public final String toString() {
        return vo1.B("PremiumBusChangeSeatsAppResponseModel(status=", this.f7100a, ")");
    }
}
