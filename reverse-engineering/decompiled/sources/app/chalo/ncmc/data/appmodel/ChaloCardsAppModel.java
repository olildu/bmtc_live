package app.chalo.ncmc.data.appmodel;

import defpackage.ji;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/ChaloCardsAppModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ChaloCardsAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6136a;
    public final List b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/ChaloCardsAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/appmodel/ChaloCardsAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChaloCardsAppModel> serializer() {
            return ChaloCardsAppModel$$serializer.f6137a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new ji(19)), LazyKt.a(lazyThreadSafetyMode, new ji(20))};
    }

    public ChaloCardsAppModel(List list, int i, List list2) {
        this.f6136a = (i & 1) == 0 ? EmptyList.f17557a : list;
        if ((i & 2) == 0) {
            this.b = EmptyList.f17557a;
        } else {
            this.b = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloCardsAppModel)) {
            return false;
        }
        ChaloCardsAppModel chaloCardsAppModel = (ChaloCardsAppModel) obj;
        return Intrinsics.d(this.f6136a, chaloCardsAppModel.f6136a) && Intrinsics.d(this.b, chaloCardsAppModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6136a.hashCode() * 31);
    }

    public final String toString() {
        return "ChaloCardsAppModel(cards=" + this.f6136a + ", unsyncedRecharges=" + this.b + ")";
    }

    public ChaloCardsAppModel(List cards, List unsyncedRecharges) {
        Intrinsics.i(cards, "cards");
        Intrinsics.i(unsyncedRecharges, "unsyncedRecharges");
        this.f6136a = cards;
        this.b = unsyncedRecharges;
    }
}
