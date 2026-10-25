package app.chalo.ncmc.data.cardtransactions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/MerchantTransactionApiResponse;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransactionApiResponse;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MerchantTransactionApiResponse implements CardTransactionApiResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6206a;
    public final Long b;
    public final CardTransactionFareInfoApiResponse c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/MerchantTransactionApiResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/cardtransactions/MerchantTransactionApiResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MerchantTransactionApiResponse> serializer() {
            return MerchantTransactionApiResponse$$serializer.f6207a;
        }
    }

    public /* synthetic */ MerchantTransactionApiResponse(int i, String str, Long l, CardTransactionFareInfoApiResponse cardTransactionFareInfoApiResponse) {
        if ((i & 1) == 0) {
            this.f6206a = null;
        } else {
            this.f6206a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = cardTransactionFareInfoApiResponse;
        }
    }

    @Override // app.chalo.ncmc.data.cardtransactions.CardTransactionApiResponse
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CardTransactionFareInfoApiResponse getC() {
        return this.c;
    }

    @Override // app.chalo.ncmc.data.cardtransactions.CardTransactionApiResponse
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF6206a() {
        return this.f6206a;
    }

    @Override // app.chalo.ncmc.data.cardtransactions.CardTransactionApiResponse
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MerchantTransactionApiResponse)) {
            return false;
        }
        MerchantTransactionApiResponse merchantTransactionApiResponse = (MerchantTransactionApiResponse) obj;
        return Intrinsics.d(this.f6206a, merchantTransactionApiResponse.f6206a) && Intrinsics.d(this.b, merchantTransactionApiResponse.b) && Intrinsics.d(this.c, merchantTransactionApiResponse.c);
    }

    public final int hashCode() {
        String str = this.f6206a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        CardTransactionFareInfoApiResponse cardTransactionFareInfoApiResponse = this.c;
        return iHashCode2 + (cardTransactionFareInfoApiResponse != null ? cardTransactionFareInfoApiResponse.hashCode() : 0);
    }

    @Override // app.chalo.ncmc.data.cardtransactions.CardTransactionApiResponse
    public final /* bridge */ boolean isValid() {
        return CardTransactionApiResponse.DefaultImpls.a(this);
    }

    public final String toString() {
        return "MerchantTransactionApiResponse(transactionId=" + this.f6206a + ", transactionTime=" + this.b + ", fareInfo=" + this.c + ")";
    }
}
