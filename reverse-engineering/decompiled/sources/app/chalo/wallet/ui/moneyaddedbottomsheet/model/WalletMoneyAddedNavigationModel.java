package app.chalo.wallet.ui.moneyaddedbottomsheet.model;

import app.chalo.walletframework.wallet.data.model.LoadMoneyOrderStatus;
import defpackage.gp1;
import defpackage.uf0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/wallet/ui/moneyaddedbottomsheet/model/WalletMoneyAddedNavigationModel;", "", "Companion", "$serializer", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class WalletMoneyAddedNavigationModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new gp1(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10888a;
    public final int b;
    public final LoadMoneyOrderStatus c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/wallet/ui/moneyaddedbottomsheet/model/WalletMoneyAddedNavigationModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/wallet/ui/moneyaddedbottomsheet/model/WalletMoneyAddedNavigationModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<WalletMoneyAddedNavigationModel> serializer() {
            return WalletMoneyAddedNavigationModel$$serializer.f10889a;
        }
    }

    public /* synthetic */ WalletMoneyAddedNavigationModel(int i, int i2, int i3, LoadMoneyOrderStatus loadMoneyOrderStatus) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(WalletMoneyAddedNavigationModel$$serializer.f10889a.getDescriptor(), i, 7);
            throw null;
        }
        this.f10888a = i2;
        this.b = i3;
        this.c = loadMoneyOrderStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletMoneyAddedNavigationModel)) {
            return false;
        }
        WalletMoneyAddedNavigationModel walletMoneyAddedNavigationModel = (WalletMoneyAddedNavigationModel) obj;
        return this.f10888a == walletMoneyAddedNavigationModel.f10888a && this.b == walletMoneyAddedNavigationModel.b && this.c == walletMoneyAddedNavigationModel.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f10888a * 31) + this.b) * 31);
    }

    public final String toString() {
        StringBuilder sbS = uf0.s(this.f10888a, this.b, "WalletMoneyAddedNavigationModel(amountAdded=", ", walletBalance=", ", loadMoneyOrderStatus=");
        sbS.append(this.c);
        sbS.append(")");
        return sbS.toString();
    }

    public WalletMoneyAddedNavigationModel(int i, int i2, LoadMoneyOrderStatus loadMoneyOrderStatus) {
        Intrinsics.i(loadMoneyOrderStatus, "loadMoneyOrderStatus");
        this.f10888a = i;
        this.b = i2;
        this.c = loadMoneyOrderStatus;
    }
}
