package app.chalo.features.freshchat;

import app.chalo.providers.CoroutineContextProvider;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/freshchat/FreshChatInitializerImpl;", "Lapp/chalo/features/freshchat/FreshChatInitializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FreshChatInitializerImpl implements FreshChatInitializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f2715a;
    public final Lazy b;
    public final ContextScope c;

    public FreshChatInitializerImpl(Lazy lazy, Lazy lazy2, CoroutineContextProvider coroutineContextProvider) {
        this.f2715a = lazy;
        this.b = lazy2;
        this.c = CoroutineScopeKt.a(coroutineContextProvider.b().plus(SupervisorKt.b()));
    }

    @Override // app.chalo.features.freshchat.FreshChatInitializer
    public final void a() {
        BuildersKt.d(this.c, null, null, new FreshChatInitializerImpl$initFreshChat$1(this, null), 3);
    }
}
