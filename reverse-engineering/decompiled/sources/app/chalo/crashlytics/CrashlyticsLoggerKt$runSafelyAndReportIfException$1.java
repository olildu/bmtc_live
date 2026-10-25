package app.chalo.crashlytics;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.crashlytics.CrashlyticsLoggerKt", f = "CrashlyticsLogger.kt", l = {EACTags.DISPLAY_IMAGE}, m = "runSafelyAndReportIfException", v = 1)
final class CrashlyticsLoggerKt$runSafelyAndReportIfException$1<T> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CrashlyticsLoggerKt.b(null, null, this);
    }
}
