package app.chalo.ncmc.data.apiresponsemodel;

import defpackage.z61;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/apiresponsemodel/SemiClosedCardInfoApiResponse;", "Lapp/chalo/ncmc/data/apiresponsemodel/CardInfoApiResponse;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SemiClosedCardInfoApiResponse implements CardInfoApiResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new z61(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SemiClosedCardDetailsApiResponse f6109a;
    public final List b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/apiresponsemodel/SemiClosedCardInfoApiResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/apiresponsemodel/SemiClosedCardInfoApiResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SemiClosedCardInfoApiResponse> serializer() {
            return SemiClosedCardInfoApiResponse$$serializer.f6110a;
        }
    }

    public /* synthetic */ SemiClosedCardInfoApiResponse(int i, SemiClosedCardDetailsApiResponse semiClosedCardDetailsApiResponse, List list) {
        if ((i & 1) == 0) {
            this.f6109a = null;
        } else {
            this.f6109a = semiClosedCardDetailsApiResponse;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    @Override // app.chalo.ncmc.data.apiresponsemodel.CardInfoApiResponse
    public final CardDetailsApiResponse a() {
        return this.f6109a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemiClosedCardInfoApiResponse)) {
            return false;
        }
        SemiClosedCardInfoApiResponse semiClosedCardInfoApiResponse = (SemiClosedCardInfoApiResponse) obj;
        return Intrinsics.d(this.f6109a, semiClosedCardInfoApiResponse.f6109a) && Intrinsics.d(this.b, semiClosedCardInfoApiResponse.b);
    }

    public final int hashCode() {
        SemiClosedCardDetailsApiResponse semiClosedCardDetailsApiResponse = this.f6109a;
        int iHashCode = (semiClosedCardDetailsApiResponse == null ? 0 : semiClosedCardDetailsApiResponse.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // app.chalo.ncmc.data.apiresponsemodel.CardInfoApiResponse
    public final /* bridge */ boolean isValid() {
        return CardInfoApiResponse.DefaultImpls.a(this);
    }

    public final String toString() {
        return "SemiClosedCardInfoApiResponse(cardDetails=" + this.f6109a + ", activePasses=" + this.b + ")";
    }
}
