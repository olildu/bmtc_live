package app.chalo.premiumbus.data.models.app;

import androidx.core.app.FrameMetricsAggregator;
import defpackage.b3;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.p41;
import defpackage.z40;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/SeatInfoAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SeatInfoAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7122a;
    public final SeatType b;
    public final String c;
    public final SeatStatus d;
    public final ReservationType e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final BufferType k;
    public final boolean l;
    public final boolean m;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/SeatInfoAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/app/SeatInfoAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SeatInfoAppModel> serializer() {
            return SeatInfoAppModel$$serializer.f7123a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        n = new Lazy[]{null, LazyKt.a(lazyThreadSafetyMode, new p41(16)), null, LazyKt.a(lazyThreadSafetyMode, new p41(17)), LazyKt.a(lazyThreadSafetyMode, new p41(18)), null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new p41(19)), null, null};
    }

    public /* synthetic */ SeatInfoAppModel(int i, int i2, SeatType seatType, String str, SeatStatus seatStatus, ReservationType reservationType, int i3, int i4, int i5, boolean z, boolean z2, BufferType bufferType, boolean z3, boolean z4) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.b(SeatInfoAppModel$$serializer.f7123a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
            throw null;
        }
        this.f7122a = i2;
        this.b = seatType;
        this.c = str;
        this.d = seatStatus;
        this.e = reservationType;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = z;
        if ((i & 512) == 0) {
            this.j = true;
        } else {
            this.j = z2;
        }
        if ((i & 1024) == 0) {
            this.k = BufferType.NONE;
        } else {
            this.k = bufferType;
        }
        if ((i & 2048) == 0) {
            this.l = false;
        } else {
            this.l = z3;
        }
        if ((i & 4096) == 0) {
            this.m = false;
        } else {
            this.m = z4;
        }
    }

    public static SeatInfoAppModel a(SeatInfoAppModel seatInfoAppModel, SeatStatus seatStatus, boolean z, int i) {
        int i2 = seatInfoAppModel.f7122a;
        SeatType seatType = seatInfoAppModel.b;
        String seatNumber = seatInfoAppModel.c;
        if ((i & 8) != 0) {
            seatStatus = seatInfoAppModel.d;
        }
        SeatStatus status = seatStatus;
        ReservationType reservationType = seatInfoAppModel.e;
        int i3 = seatInfoAppModel.f;
        int i4 = seatInfoAppModel.g;
        int i5 = seatInfoAppModel.h;
        boolean z2 = seatInfoAppModel.j;
        BufferType bufferType = seatInfoAppModel.k;
        boolean z3 = seatInfoAppModel.l;
        boolean z4 = seatInfoAppModel.m;
        seatInfoAppModel.getClass();
        Intrinsics.i(seatType, "seatType");
        Intrinsics.i(seatNumber, "seatNumber");
        Intrinsics.i(status, "status");
        Intrinsics.i(reservationType, "reservationType");
        Intrinsics.i(bufferType, "bufferType");
        return new SeatInfoAppModel(i2, seatType, seatNumber, status, reservationType, i3, i4, i5, z, z2, bufferType, z3, z4);
    }

    public final boolean b() {
        return this.e == ReservationType.WOMEN && this.k == BufferType.ACTIVE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeatInfoAppModel)) {
            return false;
        }
        SeatInfoAppModel seatInfoAppModel = (SeatInfoAppModel) obj;
        return this.f7122a == seatInfoAppModel.f7122a && this.b == seatInfoAppModel.b && Intrinsics.d(this.c, seatInfoAppModel.c) && this.d == seatInfoAppModel.d && this.e == seatInfoAppModel.e && this.f == seatInfoAppModel.f && this.g == seatInfoAppModel.g && this.h == seatInfoAppModel.h && this.i == seatInfoAppModel.i && this.j == seatInfoAppModel.j && this.k == seatInfoAppModel.k && this.l == seatInfoAppModel.l && this.m == seatInfoAppModel.m;
    }

    public final int hashCode() {
        return ((((this.k.hashCode() + ((((((((((((this.e.hashCode() + ((this.d.hashCode() + nf1.e((this.b.hashCode() + (this.f7122a * 31)) * 31, 31, this.c)) * 31)) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + (this.i ? 1231 : 1237)) * 31) + (this.j ? 1231 : 1237)) * 31)) * 31) + (this.l ? 1231 : 1237)) * 31) + (this.m ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeatInfoAppModel(seatId=");
        sb.append(this.f7122a);
        sb.append(", seatType=");
        sb.append(this.b);
        sb.append(", seatNumber=");
        sb.append(this.c);
        sb.append(", status=");
        sb.append(this.d);
        sb.append(", reservationType=");
        sb.append(this.e);
        sb.append(", x=");
        sb.append(this.f);
        sb.append(", y=");
        hq0.p(this.g, this.h, ", z=", ", isSelectedByUser=", sb);
        z40.r(sb, this.i, ", availableOnAllSlots=", this.j, ", bufferType=");
        sb.append(this.k);
        sb.append(", autoAssign=");
        sb.append(this.l);
        sb.append(", womenAdjacencyPromise=");
        return b3.g(")", sb, this.m);
    }

    public SeatInfoAppModel(int i, SeatType seatType, String seatNumber, SeatStatus seatStatus, ReservationType reservationType, int i2, int i3, int i4, boolean z, boolean z2, BufferType bufferType, boolean z3, boolean z4) {
        Intrinsics.i(seatNumber, "seatNumber");
        Intrinsics.i(bufferType, "bufferType");
        this.f7122a = i;
        this.b = seatType;
        this.c = seatNumber;
        this.d = seatStatus;
        this.e = reservationType;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = z;
        this.j = z2;
        this.k = bufferType;
        this.l = z3;
        this.m = z4;
    }
}
