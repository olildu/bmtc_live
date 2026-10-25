package app.chalo.ondc.model.app;

import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ondc/model/app/MetroJourneyStop;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MetroJourneyStop {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6764a;
    public final String b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ondc/model/app/MetroJourneyStop$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ondc/model/app/MetroJourneyStop;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MetroJourneyStop> serializer() {
            return MetroJourneyStop$$serializer.f6765a;
        }
    }

    public /* synthetic */ MetroJourneyStop(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(MetroJourneyStop$$serializer.f6765a.getDescriptor(), i, 7);
            throw null;
        }
        this.f6764a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroJourneyStop)) {
            return false;
        }
        MetroJourneyStop metroJourneyStop = (MetroJourneyStop) obj;
        return Intrinsics.d(this.f6764a, metroJourneyStop.f6764a) && Intrinsics.d(this.b, metroJourneyStop.b) && Intrinsics.d(this.c, metroJourneyStop.c);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f6764a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return vo1.p(dd.e("MetroJourneyStop(stopId=", this.f6764a, ", stopName=", this.b, ", partnerStopCode="), this.c, ")");
    }

    public MetroJourneyStop(String stopId, String stopName, String str) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        this.f6764a = stopId;
        this.b = stopName;
        this.c = str;
    }
}
