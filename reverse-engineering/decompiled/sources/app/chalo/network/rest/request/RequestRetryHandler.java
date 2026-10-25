package app.chalo.network.rest.request;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/network/rest/request/RequestRetryHandler;", "", "Companion", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RequestRetryHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6520a;
    public final RetryStrategyType b;
    public int c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/network/rest/request/RequestRetryHandler$Companion;", "", "", "CONSTANT_BACKOFF_IN_MILLISECONDS", "J", "", "POLYNOMIAL", "D", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6521a;

        static {
            int[] iArr = new int[RetryStrategyType.values().length];
            try {
                iArr[RetryStrategyType.NO_BACKOFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RetryStrategyType.LINEAR_BACKOFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RetryStrategyType.EXPONENTIAL_BACKOFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RetryStrategyType.CONSTANT_BACKOFF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RetryStrategyType.POLYNOMIAL_BACKOFF.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RetryStrategyType.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f6521a = iArr;
        }
    }

    public RequestRetryHandler(int i, RetryStrategyType retryStrategyType) {
        Intrinsics.i(retryStrategyType, "retryStrategyType");
        this.f6520a = i;
        this.b = retryStrategyType;
        this.f6520a = Math.min(i, retryStrategyType.getMaxRetryCount());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        RequestRetryHandler$readyToRetry$1 requestRetryHandler$readyToRetry$1;
        double dPow;
        if (continuationImpl instanceof RequestRetryHandler$readyToRetry$1) {
            requestRetryHandler$readyToRetry$1 = (RequestRetryHandler$readyToRetry$1) continuationImpl;
            int i = requestRetryHandler$readyToRetry$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                requestRetryHandler$readyToRetry$1.label = i - Integer.MIN_VALUE;
            } else {
                requestRetryHandler$readyToRetry$1 = new RequestRetryHandler$readyToRetry$1(this, continuationImpl);
            }
        } else {
            requestRetryHandler$readyToRetry$1 = new RequestRetryHandler$readyToRetry$1(this, continuationImpl);
        }
        Object obj = requestRetryHandler$readyToRetry$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = requestRetryHandler$readyToRetry$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            long j = 1000;
            switch (WhenMappings.f6521a[this.b.ordinal()]) {
                case 1:
                    j = 0;
                    this.c++;
                    requestRetryHandler$readyToRetry$1.label = 1;
                    if (DelayKt.b(j, requestRetryHandler$readyToRetry$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    break;
                case 2:
                    j = 1000 * ((long) this.c);
                    this.c++;
                    requestRetryHandler$readyToRetry$1.label = 1;
                    if (DelayKt.b(j, requestRetryHandler$readyToRetry$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    break;
                case 3:
                    dPow = Math.pow(2.0d, this.c);
                    j = ((long) dPow) * ((long) 1000);
                    this.c++;
                    requestRetryHandler$readyToRetry$1.label = 1;
                    if (DelayKt.b(j, requestRetryHandler$readyToRetry$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    break;
                case 4:
                    this.c++;
                    requestRetryHandler$readyToRetry$1.label = 1;
                    if (DelayKt.b(j, requestRetryHandler$readyToRetry$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    break;
                case 5:
                    dPow = Math.pow(this.c, 2.0d);
                    j = ((long) dPow) * ((long) 1000);
                    this.c++;
                    requestRetryHandler$readyToRetry$1.label = 1;
                    if (DelayKt.b(j, requestRetryHandler$readyToRetry$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    break;
                case 6:
                    throw new IllegalStateException("There must be a retry strategy");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Boolean.TRUE;
    }
}
