package app.chalo.premiumbus.ui.stopdetails;

import defpackage.nf1;
import defpackage.to0;
import defpackage.vo1;
import java.util.List;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PBStopDetailsNavAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PBStopDetailsNavAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new to0(2)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7938a;
    public final String b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PBStopDetailsNavAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/ui/stopdetails/PBStopDetailsNavAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PBStopDetailsNavAppModel> serializer() {
            return PBStopDetailsNavAppModel$$serializer.f7939a;
        }
    }

    public PBStopDetailsNavAppModel(String pickupStopId, String dropStopId, List routeIds) {
        Intrinsics.i(routeIds, "routeIds");
        Intrinsics.i(pickupStopId, "pickupStopId");
        Intrinsics.i(dropStopId, "dropStopId");
        this.f7938a = routeIds;
        this.b = pickupStopId;
        this.c = dropStopId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBStopDetailsNavAppModel)) {
            return false;
        }
        PBStopDetailsNavAppModel pBStopDetailsNavAppModel = (PBStopDetailsNavAppModel) obj;
        return Intrinsics.d(this.f7938a, pBStopDetailsNavAppModel.f7938a) && Intrinsics.d(this.b, pBStopDetailsNavAppModel.b) && Intrinsics.d(this.c, pBStopDetailsNavAppModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f7938a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PBStopDetailsNavAppModel(routeIds=");
        sb.append(this.f7938a);
        sb.append(", pickupStopId=");
        sb.append(this.b);
        sb.append(", dropStopId=");
        return vo1.p(sb, this.c, ")");
    }

    public /* synthetic */ PBStopDetailsNavAppModel(List list, int i, String str, String str2) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(PBStopDetailsNavAppModel$$serializer.f7939a.getDescriptor(), i, 7);
            throw null;
        }
        this.f7938a = list;
        this.b = str;
        this.c = str2;
    }
}
