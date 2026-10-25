package app.chalo.home.ui.profile;

import app.chalo.constants.Source;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.juspay.JusPayErrorResultAppModel;
import app.chalo.juspay.JuspayController;
import app.chalo.juspay.JuspayOperationFailure;
import app.chalo.juspay.JuspayOperationResult;
import app.chalo.juspay.JuspayOperationUpdate;
import defpackage.a80;
import defpackage.nf1;
import defpackage.ux0;
import defpackage.vo1;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.profile.ProfileScreenComponent$handleManageChaloUpiClickedIntent$2", f = "ProfileScreenComponent.kt", l = {305, 311}, m = "invokeSuspend", v = 1)
final class ProfileScreenComponent$handleManageChaloUpiClickedIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ProfileScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileScreenComponent$handleManageChaloUpiClickedIntent$2(ProfileScreenComponent profileScreenComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = profileScreenComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProfileScreenComponent$handleManageChaloUpiClickedIntent$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProfileScreenComponent$handleManageChaloUpiClickedIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0053 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i == 1) {
                ResultKt.b(obj);
                return unit;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        JuspayController juspayControllerD = this.this$0.C.d();
        if (juspayControllerD == null) {
            ProfileScreenComponent profileScreenComponent = this.this$0;
            this.label = 1;
            if (profileScreenComponent.I0(null, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return unit;
        }
        Flow flowD = juspayControllerD.d(Source.PROFILE_SCREEN.getSourceName());
        final ProfileScreenComponent profileScreenComponent2 = this.this$0;
        FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.home.ui.profile.ProfileScreenComponent$handleManageChaloUpiClickedIntent$2.1
            /* JADX WARN: Code duplicated, block: B:57:0x00ee A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:58:0x00ef A[RETURN] */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj2, Continuation continuation) {
                Object objI0;
                JuspayOperationUpdate juspayOperationUpdate = (JuspayOperationUpdate) obj2;
                ProfileScreenComponent profileScreenComponent3 = profileScreenComponent2;
                profileScreenComponent3.getClass();
                boolean zD = Intrinsics.d(juspayOperationUpdate, JuspayOperationUpdate.Started.f4065a);
                Unit unit2 = Unit.f17538a;
                if (!zD) {
                    if (Intrinsics.d(juspayOperationUpdate, JuspayOperationUpdate.Rejected.f4064a)) {
                        objI0 = profileScreenComponent3.G0(continuation);
                        if (objI0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        }
                    } else if (juspayOperationUpdate instanceof JuspayOperationUpdate.Loading) {
                        profileScreenComponent3.E0(new a80(juspayOperationUpdate, 2));
                    } else if (juspayOperationUpdate instanceof JuspayOperationUpdate.Completed) {
                        JuspayOperationResult juspayOperationResult = ((JuspayOperationUpdate.Completed) juspayOperationUpdate).f4061a;
                        profileScreenComponent3.E0(new ux0(12));
                        if (juspayOperationResult instanceof JuspayOperationResult.Error) {
                            JusPayErrorResultAppModel jusPayErrorResultAppModel = ((JuspayOperationResult.Error) juspayOperationResult).f4056a;
                            objI0 = profileScreenComponent3.I0(nf1.l(jusPayErrorResultAppModel.e, " (", jusPayErrorResultAppModel.f.f4044a, ")"), continuation);
                            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            if (objI0 != coroutineSingletons2) {
                                objI0 = unit2;
                            }
                            if (objI0 != coroutineSingletons2) {
                            }
                            if (objI0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            }
                        } else if (juspayOperationResult instanceof JuspayOperationResult.Management) {
                            HomeScreenAnalyticsHelper.DefaultImpls.a(profileScreenComponent3.n, "juspay sdk management result", vo1.s("pass status", ((JuspayOperationResult.Management) juspayOperationResult).f4057a.b.name()), Source.PROFILE_SCREEN, 12);
                        } else if (!(juspayOperationResult instanceof JuspayOperationResult.Onboarding) && !(juspayOperationResult instanceof JuspayOperationResult.UpiUiScanPay)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objI0 = unit2;
                        if (objI0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        }
                    } else if (juspayOperationUpdate instanceof JuspayOperationUpdate.Failed) {
                        JuspayOperationFailure juspayOperationFailure = ((JuspayOperationUpdate.Failed) juspayOperationUpdate).f4062a;
                        profileScreenComponent3.E0(new ux0(12));
                        JuspayOperationFailure.Error error = juspayOperationFailure instanceof JuspayOperationFailure.Error ? (JuspayOperationFailure.Error) juspayOperationFailure : null;
                        objI0 = profileScreenComponent3.I0(error != null ? error.f4051a : null, continuation);
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (objI0 != coroutineSingletons3) {
                            objI0 = unit2;
                        }
                        if (objI0 != coroutineSingletons3) {
                        }
                    } else {
                        if (!Intrinsics.d(juspayOperationUpdate, JuspayOperationUpdate.Abandoned.f4060a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        profileScreenComponent3.E0(new ux0(12));
                    }
                    if (objI0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objI0;
                    }
                    return unit2;
                }
                profileScreenComponent3.E0(new ux0(8));
                objI0 = unit2;
                if (objI0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objI0;
                }
                return unit2;
            }
        };
        this.label = 2;
        if (((ChannelFlow) flowD).collect(flowCollector, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return unit;
    }
}
