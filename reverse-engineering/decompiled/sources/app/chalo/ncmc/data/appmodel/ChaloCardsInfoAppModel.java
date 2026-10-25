package app.chalo.ncmc.data.appmodel;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/ChaloCardsInfoAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloCardsInfoAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6138a;
    public final List b;

    public ChaloCardsInfoAppModel(ArrayList arrayList, List unsyncedRecharges) {
        Intrinsics.i(unsyncedRecharges, "unsyncedRecharges");
        this.f6138a = arrayList;
        this.b = unsyncedRecharges;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloCardsInfoAppModel)) {
            return false;
        }
        ChaloCardsInfoAppModel chaloCardsInfoAppModel = (ChaloCardsInfoAppModel) obj;
        return this.f6138a.equals(chaloCardsInfoAppModel.f6138a) && Intrinsics.d(this.b, chaloCardsInfoAppModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6138a.hashCode() * 31);
    }

    public final String toString() {
        return "ChaloCardsInfoAppModel(cardsInfo=" + this.f6138a + ", unsyncedRecharges=" + this.b + ")";
    }
}
