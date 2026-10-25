package app.chalo.wallet.ui.model;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
import defpackage.cb0;
import defpackage.dd;
import defpackage.gp1;
import defpackage.nf1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/wallet/ui/model/WalletTransactionUiModel;", "", "Companion", "$serializer", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class WalletTransactionUiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] k = {null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new gp1(5)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10884a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final WalletTransactionType h;
    public final boolean i;
    public final String j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/wallet/ui/model/WalletTransactionUiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/wallet/ui/model/WalletTransactionUiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<WalletTransactionUiModel> serializer() {
            return WalletTransactionUiModel$$serializer.f10885a;
        }
    }

    public /* synthetic */ WalletTransactionUiModel(int i, String str, String str2, String str3, String str4, String str5, String str6, long j, WalletTransactionType walletTransactionType, boolean z, String str7) {
        if (1022 != (i & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED)) {
            PluginExceptionsKt.b(WalletTransactionUiModel$$serializer.f10885a.getDescriptor(), i, AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f10884a = null;
        } else {
            this.f10884a = str;
        }
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = j;
        this.h = walletTransactionType;
        this.i = z;
        this.j = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletTransactionUiModel)) {
            return false;
        }
        WalletTransactionUiModel walletTransactionUiModel = (WalletTransactionUiModel) obj;
        return Intrinsics.d(this.f10884a, walletTransactionUiModel.f10884a) && Intrinsics.d(this.b, walletTransactionUiModel.b) && Intrinsics.d(this.c, walletTransactionUiModel.c) && Intrinsics.d(this.d, walletTransactionUiModel.d) && Intrinsics.d(this.e, walletTransactionUiModel.e) && Intrinsics.d(this.f, walletTransactionUiModel.f) && this.g == walletTransactionUiModel.g && this.h == walletTransactionUiModel.h && this.i == walletTransactionUiModel.i && Intrinsics.d(this.j, walletTransactionUiModel.j);
    }

    public final int hashCode() {
        String str = this.f10884a;
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        long j = this.g;
        return this.j.hashCode() + ((((this.h.hashCode() + ((iE + ((int) (j ^ (j >>> 32)))) * 31)) * 31) + (this.i ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("WalletTransactionUiModel(transactionId=", this.f10884a, ", transactionTitle=", this.b, ", orderId=");
        cb0.t(sbE, this.c, ", amount=", this.d, ", transactionStatus=");
        cb0.t(sbE, this.e, ", transactionDate=", this.f, ", transactionTimeLong=");
        sbE.append(this.g);
        sbE.append(", transactionType=");
        sbE.append(this.h);
        sbE.append(", shouldShowInfoText=");
        sbE.append(this.i);
        sbE.append(", infoText=");
        sbE.append(this.j);
        sbE.append(")");
        return sbE.toString();
    }

    public WalletTransactionUiModel(String str, String transactionTitle, String orderId, String amount, String transactionStatus, String transactionDate, long j, WalletTransactionType transactionType, boolean z, String infoText) {
        Intrinsics.i(transactionTitle, "transactionTitle");
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(amount, "amount");
        Intrinsics.i(transactionStatus, "transactionStatus");
        Intrinsics.i(transactionDate, "transactionDate");
        Intrinsics.i(transactionType, "transactionType");
        Intrinsics.i(infoText, "infoText");
        this.f10884a = str;
        this.b = transactionTitle;
        this.c = orderId;
        this.d = amount;
        this.e = transactionStatus;
        this.f = transactionDate;
        this.g = j;
        this.h = transactionType;
        this.i = z;
        this.j = infoText;
    }
}
