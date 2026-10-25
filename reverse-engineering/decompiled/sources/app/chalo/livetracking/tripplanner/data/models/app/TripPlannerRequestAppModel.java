package app.chalo.livetracking.tripplanner.data.models.app;

import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.cb0;
import defpackage.cl1;
import defpackage.n21;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerRequestAppModel;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TripPlannerRequestAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new cl1(27)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f4680a;
    public final LatLng b;
    public final ChaloTransitMode c;
    public final long d;
    public final String e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerRequestAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerRequestAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TripPlannerRequestAppModel> serializer() {
            return TripPlannerRequestAppModel$$serializer.f4681a;
        }
    }

    public /* synthetic */ TripPlannerRequestAppModel(int i, LatLng latLng, LatLng latLng2, ChaloTransitMode chaloTransitMode, long j, String str, String str2) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(TripPlannerRequestAppModel$$serializer.f4681a.getDescriptor(), i, 63);
            throw null;
        }
        this.f4680a = latLng;
        this.b = latLng2;
        this.c = chaloTransitMode;
        this.d = j;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripPlannerRequestAppModel)) {
            return false;
        }
        TripPlannerRequestAppModel tripPlannerRequestAppModel = (TripPlannerRequestAppModel) obj;
        return Intrinsics.d(this.f4680a, tripPlannerRequestAppModel.f4680a) && Intrinsics.d(this.b, tripPlannerRequestAppModel.b) && this.c == tripPlannerRequestAppModel.c && this.d == tripPlannerRequestAppModel.d && Intrinsics.d(this.e, tripPlannerRequestAppModel.e) && Intrinsics.d(this.f, tripPlannerRequestAppModel.f);
    }

    public final int hashCode() {
        LatLng latLng = this.f4680a;
        int iHashCode = (latLng == null ? 0 : latLng.hashCode()) * 31;
        LatLng latLng2 = this.b;
        int iC = n21.c(this.c, (iHashCode + (latLng2 == null ? 0 : latLng2.hashCode())) * 31, 31);
        long j = this.d;
        int i = (iC + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.e;
        int iHashCode2 = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TripPlannerRequestAppModel(fromLatLng=");
        sb.append(this.f4680a);
        sb.append(", toLatLng=");
        sb.append(this.b);
        sb.append(", transitMode=");
        sb.append(this.c);
        sb.append(", startTimeMillis=");
        sb.append(this.d);
        cb0.t(sb, ", startStopId=", this.e, ", endStopId=", this.f);
        sb.append(")");
        return sb.toString();
    }

    public TripPlannerRequestAppModel(LatLng latLng, LatLng latLng2, ChaloTransitMode transitMode, long j, String str, String str2) {
        Intrinsics.i(transitMode, "transitMode");
        this.f4680a = latLng;
        this.b = latLng2;
        this.c = transitMode;
        this.d = j;
        this.e = str;
        this.f = str2;
    }
}
