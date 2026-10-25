package defpackage;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class du implements Deferred.DeferredHandler, SynchronizationGuard.CriticalSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f15493a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ du(Uploader uploader, Iterable iterable, TransportContext transportContext, long j) {
        this.b = uploader;
        this.c = iterable;
        this.d = transportContext;
        this.f15493a = j;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        Uploader uploader = (Uploader) this.b;
        Iterable iterable = (Iterable) this.c;
        TransportContext transportContext = (TransportContext) this.d;
        EventStore eventStore = uploader.c;
        eventStore.M0(iterable);
        eventStore.e1(uploader.g.a() + this.f15493a, transportContext);
        return null;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        CrashlyticsNativeComponentDeferredProxy.lambda$prepareNativeSession$1((String) this.b, (String) this.c, this.f15493a, (StaticSessionData) this.d, provider);
    }

    public /* synthetic */ du(String str, String str2, long j, StaticSessionData staticSessionData) {
        this.b = str;
        this.c = str2;
        this.f15493a = j;
        this.d = staticSessionData;
    }
}
