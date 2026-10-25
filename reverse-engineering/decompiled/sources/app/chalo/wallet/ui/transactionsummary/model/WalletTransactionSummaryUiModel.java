package app.chalo.wallet.ui.transactionsummary.model;

import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/transactionsummary/model/WalletTransactionSummaryUiModel;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletTransactionSummaryUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10898a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final WalletTransactionType i;
    public final WalletTransactionStatusForIcon j;

    public WalletTransactionSummaryUiModel(String transactionAmount, String transactionDate, String orderId, String transactionId, String modeOfPayment, String productName, boolean z, String transactionStatus, WalletTransactionType transactionType, WalletTransactionStatusForIcon walletTransactionStatusForIcon) {
        Intrinsics.i(transactionAmount, "transactionAmount");
        Intrinsics.i(transactionDate, "transactionDate");
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(modeOfPayment, "modeOfPayment");
        Intrinsics.i(productName, "productName");
        Intrinsics.i(transactionStatus, "transactionStatus");
        Intrinsics.i(transactionType, "transactionType");
        Intrinsics.i(walletTransactionStatusForIcon, "walletTransactionStatusForIcon");
        this.f10898a = transactionAmount;
        this.b = transactionDate;
        this.c = orderId;
        this.d = transactionId;
        this.e = modeOfPayment;
        this.f = productName;
        this.g = z;
        this.h = transactionStatus;
        this.i = transactionType;
        this.j = walletTransactionStatusForIcon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletTransactionSummaryUiModel)) {
            return false;
        }
        WalletTransactionSummaryUiModel walletTransactionSummaryUiModel = (WalletTransactionSummaryUiModel) obj;
        return Intrinsics.d(this.f10898a, walletTransactionSummaryUiModel.f10898a) && Intrinsics.d(this.b, walletTransactionSummaryUiModel.b) && Intrinsics.d(this.c, walletTransactionSummaryUiModel.c) && Intrinsics.d(this.d, walletTransactionSummaryUiModel.d) && Intrinsics.d(this.e, walletTransactionSummaryUiModel.e) && Intrinsics.d(this.f, walletTransactionSummaryUiModel.f) && this.g == walletTransactionSummaryUiModel.g && Intrinsics.d(this.h, walletTransactionSummaryUiModel.h) && this.i == walletTransactionSummaryUiModel.i && this.j == walletTransactionSummaryUiModel.j;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + nf1.e((nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.f10898a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f) + (this.g ? 1231 : 1237)) * 31, 31, this.h)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("WalletTransactionSummaryUiModel(transactionAmount=", this.f10898a, ", transactionDate=", this.b, ", orderId=");
        cb0.t(sbE, this.c, ", transactionId=", this.d, ", modeOfPayment=");
        cb0.t(sbE, this.e, ", productName=", this.f, ", isQuickPayAndIsInProcessingState=");
        pk0.x(", transactionStatus=", this.h, ", transactionType=", sbE, this.g);
        sbE.append(this.i);
        sbE.append(", walletTransactionStatusForIcon=");
        sbE.append(this.j);
        sbE.append(")");
        return sbE.toString();
    }

    public /* synthetic */ WalletTransactionSummaryUiModel(String str, String str2, String str3, String str4, String str5, boolean z, String str6, WalletTransactionType walletTransactionType, WalletTransactionStatusForIcon walletTransactionStatusForIcon) {
        this(str, str2, str3, str4, str5, "", z, str6, walletTransactionType, walletTransactionStatusForIcon);
    }
}
