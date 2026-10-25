package defpackage;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class rx implements ComponentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19250a;
    public final /* synthetic */ Qualified b;

    public /* synthetic */ rx(Qualified qualified, int i) {
        this.f19250a = i;
        this.b = qualified;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f19250a) {
            case 0:
                return DefaultHeartBeatController.lambda$component$3(this.b, componentContainer);
            case 1:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.b, componentContainer);
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0(this.b, componentContainer);
        }
    }
}
