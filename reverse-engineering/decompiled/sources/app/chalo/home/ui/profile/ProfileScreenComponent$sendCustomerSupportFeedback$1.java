package app.chalo.home.ui.profile;

import app.chalo.behaviour.policy.ReportProblemPath;
import app.chalo.features.reportproblem.ReportProblemFeatureProblem;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.reportproblem.InitiateFreshChatCustomerSupportUseCase;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.userprofile.UserProfileAppModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.profile.ProfileScreenComponent$sendCustomerSupportFeedback$1", f = "ProfileScreenComponent.kt", l = {564}, m = "invokeSuspend", v = 1)
final class ProfileScreenComponent$sendCustomerSupportFeedback$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ProfileScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileScreenComponent$sendCustomerSupportFeedback$1(ProfileScreenComponent profileScreenComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = profileScreenComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProfileScreenComponent$sendCustomerSupportFeedback$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProfileScreenComponent$sendCustomerSupportFeedback$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ChaloAppFeatureHelper chaloAppFeatureHelper = this.this$0.A;
            this.label = 1;
            obj = chaloAppFeatureHelper.d(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ReportProblemPath reportProblemPath = (ReportProblemPath) obj;
        if (reportProblemPath instanceof ReportProblemPath.WebViewPath) {
            ChaloNavigationManagerKt.e(this.this$0.r, ((ReportProblemPath.WebViewPath) reportProblemPath).f1033a, null, 6);
        } else if (reportProblemPath instanceof ReportProblemPath.WhatsAppPath) {
            this.this$0.z.a(((ReportProblemPath.WhatsAppPath) reportProblemPath).a(), null);
        } else {
            if (!Intrinsics.d(reportProblemPath, ReportProblemPath.FreshChatPath.f1032a)) {
                throw new NoWhenBranchMatchedException();
            }
            String strB = CityProviderKt.b(this.this$0.t);
            ArrayList arrayList = new ArrayList();
            if (strB != null) {
                arrayList.add(strB);
            }
            arrayList.add("commontag");
            InitiateFreshChatCustomerSupportUseCase initiateFreshChatCustomerSupportUseCase = this.this$0.u;
            ReportProblemFeatureProblem reportProblemFeatureProblem = new ReportProblemFeatureProblem("", "", "", "category", arrayList);
            ProfileScreenComponent profileScreenComponent = this.this$0;
            profileScreenComponent.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String strB2 = CityProviderKt.b(profileScreenComponent.t);
            UserProfileAppModel userProfileAppModelF = profileScreenComponent.v.f();
            if (userProfileAppModelF != null) {
                linkedHashMap.put("userPropertyPhoneNo", userProfileAppModelF.e);
                linkedHashMap.put("userPropertyUserID", userProfileAppModelF.i);
                linkedHashMap.put("userPropertyUserName", userProfileAppModelF.f10305a + " " + userProfileAppModelF.b);
            }
            if (strB2 != null) {
                linkedHashMap.put("userPropertyCity", strB2);
            }
            initiateFreshChatCustomerSupportUseCase.a("Help and Support", true, reportProblemFeatureProblem, linkedHashMap);
        }
        return Unit.f17538a;
    }
}
