package defpackage;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallations;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class sq implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19593a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sq(Object obj, int i) {
        this.f19593a = i;
        this.b = obj;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f19593a) {
            case 0:
                return ComponentDiscovery.instantiate((String) this.b);
            default:
                return FirebaseInstallations.lambda$new$0((FirebaseApp) this.b);
        }
    }
}
