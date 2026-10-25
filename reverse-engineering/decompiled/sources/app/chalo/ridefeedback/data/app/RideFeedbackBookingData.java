package app.chalo.ridefeedback.data.app;

import androidx.core.app.FrameMetricsAggregator;
import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.x11;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ridefeedback/data/app/RideFeedbackBookingData;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RideFeedbackBookingData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9067a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final long h;
    public final RideFeedbackTriggerType i;
    public final Integer j;
    public final RideFeedbackEntryPoint k;
    public final String l;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ridefeedback/data/app/RideFeedbackBookingData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ridefeedback/data/app/RideFeedbackBookingData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RideFeedbackBookingData> serializer() {
            return RideFeedbackBookingData$$serializer.f9068a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        m = new Lazy[]{null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new x11(20)), null, LazyKt.a(lazyThreadSafetyMode, new x11(21)), null};
    }

    public /* synthetic */ RideFeedbackBookingData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, RideFeedbackTriggerType rideFeedbackTriggerType, Integer num, RideFeedbackEntryPoint rideFeedbackEntryPoint, String str8) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.b(RideFeedbackBookingData$$serializer.f9068a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
            throw null;
        }
        this.f9067a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = j;
        this.i = rideFeedbackTriggerType;
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num;
        }
        this.k = (i & 1024) == 0 ? RideFeedbackEntryPoint.ACTIVATION_SCREEN : rideFeedbackEntryPoint;
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideFeedbackBookingData)) {
            return false;
        }
        RideFeedbackBookingData rideFeedbackBookingData = (RideFeedbackBookingData) obj;
        return Intrinsics.d(this.f9067a, rideFeedbackBookingData.f9067a) && Intrinsics.d(this.b, rideFeedbackBookingData.b) && Intrinsics.d(this.c, rideFeedbackBookingData.c) && Intrinsics.d(this.d, rideFeedbackBookingData.d) && Intrinsics.d(this.e, rideFeedbackBookingData.e) && Intrinsics.d(this.f, rideFeedbackBookingData.f) && Intrinsics.d(this.g, rideFeedbackBookingData.g) && this.h == rideFeedbackBookingData.h && this.i == rideFeedbackBookingData.i && Intrinsics.d(this.j, rideFeedbackBookingData.j) && this.k == rideFeedbackBookingData.k && Intrinsics.d(this.l, rideFeedbackBookingData.l);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.f9067a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        long j = this.h;
        int iHashCode = (this.i.hashCode() + ((iE + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        Integer num = this.j;
        int iHashCode2 = (this.k.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        String str = this.l;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RideFeedbackBookingData(bookingId=", this.f9067a, ", userId=", this.b, ", cityId=");
        cb0.t(sbE, this.c, ", tripId=", this.d, ", routeId=");
        cb0.t(sbE, this.e, ", fromStopName=", this.f, ", toStopName=");
        n21.p(this.h, this.g, ", tripEndTimestamp=", sbE);
        sbE.append(", triggerType=");
        sbE.append(this.i);
        sbE.append(", initialRating=");
        sbE.append(this.j);
        sbE.append(", entryPoint=");
        sbE.append(this.k);
        sbE.append(", tripStartTimeText=");
        sbE.append(this.l);
        sbE.append(")");
        return sbE.toString();
    }

    public RideFeedbackBookingData(String bookingId, String userId, String cityId, String tripId, String routeId, String fromStopName, String toStopName, long j, RideFeedbackTriggerType triggerType, Integer num, RideFeedbackEntryPoint entryPoint, String str) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(tripId, "tripId");
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(fromStopName, "fromStopName");
        Intrinsics.i(toStopName, "toStopName");
        Intrinsics.i(triggerType, "triggerType");
        Intrinsics.i(entryPoint, "entryPoint");
        this.f9067a = bookingId;
        this.b = userId;
        this.c = cityId;
        this.d = tripId;
        this.e = routeId;
        this.f = fromStopName;
        this.g = toStopName;
        this.h = j;
        this.i = triggerType;
        this.j = num;
        this.k = entryPoint;
        this.l = str;
    }
}
