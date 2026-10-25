package app.chalo.network.mock;

import app.chalo.network.NetworkCrashlyticsLogger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.network.mock.ApiSourceAwareRequestDispatcher", f = "ApiSourceAwareRequestDispatcher.kt", l = {37, 38}, m = "tryDispatch", v = 1)
final class ApiSourceAwareRequestDispatcher$tryDispatch$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ApiSourceAwareRequestDispatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiSourceAwareRequestDispatcher$tryDispatch$1(ApiSourceAwareRequestDispatcher apiSourceAwareRequestDispatcher, Continuation continuation) {
        super(continuation);
        this.this$0 = apiSourceAwareRequestDispatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ApiSourceAwareRequestDispatcher$tryDispatch$1 apiSourceAwareRequestDispatcher$tryDispatch$1;
        NetworkCrashlyticsLogger networkCrashlyticsLogger;
        NormalizedRequestDescriptor normalizedRequestDescriptor;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        ApiSourceAwareRequestDispatcher apiSourceAwareRequestDispatcher = this.this$0;
        apiSourceAwareRequestDispatcher.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            apiSourceAwareRequestDispatcher$tryDispatch$1 = this;
        } else {
            apiSourceAwareRequestDispatcher$tryDispatch$1 = new ApiSourceAwareRequestDispatcher$tryDispatch$1(apiSourceAwareRequestDispatcher, this);
        }
        Object objA = apiSourceAwareRequestDispatcher$tryDispatch$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = apiSourceAwareRequestDispatcher$tryDispatch$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            ApiSourceState apiSourceState = apiSourceAwareRequestDispatcher.f6470a;
            apiSourceAwareRequestDispatcher$tryDispatch$1.L$0 = null;
            apiSourceAwareRequestDispatcher$tryDispatch$1.L$1 = null;
            apiSourceAwareRequestDispatcher$tryDispatch$1.label = 1;
            objA = apiSourceState.a();
            if (objA != coroutineSingletons) {
                networkCrashlyticsLogger = null;
                normalizedRequestDescriptor = null;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
            return objA;
        }
        networkCrashlyticsLogger = (NetworkCrashlyticsLogger) apiSourceAwareRequestDispatcher$tryDispatch$1.L$1;
        normalizedRequestDescriptor = (NormalizedRequestDescriptor) apiSourceAwareRequestDispatcher$tryDispatch$1.L$0;
        ResultKt.b(objA);
        apiSourceAwareRequestDispatcher$tryDispatch$1.L$0 = null;
        apiSourceAwareRequestDispatcher$tryDispatch$1.L$1 = null;
        apiSourceAwareRequestDispatcher$tryDispatch$1.label = 2;
        Object objB = apiSourceAwareRequestDispatcher.b((ApiSource) objA, normalizedRequestDescriptor, networkCrashlyticsLogger, apiSourceAwareRequestDispatcher$tryDispatch$1);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }
}
