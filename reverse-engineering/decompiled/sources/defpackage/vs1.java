package defpackage;

import android.content.Context;
import com.inmobi.media.AbstractC2644s0;
import com.inmobi.media.AbstractC2689v3;
import com.inmobi.media.C2700w0;
import com.inmobi.media.C2705w5;
import com.inmobi.media.C2749z7;
import com.inmobi.media.E0;
import com.inmobi.media.GestureDetectorOnGestureListenerC2738ya;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class vs1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19865a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vs1(int i, Object obj, Object obj2) {
        this.f19865a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19865a) {
            case 0:
                AbstractC2689v3.a((Integer) this.b, (Context) this.c);
                break;
            case 1:
                C2700w0.a((C2749z7) this.b, (E0) this.c);
                break;
            case 2:
                C2705w5.a((C2705w5) this.b, (AbstractC2644s0) this.c);
                break;
            default:
                GestureDetectorOnGestureListenerC2738ya.a((GestureDetectorOnGestureListenerC2738ya) this.b, (String) this.c);
                break;
        }
    }
}
