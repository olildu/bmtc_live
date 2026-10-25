package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.inmobi.media.C2717x3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class dt1 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15492a;
    public final /* synthetic */ C2717x3 b;

    public /* synthetic */ dt1(C2717x3 c2717x3, int i) {
        this.f15492a = i;
        this.b = c2717x3;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f15492a) {
            case 0:
                return C2717x3.a(this.b, view, motionEvent);
            case 1:
                return C2717x3.c(this.b, view, motionEvent);
            case 2:
                return C2717x3.b(this.b, view, motionEvent);
            default:
                return C2717x3.d(this.b, view, motionEvent);
        }
    }
}
