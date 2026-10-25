package defpackage;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.inject.Provider;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wq implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19951a;
    public final /* synthetic */ ComponentRegistrar b;

    public /* synthetic */ wq(ComponentRegistrar componentRegistrar, int i) {
        this.f19951a = i;
        this.b = componentRegistrar;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f19951a) {
            case 0:
                return ComponentRuntime.lambda$toProviders$1(this.b);
            default:
                return ComponentRuntime.Builder.lambda$addComponentRegistrar$0(this.b);
        }
    }
}
