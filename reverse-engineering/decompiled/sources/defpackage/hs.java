package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class hs implements SuccessContinuation, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f15856a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hs(Context context, Intent intent, boolean z) {
        this.b = context;
        this.c = intent;
        this.f15856a = z;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return ((ConfigCacheClient) this.b).lambda$put$1(this.f15856a, (ConfigContainer) this.c, (Void) obj);
    }

    public /* synthetic */ hs(ConfigCacheClient configCacheClient, boolean z, ConfigContainer configContainer) {
        this.b = configCacheClient;
        this.f15856a = z;
        this.c = configContainer;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return FcmBroadcastProcessor.lambda$startMessagingService$2((Context) this.b, (Intent) this.c, this.f15856a, task);
    }
}
