package app.chalo.network.rest;

import app.chalo.network.rest.request.PriorityLevel;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/rest/ChaloRestClientManager;", "Lorg/koin/core/component/KoinComponent;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloRestClientManager implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f6501a;
    public static final Object b;
    public static final Object c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6502a;

        static {
            int[] iArr = new int[PriorityLevel.values().length];
            try {
                iArr[PriorityLevel.PRIORITY_TYPE_LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PriorityLevel.PRIORITY_TYPE_NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PriorityLevel.PRIORITY_TYPE_HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6502a = iArr;
        }
    }

    static {
        final ChaloRestClientManager chaloRestClientManager = new ChaloRestClientManager();
        final StringQualifier stringQualifier = new StringQualifier("lowPriority");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        f6501a = LazyKt.a(lazyThreadSafetyMode, new Function0<ChaloRestClient>() { // from class: app.chalo.network.rest.ChaloRestClientManager$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f6503a;
                boolean z = obj instanceof KoinScopeComponent;
                return (z ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(ChaloRestClient.class), null, stringQualifier);
            }
        });
        final StringQualifier stringQualifier2 = new StringQualifier("mediumPriority");
        b = LazyKt.a(lazyThreadSafetyMode, new Function0<ChaloRestClient>() { // from class: app.chalo.network.rest.ChaloRestClientManager$special$$inlined$inject$default$2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f6504a;
                boolean z = obj instanceof KoinScopeComponent;
                return (z ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(ChaloRestClient.class), null, stringQualifier2);
            }
        });
        final StringQualifier stringQualifier3 = new StringQualifier("highPriority");
        c = LazyKt.a(lazyThreadSafetyMode, new Function0<ChaloRestClient>() { // from class: app.chalo.network.rest.ChaloRestClientManager$special$$inlined$inject$default$3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f6505a;
                boolean z = obj instanceof KoinScopeComponent;
                return (z ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(ChaloRestClient.class), null, stringQualifier3);
            }
        });
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }
}
