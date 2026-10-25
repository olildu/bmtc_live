package app.chalo.chalobususerprofile.data.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.chalobususerprofile.data.repository.PremiumBusUserSurveyPreferenceRepositoryImpl", f = "PremiumBusUserSurveyPreferenceRepositoryImpl.kt", l = {30, 31, 32}, m = "updateCommutePreference", v = 1)
final class PremiumBusUserSurveyPreferenceRepositoryImpl$updateCommutePreference$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PremiumBusUserSurveyPreferenceRepositoryImpl this$0;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        if (r3.c(r2, r0, (app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference) r10, r9) == r1) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            r9.result = r10
            int r0 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            r9.label = r0
            app.chalo.chalobususerprofile.data.repository.PremiumBusUserSurveyPreferenceRepositoryImpl r2 = r9.this$0
            app.chalo.chalobususerprofile.data.local.PBUserProfileSurveyPreferenceDataStore r3 = r2.f1202a
            int r0 = r0 - r1
            r9.label = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r4 = 0
            if (r0 == 0) goto L6a
            r5 = 3
            r6 = 2
            r7 = 1
            if (r0 == r7) goto L36
            if (r0 == r6) goto L2a
            if (r0 != r5) goto L22
            kotlin.ResultKt.b(r10)
            goto L67
        L22:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L2a:
            java.lang.Object r0 = r9.L$1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r9.L$0
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.b(r10)
            goto L58
        L36:
            java.lang.Object r0 = r9.L$2
            app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceDetailsAppModel r0 = (app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceDetailsAppModel) r0
            java.lang.Object r7 = r9.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r9.L$0
            java.lang.String r8 = (java.lang.String) r8
            kotlin.ResultKt.b(r10)
            app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference r10 = (app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference) r10
            r9.L$0 = r8
            r9.L$1 = r7
            r9.L$2 = r4
            r9.label = r6
            java.lang.Object r10 = r2.f(r10, r0, r9)
            if (r10 != r1) goto L56
            goto L66
        L56:
            r0 = r7
            r2 = r8
        L58:
            app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference r10 = (app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference) r10
            r9.L$0 = r4
            r9.L$1 = r4
            r9.label = r5
            java.lang.Object r10 = r3.c(r2, r0, r10, r9)
            if (r10 != r1) goto L67
        L66:
            return r1
        L67:
            kotlin.Unit r10 = kotlin.Unit.f17538a
            return r10
        L6a:
            kotlin.ResultKt.b(r10)
            r3.b(r4, r4)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.chalobususerprofile.data.repository.PremiumBusUserSurveyPreferenceRepositoryImpl$updateCommutePreference$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
