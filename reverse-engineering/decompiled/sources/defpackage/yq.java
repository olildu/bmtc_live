package defpackage;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class yq implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20134a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yq(int i, Object obj, Object obj2) {
        this.f20134a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f20134a) {
            case 0:
                return ((ComponentRuntime) this.b).lambda$discoverComponents$0((Component) this.c);
            case 1:
                return DefaultHeartBeatController.lambda$new$2((Context) this.b, (String) this.c);
            default:
                return ((FirebaseApp) this.b).lambda$new$0((Context) this.c);
        }
    }
}
