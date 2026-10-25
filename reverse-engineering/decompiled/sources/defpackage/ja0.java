package defpackage;

import android.window.OnBackInvokedCallback;
import com.google.android.material.motion.MaterialBackHandler;
import com.inmobi.ads.rendering.InMobiAdActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ja0 implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17386a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ja0(Object obj, int i) {
        this.f17386a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f17386a) {
            case 0:
                InMobiAdActivity.a((InMobiAdActivity) this.b);
                break;
            case 1:
                ((MaterialBackHandler) this.b).d();
                break;
            case 2:
                ((Function0) this.b).invoke();
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
