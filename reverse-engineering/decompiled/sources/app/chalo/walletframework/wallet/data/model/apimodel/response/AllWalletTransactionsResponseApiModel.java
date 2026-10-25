package app.chalo.walletframework.wallet.data.model.apimodel.response;

import defpackage.f1;
import defpackage.xs;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/response/AllWalletTransactionsResponseApiModel;", "", "Companion", "$serializer", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class AllWalletTransactionsResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10975a;
    public final List b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/response/AllWalletTransactionsResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/walletframework/wallet/data/model/apimodel/response/AllWalletTransactionsResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<AllWalletTransactionsResponseApiModel> serializer() {
            return AllWalletTransactionsResponseApiModel$$serializer.f10976a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new f1(9)), LazyKt.a(lazyThreadSafetyMode, new f1(10)), LazyKt.a(lazyThreadSafetyMode, new f1(11))};
    }

    public /* synthetic */ AllWalletTransactionsResponseApiModel(int i, List list, List list2, List list3) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(AllWalletTransactionsResponseApiModel$$serializer.f10976a.getDescriptor(), i, 7);
            throw null;
        }
        this.f10975a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllWalletTransactionsResponseApiModel)) {
            return false;
        }
        AllWalletTransactionsResponseApiModel allWalletTransactionsResponseApiModel = (AllWalletTransactionsResponseApiModel) obj;
        return Intrinsics.d(this.f10975a, allWalletTransactionsResponseApiModel.f10975a) && Intrinsics.d(this.b, allWalletTransactionsResponseApiModel.b) && Intrinsics.d(this.c, allWalletTransactionsResponseApiModel.c);
    }

    public final int hashCode() {
        List list = this.f10975a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AllWalletTransactionsResponseApiModel(quickPayTransactionsResponse=");
        sb.append(this.f10975a);
        sb.append(", loadMoneyTransactionsResponse=");
        sb.append(this.b);
        sb.append(", chaloPayTransactionsResponse=");
        return xs.l(sb, this.c, ")");
    }
}
