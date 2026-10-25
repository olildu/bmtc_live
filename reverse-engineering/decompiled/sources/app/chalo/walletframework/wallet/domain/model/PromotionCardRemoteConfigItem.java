package app.chalo.walletframework.wallet.domain.model;

import defpackage.hq0;
import defpackage.nf1;
import defpackage.r30;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/model/PromotionCardRemoteConfigItem;", "", "Companion", "$serializer", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PromotionCardRemoteConfigItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11087a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/model/PromotionCardRemoteConfigItem$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/walletframework/wallet/domain/model/PromotionCardRemoteConfigItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PromotionCardRemoteConfigItem> serializer() {
            return PromotionCardRemoteConfigItem$$serializer.f11088a;
        }
    }

    public /* synthetic */ PromotionCardRemoteConfigItem(int i, int i2, int i3, int i4, String str, String str2, String str3) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(PromotionCardRemoteConfigItem$$serializer.f11088a.getDescriptor(), i, 63);
            throw null;
        }
        this.f11087a = str;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionCardRemoteConfigItem)) {
            return false;
        }
        PromotionCardRemoteConfigItem promotionCardRemoteConfigItem = (PromotionCardRemoteConfigItem) obj;
        return Intrinsics.d(this.f11087a, promotionCardRemoteConfigItem.f11087a) && this.b == promotionCardRemoteConfigItem.b && this.c == promotionCardRemoteConfigItem.c && this.d == promotionCardRemoteConfigItem.d && Intrinsics.d(this.e, promotionCardRemoteConfigItem.e) && Intrinsics.d(this.f, promotionCardRemoteConfigItem.f);
    }

    public final int hashCode() {
        int iE = nf1.e(((((((this.f11087a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31, 31, this.e);
        String str = this.f;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "PromotionCardRemoteConfigItem(url=", this.f11087a, ", showToKycDoneUser=", ", showToWalletLoadedUser=");
        hq0.p(this.c, this.d, ", showToQuickPayUsers=", ", screen=", sbM);
        return r30.i(sbM, this.e, ", deeplink=", this.f, ")");
    }
}
