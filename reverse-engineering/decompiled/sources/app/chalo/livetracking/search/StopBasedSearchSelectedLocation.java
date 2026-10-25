package app.chalo.livetracking.search;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.data.model.app.response.NearbyStopToLocationAppModel;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import defpackage.ra1;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation;", "", "Companion", "StopSelected", "PlaceSelected", "NearestStopToPlaceSelected", "AllNearbyStopSelected", "Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation$AllNearbyStopSelected;", "Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation$NearestStopToPlaceSelected;", "Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation$PlaceSelected;", "Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation$StopSelected;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class StopBasedSearchSelectedLocation {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ra1(14));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4480a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation$AllNearbyStopSelected;", "Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation;", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class AllNearbyStopSelected extends StopBasedSearchSelectedLocation {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final RecentPlaceAppModel c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation$AllNearbyStopSelected$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation$AllNearbyStopSelected;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<AllNearbyStopSelected> serializer() {
                return StopBasedSearchSelectedLocation$AllNearbyStopSelected$$serializer.f4481a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AllNearbyStopSelected(int i, String str, RecentPlaceAppModel recentPlaceAppModel) {
            super(str);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(StopBasedSearchSelectedLocation$AllNearbyStopSelected$$serializer.f4481a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = recentPlaceAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AllNearbyStopSelected) && Intrinsics.d(this.c, ((AllNearbyStopSelected) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return "AllNearbyStopSelected(place=" + this.c + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AllNearbyStopSelected(RecentPlaceAppModel place) {
            super("AllNearbyStops", 0);
            Intrinsics.i(place, "place");
            this.c = place;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<StopBasedSearchSelectedLocation> serializer() {
            return (KSerializer) StopBasedSearchSelectedLocation.b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation$NearestStopToPlaceSelected;", "Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation;", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class NearestStopToPlaceSelected extends StopBasedSearchSelectedLocation {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final NearbyStopToLocationAppModel c;
        public final RecentPlaceAppModel d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation$NearestStopToPlaceSelected$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation$NearestStopToPlaceSelected;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<NearestStopToPlaceSelected> serializer() {
                return StopBasedSearchSelectedLocation$NearestStopToPlaceSelected$$serializer.f4482a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ NearestStopToPlaceSelected(int i, String str, NearbyStopToLocationAppModel nearbyStopToLocationAppModel, RecentPlaceAppModel recentPlaceAppModel) {
            super(str);
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(StopBasedSearchSelectedLocation$NearestStopToPlaceSelected$$serializer.f4482a.getDescriptor(), i, 7);
                throw null;
            }
            this.c = nearbyStopToLocationAppModel;
            this.d = recentPlaceAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NearestStopToPlaceSelected)) {
                return false;
            }
            NearestStopToPlaceSelected nearestStopToPlaceSelected = (NearestStopToPlaceSelected) obj;
            return Intrinsics.d(this.c, nearestStopToPlaceSelected.c) && Intrinsics.d(this.d, nearestStopToPlaceSelected.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + (this.c.hashCode() * 31);
        }

        public final String toString() {
            return "NearestStopToPlaceSelected(stop=" + this.c + ", place=" + this.d + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NearestStopToPlaceSelected(NearbyStopToLocationAppModel stop, RecentPlaceAppModel place) {
            super("NearestStopToPlace", 0);
            Intrinsics.i(stop, "stop");
            Intrinsics.i(place, "place");
            this.c = stop;
            this.d = place;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation$PlaceSelected;", "Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation;", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PlaceSelected extends StopBasedSearchSelectedLocation {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final RecentPlaceAppModel c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation$PlaceSelected$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation$PlaceSelected;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PlaceSelected> serializer() {
                return StopBasedSearchSelectedLocation$PlaceSelected$$serializer.f4483a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PlaceSelected(int i, String str, RecentPlaceAppModel recentPlaceAppModel) {
            super(str);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(StopBasedSearchSelectedLocation$PlaceSelected$$serializer.f4483a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = recentPlaceAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PlaceSelected) && Intrinsics.d(this.c, ((PlaceSelected) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return "PlaceSelected(place=" + this.c + ")";
        }

        public PlaceSelected(RecentPlaceAppModel recentPlaceAppModel) {
            super("Place", 0);
            this.c = recentPlaceAppModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation$StopSelected;", "Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation;", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class StopSelected extends StopBasedSearchSelectedLocation {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final StopAppModel c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation$StopSelected$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation$StopSelected;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<StopSelected> serializer() {
                return StopBasedSearchSelectedLocation$StopSelected$$serializer.f4484a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StopSelected(int i, String str, StopAppModel stopAppModel) {
            super(str);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(StopBasedSearchSelectedLocation$StopSelected$$serializer.f4484a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = stopAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StopSelected) && Intrinsics.d(this.c, ((StopSelected) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return "StopSelected(stop=" + this.c + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopSelected(StopAppModel stop) {
            super("Stop", 0);
            Intrinsics.i(stop, "stop");
            this.c = stop;
        }
    }

    public /* synthetic */ StopBasedSearchSelectedLocation(String str) {
        this.f4480a = str;
    }

    public StopBasedSearchSelectedLocation(String str, int i) {
        this.f4480a = str;
    }
}
