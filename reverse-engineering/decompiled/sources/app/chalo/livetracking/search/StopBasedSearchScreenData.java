package app.chalo.livetracking.search;

import app.chalo.constants.Source;
import defpackage.ra1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedSearchScreenData;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class StopBasedSearchScreenData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Source f4478a;
    public final StopBasedSearchSelectedLocation b;
    public final StopBasedSearchSelectedLocation c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedSearchScreenData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/search/StopBasedSearchScreenData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<StopBasedSearchScreenData> serializer() {
            return StopBasedSearchScreenData$$serializer.f4479a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new ra1(11)), LazyKt.a(lazyThreadSafetyMode, new ra1(12)), LazyKt.a(lazyThreadSafetyMode, new ra1(13))};
    }

    public /* synthetic */ StopBasedSearchScreenData(int i, Source source, StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation, StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation2) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(StopBasedSearchScreenData$$serializer.f4479a.getDescriptor(), i, 7);
            throw null;
        }
        this.f4478a = source;
        this.b = stopBasedSearchSelectedLocation;
        this.c = stopBasedSearchSelectedLocation2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopBasedSearchScreenData)) {
            return false;
        }
        StopBasedSearchScreenData stopBasedSearchScreenData = (StopBasedSearchScreenData) obj;
        return this.f4478a == stopBasedSearchScreenData.f4478a && Intrinsics.d(this.b, stopBasedSearchScreenData.b) && Intrinsics.d(this.c, stopBasedSearchScreenData.c);
    }

    public final int hashCode() {
        int iHashCode = this.f4478a.hashCode() * 31;
        StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation = this.b;
        int iHashCode2 = (iHashCode + (stopBasedSearchSelectedLocation == null ? 0 : stopBasedSearchSelectedLocation.hashCode())) * 31;
        StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation2 = this.c;
        return iHashCode2 + (stopBasedSearchSelectedLocation2 != null ? stopBasedSearchSelectedLocation2.hashCode() : 0);
    }

    public final String toString() {
        return "StopBasedSearchScreenData(source=" + this.f4478a + ", fromLocation=" + this.b + ", toLocation=" + this.c + ")";
    }

    public StopBasedSearchScreenData(Source source, StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation, StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation2) {
        Intrinsics.i(source, "source");
        this.f4478a = source;
        this.b = stopBasedSearchSelectedLocation;
        this.c = stopBasedSearchSelectedLocation2;
    }
}
