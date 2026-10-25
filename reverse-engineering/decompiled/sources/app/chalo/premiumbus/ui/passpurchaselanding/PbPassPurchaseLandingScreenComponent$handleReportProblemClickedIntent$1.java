package app.chalo.premiumbus.ui.passpurchaselanding;

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
@DebugMetadata(c = "app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent$handleReportProblemClickedIntent$1", f = "PbPassPurchaseLandingScreenComponent.kt", l = {979}, m = "invokeSuspend", v = 1)
final class PbPassPurchaseLandingScreenComponent$handleReportProblemClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PbPassPurchaseLandingScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PbPassPurchaseLandingScreenComponent$handleReportProblemClickedIntent$1(PbPassPurchaseLandingScreenComponent pbPassPurchaseLandingScreenComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pbPassPurchaseLandingScreenComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PbPassPurchaseLandingScreenComponent$handleReportProblemClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PbPassPurchaseLandingScreenComponent$handleReportProblemClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String strA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PbPassPurchaseLandingScreenComponent pbPassPurchaseLandingScreenComponent = this.this$0;
            IReportProblemFeature iReportProblemFeature = pbPassPurchaseLandingScreenComponent.w;
            String strB = CityProviderKt.b(pbPassPurchaseLandingScreenComponent.n);
            String str2 = "";
            if (strB == null) {
                strB = "";
            }
            Pair pair = new Pair("userPropertyCity", strB);
            String strM = this.this$0.o.m();
            if (strM == null) {
                strM = "";
            }
            Pair pair2 = new Pair("userPropertyUserID", strM);
            UserProfileAppModel userProfileAppModelF = this.this$0.o.f();
            if (userProfileAppModelF == null || (str = userProfileAppModelF.e) == null) {
                str = "";
            }
            Pair pair3 = new Pair("userPropertyPhoneNo", str);
            UserProfileAppModel userProfileAppModelF2 = this.this$0.o.f();
            if (userProfileAppModelF2 != null && (strA = userProfileAppModelF2.a()) != null) {
                str2 = strA;
            }
            ReportProblemFeatureData reportProblemFeatureData = new ReportProblemFeatureData("premiumStopSelectionScreen", "premiumStopSelectionScreen", MapsKt.k(pair, pair2, pair3, new Pair("userPropertyUserName", str2)), false, null);
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
