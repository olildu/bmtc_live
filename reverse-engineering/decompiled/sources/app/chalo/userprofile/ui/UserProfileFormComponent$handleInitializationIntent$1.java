package app.chalo.userprofile.ui;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.userprofile.Gender;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.userprofile.utils.UserNameUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.sh1;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.userprofile.ui.UserProfileFormComponent$handleInitializationIntent$1", f = "UserProfileFormComponent.kt", l = {105, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 112}, m = "invokeSuspend", v = 1)
final class UserProfileFormComponent$handleInitializationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UserProfileFormIntent.InitializationIntent $intent;
    Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ UserProfileFormComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileFormComponent$handleInitializationIntent$1(UserProfileFormComponent userProfileFormComponent, UserProfileFormIntent.InitializationIntent initializationIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = userProfileFormComponent;
        this.$intent = initializationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserProfileFormComponent$handleInitializationIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UserProfileFormComponent$handleInitializationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objL;
        UserProfileAppModel userProfileAppModel;
        Object objT;
        boolean zBooleanValue;
        Object objK;
        boolean z;
        Integer numB;
        String strValueOf;
        Long l;
        Long l2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            UserProfileDetailsProvider userProfileDetailsProvider = this.this$0.l;
            this.label = 1;
            objL = userProfileDetailsProvider.l(this);
            if (objL != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
            objL = obj;
        } else {
            if (i == 2) {
                userProfileAppModel = (UserProfileAppModel) this.L$0;
                ResultKt.b(obj);
                objT = obj;
                zBooleanValue = ((Boolean) objT).booleanValue();
                ChaloAppFeatureHelper chaloAppFeatureHelper = this.this$0.x;
                this.L$0 = userProfileAppModel;
                this.Z$0 = zBooleanValue;
                this.label = 3;
                objK = chaloAppFeatureHelper.k(this);
                if (objK != coroutineSingletons) {
                    z = zBooleanValue;
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z2 = this.Z$0;
            userProfileAppModel = (UserProfileAppModel) this.L$0;
            ResultKt.b(obj);
            objK = obj;
            z = z2;
        }
        List list = (List) objK;
        String strA = UserNameUtils.a(userProfileAppModel.f10305a, userProfileAppModel.b);
        Gender gender = userProfileAppModel.d;
        String str = userProfileAppModel.h;
        String str2 = userProfileAppModel.e;
        String str3 = userProfileAppModel.c;
        UserProfileFormComponent userProfileFormComponent = this.this$0;
        numB = userProfileAppModel.b(userProfileFormComponent.p, userProfileFormComponent.w);
        if (numB != null || (strValueOf = String.valueOf(numB.intValue())) == null) {
            strValueOf = "";
        }
        String str4 = strValueOf;
        l = userProfileAppModel.g;
        if (l != null || l.longValue() <= 0) {
            l2 = null;
        } else {
            l2 = l;
        }
        this.this$0.E0(new sh1(new UserProfileFormDataState(strA, gender, str, str4, l2, z, list, str2, str3, 14592), 24));
        AnalyticsContractImplKt.b(this.this$0.k, "user profile form screen displayed", this.$intent.f10363a, null, false, 28);
        return unit;
        userProfileAppModel = (UserProfileAppModel) objL;
        if (userProfileAppModel == null) {
            ChaloNavigationManagerKt.c(this.this$0.m);
            return unit;
        }
        ChaloAppFeatureHelper chaloAppFeatureHelper2 = this.this$0.x;
        this.L$0 = userProfileAppModel;
        this.label = 2;
        objT = chaloAppFeatureHelper2.t(this);
        if (objT != coroutineSingletons) {
            zBooleanValue = ((Boolean) objT).booleanValue();
            ChaloAppFeatureHelper chaloAppFeatureHelper3 = this.this$0.x;
            this.L$0 = userProfileAppModel;
            this.Z$0 = zBooleanValue;
            this.label = 3;
            objK = chaloAppFeatureHelper3.k(this);
            if (objK != coroutineSingletons) {
                z = zBooleanValue;
                List list2 = (List) objK;
                String strA2 = UserNameUtils.a(userProfileAppModel.f10305a, userProfileAppModel.b);
                Gender gender2 = userProfileAppModel.d;
                String str5 = userProfileAppModel.h;
                String str6 = userProfileAppModel.e;
                String str7 = userProfileAppModel.c;
                UserProfileFormComponent userProfileFormComponent2 = this.this$0;
                numB = userProfileAppModel.b(userProfileFormComponent2.p, userProfileFormComponent2.w);
                if (numB != null) {
                    strValueOf = "";
                } else {
                    strValueOf = "";
                }
                String str8 = strValueOf;
                l = userProfileAppModel.g;
                if (l != null) {
                    l2 = null;
                } else {
                    l2 = null;
                }
                this.this$0.E0(new sh1(new UserProfileFormDataState(strA2, gender2, str5, str8, l2, z, list2, str6, str7, 14592), 24));
                AnalyticsContractImplKt.b(this.this$0.k, "user profile form screen displayed", this.$intent.f10363a, null, false, 28);
                return unit;
            }
        }
        return coroutineSingletons;
    }
}
