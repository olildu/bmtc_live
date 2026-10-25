package app.chalo.recent.model.app;

import app.chalo.citydata.data.model.app.StopAppModel;
import defpackage.hz0;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lapp/chalo/recent/model/app/RecentLocationPairEndpointAppModel;", "", "Companion", "Stop", "Place", "NearbyStopToPlace", "Lapp/chalo/recent/model/app/RecentLocationPairEndpointAppModel$NearbyStopToPlace;", "Lapp/chalo/recent/model/app/RecentLocationPairEndpointAppModel$Place;", "Lapp/chalo/recent/model/app/RecentLocationPairEndpointAppModel$Stop;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class RecentLocationPairEndpointAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f8998a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hz0(24));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/recent/model/app/RecentLocationPairEndpointAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/recent/model/app/RecentLocationPairEndpointAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static String a(RecentLocationPairEndpointAppModel recentLocationPairEndpointAppModel, RecentLocationPairEndpointAppModel recentLocationPairEndpointAppModel2) {
            String strN;
            String strN2;
            if (recentLocationPairEndpointAppModel instanceof Stop) {
                strN = ((Stop) recentLocationPairEndpointAppModel).b.f1727a;
            } else if (recentLocationPairEndpointAppModel instanceof Place) {
                strN = ((Place) recentLocationPairEndpointAppModel).b.e;
            } else {
                if (!(recentLocationPairEndpointAppModel instanceof NearbyStopToPlace)) {
                    throw new NoWhenBranchMatchedException();
                }
                NearbyStopToPlace nearbyStopToPlace = (NearbyStopToPlace) recentLocationPairEndpointAppModel;
                strN = vo1.n(nearbyStopToPlace.b.f1727a, "_", nearbyStopToPlace.c.e);
            }
            if (recentLocationPairEndpointAppModel2 instanceof Stop) {
                strN2 = ((Stop) recentLocationPairEndpointAppModel2).b.f1727a;
            } else if (recentLocationPairEndpointAppModel2 instanceof Place) {
                strN2 = ((Place) recentLocationPairEndpointAppModel2).b.e;
            } else {
                if (!(recentLocationPairEndpointAppModel2 instanceof NearbyStopToPlace)) {
                    throw new NoWhenBranchMatchedException();
                }
                NearbyStopToPlace nearbyStopToPlace2 = (NearbyStopToPlace) recentLocationPairEndpointAppModel2;
                strN2 = vo1.n(nearbyStopToPlace2.b.f1727a, "_", nearbyStopToPlace2.c.e);
            }
            return vo1.n(strN, "__", strN2);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<RecentLocationPairEndpointAppModel> serializer() {
            return (KSerializer) RecentLocationPairEndpointAppModel.f8998a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/recent/model/app/RecentLocationPairEndpointAppModel$NearbyStopToPlace;", "Lapp/chalo/recent/model/app/RecentLocationPairEndpointAppModel;", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class NearbyStopToPlace extends RecentLocationPairEndpointAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final StopAppModel b;
        public final RecentPlaceAppModel c;
        public final long d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/recent/model/app/RecentLocationPairEndpointAppModel$NearbyStopToPlace$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/recent/model/app/RecentLocationPairEndpointAppModel$NearbyStopToPlace;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<NearbyStopToPlace> serializer() {
                return RecentLocationPairEndpointAppModel$NearbyStopToPlace$$serializer.f8999a;
            }
        }

        public /* synthetic */ NearbyStopToPlace(int i, StopAppModel stopAppModel, RecentPlaceAppModel recentPlaceAppModel, long j) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(RecentLocationPairEndpointAppModel$NearbyStopToPlace$$serializer.f8999a.getDescriptor(), i, 7);
                throw null;
            }
            this.b = stopAppModel;
            this.c = recentPlaceAppModel;
            this.d = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NearbyStopToPlace)) {
                return false;
            }
            NearbyStopToPlace nearbyStopToPlace = (NearbyStopToPlace) obj;
            return Intrinsics.d(this.b, nearbyStopToPlace.b) && Intrinsics.d(this.c, nearbyStopToPlace.c) && this.d == nearbyStopToPlace.d;
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
            long j = this.d;
            return iHashCode + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NearbyStopToPlace(stop=");
            sb.append(this.b);
            sb.append(", place=");
            sb.append(this.c);
            sb.append(", distanceMeters=");
            return uf0.m(this.d, ")", sb);
        }

        public NearbyStopToPlace(StopAppModel stopAppModel, RecentPlaceAppModel place, long j) {
            Intrinsics.i(place, "place");
            this.b = stopAppModel;
            this.c = place;
            this.d = j;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/recent/model/app/RecentLocationPairEndpointAppModel$Place;", "Lapp/chalo/recent/model/app/RecentLocationPairEndpointAppModel;", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Place extends RecentLocationPairEndpointAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final RecentPlaceAppModel b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/recent/model/app/RecentLocationPairEndpointAppModel$Place$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/recent/model/app/RecentLocationPairEndpointAppModel$Place;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Place> serializer() {
                return RecentLocationPairEndpointAppModel$Place$$serializer.f9000a;
            }
        }

        public /* synthetic */ Place(int i, RecentPlaceAppModel recentPlaceAppModel) {
            if (1 == (i & 1)) {
                this.b = recentPlaceAppModel;
            } else {
                PluginExceptionsKt.b(RecentLocationPairEndpointAppModel$Place$$serializer.f9000a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Place) && Intrinsics.d(this.b, ((Place) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Place(place=" + this.b + ")";
        }

        public Place(RecentPlaceAppModel place) {
            Intrinsics.i(place, "place");
            this.b = place;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/recent/model/app/RecentLocationPairEndpointAppModel$Stop;", "Lapp/chalo/recent/model/app/RecentLocationPairEndpointAppModel;", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Stop extends RecentLocationPairEndpointAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final StopAppModel b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/recent/model/app/RecentLocationPairEndpointAppModel$Stop$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/recent/model/app/RecentLocationPairEndpointAppModel$Stop;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Stop> serializer() {
                return RecentLocationPairEndpointAppModel$Stop$$serializer.f9001a;
            }
        }

        public /* synthetic */ Stop(int i, StopAppModel stopAppModel) {
            if (1 == (i & 1)) {
                this.b = stopAppModel;
            } else {
                PluginExceptionsKt.b(RecentLocationPairEndpointAppModel$Stop$$serializer.f9001a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Stop) && Intrinsics.d(this.b, ((Stop) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Stop(stop=" + this.b + ")";
        }

        public Stop(StopAppModel stop) {
            Intrinsics.i(stop, "stop");
            this.b = stop;
        }
    }
}
