package app.chalo.network.rest.generic;

import defpackage.dd;
import defpackage.nf1;
import defpackage.sf;
import defpackage.vo1;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/network/rest/generic/ChaloAuthConfigHandler;", "", "ChaloAuthSecureData", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloAuthConfigHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f6507a;
    public final Function1 b;
    public final Function2 c;
    public final int d;
    public final Lazy e = LazyKt.b(new sf(15));

    /* JADX INFO: renamed from: app.chalo.network.rest.generic.ChaloAuthConfigHandler$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.network.rest.generic.ChaloAuthConfigHandler$1", f = "ChaloAuthPlugin.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((String) obj, (Continuation) obj2);
            Unit unit = Unit.f17538a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return Unit.f17538a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/rest/generic/ChaloAuthConfigHandler$ChaloAuthSecureData;", "", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChaloAuthSecureData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6508a;
        public final String b;
        public final String c;

        public ChaloAuthSecureData(String userId, String authType, String accessToken) {
            Intrinsics.i(userId, "userId");
            Intrinsics.i(authType, "authType");
            Intrinsics.i(accessToken, "accessToken");
            this.f6508a = userId;
            this.b = authType;
            this.c = accessToken;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChaloAuthSecureData)) {
                return false;
            }
            ChaloAuthSecureData chaloAuthSecureData = (ChaloAuthSecureData) obj;
            return Intrinsics.d(this.f6508a, chaloAuthSecureData.f6508a) && Intrinsics.d(this.b, chaloAuthSecureData.b) && Intrinsics.d(this.c, chaloAuthSecureData.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + nf1.e(this.f6508a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return vo1.p(dd.e("ChaloAuthSecureData(userId=", this.f6508a, ", authType=", this.b, ", accessToken="), this.c, ")");
        }
    }

    public ChaloAuthConfigHandler(Function1 function1, Function1 function2, Function2 function3, int i) {
        this.f6507a = function1;
        this.b = function2;
        this.c = function3;
        this.d = i;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009e A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #1 {all -> 0x00a4, blocks: (B:32:0x0094, B:34:0x009e, B:39:0x00a9, B:29:0x0077), top: B:49:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a9 A[Catch: all -> 0x00a4, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00a4, blocks: (B:32:0x0094, B:34:0x009e, B:39:0x00a9, B:29:0x0077), top: B:49:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(HttpResponse httpResponse, ContinuationImpl continuationImpl) throws Throwable {
        ChaloAuthConfigHandler$tokenRefreshSuccessful$1 chaloAuthConfigHandler$tokenRefreshSuccessful$1;
        Mutex mutex;
        Throwable th;
        Mutex mutex2;
        String str;
        Object objInvoke;
        Object objInvoke2;
        if (continuationImpl instanceof ChaloAuthConfigHandler$tokenRefreshSuccessful$1) {
            chaloAuthConfigHandler$tokenRefreshSuccessful$1 = (ChaloAuthConfigHandler$tokenRefreshSuccessful$1) continuationImpl;
            int i = chaloAuthConfigHandler$tokenRefreshSuccessful$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloAuthConfigHandler$tokenRefreshSuccessful$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloAuthConfigHandler$tokenRefreshSuccessful$1 = new ChaloAuthConfigHandler$tokenRefreshSuccessful$1(this, continuationImpl);
            }
        } else {
            chaloAuthConfigHandler$tokenRefreshSuccessful$1 = new ChaloAuthConfigHandler$tokenRefreshSuccessful$1(this, continuationImpl);
        }
        Object obj = chaloAuthConfigHandler$tokenRefreshSuccessful$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloAuthConfigHandler$tokenRefreshSuccessful$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                mutex = (Mutex) this.e.getValue();
                chaloAuthConfigHandler$tokenRefreshSuccessful$1.L$0 = httpResponse;
                chaloAuthConfigHandler$tokenRefreshSuccessful$1.L$1 = mutex;
                chaloAuthConfigHandler$tokenRefreshSuccessful$1.label = 1;
                if (mutex.a(chaloAuthConfigHandler$tokenRefreshSuccessful$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    str = (String) chaloAuthConfigHandler$tokenRefreshSuccessful$1.L$1;
                    Mutex mutex3 = (Mutex) chaloAuthConfigHandler$tokenRefreshSuccessful$1.L$0;
                    try {
                        ResultKt.b(obj);
                        objInvoke = obj;
                        mutex = mutex3;
                        if (!Intrinsics.d(str, ((ChaloAuthSecureData) objInvoke).c)) {
                            Boolean bool = Boolean.TRUE;
                            mutex.e(null);
                            return bool;
                        }
                        Function1 function1 = this.b;
                        chaloAuthConfigHandler$tokenRefreshSuccessful$1.L$0 = mutex;
                        chaloAuthConfigHandler$tokenRefreshSuccessful$1.L$1 = null;
                        chaloAuthConfigHandler$tokenRefreshSuccessful$1.label = 3;
                        objInvoke2 = function1.invoke(chaloAuthConfigHandler$tokenRefreshSuccessful$1);
                        if (objInvoke2 != coroutineSingletons) {
                            Mutex mutex4 = mutex;
                            obj = objInvoke2;
                            mutex2 = mutex4;
                            mutex2.e(null);
                            return obj;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2 = mutex3;
                    }
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) chaloAuthConfigHandler$tokenRefreshSuccessful$1.L$0;
                    try {
                        ResultKt.b(obj);
                        mutex2.e(null);
                        return obj;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                mutex2.e(null);
                throw th;
            }
            Mutex mutex5 = (Mutex) chaloAuthConfigHandler$tokenRefreshSuccessful$1.L$1;
            HttpResponse httpResponse2 = (HttpResponse) chaloAuthConfigHandler$tokenRefreshSuccessful$1.L$0;
            ResultKt.b(obj);
            mutex = mutex5;
            httpResponse = httpResponse2;
            str = HttpResponseKt.c(httpResponse).getHeaders().get("accessToken");
            chaloAuthConfigHandler$tokenRefreshSuccessful$1.L$0 = mutex;
            chaloAuthConfigHandler$tokenRefreshSuccessful$1.L$1 = str;
            chaloAuthConfigHandler$tokenRefreshSuccessful$1.label = 2;
            objInvoke = this.f6507a.invoke(chaloAuthConfigHandler$tokenRefreshSuccessful$1);
            if (objInvoke != coroutineSingletons) {
                if (!Intrinsics.d(str, ((ChaloAuthSecureData) objInvoke).c)) {
                    Boolean bool2 = Boolean.TRUE;
                    mutex.e(null);
                    return bool2;
                }
                Function1 function2 = this.b;
                chaloAuthConfigHandler$tokenRefreshSuccessful$1.L$0 = mutex;
                chaloAuthConfigHandler$tokenRefreshSuccessful$1.L$1 = null;
                chaloAuthConfigHandler$tokenRefreshSuccessful$1.label = 3;
                objInvoke2 = function2.invoke(chaloAuthConfigHandler$tokenRefreshSuccessful$1);
                if (objInvoke2 != coroutineSingletons) {
                    Mutex mutex6 = mutex;
                    obj = objInvoke2;
                    mutex2 = mutex6;
                    mutex2.e(null);
                    return obj;
                }
            }
            return coroutineSingletons;
        } catch (Throwable th4) {
            Mutex mutex7 = mutex;
            th = th4;
            mutex2 = mutex7;
        }
    }
}
