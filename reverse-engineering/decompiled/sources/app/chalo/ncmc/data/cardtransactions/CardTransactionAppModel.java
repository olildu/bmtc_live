package app.chalo.ncmc.data.cardtransactions;

import defpackage.xs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardTransactionAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CardTransactionAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6183a;
    public final int b;
    public final List c;

    public CardTransactionAppModel(ArrayList arrayList, List unsyncedRecharges, int i) {
        Intrinsics.i(unsyncedRecharges, "unsyncedRecharges");
        this.f6183a = arrayList;
        this.b = i;
        this.c = unsyncedRecharges;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardTransactionAppModel)) {
            return false;
        }
        CardTransactionAppModel cardTransactionAppModel = (CardTransactionAppModel) obj;
        return this.f6183a.equals(cardTransactionAppModel.f6183a) && this.b == cardTransactionAppModel.b && Intrinsics.d(this.c, cardTransactionAppModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f6183a.hashCode() * 31) + this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardTransactionAppModel(transactions=");
        sb.append(this.f6183a);
        sb.append(", totalPages=");
        sb.append(this.b);
        sb.append(", unsyncedRecharges=");
        return xs.l(sb, this.c, ")");
    }
}
