package defpackage;

import com.google.android.gms.maps.StreetViewPanorama;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class yb1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20094a;
    public final /* synthetic */ StreetViewPanorama b;

    public /* synthetic */ yb1(StreetViewPanorama streetViewPanorama, int i) {
        this.f20094a = i;
        this.b = streetViewPanorama;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20094a) {
            case 0:
                this.b.setOnStreetViewPanoramaCameraChangeListener(null);
                break;
            case 1:
                this.b.setOnStreetViewPanoramaChangeListener(null);
                break;
            case 2:
                this.b.setOnStreetViewPanoramaClickListener(null);
                break;
            default:
                this.b.setOnStreetViewPanoramaLongClickListener(null);
                break;
        }
        return Unit.f17538a;
    }
}
