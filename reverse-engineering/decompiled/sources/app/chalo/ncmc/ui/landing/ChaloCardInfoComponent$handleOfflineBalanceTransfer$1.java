package app.chalo.ncmc.ui.landing;

import app.chalo.ncmc.data.NcmcCardAppModelKt;
import app.chalo.ncmc.data.NcmcCardRechargeConfigAppModel;
import app.chalo.ncmc.data.NcmcCardUiModel;
import app.chalo.ncmc.domain.GetMaskedCardNoFromCardNoUseCase;
import app.chalo.ncmc.domain.GetNcmcCardAndRechargeConfigFailureReason;
import app.chalo.ncmc.domain.GetNcmcCardAndRechargeConfigUseCase;
import app.chalo.ncmc.domain.NcmcCardAndRechargeConfigResult;
import app.chalo.ncmc.ui.NcmcOfflineRechargeArgsModel;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastData;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.NcmcOfflineRechargeArgs;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.hq0;
import defpackage.pi;
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
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ncmc.ui.landing.ChaloCardInfoComponent$handleOfflineBalanceTransfer$1", f = "ChaloCardInfoComponent.kt", l = {353, 382}, m = "invokeSuspend", v = 1)
final class ChaloCardInfoComponent$handleOfflineBalanceTransfer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $kitNumber;
    Object L$0;
    int label;
    final /* synthetic */ ChaloCardInfoComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloCardInfoComponent$handleOfflineBalanceTransfer$1(ChaloCardInfoComponent chaloCardInfoComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloCardInfoComponent;
        this.$kitNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloCardInfoComponent$handleOfflineBalanceTransfer$1(this.this$0, this.$kitNumber, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloCardInfoComponent$handleOfflineBalanceTransfer$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KotlinToastManager kotlinToastManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.b(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlinToastManager = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
            }
            hq0.s(kotlinToastManager, (String) obj);
            return Unit.f17538a;
        }
        ResultKt.b(obj);
        this.this$0.E0(new pi(15));
        GetNcmcCardAndRechargeConfigUseCase getNcmcCardAndRechargeConfigUseCase = this.this$0.u;
        String str = this.$kitNumber;
        this.label = 1;
        obj = getNcmcCardAndRechargeConfigUseCase.a(str, this);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            this.this$0.E0(new pi(16));
            NcmcCardAndRechargeConfigResult ncmcCardAndRechargeConfigResult = (NcmcCardAndRechargeConfigResult) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            if (!Intrinsics.d(ncmcCardAndRechargeConfigResult.b.h, Boolean.TRUE)) {
                ChaloCardInfoComponent chaloCardInfoComponent = this.this$0;
                KotlinToastManager kotlinToastManager2 = chaloCardInfoComponent.E;
                this.L$0 = kotlinToastManager2;
                this.label = 2;
                obj = chaloCardInfoComponent.y.b(StringEnum.OFFLINE_RECHARGE_INACTIVE, new Object[0], this);
                if (obj != coroutineSingletons) {
                    kotlinToastManager = kotlinToastManager2;
                    hq0.s(kotlinToastManager, (String) obj);
                }
                return coroutineSingletons;
            }
            NcmcCardUiModel ncmcCardUiModelA = NcmcCardAppModelKt.a(ncmcCardAndRechargeConfigResult.f6244a);
            NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel = ncmcCardAndRechargeConfigResult.b;
            GetMaskedCardNoFromCardNoUseCase getMaskedCardNoFromCardNoUseCase = this.this$0.n;
            String str2 = ncmcCardUiModelA.f6044a;
            if (str2 == null) {
                str2 = "";
            }
            getMaskedCardNoFromCardNoUseCase.getClass();
            String strA = GetMaskedCardNoFromCardNoUseCase.a(str2);
            Long l = ncmcCardUiModelA.b;
            String str3 = ncmcCardUiModelA.e;
            NcmcOfflineRechargeArgsModel ncmcOfflineRechargeArgsModel = new NcmcOfflineRechargeArgsModel(ncmcCardRechargeConfigAppModel, l, new Long(ncmcCardAndRechargeConfigResult.b.g.f5577a), ncmcCardUiModelA.f, strA, str3 == null ? "" : str3);
            ChaloNavigationManager chaloNavigationManager = this.this$0.D;
            Json json = ChaloJson.b;
            json.getClass();
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new NcmcOfflineRechargeArgs(json.a(NcmcOfflineRechargeArgsModel.INSTANCE.serializer(), ncmcOfflineRechargeArgsModel)), null, null, 6));
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.E0(new pi(17));
            this.this$0.E.a(new KotlinToastData(((GetNcmcCardAndRechargeConfigFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).name()));
        }
        return Unit.f17538a;
    }
}
