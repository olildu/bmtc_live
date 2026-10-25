package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l30 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18276a;
    public final /* synthetic */ FirebaseMessaging b;
    public final /* synthetic */ TaskCompletionSource c;

    public /* synthetic */ l30(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource, int i) {
        this.f18276a = i;
        this.b = firebaseMessaging;
        this.c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18276a) {
            case 0:
                this.b.lambda$deleteToken$9(this.c);
                break;
            case 1:
                this.b.lambda$getToken$7(this.c);
                break;
            default:
                this.b.lambda$deleteToken$8(this.c);
                break;
        }
    }
}
