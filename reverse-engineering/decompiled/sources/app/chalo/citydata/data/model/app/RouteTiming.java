package app.chalo.citydata.data.model.app;

import defpackage.d41;
import defpackage.dd;
import defpackage.i71;
import defpackage.xs;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/citydata/data/model/app/RouteTiming;", "", "Companion", "FixedTiming", "FrequencyTiming", "Lapp/chalo/citydata/data/model/app/RouteTiming$FixedTiming;", "Lapp/chalo/citydata/data/model/app/RouteTiming$FrequencyTiming;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class RouteTiming {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new d41(10));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1719a;
    public final long b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/app/RouteTiming$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/app/RouteTiming;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<RouteTiming> serializer() {
            return (KSerializer) RouteTiming.d.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/app/RouteTiming$FixedTiming;", "Lapp/chalo/citydata/data/model/app/RouteTiming;", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class FixedTiming extends RouteTiming {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final long e;
        public final long f;
        public final String g;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/app/RouteTiming$FixedTiming$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/app/RouteTiming$FixedTiming;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<FixedTiming> serializer() {
                return RouteTiming$FixedTiming$$serializer.f1720a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FixedTiming(int i, long j, long j2, String str, long j3, long j4, String str2) {
            super(j, j2, str);
            if (63 != (i & 63)) {
                PluginExceptionsKt.b(RouteTiming$FixedTiming$$serializer.f1720a.getDescriptor(), i, 63);
                throw null;
            }
            this.e = j3;
            this.f = j4;
            this.g = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FixedTiming)) {
                return false;
            }
            FixedTiming fixedTiming = (FixedTiming) obj;
            return this.e == fixedTiming.e && this.f == fixedTiming.f && Intrinsics.d(this.g, fixedTiming.g);
        }

        public final int hashCode() {
            long j = this.e;
            long j2 = this.f;
            return this.g.hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31);
        }

        public final String toString() {
            StringBuilder sbG = i71.g(this.e, "FixedTiming(tripStartTime=", ", tripDuration=");
            dd.k(this.f, ", tripWeekDayValidity=", this.g, sbG);
            sbG.append(")");
            return sbG.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FixedTiming(long j, String tripWeekDayValidity) {
            super(j, tripWeekDayValidity);
            Intrinsics.i(tripWeekDayValidity, "tripWeekDayValidity");
            this.e = j;
            this.f = -1L;
            this.g = tripWeekDayValidity;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/app/RouteTiming$FrequencyTiming;", "Lapp/chalo/citydata/data/model/app/RouteTiming;", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class FrequencyTiming extends RouteTiming {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final long e;
        public final long f;
        public final long g;
        public final long h;
        public final String i;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/app/RouteTiming$FrequencyTiming$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/app/RouteTiming$FrequencyTiming;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<FrequencyTiming> serializer() {
                return RouteTiming$FrequencyTiming$$serializer.f1721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FrequencyTiming(int i, long j, long j2, String str, long j3, long j4, long j5, long j6, String str2) {
            super(j, j2, str);
            if (255 != (i & 255)) {
                PluginExceptionsKt.b(RouteTiming$FrequencyTiming$$serializer.f1721a.getDescriptor(), i, 255);
                throw null;
            }
            this.e = j3;
            this.f = j4;
            this.g = j5;
            this.h = j6;
            this.i = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FrequencyTiming)) {
                return false;
            }
            FrequencyTiming frequencyTiming = (FrequencyTiming) obj;
            return this.e == frequencyTiming.e && this.f == frequencyTiming.f && this.g == frequencyTiming.g && this.h == frequencyTiming.h && Intrinsics.d(this.i, frequencyTiming.i);
        }

        public final int hashCode() {
            long j = this.e;
            long j2 = this.f;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.g;
            int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.h;
            return this.i.hashCode() + ((i2 + ((int) ((j4 >>> 32) ^ j4))) * 31);
        }

        public final String toString() {
            StringBuilder sbG = i71.g(this.e, "FrequencyTiming(tripStartTime=", ", tripEndTime=");
            sbG.append(this.f);
            xs.r(this.g, ", frequency=", ", tripDuration=", sbG);
            dd.k(this.h, ", tripWeekDayValidity=", this.i, sbG);
            sbG.append(")");
            return sbG.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FrequencyTiming(long j, long j2, long j3, String tripWeekDayValidity) {
            super(j, tripWeekDayValidity);
            Intrinsics.i(tripWeekDayValidity, "tripWeekDayValidity");
            this.e = j;
            this.f = j2;
            this.g = j3;
            this.h = -1L;
            this.i = tripWeekDayValidity;
        }
    }

    public /* synthetic */ RouteTiming(long j, long j2, String str) {
        this.f1719a = j;
        this.b = j2;
        this.c = str;
    }

    public RouteTiming(long j, String str) {
        this.f1719a = j;
        this.b = -1L;
        this.c = str;
    }
}
