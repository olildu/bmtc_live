package defpackage;

import android.view.View;
import androidx.media3.ui.PlayerControlView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class eg implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15549a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eg(Object obj, int i) {
        this.f15549a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.f15549a) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.b;
                if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
                    view.post(new i0(carouselLayoutManager, 10));
                }
                break;
            default:
                ((PlayerControlView) this.b).onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }
}
