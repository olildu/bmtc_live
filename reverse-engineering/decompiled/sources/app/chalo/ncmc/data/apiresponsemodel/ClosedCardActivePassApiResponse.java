package app.chalo.ncmc.data.apiresponsemodel;

import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/apiresponsemodel/ClosedCardActivePassApiResponse;", "Lapp/chalo/ncmc/data/apiresponsemodel/CardActivePassApiResponse;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ClosedCardActivePassApiResponse implements CardActivePassApiResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6089a;
    public final Long b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final String g;
    public final String h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/apiresponsemodel/ClosedCardActivePassApiResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/apiresponsemodel/ClosedCardActivePassApiResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ClosedCardActivePassApiResponse> serializer() {
            return ClosedCardActivePassApiResponse$$serializer.f6090a;
        }
    }

    public /* synthetic */ ClosedCardActivePassApiResponse(int i, String str, Long l, Integer num, Integer num2, Integer num3, Integer num4, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f6089a = null;
        } else {
            this.f6089a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClosedCardActivePassApiResponse)) {
            return false;
        }
        ClosedCardActivePassApiResponse closedCardActivePassApiResponse = (ClosedCardActivePassApiResponse) obj;
        return Intrinsics.d(this.f6089a, closedCardActivePassApiResponse.f6089a) && Intrinsics.d(this.b, closedCardActivePassApiResponse.b) && Intrinsics.d(this.c, closedCardActivePassApiResponse.c) && Intrinsics.d(this.d, closedCardActivePassApiResponse.d) && Intrinsics.d(this.e, closedCardActivePassApiResponse.e) && Intrinsics.d(this.f, closedCardActivePassApiResponse.f) && Intrinsics.d(this.g, closedCardActivePassApiResponse.g) && Intrinsics.d(this.h, closedCardActivePassApiResponse.h);
    }

    public final int hashCode() {
        String str = this.f6089a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return iHashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClosedCardActivePassApiResponse(name=");
        sb.append(this.f6089a);
        sb.append(", passExpiryTimeStamp=");
        sb.append(this.b);
        sb.append(", remainingTrips=");
        pk0.y(sb, this.c, ", maxPricePerTrip=", this.d, ", maxTripsPerDay=");
        pk0.y(sb, this.e, ", totalTrips=", this.f, ", category=");
        return r30.i(sb, this.g, ", productType=", this.h, ")");
    }
}
