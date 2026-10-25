package defpackage;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gu implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15767a;
    public final /* synthetic */ Callable b;

    public /* synthetic */ gu(Callable callable, int i) {
        this.f15767a = i;
        this.b = callable;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        switch (this.f15767a) {
            case 0:
                return CrashlyticsWorker.lambda$submit$0(this.b, task);
            case 1:
                return CrashlyticsWorker.lambda$submitTask$2(this.b, task);
            case 2:
                return CrashlyticsWorker.lambda$submitTask$3(this.b, task);
            default:
                return CrashlyticsWorker.lambda$submitTaskOnSuccess$4(this.b, task);
        }
    }
}
