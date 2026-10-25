package app.chalo.features.reportproblem;

import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.userprofile.UserProfileAppModel;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.features.reportproblem.ReportProblemFeature", f = "ReportProblemFeature.kt", l = {386}, m = "getBasicUserDetailsMapForReportProblem", v = 1)
final class ReportProblemFeature$getBasicUserDetailsMapForReportProblem$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReportProblemFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportProblemFeature$getBasicUserDetailsMapForReportProblem$1(ReportProblemFeature reportProblemFeature, Continuation continuation) {
        super(continuation);
        this.this$0 = reportProblemFeature;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ReportProblemFeature$getBasicUserDetailsMapForReportProblem$1 reportProblemFeature$getBasicUserDetailsMapForReportProblem$1;
        Map map;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        ReportProblemFeature reportProblemFeature = this.this$0;
        reportProblemFeature.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            reportProblemFeature$getBasicUserDetailsMapForReportProblem$1 = this;
        } else {
            reportProblemFeature$getBasicUserDetailsMapForReportProblem$1 = new ReportProblemFeature$getBasicUserDetailsMapForReportProblem$1(reportProblemFeature, this);
        }
        Object obj2 = reportProblemFeature$getBasicUserDetailsMapForReportProblem$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reportProblemFeature$getBasicUserDetailsMapForReportProblem$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            HashMap map2 = new HashMap();
            map2.put("userPropertyCity", String.valueOf(CityProviderKt.b(reportProblemFeature.f)));
            UserProfileDetailsProvider userProfileDetailsProvider = reportProblemFeature.g;
            reportProblemFeature$getBasicUserDetailsMapForReportProblem$1.L$0 = map2;
            reportProblemFeature$getBasicUserDetailsMapForReportProblem$1.label = 1;
            Object objL = userProfileDetailsProvider.l(reportProblemFeature$getBasicUserDetailsMapForReportProblem$1);
            if (objL == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = objL;
            map = map2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) reportProblemFeature$getBasicUserDetailsMapForReportProblem$1.L$0;
            ResultKt.b(obj2);
        }
        UserProfileAppModel userProfileAppModel = (UserProfileAppModel) obj2;
        if (userProfileAppModel != null) {
            map.put("userPropertyUserName", userProfileAppModel.a());
            map.put("userPropertyPhoneNo", userProfileAppModel.e);
            map.put("userPropertyUserID", userProfileAppModel.i);
        }
        return map;
    }
}
