package app.chalo.walletframework.wallet.data.model.apimodel.request;

import defpackage.dd;
import defpackage.ep;
import defpackage.nf1;
import defpackage.pk0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/request/ClosedLoopWalletSyncHistoryRequestApiModel;", "", "Companion", "$serializer", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ClosedLoopWalletSyncHistoryRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ep(10))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10965a;
    public final String b;
    public final boolean c;
    public final String d;
    public final List e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/request/ClosedLoopWalletSyncHistoryRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/walletframework/wallet/data/model/apimodel/request/ClosedLoopWalletSyncHistoryRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ClosedLoopWalletSyncHistoryRequestApiModel> serializer() {
            return ClosedLoopWalletSyncHistoryRequestApiModel$$serializer.f10966a;
        }
    }

    public /* synthetic */ ClosedLoopWalletSyncHistoryRequestApiModel(int i, String str, String str2, String str3, List list, boolean z) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(ClosedLoopWalletSyncHistoryRequestApiModel$$serializer.f10966a.getDescriptor(), i, 31);
            throw null;
        }
        this.f10965a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClosedLoopWalletSyncHistoryRequestApiModel)) {
            return false;
        }
        ClosedLoopWalletSyncHistoryRequestApiModel closedLoopWalletSyncHistoryRequestApiModel = (ClosedLoopWalletSyncHistoryRequestApiModel) obj;
        return Intrinsics.d(this.f10965a, closedLoopWalletSyncHistoryRequestApiModel.f10965a) && Intrinsics.d(this.b, closedLoopWalletSyncHistoryRequestApiModel.b) && this.c == closedLoopWalletSyncHistoryRequestApiModel.c && Intrinsics.d(this.d, closedLoopWalletSyncHistoryRequestApiModel.d) && Intrinsics.d(this.e, closedLoopWalletSyncHistoryRequestApiModel.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + nf1.e((nf1.e(this.f10965a.hashCode() * 31, 31, this.b) + (this.c ? 1231 : 1237)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ClosedLoopWalletSyncHistoryRequestApiModel(userId=", this.f10965a, ", walletId=", this.b, ", fetchTransactions=");
        pk0.x(", agency=", this.d, ", cldwActivations=", sbE, this.c);
        return xs.l(sbE, this.e, ")");
    }

    public ClosedLoopWalletSyncHistoryRequestApiModel(String userId, String walletId, boolean z, String agency, ArrayList arrayList) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(walletId, "walletId");
        Intrinsics.i(agency, "agency");
        this.f10965a = userId;
        this.b = walletId;
        this.c = z;
        this.d = agency;
        this.e = arrayList;
    }
}
