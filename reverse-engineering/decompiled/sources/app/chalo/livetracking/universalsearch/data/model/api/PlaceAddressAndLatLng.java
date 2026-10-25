package app.chalo.livetracking.universalsearch.data.model.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/api/PlaceAddressAndLatLng;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PlaceAddressAndLatLng {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4973a;
    public final PlaceGeometry b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/api/PlaceAddressAndLatLng$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/universalsearch/data/model/api/PlaceAddressAndLatLng;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PlaceAddressAndLatLng> serializer() {
            return PlaceAddressAndLatLng$$serializer.f4974a;
        }
    }

    public /* synthetic */ PlaceAddressAndLatLng(int i, String str, PlaceGeometry placeGeometry) {
        if ((i & 1) == 0) {
            this.f4973a = null;
        } else {
            this.f4973a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = placeGeometry;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceAddressAndLatLng)) {
            return false;
        }
        PlaceAddressAndLatLng placeAddressAndLatLng = (PlaceAddressAndLatLng) obj;
        return Intrinsics.d(this.f4973a, placeAddressAndLatLng.f4973a) && Intrinsics.d(this.b, placeAddressAndLatLng.b);
    }

    public final int hashCode() {
        String str = this.f4973a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PlaceGeometry placeGeometry = this.b;
        return iHashCode + (placeGeometry != null ? placeGeometry.hashCode() : 0);
    }

    public final String toString() {
        return "PlaceAddressAndLatLng(formattedAddress=" + this.f4973a + ", geometry=" + this.b + ")";
    }
}
