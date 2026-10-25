package app.chalo.universalsearch.data;

import defpackage.b3;
import defpackage.ll1;
import defpackage.nf1;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lapp/chalo/universalsearch/data/UniversalSearchOption;", "", "Companion", "PLACES", "ROUTES", "STOPS", "TRIPS", "ALL", "Lapp/chalo/universalsearch/data/UniversalSearchOption$ALL;", "Lapp/chalo/universalsearch/data/UniversalSearchOption$PLACES;", "Lapp/chalo/universalsearch/data/UniversalSearchOption$ROUTES;", "Lapp/chalo/universalsearch/data/UniversalSearchOption$STOPS;", "Lapp/chalo/universalsearch/data/UniversalSearchOption$TRIPS;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class UniversalSearchOption {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f10136a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ll1(25));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/universalsearch/data/UniversalSearchOption$ALL;", "Lapp/chalo/universalsearch/data/UniversalSearchOption;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final class ALL extends UniversalSearchOption {
        public static final ALL INSTANCE = new ALL();
        public static final /* synthetic */ Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ll1(26));

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<ALL> serializer() {
            return (KSerializer) b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/universalsearch/data/UniversalSearchOption$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/universalsearch/data/UniversalSearchOption;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<UniversalSearchOption> serializer() {
            return (KSerializer) UniversalSearchOption.f10136a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/universalsearch/data/UniversalSearchOption$PLACES;", "Lapp/chalo/universalsearch/data/UniversalSearchOption;", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PLACES extends UniversalSearchOption {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final boolean b;
        public final boolean c;
        public final boolean d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/universalsearch/data/UniversalSearchOption$PLACES$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/universalsearch/data/UniversalSearchOption$PLACES;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PLACES> serializer() {
                return UniversalSearchOption$PLACES$$serializer.f10137a;
            }
        }

        public /* synthetic */ PLACES(int i, boolean z, boolean z2, boolean z3) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(UniversalSearchOption$PLACES$$serializer.f10137a.getDescriptor(), i, 3);
                throw null;
            }
            this.b = z;
            this.c = z2;
            if ((i & 4) == 0) {
                this.d = true;
            } else {
                this.d = z3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PLACES)) {
                return false;
            }
            PLACES places = (PLACES) obj;
            return this.b == places.b && this.c == places.c && this.d == places.d;
        }

        public final int hashCode() {
            return ((((this.b ? 1231 : 1237) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237);
        }

        public final String toString() {
            return b3.g(")", nf1.r("PLACES(showRecent=", ", showFavorites=", ", shouldShowHeader=", this.b, this.c), this.d);
        }

        public PLACES(boolean z, boolean z2) {
            this.b = true;
            this.c = z;
            this.d = z2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/universalsearch/data/UniversalSearchOption$STOPS;", "Lapp/chalo/universalsearch/data/UniversalSearchOption;", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class STOPS extends UniversalSearchOption {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final boolean b;
        public final boolean c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/universalsearch/data/UniversalSearchOption$STOPS$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/universalsearch/data/UniversalSearchOption$STOPS;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<STOPS> serializer() {
                return UniversalSearchOption$STOPS$$serializer.f10139a;
            }
        }

        public /* synthetic */ STOPS(int i, boolean z, boolean z2) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(UniversalSearchOption$STOPS$$serializer.f10139a.getDescriptor(), i, 3);
                throw null;
            }
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof STOPS)) {
                return false;
            }
            STOPS stops = (STOPS) obj;
            return this.b == stops.b && this.c == stops.c;
        }

        public final int hashCode() {
            return ((this.b ? 1231 : 1237) * 31) + (this.c ? 1231 : 1237);
        }

        public final String toString() {
            return "STOPS(showRecent=" + this.b + ", showFavorites=" + this.c + ")";
        }

        public STOPS(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/universalsearch/data/UniversalSearchOption$ROUTES;", "Lapp/chalo/universalsearch/data/UniversalSearchOption;", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ROUTES extends UniversalSearchOption {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final boolean b;
        public final boolean c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/universalsearch/data/UniversalSearchOption$ROUTES$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/universalsearch/data/UniversalSearchOption$ROUTES;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<ROUTES> serializer() {
                return UniversalSearchOption$ROUTES$$serializer.f10138a;
            }
        }

        public ROUTES() {
            this.b = true;
            this.c = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ROUTES)) {
                return false;
            }
            ROUTES routes = (ROUTES) obj;
            return this.b == routes.b && this.c == routes.c;
        }

        public final int hashCode() {
            return ((this.b ? 1231 : 1237) * 31) + (this.c ? 1231 : 1237);
        }

        public final String toString() {
            return "ROUTES(showRecent=" + this.b + ", showFavorites=" + this.c + ")";
        }

        public /* synthetic */ ROUTES(int i, boolean z, boolean z2) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(UniversalSearchOption$ROUTES$$serializer.f10138a.getDescriptor(), i, 3);
                throw null;
            }
            this.b = z;
            this.c = z2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/universalsearch/data/UniversalSearchOption$TRIPS;", "Lapp/chalo/universalsearch/data/UniversalSearchOption;", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class TRIPS extends UniversalSearchOption {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final boolean b;
        public final boolean c;
        public final boolean d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/universalsearch/data/UniversalSearchOption$TRIPS$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/universalsearch/data/UniversalSearchOption$TRIPS;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<TRIPS> serializer() {
                return UniversalSearchOption$TRIPS$$serializer.f10140a;
            }
        }

        public TRIPS() {
            this.b = true;
            this.c = true;
            this.d = true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TRIPS)) {
                return false;
            }
            TRIPS trips = (TRIPS) obj;
            return this.b == trips.b && this.c == trips.c && this.d == trips.d;
        }

        public final int hashCode() {
            return ((((this.b ? 1231 : 1237) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237);
        }

        public final String toString() {
            return b3.g(")", nf1.r("TRIPS(showRecent=", ", shouldShowStopBasedTrips=", ", shouldShowPlacesBasedTrips=", this.b, this.c), this.d);
        }

        public /* synthetic */ TRIPS(int i, boolean z, boolean z2, boolean z3) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(UniversalSearchOption$TRIPS$$serializer.f10140a.getDescriptor(), i, 7);
                throw null;
            }
            this.b = z;
            this.c = z2;
            this.d = z3;
        }
    }
}
