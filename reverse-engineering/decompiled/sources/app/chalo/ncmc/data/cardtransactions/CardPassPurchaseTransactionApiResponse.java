package app.chalo.ncmc.data.cardtransactions;

import defpackage.b3;
import defpackage.cb0;
import defpackage.gf;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardPassPurchaseTransactionApiResponse;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransactionApiResponse;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CardPassPurchaseTransactionApiResponse implements CardTransactionApiResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6168a;
    public final Long b;
    public final CardTransactionFareInfoApiResponse c;
    public final String d;
    public final String e;
    public final Long f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final String j;
    public final int k;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardPassPurchaseTransactionApiResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/cardtransactions/CardPassPurchaseTransactionApiResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CardPassPurchaseTransactionApiResponse> serializer() {
            return CardPassPurchaseTransactionApiResponse$$serializer.f6169a;
        }
    }

    public /* synthetic */ CardPassPurchaseTransactionApiResponse(int i, String str, Long l, CardTransactionFareInfoApiResponse cardTransactionFareInfoApiResponse, String str2, String str3, Long l2, Integer num, Integer num2, Integer num3, String str4, int i2) {
        if (1024 != (i & 1024)) {
            PluginExceptionsKt.b(CardPassPurchaseTransactionApiResponse$$serializer.f6169a.getDescriptor(), i, 1024);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f6168a = null;
        } else {
            this.f6168a = str;
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
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str4;
        }
        this.k = i2;
    }

    @Override // app.chalo.ncmc.data.cardtransactions.CardTransactionApiResponse
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CardTransactionFareInfoApiResponse getC() {
        return this.c;
    }

    @Override // app.chalo.ncmc.data.cardtransactions.CardTransactionApiResponse
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF6168a() {
        return this.f6168a;
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
        if (!(obj instanceof CardPassPurchaseTransactionApiResponse)) {
            return false;
        }
        CardPassPurchaseTransactionApiResponse cardPassPurchaseTransactionApiResponse = (CardPassPurchaseTransactionApiResponse) obj;
        return Intrinsics.d(this.f6168a, cardPassPurchaseTransactionApiResponse.f6168a) && Intrinsics.d(this.b, cardPassPurchaseTransactionApiResponse.b) && Intrinsics.d(this.c, cardPassPurchaseTransactionApiResponse.c) && Intrinsics.d(this.d, cardPassPurchaseTransactionApiResponse.d) && Intrinsics.d(this.e, cardPassPurchaseTransactionApiResponse.e) && Intrinsics.d(this.f, cardPassPurchaseTransactionApiResponse.f) && Intrinsics.d(this.g, cardPassPurchaseTransactionApiResponse.g) && Intrinsics.d(this.h, cardPassPurchaseTransactionApiResponse.h) && Intrinsics.d(this.i, cardPassPurchaseTransactionApiResponse.i) && Intrinsics.d(this.j, cardPassPurchaseTransactionApiResponse.j) && this.k == cardPassPurchaseTransactionApiResponse.k;
    }

    public final int hashCode() {
        String str = this.f6168a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        CardTransactionFareInfoApiResponse cardTransactionFareInfoApiResponse = this.c;
        int iHashCode3 = (iHashCode2 + (cardTransactionFareInfoApiResponse == null ? 0 : cardTransactionFareInfoApiResponse.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.h;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.i;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.j;
        return ((iHashCode9 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.k;
    }

    @Override // app.chalo.ncmc.data.cardtransactions.CardTransactionApiResponse
    public final boolean isValid() {
        return (this.f6168a == null || this.b == null) ? false : true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardPassPurchaseTransactionApiResponse(transactionId=");
        sb.append(this.f6168a);
        sb.append(", transactionTime=");
        sb.append(this.b);
        sb.append(", fareInfo=");
        sb.append(this.c);
        sb.append(", categoryName=");
        sb.append(this.d);
        sb.append(", name=");
        cb0.r(this.f, this.e, ", expiryTime=", ", remainingTrips=", sb);
        pk0.y(sb, this.g, ", maxPricePerTrip=", this.h, ", maxTripsPerDay=");
        gf.w(this.i, ", productType=", this.j, ", totalTrips=", sb);
        return b3.f(")", this.k, sb);
    }
}
