package app.chalo.ncmc.data.appmodel;

import defpackage.z61;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/SemiClosedCardInfo;", "Lapp/chalo/ncmc/data/appmodel/ChaloCardInfo;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SemiClosedCardInfo implements ChaloCardInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new z61(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SemiClosedCardDetailsAppModel f6159a;
    public final List b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/SemiClosedCardInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/appmodel/SemiClosedCardInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SemiClosedCardInfo> serializer() {
            return SemiClosedCardInfo$$serializer.f6160a;
        }
    }

    public /* synthetic */ SemiClosedCardInfo(int i, SemiClosedCardDetailsAppModel semiClosedCardDetailsAppModel, List list) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(SemiClosedCardInfo$$serializer.f6160a.getDescriptor(), i, 3);
            throw null;
        }
        this.f6159a = semiClosedCardDetailsAppModel;
        this.b = list;
    }

    @Override // app.chalo.ncmc.data.appmodel.ChaloCardInfo
    public final ChaloCardDetails a() {
        return this.f6159a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemiClosedCardInfo)) {
            return false;
        }
        SemiClosedCardInfo semiClosedCardInfo = (SemiClosedCardInfo) obj;
        return Intrinsics.d(this.f6159a, semiClosedCardInfo.f6159a) && Intrinsics.d(this.b, semiClosedCardInfo.b);
    }

    public final int hashCode() {
        int iHashCode = this.f6159a.hashCode() * 31;
        List list = this.b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "SemiClosedCardInfo(cardDetails=" + this.f6159a + ", activePasses=" + this.b + ")";
    }

    public SemiClosedCardInfo(SemiClosedCardDetailsAppModel semiClosedCardDetailsAppModel, ArrayList arrayList) {
        this.f6159a = semiClosedCardDetailsAppModel;
        this.b = arrayList;
    }
}
