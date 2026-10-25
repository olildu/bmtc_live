package app.chalo.livetracking.tripplanner.domain;

import defpackage.nf1;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/ItineraryRequestHolder;", "", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class ItineraryRequestHolder {
    public static final ItineraryRequestHolder c = new ItineraryRequestHolder("", EmptyList.f17557a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4702a;
    public final List b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/ItineraryRequestHolder$Companion;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ItineraryRequestHolder(String str, List requests) {
        Intrinsics.i(requests, "requests");
        this.f4702a = str;
        this.b = requests;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItineraryRequestHolder)) {
            return false;
        }
        ItineraryRequestHolder itineraryRequestHolder = (ItineraryRequestHolder) obj;
        return Intrinsics.d(this.f4702a, itineraryRequestHolder.f4702a) && Intrinsics.d(this.b, itineraryRequestHolder.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4702a.hashCode() * 31);
    }

    public final String toString() {
        return nf1.m("ItineraryRequestHolder(id=", this.f4702a, ", requests=", ")", this.b);
    }
}
