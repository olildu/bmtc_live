package app.chalo.recent.database.entities;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.RecentAdditionalRouteInfoEntityTypeDeserializer;
import defpackage.hz0;
import defpackage.vo1;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/recent/database/entities/RecentAdditionalRouteInfoEntity;", "", "Companion", "Metro", "Bus", "Lapp/chalo/recent/database/entities/RecentAdditionalRouteInfoEntity$Bus;", "Lapp/chalo/recent/database/entities/RecentAdditionalRouteInfoEntity$Metro;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable(with = RecentAdditionalRouteInfoEntityTypeDeserializer.class)
public abstract class RecentAdditionalRouteInfoEntity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/recent/database/entities/RecentAdditionalRouteInfoEntity$Bus;", "Lapp/chalo/recent/database/entities/RecentAdditionalRouteInfoEntity;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final class Bus extends RecentAdditionalRouteInfoEntity {
        public static final Bus INSTANCE = new Bus();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f8931a;

        static {
            ChaloTransitMode.Companion companion = ChaloTransitMode.INSTANCE;
            f8931a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hz0(16));
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<Bus> serializer() {
            return (KSerializer) f8931a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/recent/database/entities/RecentAdditionalRouteInfoEntity$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/recent/database/entities/RecentAdditionalRouteInfoEntity;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RecentAdditionalRouteInfoEntity> serializer() {
            return RecentAdditionalRouteInfoEntityTypeDeserializer.c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/recent/database/entities/RecentAdditionalRouteInfoEntity$Metro;", "Lapp/chalo/recent/database/entities/RecentAdditionalRouteInfoEntity;", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Metro extends RecentAdditionalRouteInfoEntity {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] c = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hz0(17))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8932a;
        public final ChaloTransitMode b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/recent/database/entities/RecentAdditionalRouteInfoEntity$Metro$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/recent/database/entities/RecentAdditionalRouteInfoEntity$Metro;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Metro> serializer() {
                return RecentAdditionalRouteInfoEntity$Metro$$serializer.f8933a;
            }
        }

        public Metro(int i, String str, ChaloTransitMode chaloTransitMode) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.b(RecentAdditionalRouteInfoEntity$Metro$$serializer.f8933a.getDescriptor(), i, 1);
                throw null;
            }
            this.f8932a = str;
            if ((i & 2) == 0) {
                this.b = ChaloTransitMode.METRO;
            } else {
                this.b = chaloTransitMode;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Metro) && Intrinsics.d(this.f8932a, ((Metro) obj).f8932a);
        }

        public final int hashCode() {
            return this.f8932a.hashCode();
        }

        public final String toString() {
            return vo1.B("Metro(lineColor=", this.f8932a, ")");
        }

        public Metro(String lineColor) {
            Intrinsics.i(lineColor, "lineColor");
            this.f8932a = lineColor;
            this.b = ChaloTransitMode.METRO;
        }
    }
}
