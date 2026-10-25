package app.chalo.walletframework.wallet.data.model.appmodel;

import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/appmodel/WalletMetaResponseAppModel;", "", "Companion", "$serializer", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class WalletMetaResponseAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11012a;
    public final String b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/appmodel/WalletMetaResponseAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/walletframework/wallet/data/model/appmodel/WalletMetaResponseAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<WalletMetaResponseAppModel> serializer() {
            return WalletMetaResponseAppModel$$serializer.f11013a;
        }
    }

    public /* synthetic */ WalletMetaResponseAppModel(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(WalletMetaResponseAppModel$$serializer.f11013a.getDescriptor(), i, 7);
            throw null;
        }
        this.f11012a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletMetaResponseAppModel)) {
            return false;
        }
        WalletMetaResponseAppModel walletMetaResponseAppModel = (WalletMetaResponseAppModel) obj;
        return Intrinsics.d(this.f11012a, walletMetaResponseAppModel.f11012a) && Intrinsics.d(this.b, walletMetaResponseAppModel.b) && Intrinsics.d(this.c, walletMetaResponseAppModel.c);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f11012a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return vo1.p(dd.e("WalletMetaResponseAppModel(walletId=", this.f11012a, ", userId=", this.b, ", agency="), this.c, ")");
    }

    public WalletMetaResponseAppModel(String walletId, String userId, String str) {
        Intrinsics.i(walletId, "walletId");
        Intrinsics.i(userId, "userId");
        this.f11012a = walletId;
        this.b = userId;
        this.c = str;
    }
}
