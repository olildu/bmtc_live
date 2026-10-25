package app.chalo.ncmc.data.cardtransactions;

import defpackage.xe;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardRechargeTransactionApiResponse;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransactionApiResponse;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CardRechargeTransactionApiResponse implements CardTransactionApiResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xe(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6172a;
    public final Long b;
    public final CardTransactionFareInfoApiResponse c;
    public final CardRechargePaymentMode d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardRechargeTransactionApiResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/cardtransactions/CardRechargeTransactionApiResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CardRechargeTransactionApiResponse> serializer() {
            return CardRechargeTransactionApiResponse$$serializer.f6173a;
        }
    }

    public /* synthetic */ CardRechargeTransactionApiResponse(int i, String str, Long l, CardTransactionFareInfoApiResponse cardTransactionFareInfoApiResponse, CardRechargePaymentMode cardRechargePaymentMode) {
        if ((i & 1) == 0) {
            this.f6172a = null;
        } else {
            this.f6172a = str;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = cardRechargePaymentMode;
        }
    }

    @Override // app.chalo.ncmc.data.cardtransactions.CardTransactionApiResponse
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CardTransactionFareInfoApiResponse getC() {
        return this.c;
    }

    @Override // app.chalo.ncmc.data.cardtransactions.CardTransactionApiResponse
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF6172a() {
        return this.f6172a;
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
        if (!(obj instanceof CardRechargeTransactionApiResponse)) {
            return false;
        }
        CardRechargeTransactionApiResponse cardRechargeTransactionApiResponse = (CardRechargeTransactionApiResponse) obj;
        return Intrinsics.d(this.f6172a, cardRechargeTransactionApiResponse.f6172a) && Intrinsics.d(this.b, cardRechargeTransactionApiResponse.b) && Intrinsics.d(this.c, cardRechargeTransactionApiResponse.c) && this.d == cardRechargeTransactionApiResponse.d;
    }

    public final int hashCode() {
        String str = this.f6172a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        CardTransactionFareInfoApiResponse cardTransactionFareInfoApiResponse = this.c;
        int iHashCode3 = (iHashCode2 + (cardTransactionFareInfoApiResponse == null ? 0 : cardTransactionFareInfoApiResponse.hashCode())) * 31;
        CardRechargePaymentMode cardRechargePaymentMode = this.d;
        return iHashCode3 + (cardRechargePaymentMode != null ? cardRechargePaymentMode.hashCode() : 0);
    }

    @Override // app.chalo.ncmc.data.cardtransactions.CardTransactionApiResponse
    public final /* bridge */ boolean isValid() {
        return CardTransactionApiResponse.DefaultImpls.a(this);
    }

    public final String toString() {
        return "CardRechargeTransactionApiResponse(transactionId=" + this.f6172a + ", transactionTime=" + this.b + ", fareInfo=" + this.c + ", paymentMode=" + this.d + ")";
    }
}
