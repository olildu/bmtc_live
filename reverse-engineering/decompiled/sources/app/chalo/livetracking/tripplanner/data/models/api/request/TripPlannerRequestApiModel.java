package app.chalo.livetracking.tripplanner.data.models.api.request;

import defpackage.cb0;
import defpackage.n21;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/api/request/TripPlannerRequestApiModel;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TripPlannerRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f4649a;
    public final Double b;
    public final Double c;
    public final Double d;
    public final String e;
    public final long f;
    public final String g;
    public final String h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/api/request/TripPlannerRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/api/request/TripPlannerRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TripPlannerRequestApiModel> serializer() {
            return TripPlannerRequestApiModel$$serializer.f4650a;
        }
    }

    public /* synthetic */ TripPlannerRequestApiModel(int i, Double d, Double d2, Double d3, Double d4, String str, long j, String str2, String str3) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.b(TripPlannerRequestApiModel$$serializer.f4650a.getDescriptor(), i, 255);
            throw null;
        }
        this.f4649a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = str;
        this.f = j;
        this.g = str2;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripPlannerRequestApiModel)) {
            return false;
        }
        TripPlannerRequestApiModel tripPlannerRequestApiModel = (TripPlannerRequestApiModel) obj;
        return Intrinsics.d(this.f4649a, tripPlannerRequestApiModel.f4649a) && Intrinsics.d(this.b, tripPlannerRequestApiModel.b) && Intrinsics.d(this.c, tripPlannerRequestApiModel.c) && Intrinsics.d(this.d, tripPlannerRequestApiModel.d) && Intrinsics.d(this.e, tripPlannerRequestApiModel.e) && this.f == tripPlannerRequestApiModel.f && Intrinsics.d(this.g, tripPlannerRequestApiModel.g) && Intrinsics.d(this.h, tripPlannerRequestApiModel.h);
    }

    public final int hashCode() {
        Double d = this.f4649a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.c;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.d;
        int iE = nf1.e((iHashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31, 31, this.e);
        long j = this.f;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.g;
        int iHashCode4 = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TripPlannerRequestApiModel(fromLat=");
        sb.append(this.f4649a);
        sb.append(", fromLon=");
        sb.append(this.b);
        sb.append(", toLat=");
        sb.append(this.c);
        sb.append(", toLon=");
        sb.append(this.d);
        sb.append(", transitMode=");
        n21.p(this.f, this.e, ", startTimeMillis=", sb);
        cb0.t(sb, ", fromStopId=", this.g, ", toStopId=", this.h);
        sb.append(")");
        return sb.toString();
    }

    public TripPlannerRequestApiModel(Double d, Double d2, Double d3, Double d4, String transitMode, long j, String str, String str2) {
        Intrinsics.i(transitMode, "transitMode");
        this.f4649a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = transitMode;
        this.f = j;
        this.g = str;
        this.h = str2;
    }
}
