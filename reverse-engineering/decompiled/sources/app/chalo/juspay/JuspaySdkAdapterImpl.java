package app.chalo.juspay;

import app.chalo.utils.ChaloUseCaseResult;
import defpackage.xx;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspaySdkAdapterImpl;", "Lapp/chalo/juspay/JuspaySdkAdapter;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JuspaySdkAdapterImpl implements JuspaySdkAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreateJusPaySDKRequestJsonUseCase f4066a;
    public final ProcessJuspayResultObjectUseCase b;
    public final HyperServiceHolderSDK c;
    public final SharedFlowImpl d;
    public final SharedFlow e;
    public final Lazy f;

    public JuspaySdkAdapterImpl(CreateJusPaySDKRequestJsonUseCase createJusPaySDKRequestJsonUseCase, ProcessJuspayResultObjectUseCase processJuspayResultObjectUseCase, HyperServiceHolderSDK hyperServiceHolderSDK) {
        this.f4066a = createJusPaySDKRequestJsonUseCase;
        this.b = processJuspayResultObjectUseCase;
        this.c = hyperServiceHolderSDK;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 16, BufferOverflow.DROP_OLDEST, 1);
        this.d = sharedFlowImplB;
        this.e = FlowKt.b(sharedFlowImplB);
        Lazy lazyB = LazyKt.b(new xx(this, 28));
        this.f = lazyB;
        hyperServiceHolderSDK.e((JuspaySdkAdapterImpl$juspayResultHandler$2$1) lazyB.getValue());
    }

    @Override // app.chalo.juspay.JuspaySdkAdapter
    /* JADX INFO: renamed from: a, reason: from getter */
    public final SharedFlow getE() {
        return this.e;
    }

    @Override // app.chalo.juspay.JuspaySdkAdapter
    public final void b() {
        this.c.terminate();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // app.chalo.juspay.JuspaySdkAdapter
    public final Object c(JusPaySDKRequestAppModel jusPaySDKRequestAppModel, String str, ContinuationImpl continuationImpl) {
        JuspaySdkAdapterImpl$processRequest$1 juspaySdkAdapterImpl$processRequest$1;
        if (continuationImpl instanceof JuspaySdkAdapterImpl$processRequest$1) {
            juspaySdkAdapterImpl$processRequest$1 = (JuspaySdkAdapterImpl$processRequest$1) continuationImpl;
            int i = juspaySdkAdapterImpl$processRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                juspaySdkAdapterImpl$processRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                juspaySdkAdapterImpl$processRequest$1 = new JuspaySdkAdapterImpl$processRequest$1(this, continuationImpl);
            }
        } else {
            juspaySdkAdapterImpl$processRequest$1 = new JuspaySdkAdapterImpl$processRequest$1(this, continuationImpl);
        }
        Object objA = juspaySdkAdapterImpl$processRequest$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = juspaySdkAdapterImpl$processRequest$1.label;
        SharedFlowImpl sharedFlowImpl = this.d;
        if (i2 == 0) {
            ResultKt.b(objA);
            sharedFlowImpl.f(new JusPaySdkResultAppModel.ShowLoader(str));
            juspaySdkAdapterImpl$processRequest$1.L$0 = jusPaySDKRequestAppModel;
            juspaySdkAdapterImpl$processRequest$1.L$1 = str;
            juspaySdkAdapterImpl$processRequest$1.label = 1;
            objA = this.f4066a.a(jusPaySDKRequestAppModel, str, juspaySdkAdapterImpl$processRequest$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) juspaySdkAdapterImpl$processRequest$1.L$1;
            jusPaySDKRequestAppModel = (JusPaySDKRequestAppModel) juspaySdkAdapterImpl$processRequest$1.L$0;
            ResultKt.b(objA);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        try {
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                boolean z = jusPaySDKRequestAppModel instanceof JusPaySDKRequestAppModel.InitiateSDK;
                HyperServiceHolderSDK hyperServiceHolderSDK = this.c;
                if (z) {
                    if (!hyperServiceHolderSDK.b()) {
                        String message = "initiate juspay: " + ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                        Intrinsics.i(message, "message");
                        hyperServiceHolderSDK.c((JsonObject) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a);
                    }
                    sharedFlowImpl.f(new JusPaySdkResultAppModel.HideLoader(str));
                } else if ((jusPaySDKRequestAppModel instanceof JusPaySDKRequestAppModel.OnBoardingAndPay) || Intrinsics.d(jusPaySDKRequestAppModel, JusPaySDKRequestAppModel.AccountManagement.b) || (jusPaySDKRequestAppModel instanceof JusPaySDKRequestAppModel.UpiUiScanPay)) {
                    String message2 = "process juspay Request: " + ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                    Intrinsics.i(message2, "message");
                    hyperServiceHolderSDK.d((JsonObject) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a);
                    sharedFlowImpl.f(new JusPaySdkResultAppModel.HideLoader(str));
                } else {
                    if (!Intrinsics.d(jusPaySDKRequestAppModel, JusPaySDKRequestAppModel.GetUpiSessionToken.b) && !Intrinsics.d(jusPaySDKRequestAppModel, JusPaySDKRequestAppModel.UpdateSessionToken.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String message3 = "process juspay Request: " + ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                    Intrinsics.i(message3, "message");
                    hyperServiceHolderSDK.d((JsonObject) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a);
                }
            } else {
                if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                sharedFlowImpl.f(new JusPaySdkResultAppModel.HideLoader(str));
                String message4 = "create jusyRequest error: " + ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                Intrinsics.i(message4, "message");
                String message5 = "emit: " + sharedFlowImpl.f(new JusPaySdkResultAppModel.Error(((JuspaySdkRequestError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).f4068a, str));
                Intrinsics.i(message5, "message");
            }
        } catch (Exception e) {
            sharedFlowImpl.f(new JusPaySdkResultAppModel.HideLoader(str));
            String message6 = "create jusyRequest exception: " + e.getMessage();
            Intrinsics.i(message6, "message");
            sharedFlowImpl.f(new JusPaySdkResultAppModel.Error(String.valueOf(e.getMessage()), str));
        }
        return Unit.f17538a;
    }

    @Override // app.chalo.juspay.JuspaySdkAdapter
    public final boolean d() {
        return this.c.b();
    }
}
