package defpackage;

import android.view.KeyEvent;
import android.view.View;
import com.inmobi.media.C2710wa;
import com.inmobi.media.GestureDetectorOnGestureListenerC2738ya;
import in.juspay.hypersdk.core.InflateView;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ua0 implements View.OnKeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19728a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ua0(int i, Object obj, Object obj2) {
        this.f19728a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        switch (this.f19728a) {
            case 0:
                return ((InflateView) this.b).lambda$parseKeys$2((String) this.c, view, i, keyEvent);
            default:
                return C2710wa.a((GestureDetectorOnGestureListenerC2738ya) this.b, (C2710wa) this.c, view, i, keyEvent);
        }
    }
}
