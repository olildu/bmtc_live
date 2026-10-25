package app.chalo.walletframework.wallet.domain.model;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/model/PromotionCardItem;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PromotionCardItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11086a;
    public final String b;

    public PromotionCardItem(String url, String str) {
        Intrinsics.i(url, "url");
        this.f11086a = url;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionCardItem)) {
            return false;
        }
        PromotionCardItem promotionCardItem = (PromotionCardItem) obj;
        return Intrinsics.d(this.f11086a, promotionCardItem.f11086a) && Intrinsics.d(this.b, promotionCardItem.b);
    }

    public final int hashCode() {
        int iHashCode = this.f11086a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return vo1.o("PromotionCardItem(url=", this.f11086a, ", deeplink=", this.b, ")");
    }
}
