package app.chalo.ncmc.ui.pendingrecharge.compose;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/pendingrecharge/compose/UnsyncRechargeListForCardUiModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnsyncRechargeListForCardUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6424a;
    public final String b;

    public UnsyncRechargeListForCardUiModel(String str, String totalPendingAmount) {
        Intrinsics.i(totalPendingAmount, "totalPendingAmount");
        this.f6424a = str;
        this.b = totalPendingAmount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnsyncRechargeListForCardUiModel)) {
            return false;
        }
        UnsyncRechargeListForCardUiModel unsyncRechargeListForCardUiModel = (UnsyncRechargeListForCardUiModel) obj;
        return Intrinsics.d(this.f6424a, unsyncRechargeListForCardUiModel.f6424a) && Intrinsics.d(this.b, unsyncRechargeListForCardUiModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6424a.hashCode() * 31);
    }

    public final String toString() {
        return vo1.o("UnsyncRechargeListForCardUiModel(cardNumber=", this.f6424a, ", totalPendingAmount=", this.b, ")");
    }
}
