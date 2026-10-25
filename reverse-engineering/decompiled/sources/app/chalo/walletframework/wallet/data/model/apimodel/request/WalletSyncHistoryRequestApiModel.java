package app.chalo.walletframework.wallet.data.model.apimodel.request;

import defpackage.gp1;
import defpackage.nf1;
import defpackage.t10;
import defpackage.xs;
import java.util.ArrayList;
import java.util.List;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/request/WalletSyncHistoryRequestApiModel;", "", "Companion", "$serializer", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class WalletSyncHistoryRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new gp1(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10973a;
    public final String b;
    public final String c;
    public final boolean d;
    public final List e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/request/WalletSyncHistoryRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/walletframework/wallet/data/model/apimodel/request/WalletSyncHistoryRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<WalletSyncHistoryRequestApiModel> serializer() {
            return WalletSyncHistoryRequestApiModel$$serializer.f10974a;
        }
    }

    public /* synthetic */ WalletSyncHistoryRequestApiModel(int i, int i2, String str, String str2, boolean z, List list) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(WalletSyncHistoryRequestApiModel$$serializer.f10974a.getDescriptor(), i, 31);
            throw null;
        }
        this.f10973a = i2;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletSyncHistoryRequestApiModel)) {
            return false;
        }
        WalletSyncHistoryRequestApiModel walletSyncHistoryRequestApiModel = (WalletSyncHistoryRequestApiModel) obj;
        return this.f10973a == walletSyncHistoryRequestApiModel.f10973a && Intrinsics.d(this.b, walletSyncHistoryRequestApiModel.b) && Intrinsics.d(this.c, walletSyncHistoryRequestApiModel.c) && this.d == walletSyncHistoryRequestApiModel.d && Intrinsics.d(this.e, walletSyncHistoryRequestApiModel.e);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f10973a * 31, 31, this.b);
        String str = this.c;
        return this.e.hashCode() + ((((iE + (str == null ? 0 : str.hashCode())) * 31) + (this.d ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbP = nf1.p(this.f10973a, "WalletSyncHistoryRequestApiModel(appVersion=", ", userId=", this.b, ", walletId=");
        t10.s(this.c, ", fetchTransactions=", ", quickPayOrdersList=", sbP, this.d);
        return xs.l(sbP, this.e, ")");
    }

    public WalletSyncHistoryRequestApiModel(int i, String userId, String str, boolean z, ArrayList arrayList) {
        Intrinsics.i(userId, "userId");
        this.f10973a = i;
        this.b = userId;
        this.c = str;
        this.d = z;
        this.e = arrayList;
    }
}
