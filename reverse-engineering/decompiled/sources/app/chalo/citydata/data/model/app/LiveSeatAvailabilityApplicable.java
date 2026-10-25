package app.chalo.citydata.data.model.app;

import defpackage.b3;
import defpackage.hf0;
import defpackage.vc0;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/citydata/data/model/app/LiveSeatAvailabilityApplicable;", "", "Companion", "Yes", "No", "Lapp/chalo/citydata/data/model/app/LiveSeatAvailabilityApplicable$No;", "Lapp/chalo/citydata/data/model/app/LiveSeatAvailabilityApplicable$Yes;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class LiveSeatAvailabilityApplicable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new vc0(29));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1707a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/app/LiveSeatAvailabilityApplicable$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/app/LiveSeatAvailabilityApplicable;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<LiveSeatAvailabilityApplicable> serializer() {
            return (KSerializer) LiveSeatAvailabilityApplicable.b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/citydata/data/model/app/LiveSeatAvailabilityApplicable$No;", "Lapp/chalo/citydata/data/model/app/LiveSeatAvailabilityApplicable;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final class No extends LiveSeatAvailabilityApplicable {
        public static final No INSTANCE = new No(-1, 0);
        public static final /* synthetic */ Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hf0(0));

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<No> serializer() {
            return (KSerializer) c.getValue();
        }
    }

    public /* synthetic */ LiveSeatAvailabilityApplicable(int i) {
        this.f1707a = i;
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/app/LiveSeatAvailabilityApplicable$Yes;", "Lapp/chalo/citydata/data/model/app/LiveSeatAvailabilityApplicable;", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Yes extends LiveSeatAvailabilityApplicable {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final int c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/app/LiveSeatAvailabilityApplicable$Yes$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/app/LiveSeatAvailabilityApplicable$Yes;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Yes> serializer() {
                return LiveSeatAvailabilityApplicable$Yes$$serializer.f1708a;
            }
        }

        public Yes(int i) {
            super(i, 0);
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Yes) && this.c == ((Yes) obj).c;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public final int getC() {
            return this.c;
        }

        public final String toString() {
            return b3.d(this.c, "Yes(availabilityId=", ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Yes(int i, int i2, int i3) {
            super(i2);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(LiveSeatAvailabilityApplicable$Yes$$serializer.f1708a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = i3;
        }
    }

    public LiveSeatAvailabilityApplicable(int i, int i2) {
        this.f1707a = i;
    }
}
