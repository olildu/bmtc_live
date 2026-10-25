package app.chalo.productpurchase.passpurchase.ui;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.providers.cityprovider.impl.data.models.app.AgencyInfoAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedViewModel$handleReportProblemClickedIntent$1", f = "SuperPassPurchaseSharedViewModel.kt", l = {294}, m = "invokeSuspend", v = 1)
final class SuperPassPurchaseSharedViewModel$handleReportProblemClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SuperPassPurchaseSharedViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassPurchaseSharedViewModel$handleReportProblemClickedIntent$1(SuperPassPurchaseSharedViewModel superPassPurchaseSharedViewModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = superPassPurchaseSharedViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperPassPurchaseSharedViewModel$handleReportProblemClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperPassPurchaseSharedViewModel$handleReportProblemClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SuperPassPurchaseSharedViewModel$handleReportProblemClickedIntent$1 superPassPurchaseSharedViewModel$handleReportProblemClickedIntent$1;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            SuperPassPurchaseSharedViewModel superPassPurchaseSharedViewModel = this.this$0;
            IReportProblemFeature iReportProblemFeature = superPassPurchaseSharedViewModel.t;
            SuperPassPurchaseSharedState superPassPurchaseSharedState = (SuperPassPurchaseSharedState) superPassPurchaseSharedViewModel.t0().a();
            SuperPassPurchaseSharedState superPassPurchaseSharedState2 = SuperPassPurchaseSharedContractKt.f8345a;
            Intrinsics.i(superPassPurchaseSharedState, "<this>");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            CityAppModel cityAppModel = superPassPurchaseSharedState.b;
            if (cityAppModel != null && (str = cityAppModel.f8854a) != null) {
                linkedHashMap.put("userPropertyCity", str);
            }
            SuperPassUserDetails superPassUserDetails = superPassPurchaseSharedState.h;
            String str2 = superPassUserDetails.c;
            String str3 = superPassUserDetails.f9580a;
            String str4 = superPassUserDetails.b;
            if (str2.length() > 0) {
                linkedHashMap.put("userPropertyUserName", superPassUserDetails.c);
            }
            if (str4.length() > 0) {
                linkedHashMap.put("userPropertyPhoneNo", str4);
            }
            if (str3.length() > 0) {
                linkedHashMap.put("userPropertyUserID", str3);
            }
            AgencyInfoAppModel agencyInfoAppModel = superPassPurchaseSharedState.c;
            if (agencyInfoAppModel != null) {
                linkedHashMap.put("userPropertyAgencyName", agencyInfoAppModel.f8852a);
            }
            this.label = 1;
            superPassPurchaseSharedViewModel$handleReportProblemClickedIntent$1 = this;
            if (iReportProblemFeature.b("verificationScreen", "mPassPurchaseActivity", linkedHashMap, false, null, superPassPurchaseSharedViewModel$handleReportProblemClickedIntent$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            superPassPurchaseSharedViewModel$handleReportProblemClickedIntent$1 = this;
        }
        SuperPassPurchaseSharedViewModel superPassPurchaseSharedViewModel2 = superPassPurchaseSharedViewModel$handleReportProblemClickedIntent$1.this$0;
        AnalyticsContract analyticsContract = superPassPurchaseSharedViewModel2.u;
        Source source = Source.MPASS_PURCHASE_ACTIVITY;
        Pair pair = new Pair("type", "passVerificationProblemsV2");
        Pair pair2 = new Pair("problemSource", "mPassPurchaseActivity");
        String str5 = ((SuperPassPurchaseSharedState) superPassPurchaseSharedViewModel2.t0().a()).d;
        if (str5 == null) {
            str5 = "";
        }
        AnalyticsContractImplKt.b(analyticsContract, "report problem clicked v2", source, MapsKt.i(pair, pair2, new Pair("flow", str5)), false, 24);
        return Unit.f17538a;
    }
}
