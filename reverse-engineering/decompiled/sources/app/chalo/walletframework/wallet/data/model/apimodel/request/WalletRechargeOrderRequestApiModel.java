package app.chalo.walletframework.wallet.data.model.apimodel.request;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.vo1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/request/WalletRechargeOrderRequestApiModel;", "", "Companion", "$serializer", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class WalletRechargeOrderRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10971a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/request/WalletRechargeOrderRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/walletframework/wallet/data/model/apimodel/request/WalletRechargeOrderRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<WalletRechargeOrderRequestApiModel> serializer() {
            return WalletRechargeOrderRequestApiModel$$serializer.f10972a;
        }
    }

    public /* synthetic */ WalletRechargeOrderRequestApiModel(int i, int i2, String str, String str2, String str3, String str4) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(WalletRechargeOrderRequestApiModel$$serializer.f10972a.getDescriptor(), i, 31);
            throw null;
        }
        this.f10971a = str;
        this.b = i2;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletRechargeOrderRequestApiModel)) {
            return false;
        }
        WalletRechargeOrderRequestApiModel walletRechargeOrderRequestApiModel = (WalletRechargeOrderRequestApiModel) obj;
        return Intrinsics.d(this.f10971a, walletRechargeOrderRequestApiModel.f10971a) && this.b == walletRechargeOrderRequestApiModel.b && Intrinsics.d(this.c, walletRechargeOrderRequestApiModel.c) && Intrinsics.d(this.d, walletRechargeOrderRequestApiModel.d) && Intrinsics.d(this.e, walletRechargeOrderRequestApiModel.e);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(((this.f10971a.hashCode() * 31) + this.b) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "WalletRechargeOrderRequestApiModel(city=", this.f10971a, ", amount=", ", configId=");
        cb0.t(sbM, this.c, ", walletId=", this.d, ", agency=");
        return vo1.p(sbM, this.e, ")");
    }

    public WalletRechargeOrderRequestApiModel(String city, int i, String configId, String walletId, String str) {
        Intrinsics.i(city, "city");
        Intrinsics.i(configId, "configId");
        Intrinsics.i(walletId, "walletId");
        this.f10971a = city;
        this.b = i;
        this.c = configId;
        this.d = walletId;
        this.e = str;
    }
}
