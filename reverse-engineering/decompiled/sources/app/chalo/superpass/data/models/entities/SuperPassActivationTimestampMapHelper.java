package app.chalo.superpass.data.models.entities;

import app.chalo.datastore.LocalDataStore;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.StringQualifier;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/data/models/entities/SuperPassActivationTimestampMapHelper;", "Lorg/koin/core/component/KoinComponent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassActivationTimestampMapHelper implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f9561a;

    static {
        final SuperPassActivationTimestampMapHelper superPassActivationTimestampMapHelper = new SuperPassActivationTimestampMapHelper();
        final StringQualifier stringQualifier = new StringQualifier("superPassActivationTimestampsMap.preferences_pb");
        f9561a = LazyKt.a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0<LocalDataStore>() { // from class: app.chalo.superpass.data.models.entities.SuperPassActivationTimestampMapHelper$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f9562a;
                boolean z = obj instanceof KoinScopeComponent;
                return (z ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(LocalDataStore.class), null, stringQualifier);
            }
        });
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }
}
