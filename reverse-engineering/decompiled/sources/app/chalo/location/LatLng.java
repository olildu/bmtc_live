package app.chalo.location;

import android.location.Location;
import defpackage.gd0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/location/LatLng;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable(with = LatLngSerializer.class)
public final class LatLng {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f5134a;
    public final double b;
    public final Lazy c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/location/LatLng$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/location/LatLng;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<LatLng> serializer() {
            return LatLngSerializer.f5136a;
        }
    }

    public LatLng(double d, double d2) {
        this.f5134a = d;
        this.b = d2;
        this.c = LazyKt.b(new gd0(this, 1));
    }

    public final double a(LatLng other) {
        Intrinsics.i(other, "other");
        Location location = new Location("");
        location.setLatitude(this.f5134a);
        location.setLongitude(this.b);
        Location location2 = new Location("");
        location2.setLatitude(other.f5134a);
        location2.setLongitude(other.b);
        return location.distanceTo(location2);
    }

    public final com.google.android.gms.maps.model.LatLng b() {
        return (com.google.android.gms.maps.model.LatLng) this.c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LatLng(com.google.android.gms.maps.model.LatLng latLng) {
        this(latLng.latitude, latLng.longitude);
        Intrinsics.i(latLng, "latLng");
    }
}
