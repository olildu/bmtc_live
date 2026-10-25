package app.chalo.ncmc.ui.ncmcofflinerecharge;

import app.chalo.constants.Source;
import app.chalo.ncmc.data.NcmcCardAppModelKt;
import app.chalo.ncmc.data.NcmcCardRechargeConfigAppModel;
import app.chalo.ncmc.data.NcmcCardUiModel;
import app.chalo.ncmc.domain.GetMaskedCardNoFromCardNoUseCase;
import app.chalo.ncmc.domain.GetNcmcCardAndRechargeConfigFailureReason;
import app.chalo.ncmc.domain.GetNcmcCardAndRechargeConfigUseCase;
import app.chalo.ncmc.domain.NcmcCardAndRechargeConfigResult;
import app.chalo.ncmc.ui.NcmcOnlineRechargeArgsModel;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.NcmcOnlineRechargeArgs;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.ln0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent$handleOnAddMoneyClickedIntent$1", f = "OfflineCardRechargeComponent.kt", l = {216}, m = "invokeSuspend", v = 1)
final class OfflineCardRechargeComponent$handleOnAddMoneyClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OfflineCardRechargeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineCardRechargeComponent$handleOnAddMoneyClickedIntent$1(OfflineCardRechargeComponent offlineCardRechargeComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = offlineCardRechargeComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OfflineCardRechargeComponent$handleOnAddMoneyClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OfflineCardRechargeComponent$handleOnAddMoneyClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            String str = ((OfflineCardRechargeViewState) this.this$0.f.getValue()).d;
            this.this$0.E0(new ln0(4));
            GetNcmcCardAndRechargeConfigUseCase getNcmcCardAndRechargeConfigUseCase = this.this$0.o;
            this.label = 1;
            obj = getNcmcCardAndRechargeConfigUseCase.a(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            this.this$0.E0(new ln0(5));
            NcmcCardAndRechargeConfigResult ncmcCardAndRechargeConfigResult = (NcmcCardAndRechargeConfigResult) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            NcmcCardUiModel ncmcCardUiModelA = NcmcCardAppModelKt.a(ncmcCardAndRechargeConfigResult.f6244a);
            Source source = Source.NCMC_OFFLINE_BALANCE_RECHARGE_SCREEN;
            NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel = ncmcCardAndRechargeConfigResult.b;
            GetMaskedCardNoFromCardNoUseCase getMaskedCardNoFromCardNoUseCase = this.this$0.p;
            String str2 = ncmcCardUiModelA.f6044a;
            if (str2 == null) {
                str2 = "";
            }
            getMaskedCardNoFromCardNoUseCase.getClass();
            String strA = GetMaskedCardNoFromCardNoUseCase.a(str2);
            long jLongValue = ncmcCardUiModelA.b.longValue();
            String str3 = ncmcCardUiModelA.e;
            NcmcOnlineRechargeArgsModel ncmcOnlineRechargeArgsModel = new NcmcOnlineRechargeArgsModel(jLongValue, ncmcCardUiModelA.g.longValue(), source, ncmcCardRechargeConfigAppModel, strA, str3 == null ? "" : str3);
            ChaloNavigationManager chaloNavigationManager = this.this$0.x;
            Json json = ChaloJson.b;
            json.getClass();
            ChaloNavigationManagerKt.e(chaloNavigationManager, new NcmcOnlineRechargeArgs(json.a(NcmcOnlineRechargeArgsModel.INSTANCE.serializer(), ncmcOnlineRechargeArgsModel)), null, 6);
            this.this$0.z = true;
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.E0(new ln0(6));
            KotlinToastManagerKt.a(this.this$0.y, ((GetNcmcCardAndRechargeConfigFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).name(), ToastLength.LONG);
        }
        return Unit.f17538a;
    }
}
