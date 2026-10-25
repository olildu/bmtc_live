package app.chalo.scenes.args;

import app.chalo.scenes.ChaloScenes;
import defpackage.cl1;
import defpackage.t10;
import defpackage.vo1;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lapp/chalo/scenes/args/TripPlannerArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Companion", "StopFocusedSearchScreen", "StopFocusedResultsScreen", "ResultsScreen", "DetailsScreen", "Lapp/chalo/scenes/args/TripPlannerArgs$DetailsScreen;", "Lapp/chalo/scenes/args/TripPlannerArgs$ResultsScreen;", "Lapp/chalo/scenes/args/TripPlannerArgs$StopFocusedResultsScreen;", "Lapp/chalo/scenes/args/TripPlannerArgs$StopFocusedSearchScreen;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class TripPlannerArgs extends SceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new cl1(1));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/TripPlannerArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/TripPlannerArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<TripPlannerArgs> serializer() {
            return (KSerializer) TripPlannerArgs.b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/TripPlannerArgs$DetailsScreen;", "Lapp/chalo/scenes/args/TripPlannerArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class DetailsScreen extends TripPlannerArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;
        public final long d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/TripPlannerArgs$DetailsScreen$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/TripPlannerArgs$DetailsScreen;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<DetailsScreen> serializer() {
                return TripPlannerArgs$DetailsScreen$$serializer.f9330a;
            }
        }

        public /* synthetic */ DetailsScreen(int i, String str, long j) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(TripPlannerArgs$DetailsScreen$$serializer.f9330a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = str;
            this.d = j;
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.TripPlannerDetailsScreen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DetailsScreen)) {
                return false;
            }
            DetailsScreen detailsScreen = (DetailsScreen) obj;
            return Intrinsics.d(this.c, detailsScreen.c) && this.d == detailsScreen.d;
        }

        public final int hashCode() {
            int iHashCode = this.c.hashCode() * 31;
            long j = this.d;
            return iHashCode + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            StringBuilder sbM = t10.m(this.d, "DetailsScreen(tripPlannerItineraryAppResponseModel=", this.c, ", tripPlannerStartTime=");
            sbM.append(")");
            return sbM.toString();
        }

        public DetailsScreen(String tripPlannerItineraryAppResponseModel, long j) {
            Intrinsics.i(tripPlannerItineraryAppResponseModel, "tripPlannerItineraryAppResponseModel");
            this.c = tripPlannerItineraryAppResponseModel;
            this.d = j;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/TripPlannerArgs$ResultsScreen;", "Lapp/chalo/scenes/args/TripPlannerArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ResultsScreen extends TripPlannerArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;
        public final String d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/TripPlannerArgs$ResultsScreen$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/TripPlannerArgs$ResultsScreen;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<ResultsScreen> serializer() {
                return TripPlannerArgs$ResultsScreen$$serializer.f9331a;
            }
        }

        public /* synthetic */ ResultsScreen(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
            if ((i & 2) == 0) {
                this.d = null;
            } else {
                this.d = str2;
            }
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.TripPlannerResultsScreen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultsScreen)) {
                return false;
            }
            ResultsScreen resultsScreen = (ResultsScreen) obj;
            return Intrinsics.d(this.c, resultsScreen.c) && Intrinsics.d(this.d, resultsScreen.d);
        }

        public final int hashCode() {
            String str = this.c;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.d;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return vo1.o("ResultsScreen(fromLocation=", this.c, ", toLocation=", this.d, ")");
        }

        public ResultsScreen(String str, String str2) {
            this.c = str;
            this.d = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/TripPlannerArgs$StopFocusedResultsScreen;", "Lapp/chalo/scenes/args/TripPlannerArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class StopFocusedResultsScreen extends TripPlannerArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/TripPlannerArgs$StopFocusedResultsScreen$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/TripPlannerArgs$StopFocusedResultsScreen;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<StopFocusedResultsScreen> serializer() {
                return TripPlannerArgs$StopFocusedResultsScreen$$serializer.f9332a;
            }
        }

        public /* synthetic */ StopFocusedResultsScreen(int i, String str) {
            if (1 == (i & 1)) {
                this.c = str;
            } else {
                PluginExceptionsKt.b(TripPlannerArgs$StopFocusedResultsScreen$$serializer.f9332a.getDescriptor(), i, 1);
                throw null;
            }
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.StopTripPlannerResultsScreen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StopFocusedResultsScreen) && Intrinsics.d(this.c, ((StopFocusedResultsScreen) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return vo1.B("StopFocusedResultsScreen(screenData=", this.c, ")");
        }

        public StopFocusedResultsScreen(String str) {
            this.c = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/TripPlannerArgs$StopFocusedSearchScreen;", "Lapp/chalo/scenes/args/TripPlannerArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class StopFocusedSearchScreen extends TripPlannerArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/TripPlannerArgs$StopFocusedSearchScreen$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/TripPlannerArgs$StopFocusedSearchScreen;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<StopFocusedSearchScreen> serializer() {
                return TripPlannerArgs$StopFocusedSearchScreen$$serializer.f9333a;
            }
        }

        public /* synthetic */ StopFocusedSearchScreen(int i, String str) {
            if ((i & 1) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.StopTripPlannerSearchScreen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StopFocusedSearchScreen) && Intrinsics.d(this.c, ((StopFocusedSearchScreen) obj).c);
        }

        public final int hashCode() {
            String str = this.c;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("StopFocusedSearchScreen(screenData=", this.c, ")");
        }

        public StopFocusedSearchScreen(String str) {
            this.c = str;
        }
    }
}
