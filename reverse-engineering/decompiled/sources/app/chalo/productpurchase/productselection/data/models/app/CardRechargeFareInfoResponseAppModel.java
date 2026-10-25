package app.chalo.productpurchase.productselection.data.models.app;

import defpackage.i71;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/CardRechargeFareInfoResponseAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CardRechargeFareInfoResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8630a;
    public final long b;
    public final List c;

    public CardRechargeFareInfoResponseAppModel(List suggestedAmounts, long j, long j2) {
        Intrinsics.i(suggestedAmounts, "suggestedAmounts");
        this.f8630a = j;
        this.b = j2;
        this.c = suggestedAmounts;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardRechargeFareInfoResponseAppModel)) {
            return false;
        }
        CardRechargeFareInfoResponseAppModel cardRechargeFareInfoResponseAppModel = (CardRechargeFareInfoResponseAppModel) obj;
        return this.f8630a == cardRechargeFareInfoResponseAppModel.f8630a && this.b == cardRechargeFareInfoResponseAppModel.b && Intrinsics.d(this.c, cardRechargeFareInfoResponseAppModel.c);
    }

    public final int hashCode() {
        long j = this.f8630a;
        long j2 = this.b;
        return this.c.hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31);
    }

    public final String toString() {
        StringBuilder sbG = i71.g(this.f8630a, "CardRechargeFareInfoResponseAppModel(minAmount=", ", multiplesAllowed=");
        sbG.append(this.b);
        sbG.append(", suggestedAmounts=");
        sbG.append(this.c);
        sbG.append(")");
        return sbG.toString();
    }
}
