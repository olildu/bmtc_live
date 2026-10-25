package app.chalo.wallet.ui.transactionsummary.model;

import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/wallet/ui/transactionsummary/model/WalletTransactionSummaryNavigationModel;", "", "Companion", "$serializer", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class WalletTransactionSummaryNavigationModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new gp1(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10896a;
    public final String b;
    public final WalletTransactionType c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/wallet/ui/transactionsummary/model/WalletTransactionSummaryNavigationModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/wallet/ui/transactionsummary/model/WalletTransactionSummaryNavigationModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<WalletTransactionSummaryNavigationModel> serializer() {
            return WalletTransactionSummaryNavigationModel$$serializer.f10897a;
        }
    }

    public /* synthetic */ WalletTransactionSummaryNavigationModel(int i, String str, String str2, WalletTransactionType walletTransactionType) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(WalletTransactionSummaryNavigationModel$$serializer.f10897a.getDescriptor(), i, 7);
            throw null;
        }
        this.f10896a = str;
        this.b = str2;
        this.c = walletTransactionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletTransactionSummaryNavigationModel)) {
            return false;
        }
        WalletTransactionSummaryNavigationModel walletTransactionSummaryNavigationModel = (WalletTransactionSummaryNavigationModel) obj;
        return Intrinsics.d(this.f10896a, walletTransactionSummaryNavigationModel.f10896a) && Intrinsics.d(this.b, walletTransactionSummaryNavigationModel.b) && this.c == walletTransactionSummaryNavigationModel.c;
    }

    public final int hashCode() {
        String str = this.f10896a;
        return this.c.hashCode() + nf1.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("WalletTransactionSummaryNavigationModel(transactionId=", this.f10896a, ", orderId=", this.b, ", transactionType=");
        sbE.append(this.c);
        sbE.append(")");
        return sbE.toString();
    }

    public WalletTransactionSummaryNavigationModel(String str, String orderId, WalletTransactionType walletTransactionType) {
        Intrinsics.i(orderId, "orderId");
        this.f10896a = str;
        this.b = orderId;
        this.c = walletTransactionType;
    }
}
