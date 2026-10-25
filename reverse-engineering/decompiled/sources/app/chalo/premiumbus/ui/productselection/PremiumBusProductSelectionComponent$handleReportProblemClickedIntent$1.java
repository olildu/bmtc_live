package app.chalo.premiumbus.ui.productselection;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.features.reportproblem.ReportProblemFeatureData;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.userprofile.UserProfileAppModel;
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
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionComponent$handleReportProblemClickedIntent$1", f = "PremiumBusProductSelectionComponent.kt", l = {851}, m = "invokeSuspend", v = 1)
final class PremiumBusProductSelectionComponent$handleReportProblemClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PremiumBusProductSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusProductSelectionComponent$handleReportProblemClickedIntent$1(PremiumBusProductSelectionComponent premiumBusProductSelectionComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusProductSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusProductSelectionComponent$handleReportProblemClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusProductSelectionComponent$handleReportProblemClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String strA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            AnalyticsContract.DefaultImpls.a(this.this$0.u, "pb product hook product selection screen FAQ clicked", Source.PREMIUM_BUS_PRODUCT_SELECTION_SCREEN.getSourceName(), null, null, false, 28);
            PremiumBusProductSelectionComponent premiumBusProductSelectionComponent = this.this$0;
            IReportProblemFeature iReportProblemFeature = premiumBusProductSelectionComponent.A;
            String strB = CityProviderKt.b(premiumBusProductSelectionComponent.v);
            String str2 = "";
            if (strB == null) {
                strB = "";
            }
            Pair pair = new Pair("userPropertyCity", strB);
            String strM = this.this$0.w.m();
            if (strM == null) {
                strM = "";
            }
            Pair pair2 = new Pair("userPropertyUserID", strM);
            UserProfileAppModel userProfileAppModelF = this.this$0.w.f();
            if (userProfileAppModelF == null || (str = userProfileAppModelF.e) == null) {
                str = "";
            }
            Pair pair3 = new Pair("userPropertyPhoneNo", str);
            UserProfileAppModel userProfileAppModelF2 = this.this$0.w.f();
            if (userProfileAppModelF2 != null && (strA = userProfileAppModelF2.a()) != null) {
                str2 = strA;
            }
            ReportProblemFeatureData reportProblemFeatureData = new ReportProblemFeatureData("premiumProductSelectionScreen", "premiumProductSelectionScreen", MapsKt.k(pair, pair2, pair3, new Pair("userPropertyUserName", str2)), false, null);
            this.label = 1;
            if (iReportProblemFeature.g(reportProblemFeatureData, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
