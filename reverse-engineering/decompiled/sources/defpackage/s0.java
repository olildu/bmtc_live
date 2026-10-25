package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.OnIsEnabledListener;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19257a;
    public final /* synthetic */ ActivityHandler b;
    public final /* synthetic */ OnIsEnabledListener c;

    public /* synthetic */ s0(ActivityHandler activityHandler, OnIsEnabledListener onIsEnabledListener, int i) {
        this.f19257a = i;
        this.b = activityHandler;
        this.c = onIsEnabledListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19257a) {
            case 0:
                this.b.lambda$isEnabled$9(this.c);
                break;
            case 1:
                this.b.lambda$isEnabled$11(this.c);
                break;
            default:
                this.b.lambda$isEnabled$10(this.c);
                break;
        }
    }
}
