package app.chalo.ncmc.data.appmodel;

import defpackage.ji;
import defpackage.xs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/ChaloCardRechargeFareInfoAppModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ChaloCardRechargeFareInfoAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ji(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f6132a;
    public final Long b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/ChaloCardRechargeFareInfoAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/appmodel/ChaloCardRechargeFareInfoAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChaloCardRechargeFareInfoAppModel> serializer() {
            return ChaloCardRechargeFareInfoAppModel$$serializer.f6133a;
        }
    }

    public /* synthetic */ ChaloCardRechargeFareInfoAppModel(int i, Long l, Long l2, List list) {
        if ((i & 1) == 0) {
            this.f6132a = null;
        } else {
            this.f6132a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloCardRechargeFareInfoAppModel)) {
            return false;
        }
        ChaloCardRechargeFareInfoAppModel chaloCardRechargeFareInfoAppModel = (ChaloCardRechargeFareInfoAppModel) obj;
        return Intrinsics.d(this.f6132a, chaloCardRechargeFareInfoAppModel.f6132a) && Intrinsics.d(this.b, chaloCardRechargeFareInfoAppModel.b) && Intrinsics.d(this.c, chaloCardRechargeFareInfoAppModel.c);
    }

    public final int hashCode() {
        Long l = this.f6132a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChaloCardRechargeFareInfoAppModel(minAmount=");
        sb.append(this.f6132a);
        sb.append(", multiplesAllowed=");
        sb.append(this.b);
        sb.append(", suggestedAmounts=");
        return xs.l(sb, this.c, ")");
    }

    public ChaloCardRechargeFareInfoAppModel(Long l, Long l2, ArrayList arrayList) {
        this.f6132a = l;
        this.b = l2;
        this.c = arrayList;
    }
}
