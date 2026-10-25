package app.chalo.home.data.model.app.response;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/data/model/app/response/CorridorRouteInfoAppModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CorridorRouteInfoAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2961a;
    public final String b;
    public final String c;
    public final Long d;
    public final Long e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/model/app/response/CorridorRouteInfoAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/model/app/response/CorridorRouteInfoAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CorridorRouteInfoAppModel> serializer() {
            return CorridorRouteInfoAppModel$$serializer.f2962a;
        }
    }

    public /* synthetic */ CorridorRouteInfoAppModel(int i, String str, String str2, String str3, Long l, Long l2, String str4) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(CorridorRouteInfoAppModel$$serializer.f2962a.getDescriptor(), i, 63);
            throw null;
        }
        this.f2961a = str;
        this.b = str2;
        this.c = str3;
        this.d = l;
        this.e = l2;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CorridorRouteInfoAppModel)) {
            return false;
        }
        CorridorRouteInfoAppModel corridorRouteInfoAppModel = (CorridorRouteInfoAppModel) obj;
        return Intrinsics.d(this.f2961a, corridorRouteInfoAppModel.f2961a) && Intrinsics.d(this.b, corridorRouteInfoAppModel.b) && Intrinsics.d(this.c, corridorRouteInfoAppModel.c) && Intrinsics.d(this.d, corridorRouteInfoAppModel.d) && Intrinsics.d(this.e, corridorRouteInfoAppModel.e) && Intrinsics.d(this.f, corridorRouteInfoAppModel.f);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f2961a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.d;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        return this.f.hashCode() + ((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("CorridorRouteInfoAppModel(name=", this.f2961a, ", routeDisplayName=", this.b, ", via=");
        cb0.r(this.d, this.c, ", firstDepartureTime=", ", lastDepartureTime=", sbE);
        sbE.append(this.e);
        sbE.append(", routeId=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }

    public CorridorRouteInfoAppModel(Long l, Long l2, String str, String str2, String str3, String str4) {
        this.f2961a = str;
        this.b = str2;
        this.c = str3;
        this.d = l;
        this.e = l2;
        this.f = str4;
    }
}
