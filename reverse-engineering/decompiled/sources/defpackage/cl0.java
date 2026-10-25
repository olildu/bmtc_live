package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import com.inmobi.media.C2651s7;
import com.inmobi.media.N0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class cl0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11341a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ View c;

    public /* synthetic */ cl0(View view, int i, Object obj) {
        this.f11341a = i;
        this.b = obj;
        this.c = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11341a) {
            case 0:
                N0.a((C2651s7) this.b, this.c, valueAnimator);
                break;
            case 1:
                N0.b((C2651s7) this.b, this.c, valueAnimator);
                break;
            default:
                ((ViewPropertyAnimatorUpdateListener) this.b).onAnimationUpdate(this.c);
                break;
        }
    }
}
