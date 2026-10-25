package app.chalo.livetracking.stoptripplannerresult;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.data.model.app.response.NearbyStopToLocationAppModel;
import app.chalo.location.LatLng;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import com.adjust.sdk.Constants;
import defpackage.ra1;
import defpackage.vo1;
import defpackage.xs;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerLocationType;", "", "Companion", "Stop", "NearestStopToPlaceSelected", "AllNearbyStopSelected", "None", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerLocationType$AllNearbyStopSelected;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerLocationType$NearestStopToPlaceSelected;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerLocationType$None;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerLocationType$Stop;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class StopTripPlannerLocationType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ra1(23));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4531a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerLocationType$AllNearbyStopSelected;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerLocationType;", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class AllNearbyStopSelected extends StopTripPlannerLocationType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final RecentPlaceAppModel c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerLocationType$AllNearbyStopSelected$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerLocationType$AllNearbyStopSelected;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<AllNearbyStopSelected> serializer() {
                return StopTripPlannerLocationType$AllNearbyStopSelected$$serializer.f4532a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AllNearbyStopSelected(int i, String str, RecentPlaceAppModel recentPlaceAppModel) {
            super(str);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(StopTripPlannerLocationType$AllNearbyStopSelected$$serializer.f4532a.getDescriptor(), i, 3);
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
            return "AllNearbyStopSelected(associatedPlace=" + this.c + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AllNearbyStopSelected(RecentPlaceAppModel associatedPlace) {
            super("AllNearbyStops", 0);
            Intrinsics.i(associatedPlace, "associatedPlace");
            this.c = associatedPlace;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerLocationType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerLocationType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<StopTripPlannerLocationType> serializer() {
            return (KSerializer) StopTripPlannerLocationType.b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerLocationType$NearestStopToPlaceSelected;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerLocationType;", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class NearestStopToPlaceSelected extends StopTripPlannerLocationType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] f = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ra1(24))};
        public final NearbyStopToLocationAppModel c;
        public final RecentPlaceAppModel d;
        public final List e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerLocationType$NearestStopToPlaceSelected$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerLocationType$NearestStopToPlaceSelected;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<NearestStopToPlaceSelected> serializer() {
                return StopTripPlannerLocationType$NearestStopToPlaceSelected$$serializer.f4533a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ NearestStopToPlaceSelected(int i, String str, NearbyStopToLocationAppModel nearbyStopToLocationAppModel, RecentPlaceAppModel recentPlaceAppModel, List list) {
            super(str);
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(StopTripPlannerLocationType$NearestStopToPlaceSelected$$serializer.f4533a.getDescriptor(), i, 7);
                throw null;
            }
            this.c = nearbyStopToLocationAppModel;
            this.d = recentPlaceAppModel;
            if ((i & 8) == 0) {
                this.e = null;
            } else {
                this.e = list;
            }
        }

        public static NearestStopToPlaceSelected d(NearestStopToPlaceSelected nearestStopToPlaceSelected, List list) {
            NearbyStopToLocationAppModel stop = nearestStopToPlaceSelected.c;
            RecentPlaceAppModel associatedPlace = nearestStopToPlaceSelected.d;
            nearestStopToPlaceSelected.getClass();
            Intrinsics.i(stop, "stop");
            Intrinsics.i(associatedPlace, "associatedPlace");
            return new NearestStopToPlaceSelected(stop, associatedPlace, list);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NearestStopToPlaceSelected)) {
                return false;
            }
            NearestStopToPlaceSelected nearestStopToPlaceSelected = (NearestStopToPlaceSelected) obj;
            return Intrinsics.d(this.c, nearestStopToPlaceSelected.c) && Intrinsics.d(this.d, nearestStopToPlaceSelected.d) && Intrinsics.d(this.e, nearestStopToPlaceSelected.e);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
            List list = this.e;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NearestStopToPlaceSelected(stop=");
            sb.append(this.c);
            sb.append(", associatedPlace=");
            sb.append(this.d);
            sb.append(", nearestStopList=");
            return xs.l(sb, this.e, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NearestStopToPlaceSelected(NearbyStopToLocationAppModel stop, RecentPlaceAppModel associatedPlace, List list) {
            super("NearestStopToPlace", 0);
            Intrinsics.i(stop, "stop");
            Intrinsics.i(associatedPlace, "associatedPlace");
            this.c = stop;
            this.d = associatedPlace;
            this.e = list;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerLocationType$None;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerLocationType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final class None extends StopTripPlannerLocationType {
        public static final None INSTANCE = new None("None", 0);
        public static final /* synthetic */ Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ra1(25));

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<None> serializer() {
            return (KSerializer) c.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerLocationType$Stop;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerLocationType;", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Stop extends StopTripPlannerLocationType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final StopAppModel c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerLocationType$Stop$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerLocationType$Stop;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Stop> serializer() {
                return StopTripPlannerLocationType$Stop$$serializer.f4534a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Stop(int i, String str, StopAppModel stopAppModel) {
            super(str);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(StopTripPlannerLocationType$Stop$$serializer.f4534a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = stopAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Stop) && Intrinsics.d(this.c, ((Stop) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return "Stop(stop=" + this.c + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Stop(StopAppModel stop) {
            super("Stop", 0);
            Intrinsics.i(stop, "stop");
            this.c = stop;
        }
    }

    public /* synthetic */ StopTripPlannerLocationType(String str) {
        this.f4531a = str;
    }

    public final String a() {
        String strN;
        String strN2;
        if (this instanceof Stop) {
            StopAppModel stopAppModel = ((Stop) this).c;
            String str = stopAppModel.e;
            if (str != null) {
                if ((StringsKt.F(str) ? null : str) != null && (strN2 = vo1.n(stopAppModel.b, ", ", stopAppModel.e)) != null) {
                    return strN2;
                }
            }
            return stopAppModel.b;
        }
        if (this instanceof NearestStopToPlaceSelected) {
            NearbyStopToLocationAppModel nearbyStopToLocationAppModel = ((NearestStopToPlaceSelected) this).c;
            String str2 = nearbyStopToLocationAppModel.d;
            return ((StringsKt.F(str2) ? null : str2) == null || (strN = vo1.n(nearbyStopToLocationAppModel.f, ", ", nearbyStopToLocationAppModel.d)) == null) ? nearbyStopToLocationAppModel.f : strN;
        }
        if (this instanceof AllNearbyStopSelected) {
            return ((AllNearbyStopSelected) this).c.i;
        }
        if (equals(None.INSTANCE)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final LatLng b() {
        if (this instanceof Stop) {
            return ((Stop) this).c.c;
        }
        if (this instanceof NearestStopToPlaceSelected) {
            NearbyStopToLocationAppModel nearbyStopToLocationAppModel = ((NearestStopToPlaceSelected) this).c;
            return new LatLng(nearbyStopToLocationAppModel.c, nearbyStopToLocationAppModel.f1740a);
        }
        if (this instanceof AllNearbyStopSelected) {
            return ((AllNearbyStopSelected) this).c.j;
        }
        if (equals(None.INSTANCE)) {
            return new LatLng(0.0d, 0.0d);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Map c(String str) {
        boolean z = this instanceof Stop;
        String str2 = this.f4531a;
        if (z) {
            Pair pair = new Pair(str.concat("type"), str2);
            String strConcat = str.concat("stop name");
            StopAppModel stopAppModel = ((Stop) this).c;
            String str3 = stopAppModel.b;
            LatLng latLng = stopAppModel.c;
            return MapsKt.i(pair, new Pair(strConcat, str3), new Pair(str.concat("stop id"), stopAppModel.f1727a), new Pair(str.concat("lat"), String.valueOf(latLng.f5134a)), new Pair(str.concat(Constants.LONG), String.valueOf(latLng.b)));
        }
        if (this instanceof AllNearbyStopSelected) {
            Pair pair2 = new Pair(str.concat("type"), str2);
            String strConcat2 = str.concat("locationName");
            RecentPlaceAppModel recentPlaceAppModel = ((AllNearbyStopSelected) this).c;
            String str4 = recentPlaceAppModel.g;
            LatLng latLng2 = recentPlaceAppModel.j;
            return MapsKt.i(pair2, new Pair(strConcat2, str4), new Pair(str.concat("place id"), recentPlaceAppModel.e), new Pair(str.concat("lat"), String.valueOf(latLng2.f5134a)), new Pair(str.concat(Constants.LONG), String.valueOf(latLng2.b)));
        }
        if (!(this instanceof NearestStopToPlaceSelected)) {
            if (equals(None.INSTANCE)) {
                return MapsKt.d();
            }
            throw new NoWhenBranchMatchedException();
        }
        Pair pair3 = new Pair(str.concat("type"), str2);
        String strConcat3 = str.concat("stop name");
        NearestStopToPlaceSelected nearestStopToPlaceSelected = (NearestStopToPlaceSelected) this;
        NearbyStopToLocationAppModel nearbyStopToLocationAppModel = nearestStopToPlaceSelected.c;
        Pair pair4 = new Pair(strConcat3, nearbyStopToLocationAppModel.f);
        Pair pair5 = new Pair(str.concat("stop id"), nearbyStopToLocationAppModel.b);
        String strConcat4 = str.concat("locationName");
        RecentPlaceAppModel recentPlaceAppModel2 = nearestStopToPlaceSelected.d;
        return MapsKt.i(pair3, pair4, pair5, new Pair(strConcat4, recentPlaceAppModel2.g), new Pair(str.concat("place id"), recentPlaceAppModel2.e), new Pair(str.concat("distance"), String.valueOf(nearbyStopToLocationAppModel.g)), new Pair(str.concat("lat"), String.valueOf(nearbyStopToLocationAppModel.c)), new Pair(str.concat(Constants.LONG), String.valueOf(nearbyStopToLocationAppModel.f1740a)));
    }

    public StopTripPlannerLocationType(String str, int i) {
        this.f4531a = str;
    }
}
