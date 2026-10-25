package app.chalo.productbooking.common.data.models.app;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.a30;
import defpackage.dd;
import defpackage.nf1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/FareDetailsRouteData;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class FareDetailsRouteData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a30(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8187a;
    public final String b;
    public final ChaloTransitMode c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/FareDetailsRouteData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/app/FareDetailsRouteData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<FareDetailsRouteData> serializer() {
            return FareDetailsRouteData$$serializer.f8188a;
        }
    }

    public /* synthetic */ FareDetailsRouteData(int i, String str, String str2, ChaloTransitMode chaloTransitMode) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(FareDetailsRouteData$$serializer.f8188a.getDescriptor(), i, 7);
            throw null;
        }
        this.f8187a = str;
        this.b = str2;
        this.c = chaloTransitMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareDetailsRouteData)) {
            return false;
        }
        FareDetailsRouteData fareDetailsRouteData = (FareDetailsRouteData) obj;
        return Intrinsics.d(this.f8187a, fareDetailsRouteData.f8187a) && Intrinsics.d(this.b, fareDetailsRouteData.b) && this.c == fareDetailsRouteData.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f8187a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("FareDetailsRouteData(routeName=", this.f8187a, ", routeId=", this.b, ", transitMode=");
        sbE.append(this.c);
        sbE.append(")");
        return sbE.toString();
    }

    public FareDetailsRouteData(String routeName, String routeId, ChaloTransitMode transitMode) {
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(transitMode, "transitMode");
        this.f8187a = routeName;
        this.b = routeId;
        this.c = transitMode;
    }
}
