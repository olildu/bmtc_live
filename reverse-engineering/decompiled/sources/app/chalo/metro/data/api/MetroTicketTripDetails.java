package app.chalo.metro.data.api;

import app.chalo.citydata.data.model.app.StopAppModel;
import defpackage.n21;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/metro/data/api/MetroTicketTripDetails;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MetroTicketTripDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StopAppModel f5420a;
    public final StopAppModel b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/metro/data/api/MetroTicketTripDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/metro/data/api/MetroTicketTripDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MetroTicketTripDetails> serializer() {
            return MetroTicketTripDetails$$serializer.f5421a;
        }
    }

    public /* synthetic */ MetroTicketTripDetails(int i, StopAppModel stopAppModel, StopAppModel stopAppModel2, String str) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(MetroTicketTripDetails$$serializer.f5421a.getDescriptor(), i, 7);
            throw null;
        }
        this.f5420a = stopAppModel;
        this.b = stopAppModel2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroTicketTripDetails)) {
            return false;
        }
        MetroTicketTripDetails metroTicketTripDetails = (MetroTicketTripDetails) obj;
        return Intrinsics.d(this.f5420a, metroTicketTripDetails.f5420a) && Intrinsics.d(this.b, metroTicketTripDetails.b) && Intrinsics.d(this.c, metroTicketTripDetails.c);
    }

    public final int hashCode() {
        int iB = n21.b(this.b, this.f5420a.hashCode() * 31, 31);
        String str = this.c;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetroTicketTripDetails(startStop=");
        sb.append(this.f5420a);
        sb.append(", endStop=");
        sb.append(this.b);
        sb.append(", routeId=");
        return vo1.p(sb, this.c, ")");
    }

    public MetroTicketTripDetails(StopAppModel startStop, StopAppModel endStop) {
        Intrinsics.i(startStop, "startStop");
        Intrinsics.i(endStop, "endStop");
        this.f5420a = startStop;
        this.b = endStop;
        this.c = null;
    }
}
