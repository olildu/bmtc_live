package app.chalo.ncmc.ui.cardtransactiondetail;

import app.chalo.ncmc.ui.transactionhistory.CardTransactionTypeUiModel;
import defpackage.cb0;
import defpackage.pk0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardtransactiondetail/CardTransactionDetailViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CardTransactionDetailViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardTransactionTypeUiModel f6315a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final String i;
    public final String j;
    public final boolean k;
    public final String l;

    public CardTransactionDetailViewState(CardTransactionTypeUiModel cardTransactionTypeUiModel, String str, String str2, List list, String str3, String str4, String str5, int i, String str6, String str7, boolean z, String str8) {
        this.f6315a = cardTransactionTypeUiModel;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = i;
        this.i = str6;
        this.j = str7;
        this.k = z;
        this.l = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardTransactionDetailViewState)) {
            return false;
        }
        CardTransactionDetailViewState cardTransactionDetailViewState = (CardTransactionDetailViewState) obj;
        return this.f6315a == cardTransactionDetailViewState.f6315a && Intrinsics.d(this.b, cardTransactionDetailViewState.b) && Intrinsics.d(this.c, cardTransactionDetailViewState.c) && Intrinsics.d(this.d, cardTransactionDetailViewState.d) && Intrinsics.d(this.e, cardTransactionDetailViewState.e) && Intrinsics.d(this.f, cardTransactionDetailViewState.f) && Intrinsics.d(this.g, cardTransactionDetailViewState.g) && this.h == cardTransactionDetailViewState.h && Intrinsics.d(this.i, cardTransactionDetailViewState.i) && Intrinsics.d(this.j, cardTransactionDetailViewState.j) && this.k == cardTransactionDetailViewState.k && Intrinsics.d(this.l, cardTransactionDetailViewState.l);
    }

    public final int hashCode() {
        CardTransactionTypeUiModel cardTransactionTypeUiModel = this.f6315a;
        int iHashCode = (cardTransactionTypeUiModel == null ? 0 : cardTransactionTypeUiModel.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode7 = (((iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.h) * 31;
        String str6 = this.i;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.j;
        int iHashCode9 = (((iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31) + (this.k ? 1231 : 1237)) * 31;
        String str8 = this.l;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardTransactionDetailViewState(transactionType=");
        sb.append(this.f6315a);
        sb.append(", transactionId=");
        sb.append(this.b);
        sb.append(", transactionTime=");
        pk0.w(this.c, ", fareBreakup=", ", categoryName=", sb, this.d);
        cb0.t(sb, this.e, ", productName=", this.f, ", expiryTime=");
        cb0.o(this.h, this.g, ", totalTrips=", ", productType=", sb);
        cb0.t(sb, this.i, ", payableAmount=", this.j, ", isCardExpired=");
        sb.append(this.k);
        sb.append(", paymentMethod=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }
}
