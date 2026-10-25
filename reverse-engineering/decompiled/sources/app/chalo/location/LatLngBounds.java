package app.chalo.location;

import defpackage.gd0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/LatLngBounds;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LatLngBounds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f5135a;
    public final LatLng b;
    public final Lazy c = LazyKt.b(new gd0(this, 2));

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        this.f5135a = latLng;
        this.b = latLng2;
    }
}
