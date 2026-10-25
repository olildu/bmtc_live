package defpackage;

import app.chalo.core.init.ApplicationInitManager;
import app.chalo.providers.CoroutineContextProvider;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w6 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19896a;
    public final /* synthetic */ CoroutineContextProvider b;

    public /* synthetic */ w6(CoroutineContextProvider coroutineContextProvider, int i) {
        this.f19896a = i;
        this.b = coroutineContextProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f19896a;
        CoroutineContextProvider coroutineContextProvider = this.b;
        switch (i) {
            case 0:
                Object obj = ApplicationInitManager.t;
                break;
            case 1:
                break;
        }
        return CoroutineScopeKt.a(coroutineContextProvider.b());
    }
}
