package app.chalo.crashlytics;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"Lapp/chalo/crashlytics/CrashlyticsLogger;", "ErrorReporterContract", "chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CrashlyticsLoggerKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(CrashlyticsLogger crashlyticsLogger, Function1 function1, ContinuationImpl continuationImpl) {
        CrashlyticsLoggerKt$runAndReportIfException$1 crashlyticsLoggerKt$runAndReportIfException$1;
        if (continuationImpl instanceof CrashlyticsLoggerKt$runAndReportIfException$1) {
            crashlyticsLoggerKt$runAndReportIfException$1 = (CrashlyticsLoggerKt$runAndReportIfException$1) continuationImpl;
            int i = crashlyticsLoggerKt$runAndReportIfException$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                crashlyticsLoggerKt$runAndReportIfException$1.label = i - Integer.MIN_VALUE;
            } else {
                crashlyticsLoggerKt$runAndReportIfException$1 = new CrashlyticsLoggerKt$runAndReportIfException$1(continuationImpl);
            }
        } else {
            crashlyticsLoggerKt$runAndReportIfException$1 = new CrashlyticsLoggerKt$runAndReportIfException$1(continuationImpl);
        }
        Object obj = crashlyticsLoggerKt$runAndReportIfException$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = crashlyticsLoggerKt$runAndReportIfException$1.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return obj;
            }
            ResultKt.b(obj);
            crashlyticsLoggerKt$runAndReportIfException$1.L$0 = crashlyticsLogger;
            crashlyticsLoggerKt$runAndReportIfException$1.label = 1;
            Object objInvoke = function1.invoke(crashlyticsLoggerKt$runAndReportIfException$1);
            return objInvoke == obj2 ? obj2 : objInvoke;
        } catch (Throwable th) {
            crashlyticsLogger.i(th);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(CrashlyticsLogger crashlyticsLogger, Function1 function1, ContinuationImpl continuationImpl) {
        CrashlyticsLoggerKt$runSafelyAndReportIfException$1 crashlyticsLoggerKt$runSafelyAndReportIfException$1;
        if (continuationImpl instanceof CrashlyticsLoggerKt$runSafelyAndReportIfException$1) {
            crashlyticsLoggerKt$runSafelyAndReportIfException$1 = (CrashlyticsLoggerKt$runSafelyAndReportIfException$1) continuationImpl;
            int i = crashlyticsLoggerKt$runSafelyAndReportIfException$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                crashlyticsLoggerKt$runSafelyAndReportIfException$1.label = i - Integer.MIN_VALUE;
            } else {
                crashlyticsLoggerKt$runSafelyAndReportIfException$1 = new CrashlyticsLoggerKt$runSafelyAndReportIfException$1(continuationImpl);
            }
        } else {
            crashlyticsLoggerKt$runSafelyAndReportIfException$1 = new CrashlyticsLoggerKt$runSafelyAndReportIfException$1(continuationImpl);
        }
        Object obj = crashlyticsLoggerKt$runSafelyAndReportIfException$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = crashlyticsLoggerKt$runSafelyAndReportIfException$1.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return obj;
            }
            ResultKt.b(obj);
            crashlyticsLoggerKt$runSafelyAndReportIfException$1.label = 1;
            Object objA = a(crashlyticsLogger, function1, crashlyticsLoggerKt$runSafelyAndReportIfException$1);
            return objA == coroutineSingletons ? coroutineSingletons : objA;
        } catch (Throwable unused) {
            return null;
        }
    }
}
