package app.chalo.utils.timeutil;

import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/utils/timeutil/TimeUtilsContract;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TimeUtilsContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f10451a = Companion.f10452a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/utils/timeutil/TimeUtilsContract$Companion;", "Lorg/koin/core/component/KoinComponent;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements KoinComponent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f10452a;
        public static final Object b;

        static {
            final Companion companion = new Companion();
            f10452a = companion;
            b = LazyKt.a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0<TimeUtilsContract>() { // from class: app.chalo.utils.timeutil.TimeUtilsContract$Companion$special$$inlined$inject$default$1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Object obj = this.f10453a;
                    return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(TimeUtilsContract.class), null, null);
                }
            });
        }

        @Override // org.koin.core.component.KoinComponent
        public final Koin L() {
            return GlobalContext.f18817a.a();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final TimeUtilsContract a() {
            return (TimeUtilsContract) b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ String a(TimeUtilsContract timeUtilsContract, long j, String str, int i) {
            if ((i & 2) != 0) {
                str = timeUtilsContract.b();
            }
            return timeUtilsContract.d(j, str, (i & 4) != 0 ? null : " on");
        }
    }

    long A();

    int B(String str);

    int C(int i);

    String D(long j);

    int E();

    Pair F(long j);

    String G(String str);

    int H(long j);

    int I(String str);

    long J(int i, String str);

    long K(long j, String str);

    String L(long j);

    String M(long j);

    int N(long j);

    String O(long j);

    String P(long j);

    String Q(long j);

    Object a(long j, ContinuationImpl continuationImpl);

    String b();

    Object c(long j, ContinuationImpl continuationImpl);

    String d(long j, String str, String str2);

    String e(long j);

    long f(int i, int i2);

    String g(long j);

    String h(long j);

    String i(long j);

    String j(long j);

    long k(int i, int i2, String str);

    String l(long j);

    String m(long j, String str);

    String n(long j);

    String o(long j);

    long p(String str);

    long q(long j, String str);

    int r(int i);

    int s(long j, long j2);

    String t(long j);

    String u(long j, String str);

    int v(int i, String str);

    String w(long j);

    String x(long j);

    String y(String str, Long l);

    long z(long j);
}
