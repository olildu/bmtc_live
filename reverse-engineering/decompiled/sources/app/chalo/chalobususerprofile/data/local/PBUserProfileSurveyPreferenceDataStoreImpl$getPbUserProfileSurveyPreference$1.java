package app.chalo.chalobususerprofile.data.local;

import app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lapp/chalo/chalobususerprofile/data/model/PBUserProfileSurveyPreference;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.chalobususerprofile.data.local.PBUserProfileSurveyPreferenceDataStoreImpl$getPbUserProfileSurveyPreference$1", f = "PBUserProfileSurveyPreferenceDataStoreImpl.kt", l = {21, 31}, m = "invokeSuspend", v = 1)
final class PBUserProfileSurveyPreferenceDataStoreImpl$getPbUserProfileSurveyPreference$1 extends SuspendLambda implements Function2<FlowCollector<? super PBUserProfileSurveyPreference>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cityId;
    final /* synthetic */ String $userId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PBUserProfileSurveyPreferenceDataStoreImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PBUserProfileSurveyPreferenceDataStoreImpl$getPbUserProfileSurveyPreference$1(PBUserProfileSurveyPreferenceDataStoreImpl pBUserProfileSurveyPreferenceDataStoreImpl, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pBUserProfileSurveyPreferenceDataStoreImpl;
        this.$userId = str;
        this.$cityId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PBUserProfileSurveyPreferenceDataStoreImpl$getPbUserProfileSurveyPreference$1 pBUserProfileSurveyPreferenceDataStoreImpl$getPbUserProfileSurveyPreference$1 = new PBUserProfileSurveyPreferenceDataStoreImpl$getPbUserProfileSurveyPreference$1(this.this$0, this.$userId, this.$cityId, continuation);
        pBUserProfileSurveyPreferenceDataStoreImpl$getPbUserProfileSurveyPreference$1.L$0 = obj;
        return pBUserProfileSurveyPreferenceDataStoreImpl$getPbUserProfileSurveyPreference$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PBUserProfileSurveyPreferenceDataStoreImpl$getPbUserProfileSurveyPreference$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r9)
            goto L7a
        L10:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L18:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.b(r9)
            goto L44
        L20:
            kotlin.ResultKt.b(r9)
            java.lang.Object r9 = r8.L$0
            r1 = r9
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            app.chalo.chalobususerprofile.data.local.PBUserProfileSurveyPreferenceDataStoreImpl r9 = r8.this$0
            app.chalo.datastore.LocalDataStore r9 = r9.f1191a
            java.lang.String r4 = r8.$userId
            java.lang.String r5 = r8.$cityId
            java.lang.String r6 = "premium_bus_user_profile_survey_preference_"
            java.lang.String r7 = "_"
            java.lang.String r4 = defpackage.z40.g(r6, r4, r7, r5)
            r8.L$0 = r1
            r8.label = r3
            java.lang.Object r9 = r9.f(r4, r8)
            if (r9 != r0) goto L44
            goto L79
        L44:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L53
            app.chalo.chalobususerprofile.data.local.PBUserProfileSurveyPreferenceDataStoreImpl r9 = r8.this$0
            r9.getClass()
            app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference r9 = new app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference
            r9.<init>()
            goto L6e
        L53:
            kotlinx.serialization.json.Json r3 = app.chalo.network.config.ChaloJson.b     // Catch: java.lang.Exception -> L64
            app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference$Companion r4 = app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference.INSTANCE     // Catch: java.lang.Exception -> L64
            kotlinx.serialization.KSerializer r4 = r4.serializer()     // Catch: java.lang.Exception -> L64
            kotlinx.serialization.DeserializationStrategy r4 = (kotlinx.serialization.DeserializationStrategy) r4     // Catch: java.lang.Exception -> L64
            java.lang.Object r9 = r3.b(r9, r4)     // Catch: java.lang.Exception -> L64
            app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference r9 = (app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference) r9     // Catch: java.lang.Exception -> L64
            goto L6e
        L64:
            app.chalo.chalobususerprofile.data.local.PBUserProfileSurveyPreferenceDataStoreImpl r9 = r8.this$0
            r9.getClass()
            app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference r9 = new app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference
            r9.<init>()
        L6e:
            r3 = 0
            r8.L$0 = r3
            r8.label = r2
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L7a
        L79:
            return r0
        L7a:
            kotlin.Unit r9 = kotlin.Unit.f17538a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.chalobususerprofile.data.local.PBUserProfileSurveyPreferenceDataStoreImpl$getPbUserProfileSurveyPreference$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
