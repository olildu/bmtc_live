package app.chalo.premiumbus.data.models.api.response;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/PremiumBusBookingPurchaseOptionDetailsApiResponseModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumBusBookingPurchaseOptionDetailsApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7042a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final Long f;
    public final Integer g;
    public final Boolean h;
    public final String i;
    public final String j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/PremiumBusBookingPurchaseOptionDetailsApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/api/response/PremiumBusBookingPurchaseOptionDetailsApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumBusBookingPurchaseOptionDetailsApiResponseModel> serializer() {
            return PremiumBusBookingPurchaseOptionDetailsApiResponseModel$$serializer.f7043a;
        }
    }

    public /* synthetic */ PremiumBusBookingPurchaseOptionDetailsApiResponseModel(int i, String str, String str2, String str3, String str4, Long l, Long l2, Integer num, Boolean bool, String str5, String str6) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.b(PremiumBusBookingPurchaseOptionDetailsApiResponseModel$$serializer.f7043a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f7042a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = l;
        this.f = l2;
        this.g = num;
        this.h = bool;
        this.i = str5;
        this.j = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusBookingPurchaseOptionDetailsApiResponseModel)) {
            return false;
        }
        PremiumBusBookingPurchaseOptionDetailsApiResponseModel premiumBusBookingPurchaseOptionDetailsApiResponseModel = (PremiumBusBookingPurchaseOptionDetailsApiResponseModel) obj;
        return Intrinsics.d(this.f7042a, premiumBusBookingPurchaseOptionDetailsApiResponseModel.f7042a) && Intrinsics.d(this.b, premiumBusBookingPurchaseOptionDetailsApiResponseModel.b) && Intrinsics.d(this.c, premiumBusBookingPurchaseOptionDetailsApiResponseModel.c) && Intrinsics.d(this.d, premiumBusBookingPurchaseOptionDetailsApiResponseModel.d) && Intrinsics.d(this.e, premiumBusBookingPurchaseOptionDetailsApiResponseModel.e) && Intrinsics.d(this.f, premiumBusBookingPurchaseOptionDetailsApiResponseModel.f) && Intrinsics.d(this.g, premiumBusBookingPurchaseOptionDetailsApiResponseModel.g) && Intrinsics.d(this.h, premiumBusBookingPurchaseOptionDetailsApiResponseModel.h) && Intrinsics.d(this.i, premiumBusBookingPurchaseOptionDetailsApiResponseModel.i) && Intrinsics.d(this.j, premiumBusBookingPurchaseOptionDetailsApiResponseModel.j);
    }

    public final int hashCode() {
        String str = this.f7042a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.e;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.h;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        return iHashCode9 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumBusBookingPurchaseOptionDetailsApiResponseModel(productType=", this.f7042a, ", productSubType=", this.b, ", bookingId=");
        cb0.t(sbE, this.c, ", productName=", this.d, ", expiryTime=");
        nf1.w(sbE, this.e, ", maxPricePerTrip=", this.f, ", remainingTrips=");
        sbE.append(this.g);
        sbE.append(", isSupported=");
        sbE.append(this.h);
        sbE.append(", message=");
        return r30.i(sbE, this.i, ", tierType=", this.j, ")");
    }
}
