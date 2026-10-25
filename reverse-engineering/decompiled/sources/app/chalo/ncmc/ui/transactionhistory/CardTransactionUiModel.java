package app.chalo.ncmc.ui.transactionhistory;

import app.chalo.ncmc.data.cardtransactions.CardTicketPaymentMode;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionUiModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CardTransactionUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardTransactionTypeUiModel f6439a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final CardTicketPaymentMode f;

    public CardTransactionUiModel(CardTransactionTypeUiModel cardTransactionType, String transactionId, long j, String transactionTimeString, String str, CardTicketPaymentMode cardTicketPaymentMode) {
        Intrinsics.i(cardTransactionType, "cardTransactionType");
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(transactionTimeString, "transactionTimeString");
        this.f6439a = cardTransactionType;
        this.b = transactionId;
        this.c = j;
        this.d = transactionTimeString;
        this.e = str;
        this.f = cardTicketPaymentMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardTransactionUiModel)) {
            return false;
        }
        CardTransactionUiModel cardTransactionUiModel = (CardTransactionUiModel) obj;
        return this.f6439a == cardTransactionUiModel.f6439a && Intrinsics.d(this.b, cardTransactionUiModel.b) && this.c == cardTransactionUiModel.c && Intrinsics.d(this.d, cardTransactionUiModel.d) && Intrinsics.d(this.e, cardTransactionUiModel.e) && this.f == cardTransactionUiModel.f;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f6439a.hashCode() * 31, 31, this.b);
        long j = this.c;
        int iE2 = nf1.e((iE + ((int) (j ^ (j >>> 32)))) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        CardTicketPaymentMode cardTicketPaymentMode = this.f;
        return iHashCode + (cardTicketPaymentMode != null ? cardTicketPaymentMode.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardTransactionUiModel(cardTransactionType=");
        sb.append(this.f6439a);
        sb.append(", transactionId=");
        sb.append(this.b);
        sb.append(", transactionTime=");
        dd.k(this.c, ", transactionTimeString=", this.d, sb);
        sb.append(", amount=");
        sb.append(this.e);
        sb.append(", paymentModeForTicket=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
