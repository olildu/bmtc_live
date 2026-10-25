package app.chalo.recent.database.entities;

import defpackage.hz0;
import defpackage.uf0;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity;", "", "Companion", "StopEndpoint", "PlaceEndpoint", "NearbyStopToPlaceEndpoint", "Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity$NearbyStopToPlaceEndpoint;", "Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity$PlaceEndpoint;", "Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity$StopEndpoint;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class RecentLocationPairEndpointEntity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f8935a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hz0(25));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<RecentLocationPairEndpointEntity> serializer() {
            return (KSerializer) RecentLocationPairEndpointEntity.f8935a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity$NearbyStopToPlaceEndpoint;", "Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity;", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class NearbyStopToPlaceEndpoint extends RecentLocationPairEndpointEntity {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final RecentStopInfoEntity b;
        public final RecentPlaceEntity c;
        public final long d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity$NearbyStopToPlaceEndpoint$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity$NearbyStopToPlaceEndpoint;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<NearbyStopToPlaceEndpoint> serializer() {
                return RecentLocationPairEndpointEntity$NearbyStopToPlaceEndpoint$$serializer.f8936a;
            }
        }

        public /* synthetic */ NearbyStopToPlaceEndpoint(int i, RecentStopInfoEntity recentStopInfoEntity, RecentPlaceEntity recentPlaceEntity, long j) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(RecentLocationPairEndpointEntity$NearbyStopToPlaceEndpoint$$serializer.f8936a.getDescriptor(), i, 7);
                throw null;
            }
            this.b = recentStopInfoEntity;
            this.c = recentPlaceEntity;
            this.d = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NearbyStopToPlaceEndpoint)) {
                return false;
            }
            NearbyStopToPlaceEndpoint nearbyStopToPlaceEndpoint = (NearbyStopToPlaceEndpoint) obj;
            return Intrinsics.d(this.b, nearbyStopToPlaceEndpoint.b) && Intrinsics.d(this.c, nearbyStopToPlaceEndpoint.c) && this.d == nearbyStopToPlaceEndpoint.d;
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
            long j = this.d;
            return iHashCode + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NearbyStopToPlaceEndpoint(stop=");
            sb.append(this.b);
            sb.append(", place=");
            sb.append(this.c);
            sb.append(", distanceMeters=");
            return uf0.m(this.d, ")", sb);
        }

        public NearbyStopToPlaceEndpoint(RecentStopInfoEntity recentStopInfoEntity, RecentPlaceEntity recentPlaceEntity, long j) {
            this.b = recentStopInfoEntity;
            this.c = recentPlaceEntity;
            this.d = j;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity$PlaceEndpoint;", "Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity;", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PlaceEndpoint extends RecentLocationPairEndpointEntity {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final RecentPlaceEntity b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity$PlaceEndpoint$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity$PlaceEndpoint;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PlaceEndpoint> serializer() {
                return RecentLocationPairEndpointEntity$PlaceEndpoint$$serializer.f8937a;
            }
        }

        public /* synthetic */ PlaceEndpoint(int i, RecentPlaceEntity recentPlaceEntity) {
            if (1 == (i & 1)) {
                this.b = recentPlaceEntity;
            } else {
                PluginExceptionsKt.b(RecentLocationPairEndpointEntity$PlaceEndpoint$$serializer.f8937a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PlaceEndpoint) && Intrinsics.d(this.b, ((PlaceEndpoint) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "PlaceEndpoint(place=" + this.b + ")";
        }

        public PlaceEndpoint(RecentPlaceEntity recentPlaceEntity) {
            this.b = recentPlaceEntity;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity$StopEndpoint;", "Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity;", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class StopEndpoint extends RecentLocationPairEndpointEntity {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final RecentStopInfoEntity b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity$StopEndpoint$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity$StopEndpoint;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<StopEndpoint> serializer() {
                return RecentLocationPairEndpointEntity$StopEndpoint$$serializer.f8938a;
            }
        }

        public /* synthetic */ StopEndpoint(int i, RecentStopInfoEntity recentStopInfoEntity) {
            if (1 == (i & 1)) {
                this.b = recentStopInfoEntity;
            } else {
                PluginExceptionsKt.b(RecentLocationPairEndpointEntity$StopEndpoint$$serializer.f8938a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StopEndpoint) && Intrinsics.d(this.b, ((StopEndpoint) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "StopEndpoint(stop=" + this.b + ")";
        }

        public StopEndpoint(RecentStopInfoEntity recentStopInfoEntity) {
            this.b = recentStopInfoEntity;
        }
    }
}
