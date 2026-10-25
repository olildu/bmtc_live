package defpackage;

import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xb1 implements StreetViewPanorama.OnStreetViewPanoramaClickListener, StreetViewPanorama.OnStreetViewPanoramaLongClickListener, StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener, StreetViewPanorama.OnStreetViewPanoramaChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StreetViewPanoramaPropertiesNode f20005a;

    public /* synthetic */ xb1(StreetViewPanoramaPropertiesNode streetViewPanoramaPropertiesNode) {
        this.f20005a = streetViewPanoramaPropertiesNode;
    }

    @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener
    public void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera it) {
        Intrinsics.i(it, "it");
        this.f20005a.f14665a.getClass();
        throw null;
    }

    @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener
    public void onStreetViewPanoramaChange(StreetViewPanoramaLocation it) {
        Intrinsics.i(it, "it");
        this.f20005a.f14665a.getClass();
        throw null;
    }

    @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener
    public void onStreetViewPanoramaClick(StreetViewPanoramaOrientation it) {
        Intrinsics.i(it, "it");
        this.f20005a.c.getClass();
        throw null;
    }

    @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener
    public void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation it) {
        Intrinsics.i(it, "it");
        this.f20005a.c.getClass();
        throw null;
    }
}
