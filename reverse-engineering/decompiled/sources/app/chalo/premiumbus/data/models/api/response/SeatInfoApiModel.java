package app.chalo.premiumbus.data.models.api.response;

import defpackage.cb0;
import defpackage.hq0;
import defpackage.pk0;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/SeatInfoApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SeatInfoApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f7062a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final Boolean i;
    public final String j;
    public final Boolean k;
    public final Boolean l;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/SeatInfoApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/api/response/SeatInfoApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SeatInfoApiModel> serializer() {
            return SeatInfoApiModel$$serializer.f7063a;
        }
    }

    public /* synthetic */ SeatInfoApiModel(int i, Integer num, String str, String str2, String str3, String str4, Integer num2, Integer num3, Integer num4, Boolean bool, String str5, Boolean bool2, Boolean bool3) {
        if (4095 != (i & 4095)) {
            PluginExceptionsKt.b(SeatInfoApiModel$$serializer.f7063a.getDescriptor(), i, 4095);
            throw null;
        }
        this.f7062a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = num2;
        this.g = num3;
        this.h = num4;
        this.i = bool;
        this.j = str5;
        this.k = bool2;
        this.l = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeatInfoApiModel)) {
            return false;
        }
        SeatInfoApiModel seatInfoApiModel = (SeatInfoApiModel) obj;
        return Intrinsics.d(this.f7062a, seatInfoApiModel.f7062a) && Intrinsics.d(this.b, seatInfoApiModel.b) && Intrinsics.d(this.c, seatInfoApiModel.c) && Intrinsics.d(this.d, seatInfoApiModel.d) && Intrinsics.d(this.e, seatInfoApiModel.e) && Intrinsics.d(this.f, seatInfoApiModel.f) && Intrinsics.d(this.g, seatInfoApiModel.g) && Intrinsics.d(this.h, seatInfoApiModel.h) && Intrinsics.d(this.i, seatInfoApiModel.i) && Intrinsics.d(this.j, seatInfoApiModel.j) && Intrinsics.d(this.k, seatInfoApiModel.k) && Intrinsics.d(this.l, seatInfoApiModel.l);
    }

    public final int hashCode() {
        Integer num = this.f7062a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.g;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.h;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.i;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.j;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.k;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.l;
        return iHashCode11 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeatInfoApiModel(seatId=");
        sb.append(this.f7062a);
        sb.append(", seatType=");
        sb.append(this.b);
        sb.append(", seatNumber=");
        cb0.t(sb, this.c, ", status=", this.d, ", reservationType=");
        xs.u(this.f, this.e, ", x=", ", y=", sb);
        pk0.y(sb, this.g, ", z=", this.h, ", availableOnAllSlots=");
        hq0.t(this.i, ", bufferType=", this.j, ", autoAssign=", sb);
        sb.append(this.k);
        sb.append(", womenAdjacencyPromise=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }

    public SeatInfoApiModel(Integer num, String str, String str2, String str3, String str4, Integer num2, Integer num3, Integer num4, Boolean bool, String str5, Boolean bool2, Boolean bool3) {
        this.f7062a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = num2;
        this.g = num3;
        this.h = num4;
        this.i = bool;
        this.j = str5;
        this.k = bool2;
        this.l = bool3;
    }
}
