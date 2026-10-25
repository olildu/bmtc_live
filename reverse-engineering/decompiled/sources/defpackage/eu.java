package defpackage;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.crashlytics.ndk.CrashlyticsNdkRegistrar;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class eu implements ComponentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15589a;
    public final /* synthetic */ ComponentRegistrar b;

    public /* synthetic */ eu(ComponentRegistrar componentRegistrar, int i) {
        this.f15589a = i;
        this.b = componentRegistrar;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f15589a) {
            case 0:
                return ((CrashlyticsNdkRegistrar) this.b).buildCrashlyticsNdk(componentContainer);
            default:
                return ((CrashlyticsRegistrar) this.b).buildCrashlytics(componentContainer);
        }
    }
}
