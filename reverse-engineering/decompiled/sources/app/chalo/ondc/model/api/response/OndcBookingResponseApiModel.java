package app.chalo.ondc.model.api.response;

import defpackage.q7;
import defpackage.yn0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ondc/model/api/response/OndcBookingResponseApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class OndcBookingResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6750a;
    public final List b;
    public final Integer c;
    public final List d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ondc/model/api/response/OndcBookingResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ondc/model/api/response/OndcBookingResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<OndcBookingResponseApiModel> serializer() {
            return OndcBookingResponseApiModel$$serializer.f6751a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new Lazy[]{null, LazyKt.a(lazyThreadSafetyMode, new yn0(0)), null, LazyKt.a(lazyThreadSafetyMode, new yn0(1))};
    }

    public /* synthetic */ OndcBookingResponseApiModel(int i, String str, List list, Integer num, List list2) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(OndcBookingResponseApiModel$$serializer.f6751a.getDescriptor(), i, 15);
            throw null;
        }
        this.f6750a = str;
        this.b = list;
        this.c = num;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OndcBookingResponseApiModel)) {
            return false;
        }
        OndcBookingResponseApiModel ondcBookingResponseApiModel = (OndcBookingResponseApiModel) obj;
        return Intrinsics.d(this.f6750a, ondcBookingResponseApiModel.f6750a) && Intrinsics.d(this.b, ondcBookingResponseApiModel.b) && Intrinsics.d(this.c, ondcBookingResponseApiModel.c) && Intrinsics.d(this.d, ondcBookingResponseApiModel.d);
    }

    public final int hashCode() {
        String str = this.f6750a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list2 = this.d;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbH = q7.h("OndcBookingResponseApiModel(bookingId=", this.f6750a, ", fareBreakup=", ", finalFare=", this.b);
        sbH.append(this.c);
        sbH.append(", terms=");
        sbH.append(this.d);
        sbH.append(")");
        return sbH.toString();
    }
}
