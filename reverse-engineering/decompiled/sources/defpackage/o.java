package defpackage;

import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o implements ComponentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18555a;

    public /* synthetic */ o(int i) {
        this.f18555a = i;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f18555a) {
            case 0:
                return AbtRegistrar.lambda$getComponents$0(componentContainer);
            case 1:
                return DefaultUserAgentPublisher.lambda$component$0(componentContainer);
            case 2:
                return ExecutorsRegistrar.lambda$getComponents$4(componentContainer);
            case 3:
                return ExecutorsRegistrar.lambda$getComponents$5(componentContainer);
            case 4:
                return ExecutorsRegistrar.lambda$getComponents$6(componentContainer);
            case 5:
                return ExecutorsRegistrar.lambda$getComponents$7(componentContainer);
            case 6:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(componentContainer);
            case 7:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(componentContainer);
            case 8:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(componentContainer);
            case 9:
                return TransportRegistrar.lambda$getComponents$0(componentContainer);
            case 10:
                return TransportRegistrar.lambda$getComponents$1(componentContainer);
            default:
                return TransportRegistrar.lambda$getComponents$2(componentContainer);
        }
    }
}
