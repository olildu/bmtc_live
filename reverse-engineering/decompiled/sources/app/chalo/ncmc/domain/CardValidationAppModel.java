package app.chalo.ncmc.domain;

import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/CardValidationAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CardValidationAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardValidationStatus f6216a;
    public final long b;
    public final String c;

    public CardValidationAppModel(CardValidationStatus status, long j, String str) {
        Intrinsics.i(status, "status");
        this.f6216a = status;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardValidationAppModel)) {
            return false;
        }
        CardValidationAppModel cardValidationAppModel = (CardValidationAppModel) obj;
        return this.f6216a == cardValidationAppModel.f6216a && this.b == cardValidationAppModel.b && Intrinsics.d(this.c, cardValidationAppModel.c);
    }

    public final int hashCode() {
        int iHashCode = this.f6216a.hashCode() * 31;
        long j = this.b;
        return this.c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardValidationAppModel(status=");
        sb.append(this.f6216a);
        sb.append(", rechargeLimit=");
        sb.append(this.b);
        return z40.h(sb, ", message=", this.c, ")");
    }
}
