package app.chalo.ncmc.data.appmodel;

import defpackage.ep;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/ClosedCardInfo;", "Lapp/chalo/ncmc/data/appmodel/ChaloCardInfo;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ClosedCardInfo implements ChaloCardInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ep(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClosedCardDetailsAppModel f6144a;
    public final List b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/ClosedCardInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/appmodel/ClosedCardInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ClosedCardInfo> serializer() {
            return ClosedCardInfo$$serializer.f6145a;
        }
    }

    public /* synthetic */ ClosedCardInfo(int i, ClosedCardDetailsAppModel closedCardDetailsAppModel, List list) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(ClosedCardInfo$$serializer.f6145a.getDescriptor(), i, 3);
            throw null;
        }
        this.f6144a = closedCardDetailsAppModel;
        this.b = list;
    }

    @Override // app.chalo.ncmc.data.appmodel.ChaloCardInfo
    public final ChaloCardDetails a() {
        return this.f6144a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClosedCardInfo)) {
            return false;
        }
        ClosedCardInfo closedCardInfo = (ClosedCardInfo) obj;
        return Intrinsics.d(this.f6144a, closedCardInfo.f6144a) && Intrinsics.d(this.b, closedCardInfo.b);
    }

    public final int hashCode() {
        int iHashCode = this.f6144a.hashCode() * 31;
        List list = this.b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "ClosedCardInfo(cardDetails=" + this.f6144a + ", activePasses=" + this.b + ")";
    }

    public ClosedCardInfo(ClosedCardDetailsAppModel closedCardDetailsAppModel, ArrayList arrayList) {
        this.f6144a = closedCardDetailsAppModel;
        this.b = arrayList;
    }
}
