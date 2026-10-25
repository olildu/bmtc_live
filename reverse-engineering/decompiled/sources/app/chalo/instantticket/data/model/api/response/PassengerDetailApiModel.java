package app.chalo.instantticket.data.model.api.response;

import defpackage.cb0;
import defpackage.xp0;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/instantticket/data/model/api/response/PassengerDetailApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PassengerDetailApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] k = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xp0(1)), null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f3873a;
    public final String b;
    public final List c;
    public final String d;
    public final Boolean e;
    public final Integer f;
    public final String g;
    public final Long h;
    public final Integer i;
    public final SeatLimitApiModel j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/instantticket/data/model/api/response/PassengerDetailApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/instantticket/data/model/api/response/PassengerDetailApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PassengerDetailApiModel> serializer() {
            return PassengerDetailApiModel$$serializer.f3874a;
        }
    }

    public /* synthetic */ PassengerDetailApiModel(int i, Long l, String str, List list, String str2, Boolean bool, Integer num, String str3, Long l2, Integer num2, SeatLimitApiModel seatLimitApiModel) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.b(PassengerDetailApiModel$$serializer.f3874a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f3873a = l;
        this.b = str;
        this.c = list;
        this.d = str2;
        this.e = bool;
        this.f = num;
        this.g = str3;
        this.h = l2;
        this.i = num2;
        this.j = seatLimitApiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassengerDetailApiModel)) {
            return false;
        }
        PassengerDetailApiModel passengerDetailApiModel = (PassengerDetailApiModel) obj;
        return Intrinsics.d(this.f3873a, passengerDetailApiModel.f3873a) && Intrinsics.d(this.b, passengerDetailApiModel.b) && Intrinsics.d(this.c, passengerDetailApiModel.c) && Intrinsics.d(this.d, passengerDetailApiModel.d) && Intrinsics.d(this.e, passengerDetailApiModel.e) && Intrinsics.d(this.f, passengerDetailApiModel.f) && Intrinsics.d(this.g, passengerDetailApiModel.g) && Intrinsics.d(this.h, passengerDetailApiModel.h) && Intrinsics.d(this.i, passengerDetailApiModel.i) && Intrinsics.d(this.j, passengerDetailApiModel.j);
    }

    public final int hashCode() {
        Long l = this.f3873a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.h;
        int iHashCode8 = (iHashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num2 = this.i;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        SeatLimitApiModel seatLimitApiModel = this.j;
        return iHashCode9 + (seatLimitApiModel != null ? seatLimitApiModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PassengerDetailApiModel(actualAmount=");
        sb.append(this.f3873a);
        sb.append(", discountCopy=");
        sb.append(this.b);
        sb.append(", fareBreakup=");
        cb0.s(", id=", this.d, ", isDiscountApplicable=", sb, this.c);
        sb.append(this.e);
        sb.append(", discountPercentage=");
        sb.append(this.f);
        sb.append(", name=");
        cb0.r(this.h, this.g, ", payableAmount=", ", categorySeatLimit=", sb);
        sb.append(this.i);
        sb.append(", seatLimit=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
