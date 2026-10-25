package app.chalo.walletframework.wallet.data.model.apimodel.response;

import defpackage.yn1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/response/WalletLoadBalanceConfigBaseApiResponseModel;", "", "Companion", "$serializer", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class WalletLoadBalanceConfigBaseApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10989a;
    public final List b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/response/WalletLoadBalanceConfigBaseApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/walletframework/wallet/data/model/apimodel/response/WalletLoadBalanceConfigBaseApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<WalletLoadBalanceConfigBaseApiResponseModel> serializer() {
            return WalletLoadBalanceConfigBaseApiResponseModel$$serializer.f10990a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new yn1(27)), LazyKt.a(lazyThreadSafetyMode, new yn1(28))};
    }

    public /* synthetic */ WalletLoadBalanceConfigBaseApiResponseModel(List list, int i, List list2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(WalletLoadBalanceConfigBaseApiResponseModel$$serializer.f10990a.getDescriptor(), i, 3);
            throw null;
        }
        this.f10989a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletLoadBalanceConfigBaseApiResponseModel)) {
            return false;
        }
        WalletLoadBalanceConfigBaseApiResponseModel walletLoadBalanceConfigBaseApiResponseModel = (WalletLoadBalanceConfigBaseApiResponseModel) obj;
        return Intrinsics.d(this.f10989a, walletLoadBalanceConfigBaseApiResponseModel.f10989a) && Intrinsics.d(this.b, walletLoadBalanceConfigBaseApiResponseModel.b);
    }

    public final int hashCode() {
        List list = this.f10989a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "WalletLoadBalanceConfigBaseApiResponseModel(walletConfig=" + this.f10989a + ", closedLoopDigitalWalletConfig=" + this.b + ")";
    }
}
