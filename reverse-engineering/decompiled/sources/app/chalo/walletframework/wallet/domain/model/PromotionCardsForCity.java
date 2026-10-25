package app.chalo.walletframework.wallet.domain.model;

import defpackage.nf1;
import defpackage.ox0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/model/PromotionCardsForCity;", "", "Companion", "$serializer", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PromotionCardsForCity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ox0(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11089a;
    public final List b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/model/PromotionCardsForCity$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/walletframework/wallet/domain/model/PromotionCardsForCity;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PromotionCardsForCity> serializer() {
            return PromotionCardsForCity$$serializer.f11090a;
        }
    }

    public /* synthetic */ PromotionCardsForCity(int i, String str, List list) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(PromotionCardsForCity$$serializer.f11090a.getDescriptor(), i, 3);
            throw null;
        }
        this.f11089a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionCardsForCity)) {
            return false;
        }
        PromotionCardsForCity promotionCardsForCity = (PromotionCardsForCity) obj;
        return Intrinsics.d(this.f11089a, promotionCardsForCity.f11089a) && Intrinsics.d(this.b, promotionCardsForCity.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11089a.hashCode() * 31);
    }

    public final String toString() {
        return nf1.m("PromotionCardsForCity(city=", this.f11089a, ", banners=", ")", this.b);
    }
}
