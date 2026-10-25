package defpackage;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.inject.Provider;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xq implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20043a;

    public /* synthetic */ xq(int i) {
        this.f20043a = i;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f20043a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return ExecutorsRegistrar.lambda$static$0();
            case 2:
                return ExecutorsRegistrar.lambda$static$1();
            case 3:
                return ExecutorsRegistrar.lambda$static$2();
            case 4:
                return ExecutorsRegistrar.lambda$static$3();
            case 5:
                return FirebaseMessaging.lambda$clearTransportFactoryForTest$12();
            case 6:
                return FirebaseMessaging.lambda$static$0();
            default:
                return RemoteConfigComponent.lambda$getFetchHandler$0();
        }
    }
}
