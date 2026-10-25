package app.chalo.livetracking.frameworklivetracking.data.model.api.request;

import defpackage.dd;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.t40;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/api/request/GetSeatAvailabilityRequestApiModel;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GetSeatAvailabilityRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g = {null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new t40(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4270a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final List f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/api/request/GetSeatAvailabilityRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/api/request/GetSeatAvailabilityRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GetSeatAvailabilityRequestApiModel> serializer() {
            return GetSeatAvailabilityRequestApiModel$$serializer.f4271a;
        }
    }

    public /* synthetic */ GetSeatAvailabilityRequestApiModel(int i, String str, String str2, int i2, int i3, int i4, List list) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(GetSeatAvailabilityRequestApiModel$$serializer.f4271a.getDescriptor(), i, 63);
            throw null;
        }
        this.f4270a = str;
        this.b = str2;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSeatAvailabilityRequestApiModel)) {
            return false;
        }
        GetSeatAvailabilityRequestApiModel getSeatAvailabilityRequestApiModel = (GetSeatAvailabilityRequestApiModel) obj;
        return Intrinsics.d(this.f4270a, getSeatAvailabilityRequestApiModel.f4270a) && Intrinsics.d(this.b, getSeatAvailabilityRequestApiModel.b) && this.c == getSeatAvailabilityRequestApiModel.c && this.d == getSeatAvailabilityRequestApiModel.d && this.e == getSeatAvailabilityRequestApiModel.e && Intrinsics.d(this.f, getSeatAvailabilityRequestApiModel.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((((((nf1.e(this.f4270a.hashCode() * 31, 31, this.b) + this.c) * 31) + this.d) * 31) + this.e) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("GetSeatAvailabilityRequestApiModel(deviceId=", this.f4270a, ", cityId=", this.b, ", maxDelay=");
        hq0.p(this.c, this.d, ", mode=", ", occupancyFactor=", sbE);
        sbE.append(this.e);
        sbE.append(", vehicle=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }

    public GetSeatAvailabilityRequestApiModel(String deviceId, String cityId, int i, int i2, int i3, ArrayList arrayList) {
        Intrinsics.i(deviceId, "deviceId");
        Intrinsics.i(cityId, "cityId");
        this.f4270a = deviceId;
        this.b = cityId;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = arrayList;
    }
}
