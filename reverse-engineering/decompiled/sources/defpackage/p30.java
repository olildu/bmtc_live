package defpackage;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p30 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19000a;
    public final /* synthetic */ FirebaseRemoteConfig b;

    public /* synthetic */ p30(FirebaseRemoteConfig firebaseRemoteConfig, int i) {
        this.f19000a = i;
        this.b = firebaseRemoteConfig;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f19000a) {
            case 0:
                return this.b.lambda$reset$6();
            default:
                return this.b.getInfo();
        }
    }
}
