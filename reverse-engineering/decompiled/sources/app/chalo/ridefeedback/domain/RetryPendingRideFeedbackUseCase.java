package app.chalo.ridefeedback.domain;

import app.chalo.ridefeedback.data.RideFeedbackRepository;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridefeedback/domain/RetryPendingRideFeedbackUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RetryPendingRideFeedbackUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RideFeedbackRepository f9087a;
    public final SubmitRideFeedbackUseCase b;
    public final RideFeedbackSubmissionGate c;

    public RetryPendingRideFeedbackUseCase(RideFeedbackRepository rideFeedbackRepository, SubmitRideFeedbackUseCase submitRideFeedbackUseCase, RideFeedbackSubmissionGate rideFeedbackSubmissionGate) {
        this.f9087a = rideFeedbackRepository;
        this.b = submitRideFeedbackUseCase;
        this.c = rideFeedbackSubmissionGate;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        RetryPendingRideFeedbackUseCase$invoke$1 retryPendingRideFeedbackUseCase$invoke$1;
        if (continuationImpl instanceof RetryPendingRideFeedbackUseCase$invoke$1) {
            retryPendingRideFeedbackUseCase$invoke$1 = (RetryPendingRideFeedbackUseCase$invoke$1) continuationImpl;
            int i = retryPendingRideFeedbackUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                retryPendingRideFeedbackUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                retryPendingRideFeedbackUseCase$invoke$1 = new RetryPendingRideFeedbackUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            retryPendingRideFeedbackUseCase$invoke$1 = new RetryPendingRideFeedbackUseCase$invoke$1(this, continuationImpl);
        }
        Object objB = retryPendingRideFeedbackUseCase$invoke$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = retryPendingRideFeedbackUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objB);
                retryPendingRideFeedbackUseCase$invoke$1.label = 1;
                objB = b(str, str2, str3, retryPendingRideFeedbackUseCase$invoke$1);
                if (objB == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objB);
            }
            return (ChaloUseCaseResult) objB;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new ChaloUseCaseResult.Failure(new RetryPendingRideFeedbackError.Unexpected(e2.getMessage()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0151 A[Catch: all -> 0x0193, TRY_ENTER, TryCatch #0 {all -> 0x0193, blocks: (B:57:0x0187, B:59:0x018f, B:53:0x0151, B:64:0x01a0, B:70:0x01c4), top: B:140:0x0187 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x017f  */
    /* JADX WARN: Code duplicated, block: B:59:0x018f A[Catch: all -> 0x0193, TryCatch #0 {all -> 0x0193, blocks: (B:57:0x0187, B:59:0x018f, B:53:0x0151, B:64:0x01a0, B:70:0x01c4), top: B:140:0x0187 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [app.chalo.ridefeedback.domain.RideFeedbackSubmissionGate] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r9v0, types: [app.chalo.ridefeedback.data.RideFeedbackRepository] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x017f -> B:140:0x0187). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.String r31, java.lang.String r32, java.lang.String r33, kotlin.coroutines.jvm.internal.ContinuationImpl r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ridefeedback.domain.RetryPendingRideFeedbackUseCase.b(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
