package app.chalo.models.productbooking;

import defpackage.cb0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/productbooking/SuperPassPurchaseStopsInfo;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassPurchaseStopsInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5665a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/productbooking/SuperPassPurchaseStopsInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/productbooking/SuperPassPurchaseStopsInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SuperPassPurchaseStopsInfo> serializer() {
            return SuperPassPurchaseStopsInfo$$serializer.f5666a;
        }
    }

    public /* synthetic */ SuperPassPurchaseStopsInfo(int i, String str, String str2, String str3, String str4, String str5) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(SuperPassPurchaseStopsInfo$$serializer.f5666a.getDescriptor(), i, 31);
            throw null;
        }
        this.f5665a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassPurchaseStopsInfo)) {
            return false;
        }
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo = (SuperPassPurchaseStopsInfo) obj;
        return Intrinsics.d(this.f5665a, superPassPurchaseStopsInfo.f5665a) && Intrinsics.d(this.b, superPassPurchaseStopsInfo.b) && Intrinsics.d(this.c, superPassPurchaseStopsInfo.c) && Intrinsics.d(this.d, superPassPurchaseStopsInfo.d) && Intrinsics.d(this.e, superPassPurchaseStopsInfo.e);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(this.f5665a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SuperPassPurchaseStopsInfo(startStopName=", this.f5665a, ", startStopId=", this.b, ", endStopName=");
        cb0.t(sbE, this.c, ", endStopId=", this.d, ", routeId=");
        return vo1.p(sbE, this.e, ")");
    }

    public SuperPassPurchaseStopsInfo(String startStopName, String startStopId, String endStopName, String endStopId, String str) {
        Intrinsics.i(startStopName, "startStopName");
        Intrinsics.i(startStopId, "startStopId");
        Intrinsics.i(endStopName, "endStopName");
        Intrinsics.i(endStopId, "endStopId");
        this.f5665a = startStopName;
        this.b = startStopId;
        this.c = endStopName;
        this.d = endStopId;
        this.e = str;
    }
}
